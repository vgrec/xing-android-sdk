/*
 * Copyright (C) 2012 Square, Inc.
 * Copyright (C) 2007 The Guava Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.xing.android.sdk;

import com.squareup.okhttp.ResponseBody;

import java.io.Closeable;
import java.io.IOException;

import okio.Buffer;
import okio.BufferedSource;

final class Utils {
    static <T> T checkNotNull(T object, String message) {
        if (object == null) {
            throw new NullPointerException(message);
        }
        return object;
    }

    static void closeQuietly(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException ignored) {
        }
    }

    /**
     * Replace a {@link com.squareup.okhttp.Response} with an identical copy whose body is backed by a {@link Buffer}
     * rather than a {@link okio.Source}.
     */
    static ResponseBody readBodyToBytesIfNecessary(final ResponseBody body) throws IOException {
        if (body == null) {
            return null;
        }

        BufferedSource source = body.source();
        Buffer buffer = new Buffer();
        buffer.writeAll(source);
        source.close();

        return ResponseBody.create(body.contentType(), body.contentLength(), buffer);
    }

    private Utils() {
        // No instances.
    }
}
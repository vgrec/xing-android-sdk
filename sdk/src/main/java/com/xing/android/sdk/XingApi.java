/*
 * Copyright (c) 2015 XING AG (http://xing.com/)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.xing.android.sdk;

import static com.xing.android.sdk.Utils.checkNotNull;

/**
 * TODO docs.
 *
 * @author serj.lotutovici
 */
public final class XingApi {
    /** Return a {@link Resource} instance that specified by the provided class name. */
    public <T extends Resource> T resource(Class<T> resource) {
        checkNotNull(resource, "resource == null");
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    private XingApi() {
    }

    /**
     * TODO docs.
     */
    public static final class Builder {
    }
}

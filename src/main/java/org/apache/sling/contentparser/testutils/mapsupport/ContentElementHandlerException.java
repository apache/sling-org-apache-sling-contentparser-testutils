/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.sling.contentparser.testutils.mapsupport;

/**
 * {@code RuntimeException} that's thrown by the {@link ContentElementHandler} when building {@link ContentElement}s.
 */
public class ContentElementHandlerException extends RuntimeException {

    public ContentElementHandlerException() {}

    /**
     * {@inheritDoc}
     */
    public ContentElementHandlerException(String message) {
        super(message);
    }

    /**
     * {@inheritDoc}
     */
    public ContentElementHandlerException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * {@inheritDoc}
     */
    public ContentElementHandlerException(Throwable cause) {
        super(cause);
    }
}

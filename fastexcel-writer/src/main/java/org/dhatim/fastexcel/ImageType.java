/*
 * Copyright 2016 Dhatim.
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
package org.dhatim.fastexcel;

/**
 * Supported image types for embedding in worksheets.
 */
public enum ImageType {

    PNG("png", "image/png", false), JPEG("jpeg", "image/jpeg", false), GIF("gif", "image/gif", false), SVG("svg", "image/svg+xml", true);

    private final String extension;

    private final String contentType;

    private final boolean vector;

    ImageType(String extension, String contentType, boolean vector) {
        this.extension = extension;
        this.contentType = contentType;
        this.vector = vector;
    }

    /**
     * Check if this is a vector image format (e.g., SVG).
     *
     * @return true if vector format, false if raster
     */
    public boolean isVector() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Get the file extension for this image type.
     *
     * @return File extension without the dot (e.g., "png", "jpeg")
     */
    public String getExtension() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Get the MIME content type for this image type.
     *
     * @return MIME content type (e.g., "image/png")
     */
    public String getContentType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Detect image type from byte array header.
     *
     * @param data Image bytes
     * @return Detected ImageType
     * @throws IllegalArgumentException if the image format is not supported or data is invalid
     */
    public static ImageType fromBytes(byte[] data) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

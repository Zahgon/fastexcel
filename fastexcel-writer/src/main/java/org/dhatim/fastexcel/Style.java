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

import java.io.IOException;
import java.util.Objects;

/**
 * A style defines the value formatting, font, fill pattern, border and
 * alignment of a cell or range of cells.
 */
class Style {

    /**
     * Index of cached value formatting.
     */
    private final int valueFormatting;

    /**
     * Index of cached font.
     */
    private final int font;

    /**
     * Index of cached fill pattern.
     */
    private final int fill;

    /**
     * Index of cached border.
     */
    private final int border;

    /**
     * Alignment.
     */
    private final Alignment alignment;

    /**
     * The protection settings.
     */
    private final Protection protection;

    /**
     * Constructor.
     *
     * @param original Original style. If not {@code null}, its attributes are
     * overridden by the attributes below.
     * @param valueFormatting Index of cached value formatting. Zero if not set.
     * @param font Index of cached font. Zero if not set.
     * @param fill Index of cached fill pattern. Zero if not set.
     * @param border Index of cached border. Zero if not set.
     * @param alignment Alignment. {@code null} if not set.
     */
    Style(Style original, int valueFormatting, int font, int fill, int border, Alignment alignment, Protection protection) {
        this.valueFormatting = (valueFormatting == 0 && original != null) ? original.valueFormatting : valueFormatting;
        this.font = (font == 0 && original != null) ? original.font : font;
        this.fill = (fill == 0 && original != null) ? original.fill : fill;
        this.border = (border == 0 && original != null) ? original.border : border;
        this.alignment = (alignment == null && original != null) ? original.alignment : alignment;
        this.protection = (protection == null && original != null) ? original.protection : protection;
    }

    @Override
    public int hashCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean equals(Object obj) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Write this style as an XML element.
     *
     * @param w Output writer.
     * @throws IOException If an I/O error occurs.
     */
    void write(Writer w) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

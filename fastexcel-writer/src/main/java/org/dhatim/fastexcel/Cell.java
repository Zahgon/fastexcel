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
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;
import static org.dhatim.fastexcel.CellAddress.convertNumToColString;

/**
 * A cell contains a value and a cached style index.
 */
class Cell implements Ref {

    /**
     * Cell value.
     */
    private Object value;

    /**
     * Cached style index.
     */
    private int style;

    /**
     * Write this cell as an XML element.
     *
     * @param w Output writer.
     * @param r Zero-based row number.
     * @param c Zero-based column number.
     * @throws IOException If an I/O error occurs.
     */
    void write(Writer w, int r, int c) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static String getCellType(Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    void setValue(Workbook wb, String v) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    void setValue(Number v) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    void setValue(Boolean v) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    void setValue(Date v) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    void setValue(LocalDateTime v) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    void setValue(LocalDate v) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    void setValue(ZonedDateTime v) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    void setValue(Instant v) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Get value or formula stored in this cell.
     *
     * @return Value or {@link Formula}, or {@code null}.
     */
    Object getValue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Assign a formula to this cell.
     *
     * @param expression Formula expression.
     */
    void setFormula(String expression) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Assign an inline string to this cell.
     *
     * @param v String value.
     */
    void setInlineString(String v) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Assign a rich inline string to this cell.
     *
     * @param v Rich inline string value.
     */
    void setInlineString(RichText v) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Get the style of this cell.
     *
     * @return Cell style.
     */
    int getStyle() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Set the style of this cell.
     *
     * @param style New cell style.
     */
    void setStyle(int style) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

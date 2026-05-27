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
package org.dhatim.fastexcel.reader;

import java.util.Objects;

public final class CellRangeAddress {

    private final int firstRow;

    private final int lastRow;

    private final int firstCol;

    private final int lastCol;

    public CellRangeAddress(int firstRow, int lastRow, int firstCol, int lastCol) {
        this.firstRow = firstRow;
        this.lastRow = lastRow;
        this.firstCol = firstCol;
        this.lastCol = lastCol;
        if (lastRow < firstRow || lastCol < firstCol) {
            throw new IllegalArgumentException("Invalid cell range, having lastRow < firstRow || lastCol < firstCol, " + "had rows " + lastRow + " >= " + firstRow + " or cells " + lastCol + " >= " + firstCol);
        }
    }

    public int getFirstColumn() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int getFirstRow() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int getLastColumn() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int getLastRow() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isInRange(int row, int column) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isInRange(CellAddress cell) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean containsRow(int row) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean containsColumn(int column) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean equals(Object obj) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int hashCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static CellRangeAddress valueOf(String ref) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

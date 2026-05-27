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

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Stream;

public class Row implements Iterable<Cell> {

    private final int rowNum;

    private final List<Cell> cells;

    private final int physicalCellCount;

    private final boolean isHidden;

    Row(int rowNum, int physicalCellCount, List<Cell> cells, boolean isHidden) {
        this.rowNum = rowNum;
        this.physicalCellCount = physicalCellCount;
        this.cells = cells;
        this.isHidden = isHidden;
    }

    /**
     * Returns a cell in this row by column index;
     * @param index - zero-based column index
     * @return Cell value
     * @throws IndexOutOfBoundsException if index is invalid
     */
    public Cell getCell(int index) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Cell getCell(CellAddress address) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<Cell> getCells(int beginIndex, int endIndex) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Optional<Cell> getOptionalCell(int index) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Optional<Cell> getFirstNonEmptyCell() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int getCellCount() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean hasCell(int index) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Get row number of this row
     * @return the row number (1 based)
     */
    public int getRowNum() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int getPhysicalCellCount() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Indicates whether this row is hidden in the worksheet.
     *
     * @return {@code true} if the row is hidden; {@code false} otherwise
     */
    public boolean isHidden() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Iterator<Cell> iterator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Stream<Cell> stream() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Optional<String> getCellAsString(int cellIndex) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Optional<LocalDateTime> getCellAsDate(int cellIndex) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Optional<BigDecimal> getCellAsNumber(int cellIndex) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Optional<Boolean> getCellAsBoolean(int cellIndex) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getCellText(int cellIndex) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Optional<String> getCellRawValue(int cellIndex) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

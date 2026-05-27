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

import java.util.*;
import java.util.stream.IntStream;
import static org.dhatim.fastexcel.CellAddress.convertNumToColString;

/**
 * Definition of a range of cells.
 */
public class Range implements Ref {

    /**
     * Worksheet where this range is defined.
     */
    private final Worksheet worksheet;

    /**
     * Top row.
     */
    private final int top;

    /**
     * Left column.
     */
    private final int left;

    /**
     * Bottom row.
     */
    private final int bottom;

    /**
     * Right column.
     */
    private final int right;

    /**
     * enable the folder scope when this range is added to a worksheet's named ranges
     */
    private boolean folderScope = false;

    /**
     * Constructor. Note coordinates are reordered if necessary to make sure
     * {@code top} &lt;= {@code bottom} and {@code left} &lt;= {@code right}.
     *
     * @param worksheet Parent worksheet.
     * @param top Top row.
     * @param left Left column.
     * @param bottom Bottom row.
     * @param right Right column.
     */
    Range(Worksheet worksheet, int top, int left, int bottom, int right) {
        this.worksheet = Objects.requireNonNull(worksheet);
        // Check limits
        if (top < 0 || top >= Worksheet.MAX_ROWS || bottom < 0 || bottom >= Worksheet.MAX_ROWS) {
            throw new IllegalArgumentException();
        }
        if (left < 0 || left >= Worksheet.MAX_COLS || right < 0 || right >= Worksheet.MAX_COLS) {
            throw new IllegalArgumentException();
        }
        this.top = Math.min(top, bottom);
        this.left = Math.min(left, right);
        this.bottom = Math.max(bottom, top);
        this.right = Math.max(right, left);
    }

    /**
     * Get parent worksheet.
     *
     * @return Parent worksheet.
     */
    public Worksheet getWorksheet() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Get top row.
     *
     * @return Top row.
     */
    public int getTop() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Get left column.
     *
     * @return Left column.
     */
    public int getLeft() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Get bottom row.
     *
     * @return Bottom row.
     */
    public int getBottom() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Get right column.
     *
     * @return Right column.
     */
    public int getRight() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int hashCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean equals(Object obj) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Get an absolute reference to this Range.
     *
     * ex: $A$1:$A$5
     *
     * @return absolute reference
     */
    public String toAbsoluteString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Get a new style setter for this range.
     *
     * @return Newly created style setter.
     */
    public StyleSetter style() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Merge cells within this range.
     */
    public void merge() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Check if this range contains the given cell coordinates.
     *
     * @param r Zero-based row number.
     * @param c Zero-based column number.
     * @return {@code true} if this range contains the given cell coordinates.
     */
    public boolean contains(int r, int c) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Apply shading to alternate rows in this range with the given fill
     * pattern.
     *
     * @param fill Fill pattern.
     */
    void shadeAlternateRows(Fill fill) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    void shadeRows(Fill fill, int eachNRows) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Construct a new ListDataValidation
     *
     * @param listRange The Range of the list this validation references
     * @return a new list data validation object
     */
    public ListDataValidation validateWithList(Range listRange) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Construct a new ListDataValidation
     *
     * @param formula The Formula to retrieve the validation list
     * @return a new list data validation object
     */
    public ListFormulaDataValidation validateWithListByFormula(String formula) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Construct a new ListDataValidation
     *
     * @param formula The custom validation formula
     * @return a new custom validation
     */
    public CustomDataValidation validateWithFormula(String formula) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Specifically define this range by assigning it a name.
     * It will be visible in the cell range dropdown menu.
     *
     * @param name string representing the name of this cell range
     */
    public void setName(String name) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Check if this range has a folder scope. It is used by {@link Worksheet#addNamedRange(Range, String)}.
     *
     * @return {@code true} if the range has a folder scope, {@code false} if it is visible only by the worksheet contains the range
     */
    public boolean isFolderScope() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Set the visibility of this range
     *
     * @param folderScope {@code true} to allow to see the range by all worksheet
     */
    public void setFolderScope(boolean folderScope) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Return the set of styles used by the cells in this range.
     *
     * @return Set of styles.
     */
    Set<Integer> getStyles() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Apply new (merged) styles to the cells in this range.
     *
     * @param styles Map giving new style for each old style.
     */
    void applyStyle(Map<Integer, Integer> styles) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setHyperlink(HyperLink hyperLink) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Table createTable() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Table createTable(String... headers) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

package org.dhatim.fastexcel;

import java.util.Map;
import java.util.Objects;

/**
 * Definition of a column.
 */
class Column {

    /**
     * Worksheet where this column is defined.
     */
    private final Worksheet worksheet;

    /**
     * Position of the column
     */
    private final int colNumber;

    private int style;

    /**
     * Constructor
     * @param worksheet Worksheet where this column is defined.
     * @param colNumber Position of the column
     */
    Column(Worksheet worksheet, int colNumber) {
        this.worksheet = Objects.requireNonNull(worksheet);
        this.colNumber = Objects.requireNonNull(colNumber);
        this.style = 0;
    }

    static Column noStyle(Worksheet worksheet, int c) {
        throw new UnsupportedOperationException("STUB: not implemented");
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
     * Get column number.
     *
     * @return Column number.
     */
    public int getColNumber() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Get a new style setter for this column.
     *
     * @return Newly created style setter.
     */
    public ColumnStyleSetter style() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean equals(Object o) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int hashCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Return the style assigned to this column.
     *
     * @return style.
     */
    Integer getStyle() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Apply new (merged) style to this column.
     *
     * @param stylesMap new styles map
     */
    void applyStyle(Map<Integer, Integer> stylesMap) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

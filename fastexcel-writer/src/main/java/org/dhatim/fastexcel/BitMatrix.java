/*
 * Copyright 2007 ZXing authors
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

import java.util.Arrays;

/**
 * <p>Represents a 2D matrix of bits. In function arguments below, and throughout the common
 * module, x is the column position, and y is the row position. The ordering is always x, y.
 * The origin is at the top-left.</p>
 *
 * <p>Internally the bits are represented in a 1-D array of 32-bit ints. However, each row begins
 * with a new int. This is done intentionally so that we can copy out a row into a BitArray very
 * efficiently.</p>
 *
 * <p>The ordering of bits is row-major. Within each int, the least significant bits are used first,
 * meaning they represent lower x values. This is compatible with BitArray's implementation.</p>
 *
 * @author Sean Owen
 * @author dswitkin@google.com (Daniel Switkin)
 */
public final class BitMatrix implements Cloneable {

    private int width;

    private int height;

    private int rowSize;

    private int[] bits;

    /**
     * Creates an empty square {@code BitMatrix}.
     *
     * @param dimension height and width
     */
    public BitMatrix(int dimension) {
        this(dimension, dimension);
    }

    /**
     * Creates an empty {@code BitMatrix}.
     *
     * @param width bit matrix width
     * @param height bit matrix height
     */
    public BitMatrix(int width, int height) {
        if (width < 1 || height < 1) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.width = width;
        this.height = height;
        this.rowSize = (width + 31) / 32;
        bits = new int[rowSize * height];
    }

    private BitMatrix(int width, int height, int rowSize, int[] bits) {
        this.width = width;
        this.height = height;
        this.rowSize = rowSize;
        this.bits = bits;
    }

    /**
     * <p>Gets the requested bit, where true means black.</p>
     *
     * @param x The horizontal component (i.e. which column)
     * @param y The vertical component (i.e. which row)
     * @return value of given bit in matrix
     */
    public boolean get(int x, int y) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * <p>Sets the given bit to true.</p>
     *
     * @param x The horizontal component (i.e. which column)
     * @param y The vertical component (i.e. which row)
     */
    public void set(int x, int y) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void unset(int x, int y) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * <p>Flips the given bit.</p>
     *
     * @param x The horizontal component (i.e. which column)
     * @param y The vertical component (i.e. which row)
     */
    public void flip(int x, int y) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * <p>Flips every bit in the matrix.</p>
     */
    public void flip() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Clears all bits (sets to false).
     */
    public void clear() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * <p>Sets a square region of the bit matrix to true.</p>
     *
     * @param left The horizontal position to begin at (inclusive)
     * @param top The vertical position to begin at (inclusive)
     * @param width The width of the region
     * @param height The height of the region
     */
    public void setRegion(int left, int top, int width, int height) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return The width of the matrix
     */
    public int getWidth() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return The height of the matrix
     */
    public int getHeight() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return The row size of the matrix
     */
    public int getRowSize() {
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
     * @return string representation using "X" for set and " " for unset bits
     */
    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param setString representation of a set bit
     * @param unsetString representation of an unset bit
     * @return string representation of entire matrix utilizing given strings
     */
    public String toString(String setString, String unsetString) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param setString representation of a set bit
     * @param unsetString representation of an unset bit
     * @param lineSeparator newline character in string representation
     * @return string representation of entire matrix utilizing given strings and line separator
     * @deprecated call {@link #toString(String,String)} only, which uses \n line separator always
     */
    @Deprecated
    public String toString(String setString, String unsetString, String lineSeparator) {
        return buildToString(setString, unsetString, lineSeparator);
    }

    private String buildToString(String setString, String unsetString, String lineSeparator) {
        StringBuilder result = new StringBuilder(height * (width + 1));
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                result.append(get(x, y) ? setString : unsetString);
            }
            result.append(lineSeparator);
        }
        return result.toString();
    }

    @Override
    public BitMatrix clone() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

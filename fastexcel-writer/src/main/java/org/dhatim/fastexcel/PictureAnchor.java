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

/**
 * Defines the positioning of an image within a worksheet.
 * Supports both one-cell and two-cell anchoring.
 * <p>
 * One-cell anchor: Image is positioned at a cell with explicit size (width/height).
 * Two-cell anchor: Image spans from one cell to another, resizing with cells.
 */
public class PictureAnchor {

    /**
     * EMUs (English Metric Units) per pixel at 96 DPI.
     */
    public static final int EMU_PER_PIXEL = 9525;

    /**
     * EMUs per point.
     */
    public static final int EMU_PER_POINT = 12700;

    /**
     * EMUs per inch.
     */
    public static final int EMU_PER_INCH = 914400;

    /**
     * EMUs per centimeter.
     */
    public static final int EMU_PER_CM = 360000;

    private final int fromCol;

    // offset in EMUs
    private final int fromColOff;

    private final int fromRow;

    // offset in EMUs
    private final int fromRowOff;

    // For two-cell anchor
    private final Integer toCol;

    private final Integer toColOff;

    private final Integer toRow;

    private final Integer toRowOff;

    // For one-cell anchor (explicit size in EMUs)
    private final Long widthEmu;

    private final Long heightEmu;

    /**
     * Create a one-cell anchor with explicit size in pixels.
     *
     * @param row      Zero-based row number
     * @param col      Zero-based column number
     * @param widthPx  Image width in pixels
     * @param heightPx Image height in pixels
     * @return A new PictureAnchor configured for one-cell anchoring
     */
    public static PictureAnchor oneCellAnchor(int row, int col, int widthPx, int heightPx) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Create a one-cell anchor with offset and explicit size in pixels.
     *
     * @param row       Zero-based row number
     * @param col       Zero-based column number
     * @param colOffPx  Column offset in pixels from the left edge of the cell
     * @param rowOffPx  Row offset in pixels from the top edge of the cell
     * @param widthPx   Image width in pixels
     * @param heightPx  Image height in pixels
     * @return A new PictureAnchor configured for one-cell anchoring with offset
     */
    public static PictureAnchor oneCellAnchor(int row, int col, int colOffPx, int rowOffPx, int widthPx, int heightPx) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Create a two-cell anchor spanning from one cell to another.
     *
     * @param fromRow Starting row (zero-based)
     * @param fromCol Starting column (zero-based)
     * @param toRow   Ending row (zero-based, exclusive - image ends at top of this row)
     * @param toCol   Ending column (zero-based, exclusive - image ends at left of this column)
     * @return A new PictureAnchor configured for two-cell anchoring
     */
    public static PictureAnchor twoCellAnchor(int fromRow, int fromCol, int toRow, int toCol) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Create a two-cell anchor with offsets.
     *
     * @param fromRow      Starting row (zero-based)
     * @param fromCol      Starting column (zero-based)
     * @param fromColOffPx Starting column offset in pixels
     * @param fromRowOffPx Starting row offset in pixels
     * @param toRow        Ending row (zero-based)
     * @param toCol        Ending column (zero-based)
     * @param toColOffPx   Ending column offset in pixels
     * @param toRowOffPx   Ending row offset in pixels
     * @return A new PictureAnchor configured for two-cell anchoring with offsets
     */
    public static PictureAnchor twoCellAnchor(int fromRow, int fromCol, int fromColOffPx, int fromRowOffPx, int toRow, int toCol, int toColOffPx, int toRowOffPx) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private PictureAnchor(int fromCol, int fromColOff, int fromRow, int fromRowOff, Integer toCol, Integer toColOff, Integer toRow, Integer toRowOff, Long widthEmu, Long heightEmu) {
        this.fromCol = fromCol;
        this.fromColOff = fromColOff;
        this.fromRow = fromRow;
        this.fromRowOff = fromRowOff;
        this.toCol = toCol;
        this.toColOff = toColOff;
        this.toRow = toRow;
        this.toRowOff = toRowOff;
        this.widthEmu = widthEmu;
        this.heightEmu = heightEmu;
    }

    /**
     * Check if this anchor is a two-cell anchor.
     *
     * @return true if two-cell anchor, false if one-cell anchor
     */
    public boolean isTwoCellAnchor() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Write the "from" position element.
     */
    void writeFrom(Writer w) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Write the "to" position element (for two-cell anchors).
     */
    void writeTo(Writer w) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Write the extent element (for one-cell anchors).
     */
    void writeExt(Writer w) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Get width in EMUs (for one-cell anchors).
     */
    public Long getWidthEmu() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Get height in EMUs (for one-cell anchors).
     */
    public Long getHeightEmu() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

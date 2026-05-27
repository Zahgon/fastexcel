package org.dhatim.fastexcel;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * This is a dynamically expanding matrix structure that saves space and has good performance
 *
 * @author meiMingle
 */
public class DynamicBitMatrix {

    static final int UNIT_WEITH = 1 << 6, UNIT_HIGHT = 1 << 10;

    final int MAX_WIDTH, MAX_HIGHT;

    private final CopyOnWriteArrayList<CopyOnWriteArrayList<BitMatrix>> bitMatrixData = new CopyOnWriteArrayList<>();

    public DynamicBitMatrix(int maxWidth, int maxHight) {
        MAX_WIDTH = maxWidth;
        MAX_HIGHT = maxHight;
    }

    void setRegion(int top, int left, int bottom, int right) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    boolean isConflict(int top, int left, int bottom, int right) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    boolean get(int row, int col) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private boolean isInNullArea(int bitMatrixRowIndex, int bitMatrixColIndex) {
        if (bitMatrixColIndex >= bitMatrixData.size()) {
            return true;
        }
        CopyOnWriteArrayList<BitMatrix> colBitMatrices = bitMatrixData.get(bitMatrixColIndex);
        if (colBitMatrices == null || colBitMatrices.isEmpty()) {
            return true;
        }
        if (bitMatrixRowIndex >= colBitMatrices.size()) {
            return true;
        }
        return colBitMatrices.get(bitMatrixRowIndex) == null;
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String buildToString(String setString, String unsetString, String fillNullString, String lineSeparator) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

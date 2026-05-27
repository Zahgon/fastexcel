package org.dhatim.fastexcel;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author meiMingle
 */
public class DynamicByteArray {

    static final int UNIT_LENGTH = 1 << 6;

    private final CopyOnWriteArrayList<byte[]> byteArrayData = new CopyOnWriteArrayList<>();

    final int MAX_LENGTH;

    public DynamicByteArray(int maxLength) {
        MAX_LENGTH = maxLength;
    }

    void set(int index, byte value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    void increase(int index) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private byte[] getBytesWithOutNull(int arrayAreaIndex) {
        if (arrayAreaIndex >= byteArrayData.size()) {
            for (int i = byteArrayData.size() - 1; i < arrayAreaIndex; i++) {
                byteArrayData.add(null);
            }
        }
        if (byteArrayData.get(arrayAreaIndex) == null) {
            byteArrayData.set(arrayAreaIndex, new byte[UNIT_LENGTH]);
        }
        return byteArrayData.get(arrayAreaIndex);
    }

    byte get(int index) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    int getMaxNoZeroIndex() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String buildToString(String fillNullString) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private String repeatString(String seed, int n) {
        final int seedLen = seed.length();
        final char[] srcArr = seed.toCharArray();
        char[] dstArr = new char[n * seedLen];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < seedLen; j++) {
                dstArr[i * seedLen + j] = srcArr[j];
            }
        }
        return String.valueOf(dstArr);
    }
}

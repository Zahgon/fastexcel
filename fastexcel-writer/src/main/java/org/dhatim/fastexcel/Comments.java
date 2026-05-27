package org.dhatim.fastexcel;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

class Comments {

    private static final String COLOR = "#ffffee";

    private final Map<Location, String> cache = new TreeMap<>();

    void set(int r, int c, String comment) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    boolean isEmpty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    void writeComments(Writer w) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    void writeVmlDrawing(Writer w) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    void writeDrawing(Writer w) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

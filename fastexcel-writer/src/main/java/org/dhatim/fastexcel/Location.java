package org.dhatim.fastexcel;

import java.util.Comparator;
import static org.dhatim.fastexcel.CellAddress.convertNumToColString;

class Location implements Comparable<Location>, Ref {

    final int row;

    final int col;

    public Location(int row, int col) {
        this.row = row;
        this.col = col;
    }

    private int getRow() {
        return row;
    }

    private int getCol() {
        return col;
    }

    @Override
    public int compareTo(Location o) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean equals(Object obj) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

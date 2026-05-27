package org.dhatim.fastexcel;

import java.io.IOException;

public class Table {

    int index;

    private String name;

    private String displayName;

    private boolean totalsRowShown = false;

    private final Range range;

    private final String[] headers;

    private final TableStyleInfo styleInfo = new TableStyleInfo(this);

    Table(int index, Range range, String[] headers) {
        int count = range.getRight() - range.getLeft() + 1;
        if (headers.length != count) {
            throw new IllegalStateException("Header length no match the count of columns,table index:" + index);
        }
        for (int i = 0; i < count; i++) {
            range.getWorksheet().value(range.getTop(), range.getLeft() + i, headers[i]);
        }
        this.index = index;
        this.range = range;
        this.headers = headers;
    }

    public Table setName(String name) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Table setDisplayName(String displayName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Table setTotalsRowShown(boolean totalsRowShown) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public TableStyleInfo styleInfo() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public class TableStyleInfo {

        private final Table table;

        TableStyleInfo(Table table) {
            this.table = table;
        }

        private String name;

        private boolean showFirstColumn = false;

        private boolean showLastColumn = false;

        private boolean showRowStripes = true;

        private boolean showColumnStripes = false;

        public TableStyleInfo setStyleName(String name) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public TableStyleInfo setShowFirstColumn(boolean showFirstColumn) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public TableStyleInfo setShowLastColumn(boolean showLastColumn) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public TableStyleInfo setShowRowStripes(boolean showRowStripes) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public TableStyleInfo setShowColumnStripes(boolean showColumnStripes) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public void write(Writer w) throws IOException {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    void write(Writer w) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

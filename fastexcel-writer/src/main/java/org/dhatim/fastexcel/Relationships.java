package org.dhatim.fastexcel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import static org.dhatim.fastexcel.XmlEscapeHelper.escape;

public class Relationships {

    private static final String TYPE_OF_HYPERLINK = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/hyperlink";

    private static final String TYPE_OF_DRAWING = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/drawing";

    private static final String TYPE_OF_COMMENTS = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/comments";

    private static final String TYPE_OF_VMLDRAWING = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/vmlDrawing";

    private static final String TYPE_OF_TABLE = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/table";

    private final AtomicInteger maxIndex = new AtomicInteger(1);

    final Worksheet worksheet;

    private ArrayList<Relationship> relationship = new ArrayList<>();

    public Relationships(Worksheet worksheet) {
        this.worksheet = worksheet;
    }

    String setHyperLinkRels(String target, String targetMode) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    String setTableRels(int index) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    void setCommentsRels(int index) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Set relationships for comments when pictures also exist (no separate drawing.xml for comments).
     */
    void setCommentsOnlyRels(int index) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Set relationship for picture drawing.
     *
     * @param index The sheet index
     * @return The relationship ID
     */
    String setImageDrawingRels(int index) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    boolean isEmpty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    class Relationship {

        private String id;

        private String type;

        private String target;

        private String targetMode;

        public Relationship(String id, String type, String target, String targetMode) {
            this.id = id;
            this.type = type;
            this.target = target;
            this.targetMode = targetMode;
        }
    }

    void write(Writer relsWr) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

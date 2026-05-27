package org.dhatim.fastexcel;

import java.io.IOException;
import java.util.Objects;

public class DifferentialFormat {

    private final String valueFormatting;

    private final Font font;

    private final Fill fill;

    private final Border border;

    private final Alignment alignment;

    private final Protection protection;

    private int numFmtId;

    /**
     * Constructor.
     *
     * @param numFmtId Id of the value formatting to use
     * @param font Font to use
     * @param fill Fill to use
     * @param border Border to use
     * @param alignment Alignment to use
     * @param protection Proction to use
     */
    DifferentialFormat(String valueFormatting, Font font, Fill fill, Border border, Alignment alignment, Protection protection) {
        this.valueFormatting = valueFormatting;
        this.font = font;
        this.fill = fill;
        this.border = border;
        this.alignment = alignment;
        this.protection = protection;
    }

    public String getValueFormatting() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setNumFmtId(int numFmtId) {
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

    /**
     * Write this style as an XML element.
     *
     * @param w Output writer.
     * @throws IOException If an I/O error occurs.
     */
    void write(Writer w) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

package org.dhatim.fastexcel;

import java.io.IOException;

/**
 * Marginal Information, represents a header or footer
 * in an Excel file.
 */
public class MarginalInformation {

    private static final String DEFAULT_FONT = "Times New Roman";

    private static final int DEFAULT_FONT_SIZE = 12;

    private final String text;

    private final Position position;

    private final String font;

    private final int fontSize;

    public MarginalInformation(String text, Position position) {
        this(text, position, DEFAULT_FONT, DEFAULT_FONT_SIZE);
    }

    private MarginalInformation(String text, Position position, String font, int fontSize) {
        this.text = text;
        this.position = position;
        this.font = font;
        this.fontSize = fontSize;
    }

    public MarginalInformation withFont(String font) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public MarginalInformation withFontSize(int fontSize) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getContent() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void write(Writer writer) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private String prepareTextForXml(String text) {
        switch(text.toLowerCase()) {
            case "page 1 of ?":
                return "Page &amp;P of &amp;N";
            case "page 1, sheetname":
                return "Page &amp;P, &amp;A";
            case "page 1":
                return "Page &amp;P";
            case "sheetname":
                return "&amp;A";
            default:
                return XmlEscapeHelper.escape(text);
        }
    }
}

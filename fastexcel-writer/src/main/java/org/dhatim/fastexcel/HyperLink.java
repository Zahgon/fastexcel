package org.dhatim.fastexcel;

import java.util.Objects;

public class HyperLink {

    private final String displayStr;

    private final String linkStr;

    private final HyperLinkType hyperLinkType;

    /**
     * Static factory method which allows to create external HyperLink
     * @param linkStr external link for which the hyperlink will lead to
     * @param displayStr string which will displayed in hyperlink cell
     * @return External HyperLink
     */
    public static HyperLink external(String linkStr, String displayStr) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Static factory method which allows to create internal HyperLink
     * @param linkStr link for which the hyperlink will lead to
     * @param displayStr string which will displayed in hyperlink cell
     * @return Internal HyperLink
     */
    public static HyperLink internal(String linkStr, String displayStr) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public HyperLink(String linkStr) {
        this(linkStr, linkStr, HyperLinkType.EXTERNAL);
    }

    /**
     * Default Constructor
     * By default, the HyperLink will be marked as an external
     * @param linkStr external link for which the hyperlink will lead to
     * @param displayStr string which will displayed in hyperlink cell
     */
    public HyperLink(String linkStr, String displayStr) {
        this(linkStr, displayStr, HyperLinkType.EXTERNAL);
    }

    /**
     * Constructor
     * @param linkStr link for which the hyperlink will lead to
     * @param displayStr string which will displayed in hyperlink cell
     * @param hyperLinkType identifies type of the hyperlink
     */
    HyperLink(String linkStr, String displayStr, HyperLinkType hyperLinkType) {
        this.linkStr = linkStr;
        this.displayStr = displayStr;
        this.hyperLinkType = hyperLinkType;
    }

    @Override
    public boolean equals(Object o) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int hashCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getDisplayStr() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getLinkStr() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    HyperLinkType getHyperLinkType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

package org.dhatim.fastexcel;

import java.io.IOException;
import java.util.Map;
import java.util.Objects;

/**
 * Represents the &lt;protection&gt; xml-tag.
 */
public class Protection {

    private final Map<ProtectionOption, Boolean> options;

    public Protection(Map<ProtectionOption, Boolean> options) {
        if (options == null) {
            throw new NullPointerException("Options should not be null");
        }
        this.options = options;
    }

    @Override
    public int hashCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean equals(Object o) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Write this protection as an XML element.
     *
     * @param w Output writer.
     * @throws IOException If an I/O error occurs.
     */
    void write(Writer w) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

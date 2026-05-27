/*
 * Copyright 2026 Dhatim.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.dhatim.fastexcel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * Rich inline string value: a sequence of {@link Run runs}, each carrying its
 * own font formatting. Pass an instance to
 * {@link Worksheet#inlineString(int, int, RichText)} to write it.
 *
 * <p>Wire format follows OOXML (ECMA-376 §18.4):
 * {@code <is><r><rPr>...</rPr><t>...</t></r>...</is>}.
 *
 * <p>Use {@link #builder()} to construct an instance. The {@link Run}
 * constructor is package-private on purpose — runs are created through the
 * builder.
 */
public final class RichText {

    /**
     * A single run: text plus optional font formatting.
     * A {@code null} formatting field means "inherit from cell style"
     * (i.e. the property is omitted from {@code <rPr>}).
     */
    public static final class Run {

        private final String text;

        private final boolean bold;

        private final boolean italic;

        private final boolean underlined;

        // points; null = inherit
        private final Integer fontSize;

        // null = inherit
        private final String fontName;

        // RRGGBB or AARRGGBB hex; null = inherit
        private final String fontColor;

        Run(String text, boolean bold, boolean italic, boolean underlined, Integer fontSize, String fontName, String fontColor) {
            this.text = text == null ? "" : text;
            this.bold = bold;
            this.italic = italic;
            this.underlined = underlined;
            this.fontSize = fontSize;
            this.fontName = fontName;
            this.fontColor = fontColor;
        }

        public String getText() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        void write(Writer w) throws IOException {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    /**
     * Builder for a single {@link Run}. Obtained from
     * {@link Builder#run(String)}. Setters are optional; unset fields inherit
     * from the cell style.
     */
    public static final class RunBuilder {

        private final Builder parent;

        private final String text;

        private boolean bold;

        private boolean italic;

        private boolean underlined;

        private Integer fontSize;

        private String fontName;

        private String fontColor;

        RunBuilder(Builder parent, String text) {
            this.parent = parent;
            this.text = text;
        }

        public RunBuilder bold() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public RunBuilder italic() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public RunBuilder underlined() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public RunBuilder fontSize(int points) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public RunBuilder fontName(String name) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Hex color in {@code "RRGGBB"} or {@code "AARRGGBB"} form.
         *
         * @param hexRgbOrArgb Hex color string.
         * @return This builder.
         */
        public RunBuilder fontColor(String hexRgbOrArgb) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Finishes this run and returns the parent builder for chaining.
         */
        public Builder end() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    /**
     * Builder for {@link RichText}.
     */
    public static final class Builder {

        private final List<Run> runs = new ArrayList<>();

        Builder() {
        }

        /**
         * Begin a new run. {@code null} text is treated as empty.
         *
         * @param text Run text.
         * @return A {@link RunBuilder} for the new run.
         */
        public RunBuilder run(String text) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public RichText build() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    /**
     * Returns a new {@link Builder}.
     */
    public static Builder builder() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private final List<Run> runs;

    /**
     * @param runs Runs that make up this rich string. Must not be {@code null};
     *             an empty list is allowed and produces an empty {@code <is/>}.
     */
    public RichText(List<Run> runs) {
        this.runs = new ArrayList<>(Objects.requireNonNull(runs, "runs"));
    }

    public List<Run> getRuns() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Writes the {@code <is>...</is>} body. The enclosing {@code <c>} is the caller's job.
     */
    void write(Writer w) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

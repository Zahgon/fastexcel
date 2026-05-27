package org.dhatim.fastexcel;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Properties {

    //*****  core properties  *****
    private String title;

    private String subject;

    // alias:Tags
    private String keywords;

    // alias:Comments
    private String description;

    private String category;

    //*****  app properties  *****
    private String manager;

    private String company;

    private String hyperlinkBase;

    //***** custom properties *****
    private Set<CustomProty> customProperties = Collections.synchronizedSet(new LinkedHashSet<>());

    String getTitle() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Properties setTitle(String title) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    String getSubject() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Properties setSubject(String subject) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    String getKeywords() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Properties setKeywords(String keywords) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    String getDescription() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Properties setDescription(String description) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    String getCategory() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Properties setCategory(String category) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    String getManager() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Properties setManager(String manager) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    String getCompany() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Properties setCompany(String company) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    String getHyperlinkBase() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Properties setHyperlinkBase(String hyperlinkBase) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    interface CustomProty {

        void write(Writer w, int pid) throws IOException;
    }

    abstract class AbstractProperty<T> implements CustomProty {

        protected String key;

        protected T value;

        public AbstractProperty(String key, T value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public int hashCode() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public boolean equals(Object obj) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    class TextProperty extends AbstractProperty<String> {

        public TextProperty(String key, String value) {
            super(key, value);
        }

        @Override
        public void write(Writer w, int pid) throws IOException {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    class DateProperty extends AbstractProperty<Instant> {

        public DateProperty(String key, Instant value) {
            super(key, value);
        }

        @Override
        public void write(Writer w, int pid) throws IOException {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    class NumberProperty extends AbstractProperty<BigDecimal> {

        public NumberProperty(String key, BigDecimal value) {
            super(key, value);
        }

        @Override
        public void write(Writer w, int pid) throws IOException {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    class BoolProperty extends AbstractProperty<Boolean> {

        public BoolProperty(String key, Boolean value) {
            super(key, value);
        }

        @Override
        public void write(Writer w, int pid) throws IOException {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    public Properties setTextProperty(String key, String textValue) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Properties setDateProperty(String key, Instant dateValue) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Properties setNumberProperty(String key, BigDecimal numberValue) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Properties setBoolProperty(String key, Boolean boolValue) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean hasCustomProperties() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    void writeCustomProperties(Writer w) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

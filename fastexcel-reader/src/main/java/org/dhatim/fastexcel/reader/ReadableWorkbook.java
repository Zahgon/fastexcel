/*
 * Copyright 2016 Dhatim.
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
package org.dhatim.fastexcel.reader;

import javax.xml.stream.XMLStreamException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import static org.dhatim.fastexcel.reader.DefaultXMLInputFactory.factory;

public class ReadableWorkbook implements Closeable {

    private final OPCPackage pkg;

    private final SST sst;

    private final ReadingOptions readingOptions;

    private boolean date1904;

    private final List<Sheet> sheets = new ArrayList<>();

    private Integer activeTab;

    public ReadableWorkbook(File inputFile) throws IOException {
        this(OPCPackage.open(inputFile), ReadingOptions.DEFAULT_READING_OPTIONS);
    }

    public ReadableWorkbook(File inputFile, ReadingOptions readingOptions) throws IOException {
        this(OPCPackage.open(inputFile, readingOptions.isWithCellFormat()), readingOptions);
    }

    /**
     * Note: will load the whole xlsx file into memory,
     * (but will not uncompress it in memory)
     */
    public ReadableWorkbook(InputStream inputStream) throws IOException {
        this(inputStream, ReadingOptions.DEFAULT_READING_OPTIONS);
    }

    /**
     * Note: will load the whole xlsx file into memory,
     * (but will not uncompress it in memory)
     */
    public ReadableWorkbook(InputStream inputStream, ReadingOptions readingOptions) throws IOException {
        this(OPCPackage.open(inputStream, readingOptions.isWithCellFormat()), readingOptions);
    }

    private ReadableWorkbook(OPCPackage pkg, ReadingOptions readingOptions) throws IOException {
        try {
            this.pkg = pkg;
            sst = SST.fromInputStream(pkg.getSharedStrings());
        } catch (XMLStreamException e) {
            throw new ExcelReaderException(e);
        }
        try (SimpleXmlReader workbookReader = new SimpleXmlReader(factory, pkg.getWorkbookContent())) {
            readWorkbook(workbookReader);
        } catch (XMLStreamException e) {
            throw new ExcelReaderException(e);
        }
        this.readingOptions = readingOptions;
    }

    @Override
    public void close() throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isDate1904() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Stream<Sheet> getSheets() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Optional<Sheet> getSheet(int index) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Sheet getFirstSheet() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Optional<Sheet> findSheet(String name) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Optional<Sheet> getActiveSheet() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private void readWorkbook(SimpleXmlReader r) throws XMLStreamException {
        while (r.goTo(() -> r.isStartElement("sheets") || r.isStartElement("workbookPr") || r.isStartElement("workbookView") || r.isEndElement("workbook"))) {
            if ("workbookView".equals(r.getLocalName())) {
                String activeTab = r.getAttribute("activeTab");
                if (activeTab != null) {
                    this.activeTab = Integer.parseInt(activeTab);
                }
            } else if ("sheets".equals(r.getLocalName())) {
                r.forEach("sheet", "sheets", this::createSheet);
            } else if ("workbookPr".equals(r.getLocalName())) {
                String date1904Value = r.getAttribute("date1904");
                if (date1904Value != null) {
                    date1904 = "true".equalsIgnoreCase(date1904Value) || "1".equals(date1904Value);
                }
            } else {
                break;
            }
        }
    }

    private void createSheet(SimpleXmlReader r) {
        String name = r.getAttribute("name");
        String id = r.getAttribute("http://schemas.openxmlformats.org/officeDocument/2006/relationships", "id");
        String stableId = r.getAttribute("sheetId");
        SheetVisibility sheetVisibility;
        if ("veryHidden".equals(r.getAttribute("state"))) {
            sheetVisibility = SheetVisibility.VERY_HIDDEN;
        } else if ("hidden".equals(r.getAttribute("state"))) {
            sheetVisibility = SheetVisibility.HIDDEN;
        } else {
            sheetVisibility = SheetVisibility.VISIBLE;
        }
        int index = sheets.size();
        sheets.add(new Sheet(this, index, id, stableId, name, sheetVisibility));
    }

    Stream<Row> openStream(Sheet sheet) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<String> getFormats() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Map<String, String> getNumFmtIdToFormat() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    SST getSharedStringsTable() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static boolean isOOXMLZipHeader(byte[] bytes) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static boolean isOLE2Header(byte[] bytes) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    ReadingOptions getReadingOptions() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static Runnable asUncheckedRunnable(Closeable c) {
        return () -> {
            try {
                c.close();
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        };
    }
}

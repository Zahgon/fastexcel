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

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sheet {

    private final ReadableWorkbook workbook;

    private final int index;

    private final String id;

    private final String stableId;

    private final String name;

    private final SheetVisibility visibility;

    Sheet(ReadableWorkbook workbook, int index, String id, String stableId, String name, SheetVisibility visibility) {
        this.workbook = workbook;
        this.index = index;
        this.id = id;
        this.stableId = stableId;
        this.name = name;
        this.visibility = visibility;
    }

    public int getIndex() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getId() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getStableId() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SheetVisibility getVisibility() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Stream<Row> openStream() throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<Row> read() throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

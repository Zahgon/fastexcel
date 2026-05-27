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

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;

class SimpleXmlReader implements Closeable {

    private final InputStream inputStream;

    private final XMLStreamReader reader;

    public SimpleXmlReader(XMLInputFactory factory, InputStream inputStream) throws XMLStreamException {
        this.inputStream = inputStream;
        reader = factory.createXMLStreamReader(inputStream);
    }

    @Override
    public void close() throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean goTo(BooleanSupplier predicate) throws XMLStreamException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getLocalName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isStartElement(String elementName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isEndElement(String elementName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean goTo(String elementName) throws XMLStreamException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getAttribute(String name) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getAttributeRequired(String name) throws XMLStreamException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getAttribute(String namespace, String name) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Optional<String> getOptionalAttribute(String name) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Integer getIntAttribute(String name) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void forEach(String startChildElement, String untilEndElement, Consumer<SimpleXmlReader> consumer) throws XMLStreamException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getValueUntilEndElement(String elementName) throws XMLStreamException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getValueUntilEndElement(String elementName, String skipping) throws XMLStreamException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

package org.dhatim.fastexcel.reader;

import javax.xml.stream.XMLStreamException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import static org.dhatim.fastexcel.reader.DefaultXMLInputFactory.factory;

class SST {

    private static final SST EMPTY = new SST();

    private final SimpleXmlReader reader;

    private final List<String> values = new ArrayList<>();

    private SST() {
        reader = null;
    }

    SST(InputStream in) throws XMLStreamException {
        reader = new SimpleXmlReader(factory, in);
    }

    static SST fromInputStream(InputStream in) throws XMLStreamException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    String getItemAt(int index) throws XMLStreamException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private void readUpTo(int index) throws XMLStreamException {
        while (index >= values.size()) {
            reader.goTo("si");
            StringBuilder sb = new StringBuilder();
            while (reader.goTo(() -> reader.isStartElement("t") || reader.isStartElement("rPh") || reader.isEndElement("si"))) {
                if (reader.isStartElement("t")) {
                    sb.append(reader.getValueUntilEndElement("t"));
                } else if (reader.isEndElement("si")) {
                    break;
                } else if (reader.isStartElement("rPh")) {
                    reader.goTo(() -> reader.isEndElement("rPh"));
                }
            }
            values.add(sb.toString());
        }
    }
}

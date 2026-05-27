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

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Cell {

    private static final long DAY_MILLISECONDS = 86_400_000L;

    private final ReadableWorkbook workbook;

    private final Object value;

    private final String formula;

    private final CellType type;

    private final CellAddress address;

    private final String rawValue;

    private final String dataFormatId;

    private final String dataFormatString;

    Cell(ReadableWorkbook workbook, CellType type, Object value, CellAddress address, String formula, String rawValue) {
        this(workbook, type, value, address, formula, rawValue, null, null);
    }

    Cell(ReadableWorkbook workbook, CellType type, Object value, CellAddress address, String formula, String rawValue, String dataFormatId, String dataFormatString) {
        this.workbook = workbook;
        this.type = type;
        this.value = value;
        this.address = address;
        this.formula = formula;
        this.rawValue = rawValue;
        this.dataFormatId = dataFormatId;
        this.dataFormatString = dataFormatString;
    }

    public CellType getType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int getColumnIndex() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public CellAddress getAddress() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Object getValue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return xml value of the cell as it appears in the sheet format.
     */
    public String getRawValue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getFormula() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public BigDecimal asNumber() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a date-time interpretation of a numerical cell.
     * @return LocalDateTime or null if the cell is empty
     * @throws ExcelReaderException is the cell if not of numerical type or empty
     */
    public LocalDateTime asDate() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private LocalDateTime convertToDate(double value) {
        int wholeDays = (int) Math.floor(value);
        long millisecondsInDay = (long) (((value - wholeDays) * DAY_MILLISECONDS) + 0.5D);
        // sometimes the rounding for .9999999 returns the whole number of ms a day
        if (millisecondsInDay == DAY_MILLISECONDS) {
            wholeDays += 1;
            millisecondsInDay = 0;
        }
        int startYear = 1900;
        // Excel thinks 2/29/1900 is a valid date, which it isn't
        int dayAdjust = -1;
        if (workbook.isDate1904()) {
            startYear = 1904;
            // 1904 date windowing uses 1/2/1904 as the first day
            dayAdjust = 1;
        } else if (wholeDays < 61) {
            // Date is prior to 3/1/1900, so adjust because Excel thinks 2/29/1900 exists
            // If Excel date == 2/29/1900, will become 3/1/1900 in Java representation
            dayAdjust = 0;
        }
        LocalDate localDate = LocalDate.of(startYear, 1, 1).plusDays((long) wholeDays + dayAdjust - 1);
        LocalTime localTime = LocalTime.ofNanoOfDay(millisecondsInDay * 1_000_000);
        return LocalDateTime.of(localDate, localTime);
    }

    public Boolean asBoolean() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return value of a string cell.
     * @throws ExcelReaderException when the cell is not of string type
     * @see #getText()
     */
    public String asString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private void requireType(CellType requiredType) {
        if (type != requiredType && type != CellType.EMPTY) {
            throw new ExcelReaderException("Wrong cell type " + type + ", wanted " + requiredType);
        }
    }

    /**
     * @return string representation of the cell's value
     * @see #asString()
     */
    public String getText() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Integer getDataFormatId() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getDataFormatString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a string representation of this component for debug purposes.
     */
    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

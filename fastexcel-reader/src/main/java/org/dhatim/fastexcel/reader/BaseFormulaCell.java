package org.dhatim.fastexcel.reader;

public class BaseFormulaCell {

    private final CellAddress baseCelAddr;

    private final String formula;

    private final CellRangeAddress ref;

    public BaseFormulaCell(CellAddress baseCelAddr, String formula, CellRangeAddress ref) {
        this.baseCelAddr = baseCelAddr;
        this.formula = formula;
        this.ref = ref;
    }

    public CellAddress getBaseCelAddr() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getFormula() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public CellRangeAddress getRef() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

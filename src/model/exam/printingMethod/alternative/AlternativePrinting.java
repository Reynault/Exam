package model.exam.printingMethod.alternative;

import model.exam.Exam;
import model.exam.printingMethod.PrintingStrategy;

public abstract class AlternativePrinting implements PrintingStrategy {

    PrintingStrategy printingStrategy;

    public AlternativePrinting(PrintingStrategy printingStrategy) {
        this.printingStrategy = printingStrategy;
    }

    @Override
    public abstract String print(Exam exam);
}

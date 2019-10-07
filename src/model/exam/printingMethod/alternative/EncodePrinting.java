package model.exam.printingMethod.alternative;

import model.exam.Exam;
import model.exam.printingMethod.PrintingStrategy;

public class EncodePrinting extends AlternativePrinting {
    public EncodePrinting(PrintingStrategy printingStrategy) {
        super(printingStrategy);
    }

    @Override
    public String print(Exam exam) {
        return printingStrategy.print(exam);
    }
}

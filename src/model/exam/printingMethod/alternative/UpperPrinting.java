package model.exam.printingMethod.alternative;

import model.exam.Exam;
import model.exam.printingMethod.PrintingStrategy;

public class UpperPrinting extends AlternativePrinting {

    public UpperPrinting(PrintingStrategy printingStrategy) {
        super(printingStrategy);
    }

    @Override
    public String print(Exam exam) {
        return printingStrategy.print(exam).toUpperCase();
    }
}

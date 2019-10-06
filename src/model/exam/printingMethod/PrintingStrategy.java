package model.exam.printingMethod;

import model.exam.Exam;

public interface PrintingStrategy {
    String print(Exam exam);
}

package model;

import model.exam.Exam;

import java.util.ArrayList;
import java.util.List;

public class Printer {
    private List<Exam> exams;

    public Printer() {
        exams = new ArrayList<>();
    }

    public Printer(List<Exam> exams) {
        this.exams = exams;
    }

    public void addExam(Exam exam){
        exams.add(exam);
    }

    public String printExam(int exam){
        return exams.get(exam).print();
    }
}

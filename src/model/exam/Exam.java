package model.exam;

import model.exam.part.Part;
import model.exam.part.factory.PartFactory;
import model.exam.printingMethod.PrintingStrategy;
import model.exam.supervisor.Supervisor;

public class Exam {
    private String title;
    private Supervisor supervisor;

    private PartFactory partFactory;

    private Part theoretical;
    private Part practical;

    private PrintingStrategy printingStrategy;

    public Exam(String title, Supervisor supervisor, PartFactory partFactory, PrintingStrategy printingStrategy) {
        this.title = title;
        this.supervisor = supervisor;
        this.partFactory = partFactory;
        this.printingStrategy = printingStrategy;

        theoretical = partFactory.getTheoretical();
        practical = partFactory.getPractical();
    }

    public String print(){
        return printingStrategy.print(this);
    }

    public Part getTheoretical() {
        return theoretical;
    }

    public Part getPractical() {
        return practical;
    }

    public String getTitle() {
        return title;
    }

    public Supervisor getSupervisor() {
        return supervisor;
    }

    public void setStrategy(PrintingStrategy printingStrategy){
        this.printingStrategy = printingStrategy;
    }
}

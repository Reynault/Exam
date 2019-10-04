package model;

import model.supervisor.Supervisor;
import model.exam.Test;

public class BasicExam extends Exam{

    private Supervisor supervisor;
    private Test theoretical;
    private Test practical;

    public BasicExam(String name, Supervisor supervisor, Test theoretical, Test practical) {
        super(name);
        this.supervisor = supervisor;
        this.theoretical = theoretical;
        this.practical = practical;
    }

    @Override
    public String getPresentation() {
        StringBuilder sb = new StringBuilder();
        sb.append(theoretical.getPresentation());
        sb.append(practical.getPresentation());
        return sb.toString();
    }
}

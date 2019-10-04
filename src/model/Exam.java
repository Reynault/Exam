package model;

public abstract class Exam {
    private String name;

    public Exam(String name) {
        this.name = name;
    }

    public abstract String getPresentation();

}

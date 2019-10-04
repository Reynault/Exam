package model.exam;

import model.exam.session.Session;

import java.util.List;

public abstract class Test {
    private String name;
    private List<Session> sessions;

    public Test(String name) {
        this.name = name;
    }

    public abstract String getPresentation();
}

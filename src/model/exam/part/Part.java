package model.exam.part;

import model.exam.difficulty.Difficulty;
import model.exam.difficulty.Unspecified;

import java.util.ArrayList;
import java.util.List;

public abstract class Part {
    final List<Session> sessions;
    final String name;
    final Difficulty difficulty;

    public Part(String name, Difficulty difficulty) {
        this.difficulty = difficulty;
        this.name = name;
        sessions = new ArrayList<>();
    }

    public Part(String name) {
        this.difficulty = new Unspecified();
        this.name = name;
        sessions = new ArrayList<>();
    }

    public List<Session> getSessions() {
        return sessions;
    }

    public String getName() {
        return name;
    }
}

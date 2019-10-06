package model.exam.part;

import model.exam.difficulty.Difficulty;

public class Practical extends Part {

    public Practical(String name, Difficulty difficulty, Session session) {
        super(name, difficulty);
        sessions.add(session);
    }

}

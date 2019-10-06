package model.exam.part;

import model.exam.difficulty.Difficulty;

public class Theoretical extends Part{
    public Theoretical(String name, Difficulty difficulty, Session s1, Session s2){
        super(name, difficulty);
        sessions.add(s1);
        sessions.add(s2);
    }
}

package model.exam.part;

import model.exam.difficulty.Difficulty;
import model.exam.question.factory.QuestionFactory;

public class Theoretical extends Part{
    public Theoretical(String name, Difficulty difficulty, QuestionFactory questionFactory, QuestionFactory questionFactory2){
        super(name, difficulty);
        sessions.add(new Session(questionFactory, difficulty));
        sessions.add(new Session(questionFactory2, difficulty));
    }
}

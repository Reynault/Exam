package model.exam.part;

import model.exam.difficulty.Difficulty;
import model.exam.question.factory.QuestionFactory;

public class Practical extends Part {

    public Practical(String name, Difficulty difficulty, QuestionFactory questionFactory) {
        super(name, difficulty);
        sessions.add(new Session(questionFactory, difficulty));
    }

}

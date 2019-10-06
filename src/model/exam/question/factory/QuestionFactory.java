package model.exam.question.factory;

import model.exam.difficulty.Difficulty;
import model.exam.question.Question;

public abstract class QuestionFactory {
    private Difficulty difficulty;

    public QuestionFactory(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public abstract Question createQuestion();
}

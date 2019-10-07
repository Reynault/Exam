package model.exam.question.factory;

import model.exam.question.Question;

public abstract class QuestionFactory {
    int averageLength;

    public QuestionFactory() {
        averageLength = 20;
    }

    public void setAverageLength(int averageLength) {
        this.averageLength = averageLength;
    }

    public abstract Question createQuestion();
}

package model.exam.part;

import model.exam.difficulty.Difficulty;
import model.exam.question.Question;
import model.exam.question.factory.QuestionFactory;

import java.util.ArrayList;
import java.util.List;

public class Session {
    private List<Question> questions;
    private QuestionFactory questionFactory;
    private Difficulty difficulty;

    public Session(QuestionFactory questionFactory, Difficulty difficulty) {
        this.questionFactory = questionFactory;
        this.questions = new ArrayList<>();
        this.difficulty = difficulty;
    }

    public List<Question> getQuestions() {
        return questions;
    }
}

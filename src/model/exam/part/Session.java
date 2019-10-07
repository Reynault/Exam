package model.exam.part;

import model.exam.difficulty.Difficulty;
import model.exam.question.Question;
import model.exam.question.factory.QuestionFactory;

import java.util.ArrayList;
import java.util.List;

public class Session {
    private List<Question> questions;
    private QuestionFactory questionFactory;
    private int nbQuestion;

    public Session(QuestionFactory questionFactory, Difficulty difficulty) {
        this.questionFactory = questionFactory;
        questionFactory.setAverageLength(difficulty.questionLength());
        this.questions = new ArrayList<>();
        this.nbQuestion = difficulty.nbQuestion();
        constructSession();
    }

    public void constructSession(){
        for(int i = 0 ; i < nbQuestion; i++){
            questions.add(questionFactory.createQuestion());
        }
    }

    public List<Question> getQuestions() {
        return questions;
    }
}

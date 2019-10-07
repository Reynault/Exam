package model.exam.question.factory;

import model.exam.question.Question;

public class DrivingLicenceTechnical extends QuestionFactory{

    private Question[] questions;

    public DrivingLicenceTechnical() {
        super();
        questions = new Question[]{
                new Question("Speed", "What is max speed on Ds?"),
                new Question("Spec", "Max age of children in front"),
                new Question("Lights", "When to put lights on?"),
        };
    }

    @Override
    public Question createQuestion() {
        int numQuestion = (int)(questions.length * Math.random());
        return questions[numQuestion];
    }
}

package model.exam.question.factory;

import model.exam.question.Question;

public class DrivingLicenceQCM extends QuestionFactory{


    public DrivingLicenceQCM() {
        super();
    }

    @Override
    public Question createQuestion() {
        return new Question("Do you pipop ?", "yes");
    }
}

package model.exam.session;

import model.exam.session.question.Question;

import java.util.List;

public class Technical extends Session{
    public Technical(List<Question> questions) {
        super(questions);
    }

    @Override
    public String getQuestion() {
        return null;
    }

    @Override
    public String getAnswer() {
        return null;
    }
}

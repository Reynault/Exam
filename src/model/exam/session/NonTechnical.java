package model.exam.session;

import model.exam.session.question.Question;

import java.util.List;

public class NonTechnical extends Session {
    public NonTechnical(List<Question> questions) {
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

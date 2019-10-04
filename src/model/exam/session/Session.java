package model.exam.session;

import model.exam.session.question.Question;

import java.util.Iterator;
import java.util.List;

public abstract class Session {
    private List<Question> questions;
    private Iterator<Question> iterator;

    public Session(List<Question> questions) {
        this.questions = questions;
        iterator = questions.iterator();
    }

    public abstract String getQuestion();

    public abstract String getAnswer();

    public boolean hasQuestion(){
        if(iterator.hasNext()){
            return false;
        }else{
            return true;
        }
    }
}

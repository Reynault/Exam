package model.exam.session.question;

public class Question {
    private String question;
    private String reponse;

    public Question(String question, String reponse) {
        this.question = question;
        this.reponse = reponse;
    }

    public String getQuestion() {
        return question;
    }

    public String getReponse() {
        return reponse;
    }
}

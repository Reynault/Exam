package model.exam.question;

public class Question {
    private final String question;
    private final String reponse;

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

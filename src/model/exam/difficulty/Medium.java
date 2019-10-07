package model.exam.difficulty;

public class Medium implements Difficulty {
    @Override
    public int nbQuestion() {
        return Constant.MEDIUM_NBQUESTIONS;
    }

    @Override
    public int questionLength() {
        return Constant.MEDIUM_LENGTH;
    }
}

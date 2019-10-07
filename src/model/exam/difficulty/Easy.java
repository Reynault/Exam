package model.exam.difficulty;

public class Easy implements Difficulty {
    @Override
    public int nbQuestion() {
        return Constant.EASY_NBQUESTIONS;
    }

    @Override
    public int questionLength() {
        return Constant.EASY_LENGTH;
    }
}

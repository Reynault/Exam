package model.exam.difficulty;

public class Unspecified implements Difficulty{
    @Override
    public int nbQuestion() {
        return Constant.UNSPECIFIED_NBQUESTIONS;
    }

    @Override
    public int questionLength() {
        return Constant.UNSPECIFIED_LENGTH;
    }
}

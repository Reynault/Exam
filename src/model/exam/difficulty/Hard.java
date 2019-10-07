package model.exam.difficulty;

public class Hard implements Difficulty{
    @Override
    public int nbQuestion() {
        return Constant.HARD_NBQUESTIONS;
    }

    @Override
    public int questionLength() {
        return Constant.HARD_LENGTH;
    }
}

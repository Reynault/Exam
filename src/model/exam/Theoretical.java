package model.exam;

import model.exam.difficulty.Difficulty;

public class Theoretical extends Test{
    private Difficulty difficulty;

    public Theoretical(String name) {
        super(name);
    }

    @Override
    public String getPresentation() {
        return null;
    }
}

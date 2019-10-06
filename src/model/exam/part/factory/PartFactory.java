package model.exam.part.factory;

import model.exam.part.Part;

public abstract class PartFactory {
    public abstract Part getTheoretical();
    public abstract Part getPractical();
}

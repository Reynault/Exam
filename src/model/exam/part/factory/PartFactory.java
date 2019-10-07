package model.exam.part.factory;

import model.exam.part.Part;

public interface PartFactory {
    Part getTheoretical();

    Part getPractical();
}

package model.exam.part.factory;

import model.exam.difficulty.Easy;
import model.exam.difficulty.Medium;
import model.exam.part.Part;
import model.exam.part.Practical;
import model.exam.part.Theoretical;
import model.exam.question.factory.DrivingLicenceQCM;
import model.exam.question.factory.DrivingLicenceTechnical;

public class DrivingLicence implements PartFactory{
    @Override
    public Part getTheoretical() {
        Part part = new Theoretical("Cat B", new Easy(), new DrivingLicenceTechnical(), new DrivingLicenceTechnical());
        return part;
    }

    @Override
    public Part getPractical() {
        Part part = new Practical("Psychological", new Medium(), new DrivingLicenceQCM());
        return part;
    }
}

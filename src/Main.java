import model.Printer;
import model.exam.Exam;
import model.exam.part.factory.DrivingLicence;
import model.exam.printingMethod.StandardPrinting;
import model.exam.supervisor.Supervisor;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.addExam(new Exam("Driving",
                new Supervisor("Alonso"),
                new DrivingLicence(),
                new StandardPrinting()));
        System.out.println(printer.printExam(0));
    }
}

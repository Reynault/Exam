package model.exam.printingMethod;

import model.exam.Exam;
import model.exam.part.Part;
import model.exam.part.Session;
import model.exam.question.Question;

import java.util.List;

public class StandardPrinting implements PrintingStrategy{
    @Override
    public String print(Exam exam) {
        StringBuilder sb = new StringBuilder();
        sb.append("EXAM: "+exam.getTitle()+"\n");
        sb.append("PERSON IN CHARGE: "+exam.getSupervisor().getName()+"\n");
        sb.append("\n");

        Part theorical = exam.getTheoretical();
        Part practical = exam.getPractical();

        sb.append("Eliminatory test: "+practical.getName()+"\n");

        List<Session> sessions = practical.getSessions();
        List<Question> questions;
        Question q;

        for(int i = 0; i < sessions.size(); i++) {
            questions = sessions.get(i).getQuestions();
            for(int j = 0; j < questions.size(); j++){
                q = questions.get(j);
                sb.append("Test "+(j+1)+": "+q.getQuestion()+"\n");
                sb.append("  Expected : "+q.getReponse()+"\n");
            }
            sb.append("\n");
        }

        sb.append("\n");

        sb.append("Technical test: "+theorical.getName()+"\n");
        sessions = theorical.getSessions();
        for(int i = 0; i < sessions.size(); i++){
            questions = sessions.get(i).getQuestions();
            sb.append("Questions session "+(i+1)+":\n");
            for(int j = 0; j < questions.size(); j++){
                q = questions.get(j);
                sb.append("Question "+(j+1)+": "+q.getQuestion()+"\n");
                sb.append("  "+q.getReponse()+"\n");
            }
            sb.append("\n");
        }

        return sb.toString();
    }
}

import model.HistoryStudent;
import model.Student;
import model.ChemistryStudent;

public class Main {
    public static void main(String[] args) {

        Student student1 = new ChemistryStudent(5, "Mark", "Organic Chemistry");
        System.out.println(student1.getFirstLecture());

        Student student2 = new HistoryStudent(3, "Linda", "The Middle Ages");
        System.out.println(student2.getFirstLecture());

    }
}
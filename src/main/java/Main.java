import model.HistoryStudent;
import model.ChemistryStudent;

public class Main {
    public static void main(String[] args) {

        ChemistryStudent student1 = new ChemistryStudent();
        System.out.println(student1.getNumberOfModules());

        HistoryStudent student2 = new HistoryStudent();
        System.out.println(student2.getNumberOfModules());

    }
}
package model;

public class ChemistryStudent implements Student{
    private int id;
    private String name;
    private String firstLecture;

    // Constructor
    public ChemistryStudent(int id, String name, String firstLecture){
        this.id = id;
        this.name = name;
        this.firstLecture = firstLecture;
    }

    @Override
    public String getFirstLecture() {
        return "The first lecture of chemistry students is '" + firstLecture + "'.";
    }

}

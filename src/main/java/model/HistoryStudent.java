package model;

public class HistoryStudent implements Student{
    private int id;
    private String name;
    private String firstLecture;

    // Constructor
    public HistoryStudent(int id, String name, String firstLecture){
        this.id = id;
        this.name = name;
        this.firstLecture = firstLecture;
    }

    public String getFirstLecture() {
        return "The first lecture of history students is '" + firstLecture + "'.";
    }

}

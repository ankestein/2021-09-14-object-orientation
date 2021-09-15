package model;

abstract class Student {

    private int id;
    private String name;

    // Getter and setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // abstract method
    public abstract int getNumberOfModules();
}

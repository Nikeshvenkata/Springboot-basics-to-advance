package com.nikesh.springboot.java.telusko;

class StudentWithId {
    private int id;
    private String name;

    static {
        System.out.println("In static block");
    }

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

    @Override
    public String toString() {
        return "StudentWithId{" + "id=" + id + ", name='" + name + '\'' + '}';
    }

    public StudentWithId() {
        System.out.println("In No Args Constructor");
    }

    public StudentWithId(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

public class College {
    public static void main(String[] args) {
        StudentWithId Nikesh = new StudentWithId();
        Nikesh.setId(716);
        Nikesh.setName("Venkata Nikesh");
        System.out.println(Nikesh);

        StudentWithId Prem = new StudentWithId();
        Prem.setId(130);
        Prem.setName("Prem Kumar");
        System.out.println(Prem);
    }
}

package com.nikesh.springboot.java.telusko;

import lombok.Data;

import java.util.ArrayList;

@Data
class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +  "id=" + id + ", name='" + name + '\'' + '}';
    }
}

public class ArrayOfStudents {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "John"));
        students.add(new Student(2, "Jane"));
        students.add(new Student(3, "Jack"));

        for(int i = 0; i < students.size(); i++){
            System.out.print(students.get(i) + ", ");
        }
        System.out.println();

        System.out.println(students);

        String fName = "Nikesh";
        String lName = new String("Nikesh");
        System.out.println( (fName == lName) + " " + (fName.equals(lName)) );
        for (int i = 0; i < fName.length(); i++) {
            System.out.print(fName.charAt(i) + " ");
        }
        System.out.println();

        StringBuilder sb = new StringBuilder();
        sb.append("Venkata "); sb.append(fName);
        String fullName = sb.toString();
        System.out.println(fullName);
    }
}

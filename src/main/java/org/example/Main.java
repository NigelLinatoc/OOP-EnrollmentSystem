package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setID("000123");
        student1.setName("John Doe");
        student1.setProgram("Information Technology");

        System.out.println("Student ID: " + student1.getID());
        System.out.println("Student Name: " + student1.getName());
        System.out.println("Program: " + student1.getProgram());

        System.out.println(" ");

        Student student2 = new Student();
        student2.setID("000124");
        student2.setName("Jane Doe");
        student2.setProgram("Information Technology");

        System.out.println("Student ID: " + student2.getID());
        System.out.println("Student Name: " + student2.getName());
        System.out.println("Program: " + student2.getProgram());

//COURSES

        Course course1 = new Course();
        course1.setCourseID("0001");
        course1.setCourseName("Integrative Programming");
        course1.setProgram("Information Technology");

        System.out.println(" ");

        System.out.println("Course ID: " + course1.getCourseID());
        System.out.println("Course Name: " + course1.getCourseName());
        System.out.println("Program: " + course1.getProgram());



        Course course2 = new Course();
        course2.setCourseID("0002");
        course2.setCourseName("System Design and Development");
        course2.setProgram("Information Technology");

        System.out.println(" ");

        System.out.println("Course ID: " + course2.getCourseID());
        System.out.println("Course Name: " + course2.getCourseName());
        System.out.println("Program: " + course2.getProgram());


    }
}
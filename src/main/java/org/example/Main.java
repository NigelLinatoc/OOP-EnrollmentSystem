package org.example;

import org.example.model.Course;
import org.example.model.Student;
import org.example.service.StudentRegistration;
import org.example.service.CourseRegistration;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setID(000123);
        student1.setName("John Doe");
        student1.setProgram("Information Technology");

        // 1st Way to Display Code
//        System.out.println("Student ID: " + student1.getID());
//        System.out.println("Student Name: " + student1.getName());
//        System.out.println("Program: " + student1.getProgram());

//        System.out.println(" ");

        Student student2 = new Student();
        student2.setID(000124);
        student2.setName("Jane Doe");
        student2.setProgram("Information Technology");

        //2nd Way to Display Code
        student1.display();
        student2.display();

//        1st Way to display Code
//        System.out.println("Student ID: " + student2.getID());
//        System.out.println("Student Name: " + student2.getName());
//        System.out.println("Program: " + student2.getProgram());

//COURSES

        Course course1 = new Course();
        course1.setCourseID(0001);
        course1.setCourseName("Integrative Programming");
        course1.setProgram("Information Technology");

//        System.out.println(" ");

//        System.out.println("Course ID: " + course1.getCourseID());
//        System.out.println("Course Name: " + course1.getCourseName());
//        System.out.println("Program: " + course1.getProgram());


        Course course2 = new Course();
        course2.setCourseID(0002);
        course2.setCourseName("System Design and Development");
        course2.setProgram("Information Technology");

//        System.out.println(" ");

        //2nd way to Display
        course1.display();
        course2.display();

//        System.out.println("Course ID: " + course2.getCourseID());
//        System.out.println("Course Name: " + course2.getCourseName());
//        System.out.println("Program: " + course2.getProgram());


        StudentRegistration studentRegistration = new StudentRegistration();

        //CREATE
        studentRegistration.saveStudent(new Student(100, "John Ray", "BSIT" ));
        studentRegistration.saveStudent(new Student(102, "Eric Ericson", "BSIT" ));

        //READ
        studentRegistration.displayAllStudent();
        //UPDATE
        studentRegistration.updateStudent(new Student (101, "Johnny", "BSIT"));
        //REMOVE
        studentRegistration.removeStudent(new Student(100));
        studentRegistration.displayAllStudent();

        //COURSES
        CourseRegistration courseRegistration = new CourseRegistration();

        //CREATE
        courseRegistration.save(new Course(9000, "InteProg", "BSIT" ));
        courseRegistration.save(new Course(9002, "ITSYSDE", "BSIT" ));

        //READ
        courseRegistration.displayAll();
        //UPDATE
        courseRegistration.updateCourse(new Course (9000, "DisMath", "BSIT"));
        courseRegistration.updateCourse(new Course (9002, "ITPROMAN", "BSIT"));

        //REMOVE
        courseRegistration.removeCourse(new Course(9000));
        courseRegistration.displayAll();


    }
}
package org.example.model;

public class Student {

    private int studentID;
    private String studentName;
    private String program;

    public Student(){

    }
    public Student(int studentID){

        this.studentID = studentID;
    }
    public Student(int studentID, String studentName, String program){
        this.studentID = studentID;
        this.studentName = studentName;
        this.program = program;
    }
    public int getID(){
        return studentID;
    }

    public void setID(int studentID){

        this.studentID = studentID;
    }
    public String getName(){

        return studentName;
    }

    public void setName(String studentName){

        this.studentName = studentName;
    }
    public String getProgram(){

        return program;
    }
    public void setProgram(String program){
        this.program = program;

    }
    public void display(){
        System.out.println("Student ID: " + getID());
        System.out.println("Student Name: " + getName());
        System.out.println("Program: " + getProgram());
        System.out.println("");
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", studentName='" + studentName + '\'' +
                ", program='" + program + '\'' +
                '}';
    }
}

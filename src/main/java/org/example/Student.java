package org.example;

public class Student {

    private String studentID;
    private String studentName;
    private String program;

    public Student(){

    }
    public Student(String studentID, String studentName, String program){
        this.studentID = studentID;
        this.studentName = studentName;
        this.program = program;
    }
    public String getID(){
        return studentID;
    }

    public void setID(String studentID){
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
}

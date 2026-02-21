package org.example.service;
import org.example.model.Student;
import java.util.*;
public class StudentRegistration {

    ArrayList<Student> studentList = new ArrayList<>();
//CREATE
public void saveStudent(Student student){

    studentList.add(student);

}

//READ
public void displayAllStudent(){
    System.out.println(studentList);
}
//UPDATE
public void updateStudent(Student student){
for (int i = 0; i < studentList.size(); i++){
    if (studentList.get(i).getID()== (student.getID()))
    studentList.set(i, student);
    break;
    }
}

//REMOVE
public String removeStudent(Student student){
    for (int i = 0; i < studentList.size(); i++){
        if(studentList.get(i).getID() == (student.getID())){
            studentList.remove(i);
            return "Successfully Removed.";

        }
    }
return "Error";
    }


    }


package org.example.service;
import org.example.model.Student;

import java.util.*;
import org.example.model.Course;
public class CourseRegistration {
    ArrayList<Course> courseList = new ArrayList<>();
//CREATE
public void save(Course course){

    courseList.add(course);

}
//READ
public void displayAll() {
    System.out.println(courseList);
}
//UPDATE
    public void updateCourse(Course course){
        for (int i = 0; i < courseList.size(); i++){
            if (courseList.get(i).getCourseID()== (course.getCourseID()))
                courseList.set(i, course);
            break;
        }
    }
//REMOVE
public String removeCourse(Course course){
    for (int i = 0; i < courseList.size(); i++){
        if(courseList.get(i).getCourseID() == (course.getCourseID())) {
            courseList.remove(i);
            return "Successfully Removed.";
        }
        }
    return "Error";
}
}

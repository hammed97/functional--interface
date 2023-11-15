package org.example.school.entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Courses {
    private String courseTittle;
    private int courseUnit;

    

    @Override
    public String toString() {
        return "Courses{" +
                "courseTittle='" + courseTittle + '\'' +
                ", courseUnit=" + courseUnit +
                '}';
    }

    public String getCourseTittle() {
        return courseTittle;
    }

    public void setCourseTittle(String courseTittle) {
        this.courseTittle = courseTittle;
    }

    public int getCourseUnit() {
        return courseUnit;
    }

    public void setCourseUnit(int courseUnit) {
        this.courseUnit = courseUnit;
    }



public void addCoursesToMap() {
    HashMap<Integer, String> listOfCourses = new HashMap<>();
    listOfCourses.put(101, "Biology");
    listOfCourses.put(102, "Chemistry");
    listOfCourses.put(103, "Physics");
    listOfCourses.put(104, "Economics");
    listOfCourses.put(105, "English");
    listOfCourses.put(106, "Maths");
    System.out.println(listOfCourses);

}

public void addCourseTaught() {
        ArrayList<String> listOfCoursesTaught = new ArrayList<>();
        listOfCoursesTaught.add("Biology");
        listOfCoursesTaught.add("Chemistry");
        System.out.println(listOfCoursesTaught);

    }




}

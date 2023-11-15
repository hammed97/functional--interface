package org.example.school.serviceImpl;

import org.example.school.entities.*;
import org.example.school.services.SchoolServices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SchoolServiceImpl implements SchoolServices {

    @Override
    public String admitApplicant(Applicants applicants) {
        if (applicants.getAge()< 18){
            Students.studentsList.add(applicants);
            return "Eligible";
        }else {
            return "Not Eligible";
        }
    }


    @Override
    public void coursesTeacherTaught(Courses courses) {
        courses.addCourseTaught();
    }

    @Override
    public void coursesStudentTakes(Courses courses) {
        courses.addCoursesToMap();


    }

    @Override
    public String expelStudent(int percentage) {

        if (percentage >= 90 && percentage <=100) {
            return "Excellent";
        }
        else if (percentage >= 80) {
            return "Very Good";
        }
        else if (percentage >= 70) {
            return "Good";
        }
        else if (percentage >= 60) {
            return "Satisfactory";
        }else if (percentage >= 50) {
            return "Work Hard";
        }else if (percentage >= 40) {
            return "just Passed";
        }
        else {
            return "Failed";
        }
    }


}

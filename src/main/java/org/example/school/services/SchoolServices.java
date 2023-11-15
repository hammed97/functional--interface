package org.example.school.services;

import org.example.school.entities.*;

public interface SchoolServices {
    String admitApplicant(Applicants applicants);
    void coursesTeacherTaught(Courses courses);
    void coursesStudentTakes(Courses courses);
    String expelStudent(int percentage);
}

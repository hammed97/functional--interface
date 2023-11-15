package org.example.school.entities;

import java.util.ArrayList;
import java.util.List;

public class Teachers extends Staff{

    private String coursesTaught;
    private String scheduleForTeaching;
    private String employmentStatus;
    private String teachingExperience;


    @Override
    public String toString() {
        return "teacherId=" +getID() +
                " || email: " + getEmail() +
                " || firstName: " + getFirstName() +
                " || lastName: " + getLastName();
    }

    public Teachers() {
    }



    public String getCoursesTaught() {
        return coursesTaught;
    }

    public void setCoursesTaught(String coursesTaught) {
        this.coursesTaught = coursesTaught;
    }

    public String getScheduleForTeaching() {
        return scheduleForTeaching;
    }

    public void setScheduleForTeaching(String scheduleForTeaching) {
        this.scheduleForTeaching = scheduleForTeaching;
    }

    public String getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(String employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    public String getTeachingExperience() {
        return teachingExperience;
    }

    public void setTeachingExperience(String teachingExperience) {
        this.teachingExperience = teachingExperience;
    }

    public Teachers(String coursesTaught, String scheduleForTeaching, String employmentStatus, String teachingExperience) {
        this.coursesTaught = coursesTaught;
        this.scheduleForTeaching = scheduleForTeaching;
        this.employmentStatus = employmentStatus;
        this.teachingExperience = teachingExperience;

    }
}

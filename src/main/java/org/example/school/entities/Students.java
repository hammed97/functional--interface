package org.example.school.entities;

import org.example.school.enums.Gender;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Students extends User{
    public static List<Students> studentsList = new ArrayList<>();
    private String studentId;
    private int gradeLevel;
    private String guardianEmail1;
    private String guardianEmail2;
    private long guardianPhoneNumber;
    private LocalDate yearOfAdmission;
    private String courseDescription;
    private String courseUnit;



    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public String getGuardianEmail1() {
        return guardianEmail1;
    }

    public void setGuardianEmail1(String guardianEmail1) {
        this.guardianEmail1 = guardianEmail1;
    }

    public String getGuardianEmail2() {
        return guardianEmail2;
    }

    public void setGuardianEmail2(String guardianEmail2) {
        this.guardianEmail2 = guardianEmail2;
    }

    public Students() {
    }

    public Students(String firstName, String lastName, int age, String address, BigDecimal DOB, String email, long phoneNumber, Gender gender, String nextOfKin) {
        super(firstName, lastName, age, address, DOB, email, phoneNumber, gender, nextOfKin);
    }

    public Students(String firstName, String lastName, int age, String address, BigDecimal DOB, String email, long phoneNumber, Gender gender, String nextOfKin, String studentId, long guardianPhoneNumber, LocalDate yearOfAdmission, String courseDescription, String courseUnit) {
        super(firstName, lastName, age, address, DOB, email, phoneNumber, gender, nextOfKin);
        this.studentId = studentId;
        this.guardianPhoneNumber = guardianPhoneNumber;
        this.yearOfAdmission = yearOfAdmission;
        this.courseDescription = courseDescription;
        this.courseUnit = courseUnit;
    }

    public static List<Courses> listOfCoursesTakes = new ArrayList<>();

    public void listOfCourse () {
    }

    @Override
    public String toString() {
        return "studentId=" + studentId +
                " || Grade Level: " + gradeLevel +
                " || First Name: " + getFirstName() +
                " || Last Name: " + getLastName() +
                " || Email: " + getEmail() +
                " || GuardianEmail1: " + guardianEmail1 +
                " || GuardianEmail2: " + guardianEmail2 +
                " || isArchived: " + getIsArchived() +
                " || isDeleted: " + getIsDeleted();

    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public long getGuardianPhoneNumber() {
        return guardianPhoneNumber;
    }

    public void setGuardianPhoneNumber(long guardianPhoneNumber) {
        this.guardianPhoneNumber = guardianPhoneNumber;
    }

    public LocalDate getYearOfAdmission() {
        return yearOfAdmission;
    }

    public void setYearOfAdmission(LocalDate yearOfAdmission) {
        this.yearOfAdmission = yearOfAdmission;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public String getCourseUnit() {
        return courseUnit;
    }

    public void setCourseUnit(String courseUnit) {
        this.courseUnit = courseUnit;
    }


    }

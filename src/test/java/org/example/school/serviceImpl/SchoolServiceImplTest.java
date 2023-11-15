package org.example.school.serviceImpl;

import org.example.school.entities.Applicants;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SchoolServiceImplTest {
    SchoolServiceImpl schoolService = new SchoolServiceImpl();
    @Test
    void admitApplicantCheckApplicantIsLessThan18() {
        Applicants applicant = new Applicants();
        assertEquals("Eligible", schoolService.admitApplicant(applicant));
    }

    @Test
    void admitApplicantCheckApplicantIsMoreThan18() {
        Applicants applicant = new Applicants();
        assertNotEquals("Not Eligible", schoolService.admitApplicant(applicant));
    }

    /////////TEST TO EXPEL STUDENTS BASED ON PERCENTAGE//////

    @Test
    void expelStudentToCheckPercentageMoreThan90() {
        assertEquals("Excellent", schoolService.expelStudent(95));
    }

    @Test
    void expelStudentToCheckPercentageMoreThan80() {
        assertEquals("Very Good", schoolService.expelStudent(85));
    }
    @Test
    void expelStudentToCheckPercentageMoreThan70() {
        assertEquals("Good", schoolService.expelStudent(75));
    }
    @Test
    void expelStudentToCheckPercentageMoreThan60() {
        assertEquals("Satisfactory", schoolService.expelStudent(65));
    }
    @Test
    void expelStudentToCheckPercentageMoreThan50() {
        assertEquals("Work Hard", schoolService.expelStudent(55));
    }
    @Test
    void expelStudentToCheckPercentageMoreThan40() {
        assertEquals("just Passed", schoolService.expelStudent(45));
    }
    @Test
    void expelStudentToCheckPercentageLessThan40() {
        assertEquals("Failed", schoolService.expelStudent(35));
    }

}
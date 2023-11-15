package org.example.school.serviceImpl;

import org.example.Util.StudentUtil;
import org.example.Util.TeacherUtil;
import org.example.school.entities.Book;
import org.example.school.entities.Students;
import org.example.school.entities.Teachers;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryServiceImplTest {
    LibraryServiceImpl libraryService = new LibraryServiceImpl();

    @Test
    void juniorSeniorTeacherWhenBookIsAvailable() {
        List<Teachers> listOfTeacher = TeacherUtil.teachersList;
        List<Students> listOfSeniorStudents = StudentUtil.seniorStudent;
        List<Students> listOfJuniorStudents = StudentUtil.juniorStudent;
        Book book = new Book("Mosh", "How To Be Successful" , 5);

        assertTrue(libraryService.juniorSeniorTeacher(book, listOfJuniorStudents, listOfSeniorStudents, listOfTeacher));

    }

    @Test
    void juniorSeniorTeacherWhenBookIsNotAvailable() {
        List<Teachers> listOfTeacher = TeacherUtil.teachersList;
        List<Students> listOfSeniorStudents = StudentUtil.seniorStudent;
        List<Students> listOfJuniorStudents = StudentUtil.juniorStudent;
        Book book = new Book("Mosh", "How To Be Successful" , 0);

        assertFalse(libraryService.juniorSeniorTeacher(book, listOfJuniorStudents, listOfSeniorStudents, listOfTeacher));

    }

    @Test
    void firstComeFirstServedWhenBookIsAvailable() {
        List<Teachers> listOfTeacher = TeacherUtil.teachersList;
        List<Students> listOfSeniorStudents = StudentUtil.seniorStudent;
        List<Students> listOfJuniorStudents = StudentUtil.juniorStudent;
        Book book = new Book("John", "How To Make Money" , 6);

        assertTrue(libraryService.firstComeFirstServed(book,listOfJuniorStudents,listOfSeniorStudents,listOfTeacher));



    }
}
package org.example.school.services;

import org.example.school.entities.Book;
import org.example.school.entities.Students;
import org.example.school.entities.Teachers;
import org.example.school.entities.User;

import java.util.List;

public interface LibraryService <B,U>{
    //Book juniorSeniorTeacher(Book book, List<User> juniorStudent, List<User> seniorStudent, List<User> teacher);

    boolean juniorSeniorTeacher(Book book, List<Students> juniorStudent, List<Students> seniorStudent, List<Teachers> teacher);

    //B juniorSeniorTeacher(B book, List<U> user, List<U> juniorStudent, List<U> seniorStudent, List<U> teacher);
   // B firstComeFirstServed (B book, List<U> user, List<U> juniorStudent, List<U> seniorStudent, List<U> teacher);


    boolean firstComeFirstServed(Book book, List<Students> juniorStudent, List<Students> seniorStudent, List<Teachers> teacher);
}

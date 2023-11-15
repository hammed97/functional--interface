package org.example.school.services;

import org.example.exception.BookException;
import org.example.school.entities.Book;
import org.example.school.entities.Students;
import org.example.school.entities.Teachers;

import java.util.List;

@FunctionalInterface
public interface Functional_Interface <L,B,S,T>{
    L apply(B book, List<S> juniorStudent, List<S> seniorStudent, List<T> teacher) throws BookException;


}

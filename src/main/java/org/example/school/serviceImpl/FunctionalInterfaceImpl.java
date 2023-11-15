package org.example.school.serviceImpl;

import org.example.exception.BookException;
import org.example.school.entities.*;
import org.example.school.enums.Role;
import org.example.school.services.Functional_Interface;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.logging.Logger;

public class FunctionalInterfaceImpl {
    private Logger logger = Logger.getGlobal();
    public Functional_Interface<Boolean, Book, Students, Teachers> firstComeFirstServed = (book, juniorStudent, seniorStudent, teacher) ->{
        if(book.getQuantity() == 0){
         logger.info("Book taken");
            return false;
        }
        try{
            Queue<User> person = new LinkedList<>();
            if (!teacher.isEmpty() && juniorStudent.isEmpty() && !seniorStudent.isEmpty()){
                person.add(teacher.get(3));
                person.add(seniorStudent.get(2));
                person.add(teacher.get(1));
                person.add(juniorStudent.get(3));
                person.add(juniorStudent.get(2));
                person.add(juniorStudent.get(1));
            }
            while (book.getQuantity() > 0 && !person.isEmpty()) {
                User currentPerson = person.poll();
                if (currentPerson.getRole()== Role.TEACHER || currentPerson.getRole()== Role.SENIOR_STUDENT || currentPerson.getRole()== Role.JUNIOR_STUDENT){
                    logger.info(currentPerson.getRole() + "Collected Book Titled: " + book.getBookTittle());

                    book.setQuantity(book.getQuantity() -1);
                    logger.info("The Book Titled : " + book.getBookTittle() + "remain " + book.getQuantity() + "copies");
                    System.out.println();
                }
            }
            if (book.getQuantity()==0) {
                logger.info("All Books Titled: " + book.getBookTittle() + "TAKEN");
            }
        } catch (Exception e){
            throw new RuntimeException(e);
        }
        return true;

    };

    public Functional_Interface<Boolean,Book, Students,Teachers> juniorSeniorTeacher = (book, juniorStudent, seniorStudent,teacher) ->{
        if(book.getQuantity() == 0){
            throw new BookException(" Book taken");

        }

        try{
            PriorityQueue<User> person = new PriorityQueue<>(new LibraryComparator());

            if (!teacher.isEmpty() && !juniorStudent.isEmpty() && !seniorStudent.isEmpty()) {
                person.add(teacher.get(3));
                person.add(seniorStudent.get(2));
                person.add(teacher.get(1));
                person.add(juniorStudent.get(3));
                person.add(juniorStudent.get(2));
                person.add(juniorStudent.get(1));
            }
            while(book.getQuantity() > 0 && !person.isEmpty()) {
                User currentPerson = person.poll();
                if (currentPerson.getRole()== Role.TEACHER || currentPerson.getRole()==Role.SENIOR_STUDENT || currentPerson.getRole()==Role.JUNIOR_STUDENT){

                    logger.info(currentPerson.getRole() + " Collected Book Titled: " + book.getBookTittle());

                    book.setQuantity(book.getQuantity()-1);
                    logger.info("The Book Titled: " + book.getBookTittle() + " Remain " + book.getQuantity() + " copies ");
                    System.out.println();
                }

            }
            if (book.getQuantity()== 0) {
               throw new BookException("All Books Titled: " + book.getBookTittle() + " -> TAKEN ");
            }
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        return true;
    };
    }

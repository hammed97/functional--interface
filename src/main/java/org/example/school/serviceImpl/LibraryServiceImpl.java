package org.example.school.serviceImpl;

import org.example.school.entities.*;
import org.example.school.enums.Role;
import org.example.school.services.LibraryService;

import java.util.*;


public class LibraryServiceImpl implements LibraryService<Book, User> {

    @Override
    public boolean juniorSeniorTeacher(Book book, List<Students> juniorStudent, List<Students> seniorStudent, List<Teachers> teacher) {
       if(book.getQuantity() == 0){
           System.out.println(" Book taken");
           return false;
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

                    System.out.println(currentPerson.getRole() + " Collected Book Titled: " + book.getBookTittle());

                    book.setQuantity(book.getQuantity()-1);
                    System.out.println("The Book Titled: " + book.getBookTittle() + " Remain " + book.getQuantity() + " copies ");
                    System.out.println();
                }

            }
            if (book.getQuantity()== 0) {
                System.out.println("All Books Titled: " + book.getBookTittle() + " -> TAKEN ");
            }
            }catch (Exception e){
            throw new RuntimeException(e);
        }
        return true;
    }



    @Override
    public boolean firstComeFirstServed(Book book, List<Students> juniorStudent, List<Students> seniorStudent, List<Teachers> teacher) {
        if(book.getQuantity() == 0){
            System.out.println("Book taken");
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
                    System.out.println(currentPerson.getRole() + "Collected Book Titled: " + book.getBookTittle());

                    book.setQuantity(book.getQuantity() -1);
                    System.out.println("The Book Titled : " + book.getBookTittle() + "remain " + book.getQuantity() + "copies");
                    System.out.println();
                }
            }
            if (book.getQuantity()==0) {
                System.out.println("All Books Titled: " + book.getBookTittle() + "TAKEN");
            }
        } catch (Exception e){
            throw new RuntimeException(e);
        }
        return true;
    }


}

package org.example;

import org.example.Util.StudentUtil;
import org.example.Util.TeacherUtil;
import org.example.exception.BookException;
import org.example.school.entities.Applicants;
import org.example.school.entities.Book;
import org.example.school.entities.Courses;
import org.example.school.entities.User;
import org.example.school.serviceImpl.FunctionalInterfaceImpl;
import org.example.school.serviceImpl.LibraryServiceImpl;
import org.example.school.serviceImpl.SchoolServiceImpl;
import org.example.school.services.LibraryService;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, BookException {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Percentage marks");
//        int percentage = scanner.nextInt();
//
//        SchoolServiceImpl schoolService = new SchoolServiceImpl();
//        System.out.println(schoolService.expelStudent(percentage));
//        Applicants applicants = new Applicants();
//        applicants.setAge(14);
//        schoolService.admitApplicant(applicants);
//        Courses courses = new Courses();
//       schoolService.coursesTeacherTaught(courses);
//       schoolService.coursesStudentTakes(courses);

        System.out.println();


        StudentUtil studentUtil = new StudentUtil();
        System.out.println("INFO IN STUDENT CSV FILE");
        studentUtil.readStudentFile();


//
        TeacherUtil teacherUtil = new TeacherUtil();
        System.out.println("INFO IN TEACHER CSV FILE");
        teacherUtil.readTeacherFile();


//        StudentUtil.writeStudentFileCSV("src/main/java/org/example/school/filewritten/student.txt");
//
//        TeacherUtil.writeTeacherFileCSV("src/main/java/org/example/school/filewritten/teacher.txt");

        Book book1 = new Book("Mosh","How To Be Successful", 5);
        Book book2 = new Book("John", "How To Make Money", 6);

//        LibraryServiceImpl libraryService = new LibraryServiceImpl();
//        System.out.println("PRIORITY QUEUE");
//        libraryService.juniorSeniorTeacher(book1,StudentUtil.juniorStudent,StudentUtil.seniorStudent,TeacherUtil.teachersList);
//        System.out.println();
//        System.out.println("FIFO");
//        libraryService.firstComeFirstServed(book2,StudentUtil.juniorStudent,StudentUtil.seniorStudent, TeacherUtil.teachersList);

        FunctionalInterfaceImpl functionalInterface= new FunctionalInterfaceImpl();
        functionalInterface.firstComeFirstServed.apply(book2,StudentUtil.juniorStudent,StudentUtil.seniorStudent,TeacherUtil.teachersList);
        functionalInterface.juniorSeniorTeacher.apply(book1,StudentUtil.juniorStudent,StudentUtil.seniorStudent,TeacherUtil.teachersList);


    }
}
package org.example.Util;

import org.example.school.entities.Students;
import org.example.school.enums.Role;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentUtil {
    public static List<Students> seniorStudent = new ArrayList<>();
    public static List<Students> juniorStudent = new ArrayList<>();

    public void readStudentFile() throws IOException {
        String line;
        BufferedReader readFile = new BufferedReader(new FileReader("src/main/java/org/example/school/file/student_file1.csv"));

        boolean isHeader = true;
        while ((line = readFile.readLine()) !=null) {
            if (isHeader) {
                isHeader = false;
                continue;
            }
            String[] column = line.split("," , -1);
            for (int i =0; i < column.length; i++) {
                if (column[i].isBlank()) {
                    column[i] = null;
                }
            }
            String studentId = column[0];
            String firstName = column[1];
            String lastName = column[2];
            Integer gradeLevel = Integer.valueOf(column[3]);
            String email = column[4];
            String guardianEmail1 = column[5];
            String guardianEmail2 = column[6];
            String isArchived = column[7];
            String isDeleted = column[8];

            Students students = new Students();
            students.setGradeLevel(gradeLevel);

            if(students.getGradeLevel() > 3) {
                Students studentFile = new Students();
                studentFile.setStudentId(studentId);
                studentFile.setFirstName(firstName);
                studentFile.setLastName(lastName);
                studentFile.setGradeLevel(gradeLevel);
                studentFile.setEmail(email);
                studentFile.setGuardianEmail1(guardianEmail1);
                studentFile.setGuardianEmail2(guardianEmail2);
                studentFile.setIsArchived(isArchived);
                studentFile.setIsDeleted(isDeleted);
                studentFile.setRole(Role.SENIOR_STUDENT);

                seniorStudent.add(studentFile);
            } else {
                Students studentFile = new Students();
                studentFile.setStudentId(studentId);
                studentFile.setFirstName(firstName);
                studentFile.setLastName(lastName);
                studentFile.setGradeLevel(gradeLevel);
                studentFile.setEmail(email);
                studentFile.setGuardianEmail1(guardianEmail1);
                studentFile.setGuardianEmail2(guardianEmail2);
                studentFile.setIsArchived(isArchived);
                studentFile.setIsDeleted(isDeleted);
                studentFile.setRole(Role.JUNIOR_STUDENT);

                juniorStudent.add(studentFile);
            }


        }
        for(Students juniorStudentDataFile: juniorStudent) {
            System.out.println(juniorStudentDataFile);
        }
        for (Students seniorStudentDataFile : seniorStudent){
            System.out.println(seniorStudentDataFile);
        }
    }
//    public static void writeStudentFileCSV(String filePath) {
//        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
//            for (Students studentData : studentsList) {
//                writer.write(String.valueOf(studentData));
//                writer.newLine();
//            }
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }

}










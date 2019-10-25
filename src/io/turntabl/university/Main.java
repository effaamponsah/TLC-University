package io.turntabl.university;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
       List<Student> students = Arrays.asList(
               new Student("Dennis", "PS123", Year.FIRST),
               new Student("Ahmed", "PS122", Year.THIRD),
               new Student("James", "PS121", Year.SECOND),
               new Student("Abraham", "PS120", Year.SECOND),
               new Student("Andy", "PS125", Year.FIRST),
               new Student("Roland", "PS128", Year.FOURTH),
               new Student("Patrick", "PS125", Year.FIRST),
               new Student("Ben", "PS154", Year.SECOND),
               new Student("Evans", "PS193", Year.FIRST)
               );

       List<Student> firstYearStudents = new ArrayList<>();

        for (Student student: students ) {
            if (student.getStdYear() == Year.FIRST) {
                firstYearStudents.add(student);
            }
        }

    }
}

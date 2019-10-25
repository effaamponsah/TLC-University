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
               new Student("Abraham", "PS120", Year.FOURTH),
               new Student("Andy", "PS125", Year.FIRST),
               new Student("Roland", "PS128", Year.FOURTH),
               new Student("Arnold", "PS128", Year.FOURTH),
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

        Lecturer lect1 = new Lecturer("Prof. Sam", Courses.PROGRAMMING);

        Course introToProgramming = new Course(lect1, firstYearStudents, Arrays.asList(Year.FIRST));

        List<Student> thirdAndfourthYearStds = new ArrayList<>();
        for (Student student: students) {
            if (student.getStdYear() == Year.THIRD || student.getStdYear() == Year.FOURTH){
                thirdAndfourthYearStds.add(student);
            }
        }

        Lecturer lect2 = new Lecturer("Dr. Lateef", Courses.GARDENING);

        Course advancedGardening = new Course(lect2, thirdAndfourthYearStds, Arrays.asList(Year.THIRD,Year.FOURTH));


        Lecturer lect3 = new Lecturer("Mr Mensah", Courses.PHYSICS);

        List<Student> vowelBeginFourth = new ArrayList<>();

        for (Student student : students ) {
            if ( student.getStdName().startsWith("A") && student.getStdYear() == Year.FOURTH) {
                vowelBeginFourth.add(student);
            }
        }

        printList(vowelBeginFourth);

        Course physics =  new Course(lect3, vowelBeginFourth, Arrays.asList(Year.FOURTH));

    }

    private static void printList(List<Student> vowelBeginFourth) {
        System.out.println(vowelBeginFourth);
    }

}

package io.turntabl.university;

import java.util.List;

public class Course {
    private Lecturer lecturer;
    private List<Student> students;
    private Year courseYear;

    public Course(Lecturer lecturer, List<Student> students, Year courseYear) {
        this.lecturer = lecturer;
        this.students = students;
        this.courseYear = courseYear;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Year getCourseYear() {
        return courseYear;
    }

    public void setCourseYear(Year courseYear) {
        this.courseYear = courseYear;
    }
}



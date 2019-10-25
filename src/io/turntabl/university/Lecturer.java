package io.turntabl.university;

public class Lecturer {
    private String lectName;
    private Courses lecturedCourse;

    public Lecturer(String lectName, Courses lecturedCourse) {
        this.lectName = lectName;
        this.lecturedCourse = lecturedCourse;
    }

    public String getLectName() {
        return lectName;
    }

    public void setLectName(String lectName) {
        this.lectName = lectName;
    }

    public Courses getLecturedCourse() {
        return lecturedCourse;
    }

    public void setLecturedCourse(Courses lecturedCourse) {
        this.lecturedCourse = lecturedCourse;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "lectName='" + lectName + '\'' +
                ", lecturedCourse=" + lecturedCourse +
                '}';
    }
}


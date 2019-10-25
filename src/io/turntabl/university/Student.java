package io.turntabl.university;

public class Student {
    private String stdName;
    private String stdID;
    private Year stdYear;


    public Student(String stdName, String stdID, Year stdYear) {
        this.stdName = stdName;
        this.stdID = stdID;
        this.stdYear = stdYear;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public String getStdID() {
        return stdID;
    }

    public void setStdID(String stdID) {
        this.stdID = stdID;
    }

    public Year getStdYear() {
        return stdYear;
    }

    public void setStdYear(Year stdYear) {
        this.stdYear = stdYear;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stdName='" + stdName + '\'' +
                ", stdID='" + stdID + '\'' +
                ", stdYear=" + stdYear +
                '}';
    }
}









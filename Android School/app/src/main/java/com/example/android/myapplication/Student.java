package com.example.android.myapplication;

import androidx.annotation.NonNull;

public class Student {
    String studentName;
    int studentAge;
    int studentGrade;
    int studentImg;

    public Student(String studentName, int studentAge, int studentGrade, int studentImg) {
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentGrade = studentGrade;
        this.studentImg = studentImg;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public int getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(int studentGrade) {
        this.studentGrade = studentGrade;
    }

    public int getStudentImg() {
        return studentImg;
    }

    public void setStudentImg(int studentImg) {
        this.studentImg = studentImg;
    }

    @NonNull
    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentAge=" + studentAge +
                ", studentGrade=" + studentGrade +
                ", studentImg=" + studentImg +
                '}';
    }
}

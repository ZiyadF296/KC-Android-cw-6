package com.example.android.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    /**
     * عرفوا مصفوفة بإسم students
     * define an arraylist named students
     */
    final ArrayList<Student> students = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.studentListView);

        /*
          إكتبوا الكود بعد هذا السطر
          ضيفوا عناصر من الكلاس
          add objects from class Student
         */

        // Boys
        students.add(new Student("Ahmed", 21, 3, R.drawable.boy));
        students.add(new Student("Mohamed", 22, 4, R.drawable.boy1));
        students.add(new Student("Ali", 23, 5, R.drawable.boy2));

        // Girls
        students.add(new Student("Sarah", 20, 4, R.drawable.girl));
        students.add(new Student("Fatimah", 22, 3, R.drawable.girl1));

        StudentAdapter studentAdapter = new StudentAdapter(this, 0, students);

        listView.setAdapter(studentAdapter);
    }
}
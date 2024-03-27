package com.example.voxchoicefinalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro_page_layout);

        Button btnNeither = findViewById(R.id.btnNeither);
        Button btnTeacher = findViewById(R.id.btnTeacher);
        Button btnStudent = findViewById(R.id.btnStudent);

        btnTeacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to the layout for Teacher
                Intent intent = new Intent(MainActivity.this, TeacherActivity.class);
                startActivity(intent);
            }
        });

        btnStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to the layout for Student
                Intent intent = new Intent(MainActivity.this, StudentActivity.class);
                startActivity(intent);
            }
        });

        btnNeither.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Change layout here
                setContentView(R.layout.neither_layout);
            }
        });
    }
}
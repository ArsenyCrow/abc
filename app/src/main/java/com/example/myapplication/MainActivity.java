package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView plList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        plList = findViewById(R.id.tv_pl_names);
        String[] names = {"Java", "Python", "Ruby", "JavaScript", "Matlab", "C", "C++", "Swift",
        "Objective C", "Haskell", "Lisp", "Rust", "asdf"};
        plList.setText("");
        for(String name : names) {
            plList.append(name + '\n');

    }
  }
}
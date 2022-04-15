package com.sensai.library;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.sensai.test.SumFunct;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SumFunct.simplesum(this,"deneme");
    }
}
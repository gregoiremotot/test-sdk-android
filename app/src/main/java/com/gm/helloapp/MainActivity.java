package com.gm.helloapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.gm.hellolib.PrintHello;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PrintHello.printMsg();
    }
}
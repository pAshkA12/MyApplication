package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
TextView tvView;
TextView tV6;
int qqq=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Intent intet = getIntent();
        String na = intet.getStringExtra("fq");
        tvView.setText(na);
        qqq=Integer.parseInt(na);
        if(qqq == 3){tV6.setText("Оценка: Отлично ^-^");}
        else{
            if(qqq<3){tV6.setText("Оценка: Хорошо '-'");}}
    }
}
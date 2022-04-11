package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
EditText edit_name;
CheckBox ch1;
    CheckBox ch2;
    CheckBox ch3;
    String name;
    int kol=0;
    int prv=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonBack = (Button)findViewById(R.id.buttonBack);
        buttonBack.setOnClickListener(this);
        edit_name = findViewById(R.id.edit_name);
        ch1 = findViewById(R.id.ch1);
        ch2 = findViewById(R.id.ch2);
        ch3 = findViewById(R.id.ch3);
        }




    @Override
    public void onClick(View view) {

        name = edit_name.getText().toString().trim();
        String name_otv = "инкапсуляция";
        String name_otv_b = "Инкапсуляция";
        if(name.equals(name_otv) || name.equals(name_otv_b)){
            edit_name.setFocusable(false);
            if(kol==40){kol=40;}
            else{
            kol+=40;}}
        if(ch1.isChecked() && ch2.isChecked() && ch3.isChecked()){
            ch1.setFocusable(false);
            ch2.setFocusable(false);
            ch3.setFocusable(false);
            if(prv==30){prv=30;}
            else{
                prv+=30;}
        }

    String q = Integer.toString(kol+prv);
            Intent intet = new Intent(this, MainActivity2.class);
            intet.putExtra("fn",q);
            startActivity(intet);



}}
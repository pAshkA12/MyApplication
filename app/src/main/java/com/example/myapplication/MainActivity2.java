package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity  implements View.OnClickListener{
//TextView tvView;
RadioGroup rr;
RadioButton rB1;
    RadioButton rB2;
    RadioButton rB3;
    int obs=0;
    int wer=0;
    String OTV;
    String names;
    int set_en=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
       // tvView = (TextView) findViewById(R.id.tvView);
        Intent intet = getIntent();
        String names = intet.getStringExtra("fn");
        obs=Integer.parseInt(names);
        //tvView.setText(names);
        rB1=(RadioButton)findViewById(R.id.rB1);
        rB1.setOnClickListener(radioButtonClickListener);
        rB2=(RadioButton)findViewById(R.id.rB2);
        rB2.setOnClickListener(radioButtonClickListener);
        rB3=(RadioButton)findViewById(R.id.rB3);
        rB3.setOnClickListener(radioButtonClickListener);
        //obs=Integer.getInteger(names);
        Button buttonBack2 = (Button)findViewById(R.id.buttonBack2);
        buttonBack2.setOnClickListener(this);

        if(set_en==1){rB1.setEnabled(false);
            rB2.setEnabled(false);
            rB3.setEnabled(false);}
    }
    View.OnClickListener radioButtonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            RadioButton rb = (RadioButton)v;
            switch (rb.getId()) {
                case R.id.rB1: wer=30;

                rB1.setEnabled(false);
                    rB2.setEnabled(false);
                    rB3.setEnabled(false);
                    set_en=1;
                /*if(wer==30){wer=30;}
                    r
                    else
                {wer=wer+30;}*/
                    break;
                case R.id.rB2:
                    if((obs==30 || obs==0 || obs==40 || obs==70) & wer==30){wer=wer-30;}

                    rB1.setEnabled(false);
                    rB2.setEnabled(false);
                    rB3.setEnabled(false);
                    set_en=1;
                    break;

                    case R.id.rB3:
                    if((obs==30 || obs==0 || obs==40 || obs==70) & wer==30){wer=wer-30;}

                    rB1.setEnabled(false);
                        rB2.setEnabled(false);
                        rB3.setEnabled(false);
                        set_en=1;
                    /*else
                {if(obs==40 & wer==30){wer=wer-30;}}*/
                    break;

                default:
                    break;
            }

        }
    };


    @Override
    public void onClick(View view) {
        obs=obs+wer;
        OTV=Integer.toString(obs);
        Toast toast = Toast.makeText(this, "Вы набрали: " + OTV + " баллов", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.TOP, 0,160);   // import android.view.Gravity;
        toast.show();
        rB1.setFocusable(false);
        rB2.setFocusable(false);
        rB3.setFocusable(false);




    }}

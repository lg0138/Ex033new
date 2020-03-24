package com.example.ex033new;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btnClear;
    TextView txtCounter;
    TextView txtAnswer;
    TextView txtNum1;
    TextView txtNum2;
    Button btnBig;
    Button btnEq;
    Button btnSmall;
    Button btnGo;
    int sum=0;
    int win=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnClear = (Button) findViewById(R.id.btnClear);
        txtCounter = (TextView)findViewById(R.id.txtCounter);
        txtAnswer = (TextView)findViewById(R.id.txtAnswer);
        txtNum1 = (TextView)findViewById(R.id.txtNum1);
        txtNum2 = (TextView)findViewById(R.id.txtNum2);
        btnBig = (Button) findViewById(R.id.btnBig);
        btnEq = (Button) findViewById(R.id.btnEq);
        btnSmall = (Button) findViewById(R.id.btnSmall);
        btnGo = (Button) findViewById(R.id.btnGo);

    }

    public void clear(View view) {
        txtCounter.setText("0");
        sum=0;
        win=0;
    }

    public void eq(View view) {
        double percent=0;
        String st1=txtNum1.getText().toString();
        int n1 = Integer.parseInt(st1);
        String st2=txtNum2.getText().toString();
        int n2 = Integer.parseInt(st2);
        sum++;
        if(n1==n2){
            txtAnswer.setText("True");
            win++;
        }
        else{
            txtAnswer.setText("False");
        }
        percent = ((double)win/sum)*100;
        txtCounter.setText(String.valueOf(percent));
    }

    public void big(View view) {
        double percent=0;
        String st1=txtNum1.getText().toString();
        int n1 = Integer.parseInt(st1);
        String st2=txtNum2.getText().toString();
        int n2 = Integer.parseInt(st2);
        sum++;
        if(n1<n2){
            txtAnswer.setText("True");
            win++;
        }
        else{
            txtAnswer.setText("False");
        }
        percent = ((double)win/sum)*100;

        txtCounter.setText(String.valueOf(percent));
    }

    public void small(View view) {
        double percent=0;
        String st1=txtNum1.getText().toString();
        int n1 = Integer.parseInt(st1);
        String st2=txtNum2.getText().toString();
        int n2 = Integer.parseInt(st2);
        sum++;
        if(n1>n2){
            txtAnswer.setText("True");
            win++;
        }
        else{
            txtAnswer.setText("False");
        }
        percent = ((double)win/sum)*100;
        txtCounter.setText(String.valueOf(percent));

    }

    public void go(View view) {
        int number1 = new Random().nextInt((100 - 1) + 1) + 1;
        int number2 = new Random().nextInt((100 - 1) + 1) + 1;
        txtNum1.setText(String.valueOf(number1));
        txtNum2.setText(String.valueOf(number2));


    }
}

package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void plusClick(View v){
        EditText num1 = (EditText) findViewById(R.id.num1);
        EditText num2 = (EditText) findViewById(R.id.num2);
        TextView res = (TextView) findViewById(R.id.textView);

        int l1 = Integer.parseInt(num1.getText().toString());
        int l2 = Integer.parseInt(num2.getText().toString());
        int r = l1+l1;
        res.setText(Integer.toString(r));
    }
    public void minusClick(View v){
        EditText num1 = (EditText) findViewById(R.id.num1);
        EditText num2 = (EditText) findViewById(R.id.num2);
        TextView res = (TextView) findViewById(R.id.textView);

        int l1 = Integer.parseInt(num1.getText().toString());
        int l2 = Integer.parseInt(num2.getText().toString());
        int r = l1-l1;
        res.setText(Integer.toString(r));
    }
    public void nogClick(View v){
        EditText num1 = (EditText) findViewById(R.id.num1);
        EditText num2 = (EditText) findViewById(R.id.num2);
        TextView res = (TextView) findViewById(R.id.textView);

        int l1 = Integer.parseInt(num1.getText().toString());
        int l2 = Integer.parseInt(num2.getText().toString());
        int r = l1+l1;
        res.setText(Integer.toString(r));
    }
    public void delClick(View v){
        EditText num1 = (EditText) findViewById(R.id.num1);
        EditText num2 = (EditText) findViewById(R.id.num2);
        TextView res = (TextView) findViewById(R.id.textView);

        int l1 = Integer.parseInt(num1.getText().toString());
        int l2 = Integer.parseInt(num2.getText().toString());
        int r = l1+l1;
        res.setText(Integer.toString(r));
    }
}
package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText firstNum;
    private EditText editText2;


    public void clickPlus (View view) {
        int first = Integer.parseInt(firstNum.getText().toString());
        int second = Integer.parseInt(editText2.getText().toString());

        add(first,second);
    }

    public void clickMinus (View view) {
        int first = Integer.parseInt(firstNum.getText().toString());
        int second = Integer.parseInt(editText2.getText().toString());

        subtract(first, second);

    }

    public void clickMultiply (View view) {
        int first = Integer.parseInt(firstNum.getText().toString());
        int second = Integer.parseInt(editText2.getText().toString());

        multiply(first, second);
    }

    public void clickDivide (View view) {
        int first = Integer.parseInt(firstNum.getText().toString());
        int second = Integer.parseInt(editText2.getText().toString());

        divide(first, second);
    }


    public void goToActivity2(String str) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message", str);
        startActivity(intent);

    }

    public void add(int val1, int val2) {
        int total = val1 + val2;
        String value = String.valueOf(total);
        goToActivity2(value);

    }

    public void subtract(int val1, int val2) {
        int total = val1 - val2;
        String value = String.valueOf(total);
        goToActivity2(value);

    }

    public void multiply(int val1, int val2) {
        int total = val1 * val2;
        String value = String.valueOf(total);
        goToActivity2(value);
    }

    public void divide(int val1, int val2) {
        int total = val1 / val2;
        String value = String.valueOf(total);
        goToActivity2(value);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstNum = (EditText) findViewById(R.id.firstNum);
        editText2 = (EditText) findViewById(R.id.editText2);

    }

}
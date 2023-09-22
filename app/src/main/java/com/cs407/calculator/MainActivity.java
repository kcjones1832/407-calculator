package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToActivity(int num, String err) {
        Intent intent = new Intent(this, DisplayResult.class);
        intent.putExtra("number", num);
        intent.putExtra("error", err);
        startActivity(intent);
    }

    public void add(View view) {
        EditText editText = (EditText) findViewById(R.id.editTextText);
        EditText editText2 = (EditText) findViewById(R.id.editTextText2);

        //Toast.makeText(MainActivity.this, editText.getText().getClass().toString(), Toast.LENGTH_LONG).show();
        Log.i("INFO", editText.getText().toString());
        int num1 = Integer.parseInt(editText.getText().toString().trim());
        int num2 = Integer.parseInt(editText2.getText().toString().trim());

        goToActivity(num1+num2, "");
    }

    public void subtract(View view) {
        EditText editText = (EditText) findViewById(R.id.editTextText);
        EditText editText2 = (EditText) findViewById(R.id.editTextText2);
        int num1 = Integer.parseInt(editText.getText().toString());
        int num2 = Integer.parseInt(editText2.getText().toString());

        goToActivity(num1-num2, "");
    }

    public void multiply(View view) {
        EditText editText = (EditText) findViewById(R.id.editTextText);
        EditText editText2 = (EditText) findViewById(R.id.editTextText2);
        int num1 = Integer.parseInt(editText.getText().toString());
        int num2 = Integer.parseInt(editText2.getText().toString());

        goToActivity(num1*num2, "");
    }

    public void divide(View view) {
        EditText editText = (EditText) findViewById(R.id.editTextText);
        EditText editText2 = (EditText) findViewById(R.id.editTextText2);
        int num1 = Integer.parseInt(editText.getText().toString());
        int num2 = Integer.parseInt(editText2.getText().toString());

        if (num2 == 0) {
            goToActivity(0, "Error: divide by 0");
        }
        else {
            goToActivity(num1/num2, "");
        }
    }
}
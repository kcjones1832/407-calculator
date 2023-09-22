package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayResult extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_result);

        textView = (TextView)findViewById(R.id.textDisplay);
        Intent intent = getIntent();
        String str = intent.getStringExtra("error");
        int num = intent.getIntExtra("number", 0);

        if (str.equals("")) {
            textView.setText("" + num);
        }
        else {
            textView.setText(str);
        }

    }
}
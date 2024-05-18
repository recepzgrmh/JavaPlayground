package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button calculate;
    private EditText age, height, weight;
    private TextView finalTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // EditText
        age = findViewById(R.id.ageEdit);
        height = findViewById(R.id.editHeight);
        weight = findViewById(R.id.editWeight);

        // TextView
        finalTxt = findViewById(R.id.finalTxt);

        // Button
        calculate = findViewById(R.id.calculate);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int intHeight = Integer.parseInt(height.getText().toString());
                    int intWeight = Integer.parseInt(weight.getText().toString());
                    double heightInMeters = intHeight / 100.0;
                    double txt = intWeight / Math.pow(heightInMeters, 2);
                    finalTxt.setText(String.valueOf(txt));
                } catch (NumberFormatException e) {
                    finalTxt.setText("Invalid input!");
                }
            }
        });
    }
}

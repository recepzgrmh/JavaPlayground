package com.example.secondapp;

import android.os.Bundle;
import android.os.SystemClock;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private CheckBox firstCheck, secondCheck, thirdCheck, fourthCheck;
    private RadioGroup radioGroup;
    private RadioButton erkek, kiz, diger;
    private TextView txt;

    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = findViewById(R.id.txt);

        firstCheck = findViewById(R.id.firstClass);
        secondCheck = findViewById(R.id.secondClass);
        thirdCheck = findViewById(R.id.thirdClass);
        fourthCheck = findViewById(R.id.fourthClass);

        radioGroup = findViewById(R.id.radioGroup);
        erkek = findViewById(R.id.erkek);
        kiz = findViewById(R.id.kiz);
        diger = findViewById(R.id.other);

        progressBar = findViewById(R.id.progressBar);

        firstCheck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    txt.append("Sporla ilgilisin\n");
                } else {
                    txt.append("Sporla ilgili değilsin\n");
                }
            }
        });

        secondCheck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    txt.append("Müzikle ilgilisin\n");
                } else {
                    txt.append("Müzikle ilgili değilsin\n");
                }
            }
        });

        thirdCheck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    txt.append("Seyahat etmekle ilgilisin\n");
                } else {
                    txt.append("Seyahat etmekle ilgili değilsin\n");
                }
            }
        });

        fourthCheck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    txt.append("Okumakla ilgilisin\n");
                } else {
                    txt.append("Okumakla ilgili değilsin\n");
                }
            }
        });

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.erkek) {
                    txt.append("Erkeksin\n");
                } else if (checkedId == R.id.kiz) {
                    txt.append("Kızsın\n");
                } else if (checkedId == R.id.other) {
                    txt.append("Diğer\n");
                }
            }
        });


        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0 ; i < 100; i++){
                    progressBar.incrementProgressBy(1);
                    SystemClock.sleep(500);
                }
            }
        });

        thread.start();

    }
}

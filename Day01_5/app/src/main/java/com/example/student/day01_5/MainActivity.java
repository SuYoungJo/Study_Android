package com.example.student.day01_5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    LinearLayout inner;
    RadioButton radioButton1, radioButton2, radioButton3;
    Button btnFinish, btnInit;
    ImageView imgChoice;
    Switch swQuestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        makeUi();
    }

    public void makeUi() {
        inner = findViewById(R.id.inner);
        swQuestion = findViewById(R.id.swQuestion);
        radioButton1 = findViewById(R.id.radioButton1);
        radioButton2 = findViewById(R.id.radioButton2);
        radioButton3 = findViewById(R.id.radioButton3);
        btnFinish = findViewById(R.id.btnFinish);
        btnInit = findViewById(R.id.btnInit);
        imgChoice = findViewById(R.id.imgChoice);

        radioButton1.setOnClickListener(this);
        radioButton2.setOnClickListener(this);
        radioButton3.setOnClickListener(this);
        btnFinish.setOnClickListener(this);
        btnInit.setOnClickListener(this);
        swQuestion.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                Toast.makeText(MainActivity.this, ""+isChecked, Toast.LENGTH_SHORT).show();
                if(isChecked == true){
                    inner.setVisibility(View.VISIBLE);
                }else{
                    inner.setVisibility(View.INVISIBLE);
                }
            }
        });
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.radioButton1){
            imgChoice.setImageResource(R.drawable.android1);
        }else if(v.getId() == R.id.radioButton2){
            imgChoice.setImageResource(R.drawable.android2);
        }else if(v.getId() == R.id.radioButton3){
            imgChoice.setImageResource(R.drawable.android3);
        }else if(v.getId() == R.id.btnFinish){
            finish();
        }else if(v.getId() == R.id.btnInit){
            imgChoice.setImageResource(R.drawable.ic_launcher_background);
            swQuestion.setChecked(false);
        }
    }
}

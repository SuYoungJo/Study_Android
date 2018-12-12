package com.example.student.day02_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn1, btn2, btn3;
    LinearLayout layout1, layout2, layout3;
    FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        makeUi();
    }

    public void makeUi() {
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        layout1 = findViewById(R.id.layout1);
        layout2 = findViewById(R.id.layout2);
        layout3 = findViewById(R.id.layout3);
        frameLayout = findViewById(R.id.frameLayout);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        frameLayout.removeAllViews();

        if(v.getId() == R.id.btn1){
            frameLayout.addView(layout1);
//            frameLayout.removeView(layout2);
//            frameLayout.removeView(layout3);
        }else if(v.getId() == R.id.btn2){
            frameLayout.addView(layout2);
//            frameLayout.removeView(layout1);
//            frameLayout.removeView(layout3);
        }else if(v.getId() == R.id.btn3){
            frameLayout.addView(layout3);
//            frameLayout.removeView(layout1);
//            frameLayout.removeView(layout2);

        }
    }
}

package com.example.student.day01_4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox checkBox;
    LinearLayout inner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkBox = findViewById(R.id.checkBox);
        inner = findViewById(R.id.inner);

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(MainActivity.this, ""+isChecked, Toast.LENGTH_SHORT).show();
                if(isChecked == true){
                    inner.setVisibility(View.VISIBLE);
                }else{
                    inner.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}

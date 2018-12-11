package com.example.student.day01_1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText editText;
    ImageView imageView;
    Button button1, button2;
    RadioButton radioButton1, radioButton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        makeUi();
    }

    public void makeUi() {
        button1 = findViewById(R.id.lButton1);
        button2 = findViewById(R.id.lButton2);
        editText = findViewById(R.id.lEditText);
        imageView = findViewById(R.id.lImageView);
        radioButton1 = findViewById(R.id.lRadiobutton1);
        radioButton2 = findViewById(R.id.lRadiobutton2);
        imageView = findViewById(R.id.lImageView);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        radioButton1.setOnClickListener(this);
        radioButton2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.lButton1){
            String str = editText.getText().toString();
            Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
        }else if(v.getId() == R.id.lButton2){
            String str = editText.getText().toString();
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + str));
            startActivity(intent);
        }else if(v.getId() == R.id.lRadiobutton1){
            imageView.setImageResource(R.drawable.p1);
        }else if(v.getId() == R.id.lRadiobutton2){
            imageView.setImageResource(R.drawable.p2);
        }

    }
}

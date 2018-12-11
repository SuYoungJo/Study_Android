package com.example.student.day01;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button jButton1, jButton2, jButton3, jButton4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        makeUi();

    }

    private void makeUi() {
        jButton1 = findViewById(R.id.lButton1);
        jButton2 = findViewById(R.id.lButton2);
        jButton3 = findViewById(R.id.lButton3);
        jButton4 = findViewById(R.id.lButton4);

        jButton1.setOnClickListener(this);
        jButton2.setOnClickListener(this);
        jButton3.setOnClickListener(this);
        jButton4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.lButton1){
            Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.nate.com"));
            startActivity(mIntent);
        }else if (v.getId() == R.id.lButton2) {
            Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:/911"));
            startActivity(mIntent);
        }else if (v.getId() == R.id.lButton3){
            Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("content://media/internal/images/media"));
            startActivity(mIntent);
        }else if (v.getId() == R.id.lButton4){
            finish();
        }
    }
}

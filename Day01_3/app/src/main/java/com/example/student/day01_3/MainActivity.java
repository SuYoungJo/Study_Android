package com.example.student.day01_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText inputNum1, inputNum2;
    Button btnAdd, btnSub, btnMul, btnDiv;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        makeUi();
    }

    public void makeUi() {
        inputNum1=findViewById(R.id.inputNum1);
        inputNum2=findViewById(R.id.inputNum2);
        btnAdd=findViewById(R.id.btnAdd);
        btnSub=findViewById(R.id.btnSub);
        btnMul=findViewById(R.id.btnMul);
        btnDiv=findViewById(R.id.btnDiv);
        txtResult=findViewById(R.id.txtResult);

        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String num1= inputNum1.getText().toString();
        String num2= inputNum2.getText().toString();
        Integer result = 0;
        if(v.getId() == R.id.btnAdd){
            result = Integer.parseInt(num1) + Integer.parseInt(num2);
        }else if(v.getId() == R.id.btnSub){
            result = Integer.parseInt(num1) - Integer.parseInt(num2);
        }else if(v.getId() == R.id.btnMul){
            result = Integer.parseInt(num1) * Integer.parseInt(num2);
        }else if(v.getId() == R.id.btnDiv){
            result = Integer.parseInt(num1) / Integer.parseInt(num2);
        }

        txtResult.setText(result.toString());
    }
}

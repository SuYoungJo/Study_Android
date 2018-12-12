package com.example.student.day02_2;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText editInput1, editInput2;
    private Button[] btnNums = new Button[10];
    private Integer[] btnNumIds = {R.id.btnNum0, R.id.btnNum1, R.id.btnNum2, R.id.btnNum3, R.id.btnNum4, R.id.btnNum5, R.id.btnNum6, R.id.btnNum7, R.id.btnNum8, R.id.btnNum9};
    private Button btnAdd, btnSub, btnMul, btnDiv;
    private TextView txtResult;

    private String num1, num2;
    private Double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        makeUi();
    }

    private void makeUi() {
        editInput1 = findViewById(R.id.editInput1);
        editInput2 = findViewById(R.id.editInput2);
        for (int i = 0; i < btnNums.length; i++){
            btnNums[i] = findViewById(btnNumIds[i]);
        }

        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);
        txtResult = findViewById(R.id.txtResult);


        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        for (int i = 0; i < btnNums.length; i++){
            final int index; //필수!!
            index = i;
            btnNums[index].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(editInput1.isFocused() == true){
                        num1 = editInput1.getText().toString() + btnNums[index].getText().toString();
                        editInput1.setText(num1);
                    }else if(editInput2.isFocused() == true){
                        num2 = editInput2.getText().toString() + btnNums[index].getText().toString();
                        editInput2.setText(num2);
                    }else {
                        Toast.makeText(getApplicationContext(), "먼저 EditText를 선택하세요", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View v) {
        num1 = editInput1.getText().toString();
        num2 = editInput2.getText().toString();
        double getNum1 = Double.parseDouble(num1);
        double getNum2 = Double.parseDouble(num2);

        if(!num1.equals("") && num1 != null && !num2.equals("") && num2 != null ) {
            if (v.getId() == R.id.btnAdd) {
                result = getNum1 + getNum2;
            } else if (v.getId() == R.id.btnSub) {
                result = getNum1 - getNum2;
            } else if (v.getId() == R.id.btnMul) {
                result = getNum1 * getNum2;
            } else if (v.getId() == R.id.btnDiv && !num2.equals("0")) {
                result = getNum1 / getNum2;
            } else {
                result = 0.0;
            }
        }else {
            result = 0.0;
        }

        txtResult.setText("계산결과 : " + result.toString());
    }
}

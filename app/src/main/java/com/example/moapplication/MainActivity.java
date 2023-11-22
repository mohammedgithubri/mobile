package com.example.moapplication;

import static com.example.moapplication.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button buttonAdd,buttonSub,buttonMul,buttonDiv;
    EditText editTextn1,editTextn2;
    TextView textView;
    int num1,num2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
        buttonAdd=findViewById(id.btn_add);
        buttonSub=findViewById(id.btn_sub);
        buttonMul=findViewById(id.btn_mul);
        buttonDiv=findViewById(id.btn_div);
        editTextn1=findViewById(id.number1);
        editTextn2=findViewById(id.number2);
        textView=findViewById(id.answer);


        buttonAdd.setOnClickListener(this);
        buttonSub.setOnClickListener(this);
        buttonMul.setOnClickListener(this);
        buttonDiv.setOnClickListener(this);



    }
/** @noinspection SuspiciousIndentAfterControlStatement*/
public int getIntFromEditText(EditText editText){
    if(editText.getText().toString().equals("")){
        Toast.makeText(this,  "Enter number",Toast.LENGTH_SHORT).show();
        return 0;
    }
    else
    return Integer.parseInt(editText.getText().toString());
}

    /** @noinspection SwitchStatementWithoutDefaultBranch*/
    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {
num1=getIntFromEditText(editTextn1);
num2=getIntFromEditText(editTextn2);
switch (view.getId()){
    case R.id.btn_add:

        textView.setText("Answer=" +(num1+num2));
        break;
    case R.id.btn_sub:
        textView.setText("Answer="+(num1-num2));
        break;
    case R.id.btn_mul:
        textView.setText("Answer="+(num1*num2));
        break;
    case R.id.btn_div:
        textView.setText("Answer="+((float)num1/(float) num2));
        break;

      }
    }
    /*
     * group memebers
     * name                                                  id
     * 1. Ermias bekel                                    0253/13
     * 2.kore melaku                                      0142/13
     * 3.Bol Oguek                                        0055/13
       4.kefita kantale                                   0133/13
     * */
}

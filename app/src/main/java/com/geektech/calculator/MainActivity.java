package com.geektech.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Integer first,second,result,result1,result2,result3,result4,result5;
    private Boolean isOperationClick;
    private String operation;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_view);
    }

    public void onNumberClick(View view) {

        switch (view.getId()) {
            case R.id.one:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("1");
                } else {
                    textView.append("1");
                }
                isOperationClick=false;

                break;

            case R.id.two:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("2");
                } else {
                    textView.append("2");
                }
                isOperationClick=false;

                break;

            case R.id.three:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("3");
                } else {
                    textView.append("3");
                }
                isOperationClick=false;

                break;
            case R.id.four:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("4");
                } else {
                    textView.append("4");
                }
                isOperationClick=false;

                break;

            case R.id.five:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("5");
                } else {
                    textView.append("5");
                }
                isOperationClick=false;

                break;

            case R.id.six:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("6");
                } else {
                    textView.append("6");
                }
                isOperationClick=false;

                break;

            case R.id.seven:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("7");
                } else {
                    textView.append("7");
                }
                isOperationClick=false;

                break;

            case R.id.eight:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("8");
                } else {
                    textView.append("8");
                }
                isOperationClick=false;

                break;

            case R.id.nine:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("9");
                } else {
                    textView.append("9");
                }
                isOperationClick=false;

                break;

            case R.id.zero:
                if (textView.getText().toString().equals("") || isOperationClick) {
                    textView.setText("0");
                } else {
                    textView.append("0");
                }
                isOperationClick=false;
                break;
            case R.id.clear:
                    textView.setText("0");
                    first = 0;
                    second = 0;
                    break;

        }
    }

    public void onOperationClick(View view) {
        switch (view.getId()){
            case R.id.plus:
                operation = "+";
                first=Integer.valueOf(textView.getText().toString());
                isOperationClick=true;
                break;

            case R.id.division:
                operation="/";
                first=Integer.valueOf(textView.getText().toString());
                isOperationClick=true;
                break;
            case R.id.minus:
                operation="-";
                first=Integer.valueOf(textView.getText().toString());
                isOperationClick=true;
                break;
             case R.id.multiply:
                 operation="*";
                 first=Integer.valueOf(textView.getText().toString());
                 isOperationClick=true;
                 break;
             case R.id.interest:
                 operation="%";
                 first=Integer.valueOf(textView.getText().toString());
                 isOperationClick=true;
                 break;

            case R.id.equals:
                switch (operation){
                    case "+":
                        second=Integer.valueOf(textView.getText().toString());
                        result = first + second;
                        textView.setText(result.toString());
                        break;
                    case "-":
                        second=Integer.valueOf(textView.getText().toString());
                        result1 = first - second;
                        textView.setText(result1.toString());
                        break;
                    case "*":
                        second=Integer.valueOf(textView.getText().toString());
                        result2 = first*second;
                        textView.setText(result2.toString());
                        break;
                    case "/":
                        second=Integer.valueOf(textView.getText().toString());
                        result3 = first/second;
                        textView.setText(result3.toString());
                        break;
                    case "%":
                        second=Integer.valueOf(textView.getText().toString());
                        result4=first*second/100;
                        textView.setText(result4.toString());
                        break;
                }
                isOperationClick = true;
        }
}
}
package com.geektech.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Integer first,second,result;
    private Boolean isOperationClick;
    Boolean isNew=true;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_view);

    }

    public void onNumberClick(View view) {
        if (isNew) {
            textView.setText("");
            isNew = false;
            String number = textView.getText().toString();
            switch (view.getId()) {
                case R.id.one:
                    number = number + "1";
                    break;
                case R.id.two:
                    number = number + "2";
                    break;
                case R.id.three:
                    number = number + "3";
                    break;
                case R.id.four:
                    number = number + "4";
                    break;
                case R.id.five:
                    number = number + "5";
                    break;
                case R.id.six:
                    number = number + "6";
                    break;
                case R.id.seven:
                    number = number + "7";
                    break;
                case R.id.eight:
                    number = number + "8";
                    break;
                case R.id.nine:
                    number = number + "9";
                    break;
                case R.id.zero:
                    if (textView.getText().toString().equals("") || isOperationClick) {
                        textView.setText("0");
                    } else {
                        textView.append("0");
                    }
                    break;
                case R.id.clear:
                    textView.setText("0");
                    first = 0;
                    second = 0;
                    break;

                case R.id.comma:
                    number = number + ",";
            }
            textView.setText(number);

        }
        isOperationClick = false;
    }

        /* switch (view.getId()){


            case R.id.one:
                if (textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("1");
                }else {
                textView.append("1");
                }
                break;

            case R.id.two:
                if (textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("2");
                }else {
                    textView.append("2");}
                break;

            case R.id.three:
                if (textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("3");
                }else {
                    textView.append("3");}
                break;
            case R.id.four:
                if (textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("4");
                }else {
                    textView.append("4");}
                break;

            case R.id.five:
                if (textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("5");
                }else {
                    textView.append("5");}
                break;

            case R.id.six:
                if (textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("6");
                }else {
                    textView.append("6");}
                break;

            case R.id.seven:
                if (textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("7");
                }else {
                    textView.append("7");}
                break;

            case R.id.eight:
                if (textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("8");
                }else {
                    textView.append("8");}
                break;

            case R.id.nine:
                if (textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("9");
                }else {
                    textView.append("9");}
                break;

            case R.id.zero:
                if (textView.getText().toString().equals("") || isOperationClick){
                    textView.setText("0");
                }else {
                    textView.append("0");}
                break;
            case R.id.clear:
                textView.setText("0");
                first = 0;
                second=0;
                break;
            }
            isOperationClick = false;
        }

    public void onOperationClick(View view) {
        switch (view.getId()){
            case R.id.plus:
                first = Integer.valueOf(textView.getText().toString());
                break;

            case R.id.minus:
                first = Integer.valueOf(textView.getText().toString());
                Integer result4 = first-second;
                break;

            case R.id.multiply:
                first = Integer.valueOf(textView.getText().toString());
                Integer result2 = first*second;
                break;

            case R.id.division:
                first = Integer.valueOf(textView.getText().toString());
                Integer result3 = first/second;
                break;

            case R.id.equals:
                switch (view.getId()) {
                    case R.id.plus:
                        second = Integer.getInteger(textView.getText().toString());
                        result = first + second;
                        textView.setText(result.toString());
                        break;
                    case R.id.minus:
                        second = Integer.getInteger(textView.getText().toString());
                        result = first - second;
                        textView.setText(result.toString());
                        break;
                    case R.id.multiply:
                        second = Integer.getInteger(textView.getText().toString());



                }


        }
        isOperationClick = true;

             */
    }
}
}
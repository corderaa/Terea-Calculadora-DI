package com.example.calculadora

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.calculadora.logic.Operations

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val operation = Operations();

        var number1 : String = "";
        var number2 : String = "";
        var operator : String = "";
        var isOperatorSelected : Boolean = false;
        var isResultShowed : Boolean = false;

        // Widget Initializations

        val button1 : Button = findViewById(R.id.button1);
        val button2 : Button = findViewById(R.id.button2);
        val button3 : Button = findViewById(R.id.button3);
        val button4 : Button = findViewById(R.id.button4);
        val button5 : Button = findViewById(R.id.button5);
        val button6 : Button = findViewById(R.id.button6);
        val button7 : Button = findViewById(R.id.button7);
        val button8 : Button = findViewById(R.id.button8);
        val button9 : Button = findViewById(R.id.button9);
        val button0 : Button = findViewById(R.id.button0);
        val buttonPlus : Button = findViewById(R.id.buttonPlus);
        val buttonMinus : Button = findViewById(R.id.buttonMinus);
        val buttonOperate : Button = findViewById(R.id.buttonOperate);

        val textViewError : TextView = findViewById(R.id.errorTextView)
        val textViewResult : TextView = findViewById(R.id.textViewSolution)



        button0.setOnClickListener{
            if (!isOperatorSelected) {
                number1 += "0";
                textViewResult.setText(number1 + operator + number2);
            }else {
                number2 += "0";
                textViewResult.setText(number1 + operator + number2);
            }
        }
        button1.setOnClickListener{
            if (!isOperatorSelected) {
                number1 += "1";
                textViewResult.setText(number1 + operator + number2);
            }else {
                number2 += "1";
                textViewResult.setText(number1 + operator + number2);
            }
        }
        button2.setOnClickListener{
            if (!isOperatorSelected) {
                number1 += "2";
                textViewResult.setText(number1 + operator + number2);
            }else{
                number2 += "2";
                textViewResult.setText(number1 + operator + number2);
            }
        }
        button3.setOnClickListener{
            if (!isOperatorSelected) {
                number1 += "3";
                textViewResult.setText(number1 + operator + number2);
            }else {
                number2 += "3";
                textViewResult.setText(number1 + operator + number2);
            }
        }
        button4.setOnClickListener{
            if (!isOperatorSelected){
                number1 += "4";
                textViewResult.setText(number1 + operator + number2);
            }else {
                number2 += "4";
                textViewResult.setText(number1 + operator + number2);
            }
        }
        button5.setOnClickListener{
            if (!isOperatorSelected) {
                number1 += "5";
                textViewResult.setText(number1 + operator + number2);
            }else {
                number2 += "5";
                textViewResult.setText(number1 + operator + number2);
            }
        }
        button6.setOnClickListener{
            if (!isOperatorSelected) {
                number1 += "6";
                textViewResult.setText(number1 + operator + number2);
            }else{
                number2 += "6";
                textViewResult.setText(number1 + operator + number2);
            }
        }
        button7.setOnClickListener{
            if (!isOperatorSelected) {
                number1 += "7";
                textViewResult.setText(number1 + operator + number2);
            }else {
                number2 += "7";
                textViewResult.setText(number1 + operator + number2);
            }
        }
        button8.setOnClickListener{
            if (!isOperatorSelected) {
                number1 += "8";
                textViewResult.setText(number1 + operator + number2);
            }else {
                number2 += "8";
                textViewResult.setText(number1 + operator + number2);
            }
        }
        button9.setOnClickListener{
            if (!isOperatorSelected) {
                number1 += "9";
                textViewResult.setText(number1 + operator + number2);
            }else{
                number2 += "9";
                textViewResult.setText(number1 + operator + number2);
                }
        }
        buttonPlus.setOnClickListener{
            if (!isOperatorSelected) {
                operator = "+";
                textViewResult.setText(number1 + operator + number2);
                isOperatorSelected = true;
            }
        }
        buttonMinus.setOnClickListener{
            if (!isOperatorSelected) {
                operator = "-";
                textViewResult.setText(number1 + operator + number2);
                isOperatorSelected = true;
            }
        }
        buttonOperate.setOnClickListener{
            if (isOperatorSelected && !isResultShowed){
                if (operator.equals("+")){
                    textViewResult.setText(operation.addition(number1, number2));
                    isResultShowed = true;
                }else if (operator.equals("-")){
                    textViewResult.setText(operation.substraction(number1, number2));
                    isResultShowed = true;
                }
            }else {
                textViewResult.setText("");
                number1 = "";
                number2 = "";
                operator = "";
                isOperatorSelected = false;
                isResultShowed = false;
            }
        }
    }
}
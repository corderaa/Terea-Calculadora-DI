package com.example.calculadora.logic

import android.renderscript.Int2

class Operations {

    fun addition(number1: String, number2: String) : String {
        var result : String;
        var resultValue : Int;

        resultValue = number1.toInt() + number2.toInt();
        result = resultValue.toString();

        return result;
    }

    fun substraction(number1: String, number2: String) : String {
        var result : String;
        var resultValue : Int;

        resultValue = number1.toInt() + number2.toInt();
        result = resultValue.toString();

        return result;
    }
}
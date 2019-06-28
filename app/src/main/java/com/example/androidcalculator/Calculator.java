package com.example.androidcalculator;

public class Calculator implements ICalculator {

    int num1;
    int num2;


    public Calculator(){

    }

    public Calculator(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public int add(){
        return num1 + num2;
    }

    @Override
    public int substract(){
        return num1 - num2;
    }

    @Override
    public int multiply(){
        return num1 * num2;
    }

    @Override
    public int divide(){
        return num1 / num2;
    }
}

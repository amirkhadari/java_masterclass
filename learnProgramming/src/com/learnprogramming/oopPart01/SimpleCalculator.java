package com.learnprogramming.oopPart01;

public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult(){
        return firstNumber + secondNumber;
    }

    public double getDivisionResult(){
        return secondNumber!=0?firstNumber / secondNumber:0;
    }

    public double getSubtractionResult(){
        return firstNumber - secondNumber;
    }

    public double getMultiplicationResult(){
        return firstNumber * secondNumber;
    }
}

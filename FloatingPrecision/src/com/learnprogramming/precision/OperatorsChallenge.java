package com.learnprogramming.precision;

public class OperatorsChallenge {

    public static void main(String[] args){

        double num1 = 20d;
        double num2 = 80d;

        double res = (num1+num2)*100d;

        double rem = res%40d;

        String status = (rem==0)?"It Worked":"Got some Remainder";

        System.out.println(status);

    }

}

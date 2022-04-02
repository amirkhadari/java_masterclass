package com.learnprogramming.precision;

public class StringOperations {

    public static void main(String[] args){

        String mystring = "This is a string";
        System.out.println("my string is equal to " +mystring);
        mystring = mystring + ", and this is more. ";
        System.out.println("my string is equal to " +mystring);
        mystring = mystring + "\u00A9 2022";
        System.out.println("my string is equal to " +mystring);

        String numberString = "2340.987";
        numberString = numberString + "123.765";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString);


    }

}

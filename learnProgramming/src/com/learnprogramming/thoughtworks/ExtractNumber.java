package com.learnprogramming.thoughtworks;

public class ExtractNumber {

//    Given a string. Pull out only the number from it and tell the sum of numbers.
//    Each contiguous numbers should be considered as one number.
//ex : asd2asd3afdad4&&*5 --- output should be 2+3+4+5
//ex2 : 123sfdsf56sfdsfd67*($%^ --- output should be 123+56+67

//    Scanner scan = new Scanner(System.in);
//    String text = scan.nextLine();

    public static void main(String[] args){
        String text = "asd2asd3afdad4&&*5";

        text = text.replaceAll("//[a-zA-Z]", " ");

        System.out.println(text);
    }



}

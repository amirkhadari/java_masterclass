package com.learnprogramming.exercises;

import java.util.HashMap;
import java.util.Map;

public class section4exercises {

    public static void main(String[] args){
//        double div = 3.265*1000;
//        double rem = 3.32456*1000;
//
//        System.out.println((int) div+"   "+ (int) rem);

//        char[] newWord = section4exercises.stringSort("Silent");
//        for(char e: newWord){
//            System.out.println(e);
//        }

//        System.out.println(isAnagramByCharArray("siLent", "liSTen"));
//
//        System.out.println(printFactorial(6));

        printFibonacci(13, 12, 10);
        printFibonacci(10);

    }

    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0   ){
             return -1;
        }
        return Math.round(kilometersPerHour/1.609);
    }

    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour>0){
            long val = section4exercises.toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour+ "km/h = "+val+"mi/h");
        }else{
            System.out.println("Invalid Value");
        }

    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        return (int) (num1 * 1000) == (int) (num2 * 1000);
    }

    public static boolean hasEqualSum(int num1, int num2, int res){
        return (num1 + num2) == res;
    }

    public static boolean isTeen(int num){
        return (num>12 && num<20);
    }

    public static boolean hasTeen(int num1, int num2, int num3){
        return isTeen(num1) || isTeen(num2) || isTeen(num3);
    }


    public static char[] stringSort(String text){
        char[] word = text.toLowerCase().toCharArray();
        for(int i=0; i<word.length; i++){
            for(int j=i+1; j<word.length-1;j++){
                if(word[i]>word[j]){
                    char temp = word[i];
                    word[i] = word[j];
                    word[j] = temp;
                }
            }
        }
        return word;
    }

    public static boolean isAnagramByCollections(String text01, String text02){
        String actWord = text01.replace(" ", "").toLowerCase();
        String expWord = text02.replace(" ", "").toLowerCase();
        if(actWord.length()!=expWord.length())
            return false;
        Map<Character, Integer> actMap = new HashMap<>();
        Map<Character, Integer> expMap = new HashMap<>();

        for(int i=0; i<actWord.length(); i++){
            Character ch1 = actWord.charAt(i);
            Character ch2 = expWord.charAt(i);

            actMap.merge(ch1, 1, Integer::sum);
            expMap.merge(ch2, 1, Integer::sum);
        }

        return actMap.equals(expMap);
    }

    public static boolean isAnagramByCharArray(String text01, String text02){
        String actWord = text01.replace(" ", "").toLowerCase();
        String expWord = text02.replace(" ", "").toLowerCase();
        if(actWord.length()!=expWord.length())
            return false;
        char[] word = actWord.toCharArray();
        for(char ch: word){
            if(expWord.indexOf(ch)== -1)
                return false;
            expWord = expWord.substring(0, expWord.indexOf(ch))+
                    expWord.substring(expWord.indexOf(ch)+1, expWord.length());
        }
        return true;
    }

    public static int printFactorial(int num){
        int result = 1;
        for(int i=num; i>1; i--){
            result *= i;
        }
        return result;
    }

    public static void printFibonacci(int num1, int num2, int range){
        int result = num1+num2;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(result);

        for(int i=2; i<=range; i++){
            num1 = num2;
            num2 = result;
            result = num1+num2;
            System.out.println(result);
        }
    }

    public static void printFibonacci(int range){
        printFibonacci(0,1,range);
    }

}

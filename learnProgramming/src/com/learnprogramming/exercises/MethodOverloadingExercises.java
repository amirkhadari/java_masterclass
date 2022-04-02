package com.learnprogramming.exercises;

public class MethodOverloadingExercises {

    public static void main(String[] args){
//        double cm = calcFeetAndInchesToCentimeters(1, 0);
//        double cc = calcFeetAndInchesToCentimeters(100);
//        System.out.println("CM: "+cm+" CC: "+cc);

//        getDurationString(124, 54);
//        getDurationString(3450);
//
//        System.out.println(525600/(365*24*60));
//        System.out.println(561600%(365*24*60)/(24*60));

        printEqual(1,2,3);

        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));

        String s1 = "abcd";
        String s2 = "jl";
        s1.equals(s2);


    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        double cms = -1;
        if((feet>=0) && (inches>=0 && inches<13)){
            cms = feet * 12 * 2.54;
            cms += inches * 2.54;
        }
        return cms;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        double cms = -1;
        if(inches>=0){
            double feet = (int) inches/12;
            double inch = (int) inches%12;
            cms = calcFeetAndInchesToCentimeters(feet, inch);
        }
        return cms;
    }

    public static void getDurationString(int min, int sec){
        if((min < 0) || (sec <0 || sec >59)){
            System.out.println("Invalid value");
        }
        int hrs = min/60;
        min = (min%60);
        System.out.println(hrs+"h "+min+"m "+sec+"s");
    }

    public static void getDurationString(int sec){
        if(sec<0){
            System.out.println("Invalid Value");
        }
        int mins = sec/60;
        int secs = sec%60;
        getDurationString(mins, secs);
    }

    public static double area(double radius){
        if(radius<0){
            return -1.0;
        }
        return radius * radius * Math.PI;
    }

    public static double area(double length, double breadth){
        if(length<0 || breadth<0){
            return -1.0;
        }
        return length * breadth;
    }

    public static void printYearsAndDays(long mins){
        if(mins<0){
            System.out.println("Invalid Value");
        }
        long yrs = mins/(365*24*60);
        long days = (mins%(365*24*60))/(24*60);
        System.out.println(mins+" min = "+yrs+" y and "+days+" d");
    }

    public static void printEqual(int num1, int num2, int num3){
        if((num1<0) || (num2<0) || (num3<0)){
            System.out.println("Invalid Value");
        }else if((num1==num2) && (num2==num3)){
            System.out.println("All numbers are equal");
        }else if((num1!=num2) && (num2!=num3) && (num1!=num3)){
            System.out.println("All numbers are different");
        }else{
            System.out.println("Neither all are equal or different");
        }
    }

    public static boolean isCatPlaying(boolean summer, int temp){
        boolean cat = false;
        if((temp>24 && temp<46) && (summer)){
            cat = true;
        }else if(temp > 24 && temp < 36){
            cat = true;
        }
        return cat;
    }

}

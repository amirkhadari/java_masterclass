package com.learnprogramming.exercises;

public class LeapYearCalculator {

    public static void main(String[] args){
        System.out.println(isLeapYear(1924));
        System.out.println(getDaysInMonth(1,2020));

    }

    public static boolean isLeapYear(int year){
        boolean isLeap = false;
        if(year > 0 && year < 10000){
            if(year%4==0){
                if(year%100==0){
                    if (year%400==0){
                        isLeap = true;
                    }else {
                        isLeap = false;
                    }
                }else{
                    isLeap = true;
                }
            }else {
                isLeap =false;
            }
        }
        return isLeap;
    }

    public static int getDaysInMonth(int month, int year){
        int days = -1;
        if((month>0 && month<13) && (year>0 && year<10000)){
            switch(month){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    days = 31;
                    break;
                case 4: case 6: case 9: case 11:
                    days = 30;
                    break;
                case 2:
                    if(isLeapYear(year)){
                        days=29;
                    }else {
                        days = 28;
                    }
                    break;
            }
        }
        return days;
    }

}

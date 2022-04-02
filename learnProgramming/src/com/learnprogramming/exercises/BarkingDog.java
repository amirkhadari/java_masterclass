package com.learnprogramming.exercises;

public class BarkingDog {

    public static void main(String[] args){

    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        boolean wakeUp = false;
        if(barking){
            if((hourOfDay < 8 && hourOfDay >= 0) || hourOfDay == 23) {
                wakeUp = true;
            }
        }
        return wakeUp;
    }

}

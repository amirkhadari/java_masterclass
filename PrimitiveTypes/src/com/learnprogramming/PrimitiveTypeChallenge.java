package com.learnprogramming;

public class PrimitiveTypeChallenge {

    public static void main(String[] args){

        byte myByte = 99;
        short myShort = 32454;
        int myInt = 1223456;

        long myTotal = 50000L + (10L * (myByte + myShort + myInt));

        short myShortTotal = (short) (1000 +10 * (myByte + myShort + myInt));

        System.out.println(myTotal);
        System.out.println(myShortTotal);

    }

}

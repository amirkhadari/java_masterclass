package com.learnprogramming.exercises;

public class MegaBytesConverter {

    public static void main(String[] args){
        int d = 5000/1024;
        int rem = 5000%1024;
        System.out.println(d);
        System.out.println(rem);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes<0){
            System.out.println("Invalid Value");
        }else{
            int mb = kiloBytes/1024;
            int kb = kiloBytes%1024;

            System.out.println(kiloBytes+ " KB = " +mb+ " MB and " +kb+ " KB");
        }

    }

}

package com.learnprogramming.exercises;

import java.util.Scanner;

public class MinAndMaxChallenge {

    public static void main(String[] args){
        int comp = 0;
        int min = 0;
        int max = 0;

        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("Enter Number: ");
            if(scan.hasNextInt()){
                int num = scan.nextInt();
                if(num > max){
                    max = num;
                }else{
                    comp = num;

                }
            }else{
                System.out.println("Invalid Value");
                break;
            }
            scan.nextLine();
        }
        System.out.println("Min: "+min+" & Max: " +max);
        scan.close();
    }

}

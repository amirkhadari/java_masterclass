package com.learnprogramming.exercises;

import java.util.Scanner;

public class ReadingInput {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int sum = 0;
        for(int count=1; count<=10; count++){
            System.out.println("Enter a Number#"+count+": ");
            if(scan.hasNextInt()){
                int num = scan.nextInt();
                sum += num;
            }else{
                System.out.println("Invalid Value");
            }
            scan.nextLine();
        }
        System.out.println("Total: "+sum);

        scan.close();

    }

}

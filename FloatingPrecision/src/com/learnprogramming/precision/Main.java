package com.learnprogramming.precision;

public class Main {

    public static void main(String[] args) {

//        float myMinFloatValue = Float.MIN_VALUE;
//        float myMaxFloatValue = Float.MAX_VALUE;
//        System.out.println("Minimum float value: " +myMinFloatValue);
//        System.out.println("Maximum float value: " +myMaxFloatValue);
//
//        double myMinDoubleValue = Double.MIN_VALUE;
//        double myMaxDoubleValue = Double.MAX_VALUE;
//        System.out.println("Minimum Double value: " +myMinDoubleValue);
//        System.out.println("Maximum Double value: " +myMaxDoubleValue);
//
//        int myIntValue = 5/2;
//        float myFloatValue = 5.34f;
//        double myDoubleValue = 5/2d;
//
//        System.out.println(myIntValue);
//        System.out.println(myFloatValue);
//        System.out.println(myDoubleValue);

        int arr[] = {0, -5, 3, -5, 2, -1, 1, 1, -1};
        int size = 9;
        int last = arr[size-1];
        arr[size-1] = -1;
        for(int i=size-2; i>=0; i=i-1){
            int temp = arr[i];
            arr[i] = last;
            if(last < temp){
                last = temp;
            }
        }

        for(int i=0; i<size; i++){
            System.out.println(arr[i]);
        }

    }
}

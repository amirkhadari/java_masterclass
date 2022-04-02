package com.learnprogramming.thoughtworks;

public class StringManipulations {

    public static void main(String[] args){

//        String s = "My Name is Java";
//
//        Set<Character> newSet = new HashSet<>();
//
//        char[] text = s.trim().toLowerCase().toCharArray();
//
//        for (char c : text) {
//            newSet.add(c);
//        }
//
//        for(char t: newSet){
//            System.out.println(t);
//        }

//        int[] A = {1,3,6,4,1,2};
//
//        for(int i=0; i<A.length; i++){
//            for(int j= i+1; j< A.length; j++){
//                if(A[i]>A[j]){
//                    int temp = A[i];
//                    A[i] = A[j];
//                    A[j] = temp;
//                }
//            }
//
//        }
//
//        for(int k=0; k<A.length-1; k++){
//            if(A[k+1]!=A[k]+1){
//                System.out.println(A[k]+1);
//            }else{
//                System.out.println(A[A.length-1]+1);
//            }
//        }

        solution(16);

    }

    public static void solution(int N){
        int sum = 0;
        int i = 1;

        while(true){
            int temp = i;
            System.out.println(temp);
            while(i>0){
                sum += i%1;
                i /= 10;
            }
            if(N==sum){
                System.out.println("Result "+temp);
                break;
            }
            i++;
        }
    }



}

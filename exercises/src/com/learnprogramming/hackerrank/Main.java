package com.learnprogramming.hackerrank;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String original_name = scan.nextLine();
        String modified_name = scan.nextLine();

//        System.out.println(original_name);
//        System.out.println(modified_name);

//        for(int idx = 0; idx< alpha.length; idx++){
//            System.out.println(alpha[idx]);
//        }


    }

    public static char[] sort_char_array(char[] alpha){
        for(int i=0; i<alpha.length-1; i++){
            for(int j=i+1; j< alpha.length; j++){
                if(alpha[i] > alpha[j]){
                    char temp = alpha[i];
                    alpha[i] = alpha[j];
                    alpha[j] = temp;
                }
            }
        }
        return alpha;
    }

    public static boolean isAnagram(String text1, String text2){
        boolean isAnagram = false;

        char[] org_arr = text1.toLowerCase().toCharArray();
        char[] mod_arr = text2.toLowerCase().toCharArray();
        if(text1.length() == text2.length()){

            if(org_arr.equals(mod_arr)){
                isAnagram = true;
            }
        }

        return isAnagram;
    }
}

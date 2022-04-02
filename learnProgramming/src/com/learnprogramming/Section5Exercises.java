package com.learnprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Section5Exercises {

    public static void main(String[] args){

//        int sum = digitSum(-125);
//        System.out.println(sum);
//
//        System.out.println(isPalindrome(-1221));
//
//        System.out.println(sumFirstAndLastDigit(252));
//        System.out.println(sumFirstAndLastDigit(257));
//        System.out.println(sumFirstAndLastDigit(0));
//        System.out.println(sumFirstAndLastDigit(5));
//        System.out.println(sumFirstAndLastDigit(-10));

//        System.out.println(hasSameLastDigit(9,99,999));

//        System.out.println(getGreatestCommonDivisorEuclideanAlgo(25,15));
//        System.out.println(getGreatestCommonDivisorEuclideanAlgo(12,30));
//        System.out.println(getGreatestCommonDivisorEuclideanAlgo(9,18));
//        System.out.println(getGreatestCommonDivisorEuclideanAlgo(81,153));

//        printFactors(6);
//        printFactors(32);
//        printFactors(10);
//        printFactors(-1);

//        System.out.println(isPerfectNumber(6));
//        System.out.println(isPerfectNumber(28));
//        System.out.println(isPerfectNumber(5));
//        System.out.println(isPerfectNumber(-1));

//        numberToWords(100);
//        System.out.println(getDigitCount(0));
//        System.out.println(reverseNumber(-123));
//        numberToWords(1450);

//        numberToWordsByArrayList(1450);

//        System.out.println(canPack(1,0,4));
//        System.out.println(canPack(1,0,5));
//        System.out.println(canPack(0,5,4));
//        System.out.println(canPack(2,2,11));
//        System.out.println(canPack(-3,2,12));
//        System.out.println(canPack(2,1,5));

//        System.out.println(getLargestPrime(45));
//        System.out.println(getLargestPrime(21));
//        System.out.println(getLargestPrime(217));
//        System.out.println(getLargestPrime(0));
//        System.out.println(getLargestPrime(-1));
//        System.out.println(getLargestPrime(321));

//        printSquareStar(7);

//        inputThenPrintSumAndAverage();

        System.out.println(getBucketCount(2.75,3.25, 2.5, 1));
        System.out.println(getBucketCount(-3.4,2.1, 1.5, 2));
        System.out.println(getBucketCount(3.4,2.1, 1.5, 2));

        System.out.println(getBucketCount(7.25,4.3, 2.35));
        System.out.println(getBucketCount(-3.4,2.1, 1.5));
        System.out.println(getBucketCount(3.4,2.1, 1.5));

        System.out.println(Math.ceil(13.1));

    }

    public static int digitSum(int num){
        int sum = 0;
        if(num<10){
            return -1;
        }
        while(num>0){
            int last_dig = num%10;
            sum += last_dig;
            num = num/10;
        }
        return sum;
    }

    public static boolean isPalindrome(int num){
        int reverse = 0;
        if(num<0){
            num = -num;
        }
        int temp = num;
        while(num>0){
            int last_dig = num%10;
            reverse = reverse*10 + last_dig;
            num /= 10;
        }
        return temp==reverse;
    }

    public static int reverseNumber(int num){
        int reverse = 0;
        while (num!=0){
            int lastDig = num%10;
            reverse = (reverse*10)+lastDig;
            num /= 10;
        }
        return reverse;
    }

    public static int sumFirstAndLastDigit(int num){
        if(num<0){
            return -1;
        }
        if(num<10){
            return num*2;
        }

        int firstDig = 0;
        int lastDig = num%10;
        while(num>10){
            num /= 10;
            firstDig = num %10;
        }
        return firstDig+lastDig;
    }

    public static int getEvenDigitSum(int num){
        if(num<0){
            return -1;
        }
        int sum = 0;
        while(num>0){
            int dig = num%10;
            if(dig%2==0){
                sum += dig;
            }
            num /= 10;
        }
        return sum;
    }

    public static boolean hasSharedDigit(int num1, int num2){
        if(num1<10 || num1>199 || num2<10 || num2>99){
            return false;
        }
        return ((num1%10 == num2%10) || (num1%10==num2/10) || (num1/10 == num2%10) || (num1/10 == num2/10));
    }

    public static boolean isValid(int num){
        return (num>=10 && num<=1000);
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        if(!isValid(num1) || !isValid(num2) || !isValid(num3)){
            return false;
        }
        return (num1%10==num2%10) || (num1%10==num3%10) || (num2%10 == num3%10);
    }

    public static int getGreatestCommonDivisor(int first, int second){
        if(first<10 || second<10){
            return -1;
        }
        int base = Math.min(first, second);
        int divisor = 1;
        for(int i=1; i<=base; i++){
            if((first%i==0) && (second%i==0)){
                divisor = i;
            }
        }
        return divisor;
    }

    public static int getGreatestCommonDivisorEuclideanAlgo(int first, int second){
        if(first<10 || second<10){
            return -1;
        }

//        Euclidean Algorithm
//        All you have to know is that the greatest common divisor of
//        your two numbers does not change if you replace the larger one with difference of the two
//        GCD LOGIC:
//        30-12 = 18
//        18-12 = 6
//        12-6 = 6
//        6 == 6 -> Greatest Common Divisor

        while(first != second){
            if(first>second){
                first=first-second;
            }else {
                second=second-first;
            }
        }

        return first;
    }

    public static void printFactors(int num){

        if(num<1){
            System.out.println("Invalid Value");
        }else{
            System.out.println(1);
            for(int i=2; i<=num/2; i++){
                if(num%i==0){
                    System.out.println(i);
                }
            }
            System.out.println(num);
        }
    }

    public static boolean isPerfectNumber(int num){
        if(num<1){
            return false;
        }
        int sum = 0;
        for(int i=1;i<=num/2; i++){
            if(num%i==0){
                sum += i;
            }
        }
        return sum==num;
    }

    public static int getDigitCount(int num){
        if(num<0){
            return -1;
        }
        if(num == 0){
            return 1;
        }
        int count = 0;
        while(num>0){
            count++;
            num /= 10;

        }
        return count;
    }

    public static void numberToWords(int num){
        if(num<0){
            System.out.println("Invalid Value");
        }else{
            String[] word = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
            int actNum = reverseNumber(num);
            int diff = getDigitCount(num)-getDigitCount(actNum);
            if(num == 0){
                System.out.println("Zero");
            }
            if(getDigitCount(actNum) == getDigitCount(num)){
                while (actNum>0){
                    int digit = actNum%10;
                    System.out.println(word[digit]);
                    actNum /= 10;
                }
            }else{
                while(actNum>0){
                    int digit = actNum%10;
                    System.out.println(word[digit]);
                    actNum /= 10;
                }
                for(int i=1;i<=diff;i++){
                    System.out.println("Zero");
                }
            }

        }
    }

    public static void numberToWordsByArrayList(int num){
        List<String> numbers = new ArrayList<String>();
        if(num<0){
            System.out.println("Invalid Value");
        }else {
            String[] word = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
            while (num > 0) {
                int digit = num % 10;
                numbers.add(word[digit]);
                num /= 10;
            }
            for(int i=numbers.size()-1;i>=0; i--){
                System.out.println(numbers.get(i));
            }
        }
    }

    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount<0 || smallCount<0 || goal<0){
            return false;
        }else{
            int quantity = (bigCount*5) + smallCount;
            if(quantity<goal){
                return false;
            }else return goal % 5 <= smallCount;
        }
    }

    public static int getLargestPrime(int num){
        if(num<2){
            return -1;
        }
        int factor = 0;
        for(int i=num; i>=2; i--){
            if(num%i==0){
                boolean isPrime = true;
                for(int j = (int) Math.sqrt(i); j>=2; j--){
                    if(i%j==0) {
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime){
                    factor = i;
                    break;
                }
            }
        }
        return factor;
    }

    public static void printSquareStar(int num){
        if(num<5){
            System.out.println("Invalid Value");
        }else{
            for(int colCount = 1; colCount<=num; colCount++){
                for(int rowCount=1; rowCount<=num; rowCount++){
                    if(rowCount==1 || rowCount==num || colCount==1 || colCount == num || rowCount==colCount || colCount == num-rowCount+1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }

    public static void inputThenPrintSumAndAverage(){
        int counter = 0;
        int sum = 0;
        double avg = 0;
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()){
            int num = scan.nextInt();
            counter++;
            sum += num;
            avg = (double) sum/counter;
        }
        System.out.println("SUM = "+sum+" AVG = "+Math.round(avg));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if(width<=0 || height<=0 || areaPerBucket<=0 || extraBuckets<0)
            return -1;
        double areaRemained = (width * height) - (double) (extraBuckets * areaPerBucket);
        return (int) Math.ceil(areaRemained/areaPerBucket);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width<=0 || height<=0 || areaPerBucket<=0)
            return -1;
        double areaRemained = (width * height);
        return (int) Math.ceil(areaRemained/areaPerBucket);
    }

    public static int getBucketCount(double area, double areaPerBucket){
        if(area<=0 || areaPerBucket<=0)
            return -1;
        return (int) Math.ceil(area/areaPerBucket);
    }

}

package com.learnprogramming.control_flow_statements;

public class ForLoop {

    public static void main(String[] args){
//        for(int i=8;i>1;i--){
//            System.out.println("Interest for amount 10000 at "+i+"% is Rs."
//                    +String.format("%.2f", calcInterest(10000, i)));
//        }

//        rangeOfPrime(10, 30);

//        int i=2;
//        while (i<9){
//            System.out.println("Interest for amount 10000 at "+i+"% is Rs."+calcInterest(10000, i));
//            i++;
//        }

//        sumOf3And5();

        int count = 0;
        int sum =0;
        int num = 4;
        int finNum = 20;
        while(num<=finNum){
            if(!isOdd(num)){
                System.out.println(num);
                count++;
                sum += num;
            }
            num++;
            if(count==5){
                break;
            }
        }
        System.out.println(sum);

    }

    public static double calcInterest(double amount, double interestRate){
        return (amount * (interestRate/100));
    }

    public static boolean isPrime(int num){
        if(num==1){
            return false;
        }
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void rangeOfPrime(int num1, int num2){
        int count =0;
        for(int i=num1; i<num2+1;i++){
            if(isPrime(i)){
                count++;
                System.out.println(i + " is a prime number and the count is " + count);
                if(count==3){
                    break;
                }
            }

        }
    }

    public static void sumOf3And5(){
        int sum = 0;
        int count = 0;
        for(int i=1; i<1001;i++){
            if((i%3==0) && (i%5==0)){
                System.out.println(i);
                sum += i;
                count++;
            }
            if(count==5){
                break;
            }
        }
        System.out.println(sum);
    }

    public static boolean isOdd(int num){
        return num > 0 && num % 2 != 0;
    }
    public static int sumOdd(int num1, int num2){
        int sum = 0;
        if(num1<0 || num2<0 || num1>num2){
            return -1;
        }
        for(int i=num1;i<=num2;i++){
            if(isOdd(i)){
                sum += i;
            }
        }
        return sum;
    }

}

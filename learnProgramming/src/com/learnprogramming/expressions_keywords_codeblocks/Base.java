package com.learnprogramming.expressions_keywords_codeblocks;

public class Base {

    public static void main(String[] args){

//        int score1 = Base.game(10000, 8, 200, true);
//        int score2 = Base.game(8000, 3, 123, true);
//
//        System.out.println("Your final score is "+score1);
//        System.out.println("Your final score is "+score2);
        int position = getPosition(499);
        displayHighScorePosition("Tim",position);

    }

    public static void printNumber(int num){
        if(num > 0) {
            printNumber(num-1);
            System.out.println(num);
        }
    }

    public static int game(int score, int level, int bonus, boolean gameOver){
        if(gameOver){
            int final_score = score + (level * bonus);
            final_score+=2000;
            return final_score;
        }
        return -1;
    }

    public static void displayHighScorePosition(String person, int score){

        System.out.println(person +" managed to get into position " +score+ " on the high score table");

    }

    public static int getPosition(int score){

        int position = 4;
        if(score>=1000){
            position = 1;
        }else if(score>=500){
            position = 2;
        }else if(score>=100){
            position = 3;
        }
        return position;
    }


}

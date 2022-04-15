package com.learnprogramming.test;

import com.learnprogramming.composition.*;

public class Base {

    public static void main(String[] args){

        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

//        Resolution nativeResolution = new Resolution()
        Monitor monitor = new Monitor("27inch Beast", "Acer", 27,
                new Resolution(1366, 768));

        MotherBoard motherBoard = new MotherBoard("BJ-200", "Asus", 4, 6,
                "V2.44");

        PC myPC = new PC(theCase, monitor, motherBoard);

        myPC.getTheMonitor().drawPixel(1500, 1200, "Red");
        myPC.getTheMotherBoard().loadProgram("Ubuntu 20.04 LTS");
        myPC.getTheCase().pressPowerButton();

    }

}

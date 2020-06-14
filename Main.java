package com.company;

public class Main {

    public static void dice2() {
        long start = System.currentTimeMillis();
        DiceV2 aDice = new DiceV2();
        for (int i = 0; i < 5; i++) {
            aDice.roll();
            System.out.println(aDice.getDiceFace());
        }
        System.out.println("");
        System.out.println("Version 3");
        aDice.showFrequency2();
        System.out.println("");
        long end = System.currentTimeMillis();
        System.out.println("time = " + (end - start) + " ms");
        System.out.println("");
    }

    public static void main(String[] args) {
        dice2();
    }
}
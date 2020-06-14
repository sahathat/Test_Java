package com.company;

import java.util.Random;

public class DiceV2 {
    public int[] frequency = new int[6]; // 0-6

    public int[] getFrequency() {
        return frequency;
    }

    private static  Random R = new Random();

    private int counts = 0;

    private char diceFace ;

    public char getDiceFace() {
        return diceFace;
    }

    public int roll() {
        counts++;
        // Random r = new Random() ;
        int face = R.nextInt(6) + 1; // 0-5
        frequency[face - 1] += 1;
        diceFace = (char)(face - 1 + '\u2680');
        return face;
    }
    public void showFrequency2(){
        for (int i = 0 ; i < frequency.length ; i++){
            System.out.printf("number %d have %d time (%.2f%%)\n" , i+1 , frequency[i] , (float)frequency[i]/(float)counts*100);
        }
    }
}
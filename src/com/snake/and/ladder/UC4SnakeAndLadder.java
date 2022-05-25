package com.snake.and.ladder;

import java.util.Random;

public class UC4SnakeAndLadder {
    public static void main(String[] args) {

        int zeroPosition = 0;
     /*   int ladder = 2;
        int snake = 3;
*/
        Random ran = new Random();

        int diceValue = 1 + ran.nextInt(6);

        System.out.println("this +" + diceValue);


        while (diceValue < 101) {
            if (diceValue == 100) {
                System.out.println("Dice is reached :- "+diceValue);

            }
            diceValue++;
        }

    }
}

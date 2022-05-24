package com.snake.and.ladder;

import java.util.Random;

public class UC3SnakeAndLadder {
    public static void main(String[] args) {

        int zeroPosition = 0;
        int ladder = 2;
        int snake = 3;


        Random ran = new Random();

        int diceValue = 1 + ran.nextInt(6);

        int chance = 1 + ran.nextInt(3);

        switch(chance)
        {
            case 1:
                System.out.println("Start position");
                zeroPosition = 0 + zeroPosition;
                System.out.println("the position is " + zeroPosition);
                break;


            case 2:
                System.out.println("move forward");

                String currPosition;
                if((diceValue + zeroPosition) > 100)
                {
                    zeroPosition = zeroPosition - diceValue;
                    System.out.println("the position is " + zeroPosition);
                }else {
                    zeroPosition = zeroPosition + diceValue;
                    System.out.println("the current-position is  " + zeroPosition);
                }

                break;


            case 3:
                System.out.println("Backward move");
                zeroPosition = zeroPosition - diceValue;
                if(zeroPosition<= 0) {
                    zeroPosition = 0;
                    System.out.println("the position is " + zeroPosition);
                }
                else
                    System.out.println("the position is " + zeroPosition);


        }


    }
}


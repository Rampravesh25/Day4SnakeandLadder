package com.snake.and.ladder;

import java.util.Random;

public class UC1SnakeAndLadder {
    public static void main(String[] args) {
        int n = 0;
        Random ran = new Random();
        n = ran.nextInt(7);
        System.out.println("Print the " + n);
    }
}


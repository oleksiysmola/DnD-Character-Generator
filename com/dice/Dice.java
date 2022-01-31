package com.dice;

import java.util.Random;

public class Dice {
    private Random random = new Random();
    // Method for rolling numDice amount of dice with number of faces equal to diceSides
    public int[] rollDice(int numDice, int diceSides){
        // Give error if input is invalid
        if (numDice < 1 || diceSides < 1) {
            throw new IllegalArgumentException("Invalid input");
        }
        // Initialize random class
        Random random = this.random;
        // Initialize array to store results
        int[] results = new int[numDice];
        // Loop over array
        for (int i = 0; i < results.length; i++){
            results[i] = random.nextInt(diceSides) + 1;
        }
        return results;
    }
}

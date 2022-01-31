package com.character;

import com.dice.Dice;

public class CharacterAbilityScores {
    public static void main(String[] args){
        generateAbilityScores();

    }
    public static int[] generateAbilityScores(){
        // Obtain dice class
        Dice rolls = new Dice();

        // Initialise array of ability scores
        int[] abilityScores = new int[6];
        // Loop over all ability scores
        for (int i = 0; i < abilityScores.length; i++){
            int[] result = rolls.rollDice(4, 6);
            // Loop to remove smallest value from result
            int smallestIndex = 0; // Tracks the smallest index
            int sum = result[0]; // Initialise sum
            for (int j = 1; j < result.length; j++){
                if (result[j - 1] > result[j]){
                    smallestIndex = j; // Update smallest index
                }
                sum += result[j]; // Update sum
            }
            // Remove smallest value from sum
            sum -= result[smallestIndex];
            System.out.println(sum);
            // Sum gives us the ability score result
            abilityScores[i] = sum;
        }
        return abilityScores;
    }
}

/*
*   Author: Kyle Williams (eeu8e1)
*   Date: 30th October 2017
*   Assignment 2 - Create a simple GUI Dice Game
 */
package gui.dice.game;

import java.util.Random;

public class Dice {

    private Random generator;
    public int sides;
    private int value;

    public Dice(int noSides) {
        generator = new Random();
        sides = noSides;
        value = 1 + generator.nextInt(sides);
    }

    public int throwDice() {
        value = 1 + generator.nextInt(sides);
        return value;
    }

    public int getValue() {
        return value;
    }

    // Use for program testing
    public void setValue(int v) {
        value = v;
    }
}

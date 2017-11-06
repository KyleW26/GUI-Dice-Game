/*
*   Author: Kyle Williams (eeu8e1)
*   Date: 30th October 2017
*   Assignment 2 - Create a simple GUI Dice Game
 */
package gui.dice.game;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
import java.util.Random;

public class DiceComponent extends JComponent {

    Dice die1 = new Dice(6);
    Dice die2 = new Dice(6);

    int throwDie1;
    int throwDie2;

    @Override
    public void paintComponent(Graphics g) {
        throwDie1 = die1.throwDice();
        throwDie2 = die2.throwDice();
        Graphics2D g2 = (Graphics2D) g;
        DiceFace dice1 = new DiceFace(150, 100, 25, throwDie1, Color.BLACK);
        DiceFace dice2 = new DiceFace(150, 320, 25, throwDie2, Color.RED);
        dice1.draw(g2);
        dice2.draw(g2);

    }

    public int getDie1() {
        return throwDie1;
    }

    public int getDie2() {
        return throwDie2;
    }
}

/*
*   Author: Kyle Williams (eeu8e1)
*   Date: 30th October 2017
*   Assignment 2 - Create a simple GUI Dice Game
 */
package gui.dice.game;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class DiceFace {
    // Holds the seven possible dot positions on a standard die

    private Ellipse2D.Double[] dots = new Ellipse2D.Double[7];

    private Rectangle box;
    private int xLeft;
    private int yTop;
    private int size;
    public int diceValue;
    private Color colour = Color.BLACK;

    public DiceFace(int size, int x, int y, int faceVal, Color color) {
        this(size, x, y, faceVal);
        this.colour = color;
    }

    public DiceFace(int size, int x, int y, int faceVal) {
        this.size = size; // dimension of dice face
        xLeft = x; // position
        yTop = y; // position
        diceValue = faceVal; // pip value
    }

    public void setDiceFace(int v) {
        diceValue = v;
    }

    public void draw(Graphics2D g2) {
        box = new Rectangle(xLeft, yTop, size, size);
        makeDots();

        // Black background
        g2.setColor(colour);
        g2.fill(box);

        // White dots on black
        g2.setColor(Color.WHITE);

        // Draw dots
        switch (diceValue) {
            case 1:
                g2.fill(dots[0]);
                break;
            case 2:
                g2.fill(dots[1]);
                g2.fill(dots[2]);
                break;
            case 3:
                g2.fill(dots[0]);
                g2.fill(dots[1]);
                g2.fill(dots[2]);
                break;
            case 4:
                g2.fill(dots[1]);
                g2.fill(dots[2]);
                g2.fill(dots[3]);
                g2.fill(dots[4]);
                break;
            case 5:
                g2.fill(dots[0]);
                g2.fill(dots[1]);
                g2.fill(dots[2]);
                g2.fill(dots[3]);
                g2.fill(dots[4]);
                break;
            case 6:
                g2.fill(dots[1]);
                g2.fill(dots[2]);
                g2.fill(dots[3]);
                g2.fill(dots[4]);
                g2.fill(dots[5]);
                g2.fill(dots[6]);
                break;
            default:
                break;
        }
    }

    public void makeDots() {
        int w = size / 6;   // dot width
        int h = size / 6;   // dot height

        dots[0] = new Ellipse2D.Double(xLeft + (2.5 * size) / 6, yTop + (2.5 * size) / 6, h, w);
        dots[1] = new Ellipse2D.Double(xLeft + (3.75 * size) / 6, yTop + (3.75 * size) / 6, h, w);
        dots[2] = new Ellipse2D.Double(xLeft + (1.25 * size) / 6, yTop + (1.25 * size) / 6, h, w);
        dots[3] = new Ellipse2D.Double(xLeft + (1.25 * size) / 6, yTop + (3.75 * size) / 6, h, w);
        dots[4] = new Ellipse2D.Double(xLeft + (3.75 * size) / 6, yTop + (1.25 * size) / 6, h, w);
        dots[5] = new Ellipse2D.Double(xLeft + (1.25 * size) / 6, yTop + (2.5 * size) / 6, h, w);
        dots[6] = new Ellipse2D.Double(xLeft + (3.75 * size) / 6, yTop + (2.5 * size) / 6, h, w);
    }
}

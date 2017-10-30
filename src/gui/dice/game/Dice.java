/*
*   Author: Kyle Williams (eeu8e1)
*   Date: 30th October 2017
*   Assignment 2 - Create a simple GUI Dice Game
*/
package gui.dice.game;
import java.awt.*;
import java.awt.geom.*;

public class Dice 
{
    private int centreX;
    private int centreY;
    public int dieOne;
    public int dieTwo;
    
    // Constructor Method to pass parameters
    public Dice(int dieOne, int dieTwo) 
    {
        centreX = 300;
        centreY = 150;
        dieOne = 0;
        dieTwo = 0;
    }
    
    public void draw(Graphics2D g2)
    {
        // Build parts main clock
        g2.fillRect(centreX-200, centreY-100, 150, 150);
        g2.setColor(Color.red);
        g2.fillRect(centreX, centreY-100, 150, 150);
    }
}

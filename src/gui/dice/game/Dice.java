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
    public int dieSize;
    public int dotSize;
    
    // Constructor Method to pass parameters
    public Dice(int dieOne, int dieTwo) 
    {
        centreX = 300;
        centreY = 150;
        dieSize = 150;
        dotSize = dieSize / 6;
        dieOne = 0;
        dieTwo = 0;
    }
    
    public void draw(Graphics2D g2)
    {
        // Build parts main clock
        g2.fillRect(centreX-200, centreY-100, dieSize, dieSize);
        g2.setColor(Color.red);
        g2.fillRect(centreX, centreY-100, dieSize, dieSize);
        
       // Draw the three left hand side dots - Dice 1
       g2.setColor(Color.WHITE);
       g2.fillOval(centreX-165, centreY-80, dotSize, dotSize);
       g2.fillOval(centreX-165, centreY-40, dotSize, dotSize);
       g2.fillOval(centreX-165, centreY, dotSize, dotSize);
       
       // Draw the three right hand side dots - Dice 1
       g2.fillOval(centreX-115, centreY-80, dotSize, dotSize);
       g2.fillOval(centreX-115, centreY-40, dotSize, dotSize);
       g2.fillOval(centreX-115, centreY, dotSize, dotSize);
       
       // Draw the three left hand side dots - Dice 2
       g2.fillOval(centreX+35, centreY-80, dotSize, dotSize);
       g2.fillOval(centreX+35, centreY-40, dotSize, dotSize);
       g2.fillOval(centreX+35, centreY, dotSize, dotSize);
       
       // Draw the three right hand side dots - Dice 2
       g2.fillOval(centreX+85, centreY-80, dotSize, dotSize);
       g2.fillOval(centreX+85, centreY-40, dotSize, dotSize);
       g2.fillOval(centreX+85, centreY, dotSize, dotSize);
    }
}

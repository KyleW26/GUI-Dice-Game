/*
*   Author: Kyle Williams (eeu8e1)
*   Date: 30th October 2017
*   Assignment 2 - Create a simple GUI Dice Game
*/
package gui.dice.game;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class DiceComponent extends JComponent 
{
       
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Dice d1 = new Dice(0,0);
        d1.draw(g2);  
    }
}

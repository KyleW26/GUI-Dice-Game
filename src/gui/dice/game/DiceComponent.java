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
       
    
    @Override
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        DiceFace dice1  = new DiceFace(150,100,25, 2);
        DiceFace dice2 = new DiceFace(150, 320, 25, 3, Color.RED);
        dice1.draw(g2); dice2.draw(g2);
    }
}

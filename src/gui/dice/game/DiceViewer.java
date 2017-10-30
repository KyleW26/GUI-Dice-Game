/*
*   Author: Kyle Williams (eeu8e1)
*   Date: 30th October 2017
*   Assignment 2 - Create a simple GUI Dice Game
*/
package gui.dice.game;
import java.util.*;
import javax.swing.*;
import java.awt.*;

public class DiceViewer 
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame();
        frame.setSize(600,400);
        frame.setTitle("Dice Viewer");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        
        DiceComponent dice = new DiceComponent();
        frame.getContentPane().setPreferredSize(new Dimension(600,300));
        frame.getContentPane().add(dice);
        
        frame.setVisible(true);
    }
    
}

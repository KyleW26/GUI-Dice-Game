/*
*   Author: Kyle Williams (eeu8e1)
*   Date: 30th October 2017
*   Assignment 2 - Create a simple GUI Dice Game
 */
package gui.dice.game;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DiceViewer {

    public static void main(String[] args) {
        // Create the frame, panel and button
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton b = new JButton("Throw Dice");

        // Set the size of the frame, the layout
        frame.setSize(600, 350);
        frame.setTitle("Dice Viewer");
        frame.setLayout(new BorderLayout(1, 1));

        // Set the dice component
        DiceComponent dice = new DiceComponent();
        frame.getContentPane().setPreferredSize(new Dimension(600, 300));
        frame.getContentPane().add(dice);

        b.setPreferredSize(new Dimension(100, 30));
        panel.add(b);
        frame.getContentPane().add(panel, BorderLayout.SOUTH);
        b.setActionCommand("throw");

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ("throw".equals(e.getActionCommand())) {
                    dice.repaint();
                }
            }
        });

        // Build the radio buttons and add them to a box
        Box box1 = Box.createVerticalBox();
        ButtonGroup bg = new ButtonGroup();
        JRadioButton high = new JRadioButton("High");
        JRadioButton low = new JRadioButton("Low");
        JRadioButton seven = new JRadioButton("Sevens");
        bg.add(high);
        box1.add(high);
        bg.add(low);
        box1.add(low);
        bg.add(seven);
        box1.add(seven);
        panel.add(box1);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

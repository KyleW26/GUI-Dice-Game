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

    public static int die1Value;
    public static int die2Value;

    public static void main(String[] args) {

        String[] betting = {"0", "10", "30", "40"};
        // Create a frame of 600 x 300
        JFrame frame = new JFrame();
        final int FRAME_WIDTH = 600;
        final int FRAME_HEIGHT = 300;

        //Set the dice shapes
        frame.setPreferredSize(new Dimension(300, 300));
        DiceComponent dice = new DiceComponent();
        frame.add(dice, BorderLayout.CENTER);

        //Define my panel and set the layout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 4));
        int money = 50; // Default starting money
        JRadioButton high = new JRadioButton("High");
        JRadioButton low = new JRadioButton("Low");
        JRadioButton sevens = new JRadioButton("Sevens");
        JLabel balance = new JLabel("               Balance = £" + money);
        JButton throwButton = new JButton("Throw dice");
        throwButton.setActionCommand("throw");

        class ClickListener implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent event) {
                if ("throw".equals(event.getActionCommand())) {
                    dice.repaint();
                }
                DiceViewer.die1Value = (int) (6 * Math.random() + 1);
                DiceViewer.die2Value = (int) (6 * Math.random() + 1);
                {
                }
            }
        }

        ActionListener listener = new ClickListener();
        throwButton.addActionListener(listener);

        JComboBox<String> dropBox = new JComboBox<>(betting);
        ButtonGroup group = new ButtonGroup();
        high.setSelected(true);
        low.setSelected(true);
        sevens.setSelected(true);

        group.add(high);
        group.add(low);
        group.add(sevens);
        frame.pack();
        frame.setVisible(true);

        //Control panel giving the GUI of the game
        panel.add(high);
        panel.add(new JPanel());
        panel.add(new JPanel());
        panel.add(new JPanel());
        panel.add(low);
        panel.add(dropBox);
        panel.add(balance);
        panel.add(throwButton);
        panel.add(sevens);
        panel.add(new JPanel());
        panel.add(new JPanel());
        panel.add(new JPanel());
        frame.add(panel, BorderLayout.SOUTH);

        //Add frame
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setTitle("High Low - v1.6");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

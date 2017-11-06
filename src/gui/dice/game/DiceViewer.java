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

public abstract class DiceViewer implements ActionListener {

    DiceComponent dice = new DiceComponent();
    private static JFrame frame;
    private static JPanel panel, buttonPanel;
    private static JButton b;
    private static ButtonGroup bg1;
    private static JRadioButton high, low, seven;

    public static void main(String[] args) {
        // Create the frame, panel and button
        frame = new JFrame();
        panel = new JPanel();
        b = new JButton("Throw Dice");

        // Set the size of the frame, the layout
        frame.setSize(600, 350);
        frame.setTitle("Dice Viewer");
        frame.setLayout(new BorderLayout(1, 1));

        // Set the dice component
        DiceComponent dice = new DiceComponent();
        frame.getContentPane().setPreferredSize(new Dimension(600, 300));
        frame.getContentPane().add(dice);

        b.setPreferredSize(new Dimension(100, 30));
        frame.getContentPane().add(panel, BorderLayout.SOUTH);
        b.setActionCommand("throw");

        // Build the radio buttons and add them to a box
        buttonPanel = new JPanel(new GridLayout(0, 1));
        bg1 = new ButtonGroup();
        high = new JRadioButton("High");
        low = new JRadioButton("Low");
        seven = new JRadioButton("Sevens");

        buttonPanel.add(high);
        bg1.add(high);
        high.setMnemonic(KeyEvent.VK_A);
        high.addActionListener(this);

        buttonPanel.add(low);
        bg1.add(low);
        low.addActionListener(this);

        buttonPanel.add(seven);
        bg1.add(seven);
        seven.addActionListener(this);

        panel.add(buttonPanel);
        panel.add(b);
        b.setEnabled(false);

        frame.setVisible(
                true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (low.isSelected() || high.isSelected() || seven.isSelected()) {
            b.setEnabled(true);
            if ("throw".equals(e.getActionCommand())) {
                dice.repaint();
            }
        }
    }
}


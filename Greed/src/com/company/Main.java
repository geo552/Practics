package com.company;

import java.awt.*;
import java.awt.event.*;
import static java.lang.String.format;
import java.util.Random;
import static java.util.stream.IntStream.range;
import javax.swing.*;


class MainTest{
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame f = new JFrame();
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setTitle("Greed");
            f.setResizable(false);
            f.add(new Greed(), BorderLayout.CENTER);
            f.pack();
            f.setLocationRelativeTo(null);
            f.setVisible(true);
        });
    }
}


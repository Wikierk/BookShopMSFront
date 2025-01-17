/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JWindow;
import javax.swing.SwingConstants;
import javax.swing.Timer;

/**
 *
 * @author Wiktor
 */
public class Toast {
    private String message;
    private JPanel parent;
    private int duration;
    
    public Toast(JPanel parentPanel, String message, int duration) {
    JWindow toastWindow = new JWindow();
    toastWindow.setLayout(new BorderLayout());

    JLabel label = new JLabel(message, SwingConstants.CENTER);
    label.setOpaque(true);
    label.setBackground(new Color(82, 156, 8, 200));
    label.setForeground(Color.WHITE);
    label.setFont(new Font("Arial", Font.BOLD, 14));
    label.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
    toastWindow.add(label);
    toastWindow.pack();

    Point locationOnScreen = parentPanel.getLocationOnScreen();
    int x = locationOnScreen.x + (parentPanel.getWidth() - toastWindow.getWidth() - 50);
    int y = locationOnScreen.y + parentPanel.getHeight() - toastWindow.getHeight() - 30;
    toastWindow.setLocation(x, y);

    toastWindow.setVisible(true);

    new Timer(duration, e -> toastWindow.dispose()).start();
    }
}

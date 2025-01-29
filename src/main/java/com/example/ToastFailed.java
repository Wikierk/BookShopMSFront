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
 * This class displays a toast notification with a failure message as a small 
 * pop-up window. The toast will automatically disappear after the specified duration.
 * The toast uses a red color background to indicate an error or failure.
 * 
 * A toast is typically used to show brief information to the user without blocking 
 * interaction with the rest of the application.
 * 
 * @author Wiktor
 */
public class ToastFailed {
    private String message;
    private JPanel parent;
    private int duration;
    
    
     /**
     * Constructs a new ToastFailed notification with the specified failure message and duration.
     * 
     * @param parentPanel the parent panel where the toast will be displayed near
     * @param message the failure message to be displayed in the toast
     * @param duration the duration (in milliseconds) for which the toast will remain visible
     */
    public ToastFailed(JPanel parentPanel, String message, int duration) {
    JWindow toastWindow = new JWindow();
    toastWindow.setLayout(new BorderLayout());

    JLabel label = new JLabel(message, SwingConstants.CENTER);
    label.setOpaque(true);
    label.setBackground(new Color(245, 37, 54, 200));
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

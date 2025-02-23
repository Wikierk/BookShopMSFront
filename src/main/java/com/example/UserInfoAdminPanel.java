/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.example;


import com.example.dto.UserDto;


/**
 * This class represents a JPanel displaying the information of a user 
 * in the admin panel. It shows the user's name, email, and role.
 * 
 * The information displayed is based on the UserDto object passed during 
 * the instantiation of the panel.
 * 
 * @author Wiktor
 */
public class UserInfoAdminPanel extends javax.swing.JPanel {

    private MainFrame mainFrame;
    UserDto user;
    
     /**
     * Creates a new UserInfoAdminPanel with the provided user information.
     * 
     * @param user The UserDto object containing the user's data to display
     * @param mainFrame The main frame of the application
     */
    public UserInfoAdminPanel(UserDto user, MainFrame mainFrame) {
        initComponents();
        this.mainFrame = mainFrame;
        this.user = user;
        NameLabel.setText("Name: " + user.name);
        EmailLabel.setText("Email: " +  user.email);
        RoleLabel.setText("Role: " + user.role.toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UserInfoPanel = new javax.swing.JPanel();
        NamePanel = new javax.swing.JPanel();
        NameLabel = new javax.swing.JLabel();
        EmailPanel = new javax.swing.JPanel();
        EmailLabel = new javax.swing.JLabel();
        RolePanel = new javax.swing.JPanel();
        RoleLabel = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), javax.swing.BorderFactory.createTitledBorder("")));
        setMaximumSize(new java.awt.Dimension(250, 420));
        setMinimumSize(new java.awt.Dimension(250, 420));
        setPreferredSize(new java.awt.Dimension(250, 420));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        UserInfoPanel.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), javax.swing.BorderFactory.createTitledBorder("")));
        UserInfoPanel.setPreferredSize(new java.awt.Dimension(218, 120));
        UserInfoPanel.setLayout(new javax.swing.BoxLayout(UserInfoPanel, javax.swing.BoxLayout.Y_AXIS));

        NamePanel.setPreferredSize(new java.awt.Dimension(225, 30));
        NamePanel.setLayout(new java.awt.BorderLayout());

        NameLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        NameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NameLabel.setText("Name");
        NameLabel.setToolTipText("");
        NameLabel.setPreferredSize(new java.awt.Dimension(38, 20));
        NamePanel.add(NameLabel, java.awt.BorderLayout.CENTER);

        UserInfoPanel.add(NamePanel);

        EmailPanel.setPreferredSize(new java.awt.Dimension(225, 30));
        EmailPanel.setLayout(new java.awt.BorderLayout());

        EmailLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        EmailLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EmailLabel.setText("Email");
        EmailPanel.add(EmailLabel, java.awt.BorderLayout.CENTER);

        UserInfoPanel.add(EmailPanel);

        RolePanel.setLayout(new java.awt.BorderLayout());

        RoleLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RoleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RoleLabel.setText("Role");
        RolePanel.add(RoleLabel, java.awt.BorderLayout.CENTER);

        UserInfoPanel.add(RolePanel);

        add(UserInfoPanel);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JPanel EmailPanel;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JPanel NamePanel;
    private javax.swing.JLabel RoleLabel;
    private javax.swing.JPanel RolePanel;
    private javax.swing.JPanel UserInfoPanel;
    // End of variables declaration//GEN-END:variables
}

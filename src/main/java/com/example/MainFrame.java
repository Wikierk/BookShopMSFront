/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.example;

import com.example.dto.UserDto;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 * MainFrame is the central JFrame of the application. It manages the main layout and handles the 
 * navigation between different panels, such as login, registration, client dashboard, and admin sections.
 * It utilizes a CardLayout to switch between these panels.
 * 
 * @author Wiktor
 */
public class MainFrame extends javax.swing.JFrame {

    private CardLayout cardLayout;
    UserDto user;
    JPanel mainPanel;
     /**
     * Constructor that initializes the main frame, the card layout, and adds all the panels to the 
     * mainPanel. Initially, the login panel is displayed.
     */
    public MainFrame() {
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);
        mainPanel.add(new LoginPanel(this), "login");
        mainPanel.add(new RegistrationPanel(this), "registration");
        mainPanel.add(new ClientPanel(this), "client");
        mainPanel.add(new CartPanel(this), "cart");
        mainPanel.add(new OrdersPanel(this), "orders");
        mainPanel.add(new AdminPanel(this), "admin");
        mainPanel.add(new BookFormPanel(this), "bookForm");
        mainPanel.add(new AdminUsersPanel(this), "adminUsers");
        mainPanel.add(new UserFormPanel(this), "userForm");
        mainPanel.add(new AdminOrdersPanel(this), "adminOrders");
        
        add(mainPanel);
        cardLayout.show(mainPanel, "login");
        initComponents();

        
    }
     /**
     * Switches to the panel with the given name.
     * @param panelName the name of the panel to display
     */
    public void showPanel(String panelName) {
        cardLayout.show(mainPanel, panelName);
    }
    /**
     * Sets the current user.
     * @param user the UserDto object representing the current user
     */
    public void setUser(UserDto user){
        this.user = user;
    }
     /**
     * Returns the current user.
     * @return the UserDto object representing the current user
     */
    public UserDto getUser(){
        return this.user;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bookstore");
        setMaximumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new java.awt.CardLayout());

        pack();
    }// </editor-fold>//GEN-END:initComponents


    public static void setMainFrame() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

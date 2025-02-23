/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.example;

import com.example.dto.OrderDto;
import com.example.requests.SelectOrdersForUserRequest;
import com.example.responses.Response;
import com.example.responses.ResponseType;
import com.example.responses.SelectOrdersResponse;
import javax.swing.JPanel;



/**
 * This class represents the panel for displaying the list of orders associated with a user.
 * It contains UI elements and logic for loading and displaying order data, handling user interactions
 * like navigating to different panels or logging out.
 * 
 * The OrdersPanel fetches orders for the current user from a server and displays them dynamically.
 * It also provides the ability to navigate to other panels, such as the cart or client panels.
 * 
 * Author: Wiktor
 */
public class OrdersPanel extends javax.swing.JPanel {

    /**
     * Creates new form ClientPanel
     */
    private MainFrame mainFrame;
    
     /**
     * Constructor to initialize the OrdersPanel with the mainFrame reference.
     * 
     * @param mainFrame the MainFrame that contains the overall application layout
     */
    public OrdersPanel(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SidePanel = new javax.swing.JPanel();
        HelloLabel = new javax.swing.JLabel();
        BackBtn = new javax.swing.JButton();
        CartBtn = new javax.swing.JButton();
        LogOutBtn = new javax.swing.JButton();
        MainPanel = new javax.swing.JPanel();
        HeaderPanel = new javax.swing.JPanel();
        OrderItemsLabel = new javax.swing.JLabel();
        OrderItemsPanel = new javax.swing.JPanel();
        OrderItemsScrollPane = new javax.swing.JScrollPane();
        OrderItemsBoxPanel = new javax.swing.JPanel();

        setMaximumSize(new java.awt.Dimension(900, 600));
        setPreferredSize(new java.awt.Dimension(900, 600));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        setLayout(new java.awt.BorderLayout());

        SidePanel.setPreferredSize(new java.awt.Dimension(150, 485));
        SidePanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 15));

        HelloLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        HelloLabel.setText("Your Orders");
        SidePanel.add(HelloLabel);
        HelloLabel.getAccessibleContext().setAccessibleDescription("");

        BackBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BackBtn.setText("Back");
        BackBtn.setPreferredSize(new java.awt.Dimension(80, 30));
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });
        SidePanel.add(BackBtn);

        CartBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CartBtn.setText("Cart");
        CartBtn.setPreferredSize(new java.awt.Dimension(80, 30));
        CartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CartBtnActionPerformed(evt);
            }
        });
        SidePanel.add(CartBtn);

        LogOutBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LogOutBtn.setText("Log out");
        LogOutBtn.setPreferredSize(new java.awt.Dimension(85, 30));
        LogOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutBtnActionPerformed(evt);
            }
        });
        SidePanel.add(LogOutBtn);

        add(SidePanel, java.awt.BorderLayout.LINE_START);

        MainPanel.setMaximumSize(new java.awt.Dimension(750, 385));
        MainPanel.setPreferredSize(new java.awt.Dimension(750, 385));

        HeaderPanel.setPreferredSize(new java.awt.Dimension(750, 80));
        HeaderPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 60, 30));

        OrderItemsLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        OrderItemsLabel.setText("Orders");
        HeaderPanel.add(OrderItemsLabel);

        MainPanel.add(HeaderPanel);

        OrderItemsPanel.setPreferredSize(new java.awt.Dimension(600, 350));
        OrderItemsPanel.setLayout(new javax.swing.BoxLayout(OrderItemsPanel, javax.swing.BoxLayout.LINE_AXIS));

        OrderItemsScrollPane.setPreferredSize(new java.awt.Dimension(690, 485));

        OrderItemsBoxPanel.setLayout(new javax.swing.BoxLayout(OrderItemsBoxPanel, javax.swing.BoxLayout.Y_AXIS));
        OrderItemsScrollPane.setViewportView(OrderItemsBoxPanel);

        OrderItemsPanel.add(OrderItemsScrollPane);

        MainPanel.add(OrderItemsPanel);

        add(MainPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
   /**
     * Action handler for the "Back" button. Navigates to the client panel.
     */
    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        mainFrame.showPanel("client");
    }//GEN-LAST:event_BackBtnActionPerformed
    /**
     * Action handler for the "Cart" button. Navigates to the cart panel.
     */
    private void CartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CartBtnActionPerformed
        mainFrame.showPanel("cart");
    }//GEN-LAST:event_CartBtnActionPerformed
    /**
     * Action handler for the "Log out" button. Logs the user out and navigates to the login panel.
     */
    private void LogOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutBtnActionPerformed
        mainFrame.showPanel("login");
    }//GEN-LAST:event_LogOutBtnActionPerformed
    /**
     * Method that runs when the OrdersPanel is shown. It fetches and displays orders for the user.
     * It sends a request to the server to fetch the user's orders and updates the UI with the order data.
     */
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        OrderItemsBoxPanel.removeAll();
        OrderItemsBoxPanel.revalidate();
        OrderItemsBoxPanel.repaint();
        OrderDto[] orders = {};
        SelectOrdersForUserRequest selectOrdersForUserRequest = new SelectOrdersForUserRequest(mainFrame.getUser().id);
        try {
            Client client = BookShopManagementSystem.getClient();
            if (client != null) {
                String response = client.sendMessage(selectOrdersForUserRequest.create());
                String[] result = Response.split(response);
                 System.out.println("Server response: " + response);
                 if((ResponseType.fromResponseHeader(result[0]) == ResponseType.Ok)) {
                     SelectOrdersResponse selectOrdersResponse = new SelectOrdersResponse(result[1]);
                     orders = selectOrdersResponse.orders;
                 }
                 
            } else {
                System.out.println("Client is not connected.");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        for (OrderDto order : orders) {
            JPanel singleOrderPanel = new OrderItemPanel(order, mainFrame);
            OrderItemsBoxPanel.add(singleOrderPanel);
        }
    }//GEN-LAST:event_formComponentShown


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton CartBtn;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JLabel HelloLabel;
    private javax.swing.JButton LogOutBtn;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel OrderItemsBoxPanel;
    private javax.swing.JLabel OrderItemsLabel;
    private javax.swing.JPanel OrderItemsPanel;
    private javax.swing.JScrollPane OrderItemsScrollPane;
    private javax.swing.JPanel SidePanel;
    // End of variables declaration//GEN-END:variables
}

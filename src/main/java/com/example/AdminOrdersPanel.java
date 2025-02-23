/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.example;

import com.example.dto.OrderDto;
import com.example.requests.SelectOrdersRequest;
import com.example.responses.Response;
import com.example.responses.ResponseType;
import com.example.responses.SelectOrdersResponse;
import javax.swing.JPanel;

/**
 *
 * @author Wiktor
 * /
 * AdminOrdersPanel represents the admin panel for managing orders.
 * It allows the administrator to view and manage book orders.
 * The panel dynamically loads orders from the server and displays them.
 *
 */
public class AdminOrdersPanel extends javax.swing.JPanel {

    /**
     * Creates new form ClientPanel
     */
    private MainFrame mainFrame;
    /**
     * Creates a new AdminOrdersPanel.
     *
     * @param mainFrame The main frame of the application.
     */
    public AdminOrdersPanel(MainFrame mainFrame) {
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
        UsersBtn = new javax.swing.JButton();
        BooksBtn = new javax.swing.JButton();
        LogOutBtn = new javax.swing.JButton();
        MainPanel = new javax.swing.JPanel();
        HeaderPanel = new javax.swing.JPanel();
        OrdersLabel = new javax.swing.JLabel();
        OrdersPanel = new javax.swing.JPanel();
        OrdersScrollPane = new javax.swing.JScrollPane();
        OrdersBoxPanel = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(700, 430));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        setLayout(new java.awt.BorderLayout());

        SidePanel.setPreferredSize(new java.awt.Dimension(150, 485));
        SidePanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 15));

        HelloLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        HelloLabel.setText("Hello, Admin!");
        SidePanel.add(HelloLabel);
        HelloLabel.getAccessibleContext().setAccessibleDescription("");

        UsersBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        UsersBtn.setText("Users");
        UsersBtn.setMaximumSize(new java.awt.Dimension(110, 30));
        UsersBtn.setMinimumSize(new java.awt.Dimension(110, 30));
        UsersBtn.setPreferredSize(new java.awt.Dimension(110, 30));
        UsersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsersBtnActionPerformed(evt);
            }
        });
        SidePanel.add(UsersBtn);

        BooksBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BooksBtn.setText("Books");
        BooksBtn.setMaximumSize(new java.awt.Dimension(110, 30));
        BooksBtn.setMinimumSize(new java.awt.Dimension(110, 30));
        BooksBtn.setPreferredSize(new java.awt.Dimension(110, 30));
        BooksBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BooksBtnActionPerformed(evt);
            }
        });
        SidePanel.add(BooksBtn);

        LogOutBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LogOutBtn.setText("Log out");
        LogOutBtn.setMaximumSize(new java.awt.Dimension(110, 30));
        LogOutBtn.setMinimumSize(new java.awt.Dimension(110, 30));
        LogOutBtn.setPreferredSize(new java.awt.Dimension(110, 30));
        LogOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutBtnActionPerformed(evt);
            }
        });
        SidePanel.add(LogOutBtn);

        add(SidePanel, java.awt.BorderLayout.LINE_START);

        MainPanel.setLayout(new java.awt.BorderLayout());

        HeaderPanel.setPreferredSize(new java.awt.Dimension(750, 80));
        HeaderPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 60, 30));

        OrdersLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        OrdersLabel.setText("Orders:");
        HeaderPanel.add(OrdersLabel);

        MainPanel.add(HeaderPanel, java.awt.BorderLayout.PAGE_START);

        OrdersPanel.setPreferredSize(new java.awt.Dimension(750, 300));
        OrdersPanel.setLayout(new javax.swing.BoxLayout(OrdersPanel, javax.swing.BoxLayout.LINE_AXIS));

        OrdersScrollPane.setPreferredSize(new java.awt.Dimension(690, 485));

        OrdersBoxPanel.setLayout(new javax.swing.BoxLayout(OrdersBoxPanel, javax.swing.BoxLayout.Y_AXIS));
        OrdersScrollPane.setViewportView(OrdersBoxPanel);

        OrdersPanel.add(OrdersScrollPane);

        MainPanel.add(OrdersPanel, java.awt.BorderLayout.CENTER);

        add(MainPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Handles the event when the "Users" button is clicked.
     * Switches the view to the admin user management panel.
     *
     * @param evt The action event triggered by clicking the Users button.
     */
    private void UsersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsersBtnActionPerformed
        mainFrame.showPanel("adminUsers");
    }//GEN-LAST:event_UsersBtnActionPerformed
    /**
     * Handles the event when the "Log Out" button is clicked.
     * Switches the view to the login panel.
     *
     * @param evt The action event triggered by clicking the Log Out button.
     */
    private void LogOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutBtnActionPerformed
        mainFrame.showPanel("login");
    }//GEN-LAST:event_LogOutBtnActionPerformed

    /**
     * Handles the event when the "Books" button is clicked.
     * Switches the view to the book management panel.
     *
     * @param evt The action event triggered by clicking the Books button.
     */
    private void BooksBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BooksBtnActionPerformed
        mainFrame.showPanel("admin");
    }//GEN-LAST:event_BooksBtnActionPerformed
   /**
     * Refreshes the OrdersBoxPanel by fetching and displaying orders from the server.
     * The method removes existing orders, retrieves new data, and updates the panel.
     */
    public void refreshOrdersBoxPanel() {
        OrdersBoxPanel.removeAll();
        OrdersBoxPanel.revalidate();
        OrdersBoxPanel.repaint();
        OrderDto[] orders = {};
        SelectOrdersRequest selectOrdersRequest = new SelectOrdersRequest();
        try {
            Client client = BookShopManagementSystem.getClient();
            if (client != null) {
                String response = client.sendMessage(selectOrdersRequest.create());
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
            JPanel singleOrderPanel = new OrderAdminPanel(order, mainFrame,this);
            OrdersBoxPanel.add(singleOrderPanel);
        }
    }
        /**
     * Event handler for when the panel is shown.
     * Automatically refreshes the orders list when the panel becomes visible.
     *
     * @param evt The component event triggered when the panel is shown.
     */
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        refreshOrdersBoxPanel();
    }//GEN-LAST:event_formComponentShown


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BooksBtn;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JLabel HelloLabel;
    private javax.swing.JButton LogOutBtn;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel OrdersBoxPanel;
    private javax.swing.JLabel OrdersLabel;
    private javax.swing.JPanel OrdersPanel;
    private javax.swing.JScrollPane OrdersScrollPane;
    private javax.swing.JPanel SidePanel;
    private javax.swing.JButton UsersBtn;
    // End of variables declaration//GEN-END:variables
}

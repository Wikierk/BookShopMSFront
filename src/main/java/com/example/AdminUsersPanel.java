/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.example;

import com.example.dto.BookDto;
import com.example.dto.UserDto;
import com.example.requests.SelectBooksRequest;
import com.example.requests.SelectUsersRequest;
import com.example.responses.Response;
import com.example.responses.ResponseType;
import com.example.responses.SelectBooksResponse;
import com.example.responses.SelectUsersResponse;
import javax.swing.JPanel;

/**
 *
 * @author Wiktor
 */
public class AdminUsersPanel extends javax.swing.JPanel {

    /**
     * Creates new form ClientPanel
     */
    private MainFrame mainFrame;

    public AdminUsersPanel(MainFrame mainFrame) {
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
        AddUserBtn = new javax.swing.JButton();
        OrdersBtn = new javax.swing.JButton();
        BooksBtn = new javax.swing.JButton();
        LogOutBtn = new javax.swing.JButton();
        MainPanel = new javax.swing.JPanel();
        HeaderPanel = new javax.swing.JPanel();
        UsersLabel = new javax.swing.JLabel();
        UsersPanel = new javax.swing.JPanel();
        UsersScrollPane = new javax.swing.JScrollPane();
        UsersBoxPanel = new javax.swing.JPanel();

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

        AddUserBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AddUserBtn.setText("Add User");
        AddUserBtn.setMaximumSize(new java.awt.Dimension(110, 30));
        AddUserBtn.setMinimumSize(new java.awt.Dimension(110, 30));
        AddUserBtn.setPreferredSize(new java.awt.Dimension(110, 30));
        AddUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddUserBtnActionPerformed(evt);
            }
        });
        SidePanel.add(AddUserBtn);

        OrdersBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        OrdersBtn.setText("Orders");
        OrdersBtn.setMaximumSize(new java.awt.Dimension(110, 30));
        OrdersBtn.setMinimumSize(new java.awt.Dimension(110, 30));
        OrdersBtn.setPreferredSize(new java.awt.Dimension(110, 30));
        OrdersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdersBtnActionPerformed(evt);
            }
        });
        SidePanel.add(OrdersBtn);

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

        UsersLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        UsersLabel.setText("Users:");
        HeaderPanel.add(UsersLabel);

        MainPanel.add(HeaderPanel, java.awt.BorderLayout.PAGE_START);

        UsersPanel.setPreferredSize(new java.awt.Dimension(750, 300));
        UsersPanel.setLayout(new javax.swing.BoxLayout(UsersPanel, javax.swing.BoxLayout.LINE_AXIS));

        UsersScrollPane.setPreferredSize(new java.awt.Dimension(690, 485));

        UsersBoxPanel.setLayout(new javax.swing.BoxLayout(UsersBoxPanel, javax.swing.BoxLayout.Y_AXIS));
        UsersScrollPane.setViewportView(UsersBoxPanel);

        UsersPanel.add(UsersScrollPane);

        MainPanel.add(UsersPanel, java.awt.BorderLayout.CENTER);

        add(MainPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void AddUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddUserBtnActionPerformed
        mainFrame.showPanel("userForm");
    }//GEN-LAST:event_AddUserBtnActionPerformed

    private void OrdersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdersBtnActionPerformed
        mainFrame.showPanel("adminOrders");
    }//GEN-LAST:event_OrdersBtnActionPerformed

    private void LogOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutBtnActionPerformed
        mainFrame.showPanel("login");
    }//GEN-LAST:event_LogOutBtnActionPerformed

    private void BooksBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BooksBtnActionPerformed
        mainFrame.showPanel("admin");
    }//GEN-LAST:event_BooksBtnActionPerformed

    public void refreshUsersBoxPanel() {
        UsersBoxPanel.removeAll();
        UsersBoxPanel.revalidate();
        UsersBoxPanel.repaint();
        UserDto[] users = {};
        SelectUsersRequest selectUsersRequest = new SelectUsersRequest();
        try {
            Client client = BookShopManagementSystem.getClient();
            if (client != null) {
                String response = client.sendMessage(selectUsersRequest.create());
                String[] result = Response.split(response);
                System.out.println("Server response: " + response);
                if ((ResponseType.fromResponseHeader(result[0]) == ResponseType.Ok)) {
                    SelectUsersResponse selectUsersResponse = new SelectUsersResponse(result[1]);
                    users = selectUsersResponse.users;
                }

            } else {
                System.out.println("Client is not connected.");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        for (UserDto user : users) {
            JPanel singleUserPanel = new UserAdminPanel(user,mainFrame);
            UsersBoxPanel.add(singleUserPanel);
        }
    }

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown

        refreshUsersBoxPanel();
    }//GEN-LAST:event_formComponentShown


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddUserBtn;
    private javax.swing.JButton BooksBtn;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JLabel HelloLabel;
    private javax.swing.JButton LogOutBtn;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton OrdersBtn;
    private javax.swing.JPanel SidePanel;
    private javax.swing.JPanel UsersBoxPanel;
    private javax.swing.JLabel UsersLabel;
    private javax.swing.JPanel UsersPanel;
    private javax.swing.JScrollPane UsersScrollPane;
    // End of variables declaration//GEN-END:variables
}

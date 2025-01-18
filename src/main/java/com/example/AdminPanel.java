/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.example;

import com.example.dto.BookDto;
import com.example.requests.SelectBooksRequest;
import com.example.responses.Response;
import com.example.responses.ResponseType;
import com.example.responses.SelectBooksResponse;
import javax.swing.JPanel;

/**
 *
 * @author Wiktor
 */
public class AdminPanel extends javax.swing.JPanel {

    /**
     * Creates new form ClientPanel
     */
    private MainFrame mainFrame;

    public AdminPanel(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        initComponents();
       
        /*
    Book[] books = new Book[10];
    books[0] = new Book("The Great Gatsby", "F. Scott Fitzgerald", new BigDecimal("29.99"));
    books[1] = new Book("1984", "George Orwell", new BigDecimal("19.99"));
    books[2] = new Book("To Kill a Mockingbird", "Harper Lee", new BigDecimal("24.99"));
    books[3] = new Book("The Great Gatsby", "F. Scott Fitzgerald", new BigDecimal("29.99"));
    books[4] = new Book("1984", "George Orwell", new BigDecimal("19.99"));
    books[5] = new Book("To Kill a Mockingbird", "Harper Lee", new BigDecimal("24.99"));
    books[6] = new Book("1984", "George Orwell", new BigDecimal("19.99"));
    books[7] = new Book("To Kill a Mockingbird", "Harper Lee", new BigDecimal("19.99"));
    books[8] = new Book("The Great Gatsby", "F. Scott Fitzgerald", new BigDecimal("29.99"));
    books[9] = new Book("1984", "George Orwell", new BigDecimal("19.99"));
        
        for (Book book : books) {
            JPanel singleBookPanel = new BookAdminPanel(book, this, mainFrame);
            BooksBoxPanel.add(singleBookPanel);
        }
         */
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
        BasketBtn = new javax.swing.JButton();
        OrdersBtn = new javax.swing.JButton();
        UsersBtn = new javax.swing.JButton();
        FiltersBtn = new javax.swing.JButton();
        LogOutBtn = new javax.swing.JButton();
        MainPanel = new javax.swing.JPanel();
        HeaderPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BooksPanel = new javax.swing.JPanel();
        BooksScrollPane = new javax.swing.JScrollPane();
        BooksBoxPanel = new javax.swing.JPanel();

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

        BasketBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BasketBtn.setText("Add Book");
        BasketBtn.setMaximumSize(new java.awt.Dimension(110, 30));
        BasketBtn.setMinimumSize(new java.awt.Dimension(110, 30));
        BasketBtn.setPreferredSize(new java.awt.Dimension(110, 30));
        BasketBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BasketBtnActionPerformed(evt);
            }
        });
        SidePanel.add(BasketBtn);

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

        FiltersBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        FiltersBtn.setText("Filters");
        FiltersBtn.setMaximumSize(new java.awt.Dimension(110, 30));
        FiltersBtn.setMinimumSize(new java.awt.Dimension(110, 30));
        FiltersBtn.setPreferredSize(new java.awt.Dimension(110, 30));
        SidePanel.add(FiltersBtn);

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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Books:");
        HeaderPanel.add(jLabel1);

        MainPanel.add(HeaderPanel, java.awt.BorderLayout.PAGE_START);

        BooksPanel.setPreferredSize(new java.awt.Dimension(750, 300));
        BooksPanel.setLayout(new javax.swing.BoxLayout(BooksPanel, javax.swing.BoxLayout.LINE_AXIS));

        BooksScrollPane.setPreferredSize(new java.awt.Dimension(690, 485));

        BooksBoxPanel.setLayout(new javax.swing.BoxLayout(BooksBoxPanel, javax.swing.BoxLayout.Y_AXIS));
        BooksScrollPane.setViewportView(BooksBoxPanel);

        BooksPanel.add(BooksScrollPane);

        MainPanel.add(BooksPanel, java.awt.BorderLayout.CENTER);

        add(MainPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void BasketBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BasketBtnActionPerformed
        mainFrame.showPanel("bookForm");
    }//GEN-LAST:event_BasketBtnActionPerformed

    private void OrdersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdersBtnActionPerformed
        mainFrame.showPanel("adminOrders");
    }//GEN-LAST:event_OrdersBtnActionPerformed

    private void LogOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutBtnActionPerformed
        mainFrame.showPanel("login");
    }//GEN-LAST:event_LogOutBtnActionPerformed

    private void UsersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsersBtnActionPerformed
        mainFrame.showPanel("adminUsers");
    }//GEN-LAST:event_UsersBtnActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        BooksBoxPanel.removeAll();
        BooksBoxPanel.revalidate();
        BooksBoxPanel.repaint();
        BookDto[] books = {};
        SelectBooksRequest selectBookRequest = new SelectBooksRequest();
        try {
            Client client = BookShopManagementSystem.getClient();
            if (client != null) {
                String response = client.sendMessage(selectBookRequest.create());
                String[] result = Response.split(response);
                 System.out.println("Server response: " + response);
                 if((ResponseType.fromResponseHeader(result[0]) == ResponseType.Ok)) {
                     SelectBooksResponse selectBooksResponse = new SelectBooksResponse(result[1]);
                     books = selectBooksResponse.books;
                 }
                 
            } else {
                System.out.println("Client is not connected.");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        for (BookDto book : books) {
            JPanel singleBookPanel = new BookAdminPanel(book, this, mainFrame);
            BooksBoxPanel.add(singleBookPanel);
        }
    }//GEN-LAST:event_formComponentShown


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BasketBtn;
    private javax.swing.JPanel BooksBoxPanel;
    private javax.swing.JPanel BooksPanel;
    private javax.swing.JScrollPane BooksScrollPane;
    private javax.swing.JButton FiltersBtn;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JLabel HelloLabel;
    private javax.swing.JButton LogOutBtn;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton OrdersBtn;
    private javax.swing.JPanel SidePanel;
    private javax.swing.JButton UsersBtn;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

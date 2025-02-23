/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.example;

import com.example.dto.BookOrderDetailsDto;
import com.example.dto.OrderDto;
import com.example.dto.UserDto;
import com.example.requests.SelectBooksForOrderRequest;
import com.example.requests.SelectUserForOrderRequest;
import com.example.responses.Response;
import com.example.responses.ResponseType;
import com.example.responses.SelectBooksForOrderResponse;
import com.example.responses.SelectUserResponse;
import java.awt.Font;
import java.math.BigDecimal;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * OrderAdminDetailsPanel is a panel in the admin interface of the application
 * that displays the details of a specific order. It shows order information,
 * including the user who placed the order and the books included in the order.
 * It also calculates and displays the total value of the order.
 * 
 * @author Wiktor
 */
public class OrderAdminDetailsPanel extends javax.swing.JPanel {

    
    private MainFrame mainFrame;
    private OrderDto order;
    private BigDecimal totalValue = new BigDecimal(0);

     /**
     * Constructor initializes the panel with the main frame and order details.
     * It sets up the initial display, including the order ID.
     * 
     * @param mainFrame the main frame of the application
     * @param order the order whose details are to be displayed
     */
    public OrderAdminDetailsPanel(MainFrame mainFrame, OrderDto order) {
        this.mainFrame = mainFrame;
        initComponents();
        this.order = order;
        HelloLabel.setText("Order: " + order.id);
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
        LogOutBtn = new javax.swing.JButton();
        MainPanel = new javax.swing.JPanel();
        HeaderPanel = new javax.swing.JPanel();
        OrderItemsLabel = new javax.swing.JLabel();
        OrderItemsPanel = new javax.swing.JPanel();
        OrderItemsScrollPane = new javax.swing.JScrollPane();
        OrderItemsBoxPanel = new javax.swing.JPanel();
        CartSummaryPanel = new javax.swing.JPanel();
        TotalValueInfoLabel = new javax.swing.JLabel();
        TotalValueLabel = new javax.swing.JLabel();

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
        HelloLabel.setText("Order ID");
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
        OrderItemsLabel.setText("Order Details");
        HeaderPanel.add(OrderItemsLabel);

        MainPanel.add(HeaderPanel);

        OrderItemsPanel.setPreferredSize(new java.awt.Dimension(600, 350));
        OrderItemsPanel.setLayout(new javax.swing.BoxLayout(OrderItemsPanel, javax.swing.BoxLayout.LINE_AXIS));

        OrderItemsScrollPane.setPreferredSize(new java.awt.Dimension(690, 485));

        OrderItemsBoxPanel.setLayout(new javax.swing.BoxLayout(OrderItemsBoxPanel, javax.swing.BoxLayout.Y_AXIS));
        OrderItemsScrollPane.setViewportView(OrderItemsBoxPanel);

        OrderItemsPanel.add(OrderItemsScrollPane);

        MainPanel.add(OrderItemsPanel);

        CartSummaryPanel.setPreferredSize(new java.awt.Dimension(770, 100));
        CartSummaryPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 200, 5));

        TotalValueInfoLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        TotalValueInfoLabel.setText("Total Value:");
        CartSummaryPanel.add(TotalValueInfoLabel);

        TotalValueLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TotalValueLabel.setText("0 ZŁ");
        CartSummaryPanel.add(TotalValueLabel);

        MainPanel.add(CartSummaryPanel);

        add(MainPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Event handler for the "Back" button. Navigates back to the admin orders panel.
     */
    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        mainFrame.showPanel("adminOrders");
    }//GEN-LAST:event_BackBtnActionPerformed
    /**
     * Event handler for the "Log out" button. Logs out and navigates back to the login screen.
     */
    private void LogOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutBtnActionPerformed
        mainFrame.showPanel("login");
    }//GEN-LAST:event_LogOutBtnActionPerformed

     /**
     * Called when the panel is displayed. This method fetches and displays the order details,
     * including the user who placed the order and the list of books in the order.
     * It also calculates the total value of the order and updates the display accordingly.
     */
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        OrderItemsBoxPanel.removeAll();
        OrderItemsBoxPanel.revalidate();
        OrderItemsBoxPanel.repaint();
        totalValue = new BigDecimal(0);
        BookOrderDetailsDto[] books = {};
        UserDto user;
        SelectUserForOrderRequest selectUserForOrderRequest = new SelectUserForOrderRequest(order.id);
        try {
            Client client = BookShopManagementSystem.getClient();
            if (client != null) {
                String response = client.sendMessage(selectUserForOrderRequest.create());
                String[] result = Response.split(response);
                System.out.println("Server response: " + response);
                if ((ResponseType.fromResponseHeader(result[0]) == ResponseType.Ok)) {
                    SelectUserResponse selectUserResponse = new SelectUserResponse(result[1]);
                    user = selectUserResponse.user;
                    JPanel singleUserPanel = new UserInfoAdminPanel(user, mainFrame);
                    JLabel userLabel = new JLabel();
                    userLabel.setFont(new Font("Serif", Font.BOLD, 24)); 
                    userLabel.setText("User Info: ");
                    OrderItemsBoxPanel.add(userLabel);
                    OrderItemsBoxPanel.add(singleUserPanel);
                }

            } else {
                System.out.println("Client is not connected.");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        SelectBooksForOrderRequest selectBooksForOrderRequest = new SelectBooksForOrderRequest(order.id);
        try {
            Client client = BookShopManagementSystem.getClient();
            if (client != null) {
                String response = client.sendMessage(selectBooksForOrderRequest.create());
                String[] result = Response.split(response);
                System.out.println("Server response: " + response);
                if ((ResponseType.fromResponseHeader(result[0]) == ResponseType.Ok)) {
                    SelectBooksForOrderResponse selectBooksForOrderResponse = new SelectBooksForOrderResponse(result[1]);
                    books = selectBooksForOrderResponse.books;
                }

            } else {
                System.out.println("Client is not connected.");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        JLabel bookLabel = new JLabel();
        bookLabel.setFont(new Font("Serif", Font.BOLD, 24));  
        bookLabel.setText("Book Info: ");
        OrderItemsBoxPanel.add(bookLabel);
        for (BookOrderDetailsDto book : books) {
            JPanel singleBookPanel = new BookInfoPanel(book);
            OrderItemsBoxPanel.add(singleBookPanel);
            totalValue = totalValue.add(book.getBook().getPrice().multiply(new BigDecimal(book.getQuantity())));
        }

        TotalValueLabel.setText(String.valueOf(totalValue) + "ZŁ");

    }//GEN-LAST:event_formComponentShown


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JPanel CartSummaryPanel;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JLabel HelloLabel;
    private javax.swing.JButton LogOutBtn;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel OrderItemsBoxPanel;
    private javax.swing.JLabel OrderItemsLabel;
    private javax.swing.JPanel OrderItemsPanel;
    private javax.swing.JScrollPane OrderItemsScrollPane;
    private javax.swing.JPanel SidePanel;
    private javax.swing.JLabel TotalValueInfoLabel;
    private javax.swing.JLabel TotalValueLabel;
    // End of variables declaration//GEN-END:variables
}

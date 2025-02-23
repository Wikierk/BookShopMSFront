/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.example;

import bookshopmanagementsystem.interfaces.Cart;
import com.example.dto.BookDto;
import com.example.interfaces.BookInCart;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Wiktor
 * 
 * BookPanel is a custom JPanel that displays book information and allows users to interact with the book.
 * Users can add the book to their cart or place an order immediately.
 *
 */
public class BookPanel extends javax.swing.JPanel {

    /**
     * Creates new form BookPanel
     */
    private ClientPanel clientPanel;
    private MainFrame mainFrame;
    private BookDto book;
     
    /**
     * Creates a new BookPanel.
     * 
     * @param book The book data transfer object containing book details.
     * @param clientPanel The client panel that interacts with this book panel.
     * @param mainFrame The main frame of the application.
     */
    public BookPanel(BookDto book, ClientPanel clientPanel, MainFrame mainFrame) {
        initComponents();
        TitleLabel.setText(book.getTitle());
        AuthorLabel.setText(book.getAuthor());
        PriceLabel.setText(String.valueOf(book.getPrice()) + " ZŁ");
        this.clientPanel = clientPanel;
        this.mainFrame = mainFrame;
        this.book = book;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImagePanel = new javax.swing.JPanel();
        ImageLabel = new javax.swing.JLabel();
        BookInfoPanel = new javax.swing.JPanel();
        TitlePanel = new javax.swing.JPanel();
        TitleLabel = new javax.swing.JLabel();
        AuthorPanel = new javax.swing.JPanel();
        AuthorLabel = new javax.swing.JLabel();
        PricePanel = new javax.swing.JPanel();
        PriceLabel = new javax.swing.JLabel();
        BtnPanel = new javax.swing.JPanel();
        AddToCartBtn = new javax.swing.JButton();
        OrderNowBtn = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(15, 1, 15, 1), javax.swing.BorderFactory.createTitledBorder("")));
        setMaximumSize(new java.awt.Dimension(250, 420));
        setPreferredSize(new java.awt.Dimension(250, 420));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        ImagePanel.setPreferredSize(new java.awt.Dimension(218, 200));
        ImagePanel.setLayout(new java.awt.BorderLayout());

        ImageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/no-image-icon-23485.png"))); // NOI18N
        ImagePanel.add(ImageLabel, java.awt.BorderLayout.CENTER);

        add(ImagePanel);

        BookInfoPanel.setPreferredSize(new java.awt.Dimension(218, 120));
        BookInfoPanel.setLayout(new javax.swing.BoxLayout(BookInfoPanel, javax.swing.BoxLayout.Y_AXIS));

        TitlePanel.setPreferredSize(new java.awt.Dimension(225, 30));
        TitlePanel.setLayout(new java.awt.BorderLayout());

        TitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel.setText("Title");
        TitleLabel.setToolTipText("");
        TitlePanel.add(TitleLabel, java.awt.BorderLayout.CENTER);

        BookInfoPanel.add(TitlePanel);

        AuthorPanel.setPreferredSize(new java.awt.Dimension(225, 30));
        AuthorPanel.setLayout(new java.awt.BorderLayout());

        AuthorLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AuthorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AuthorLabel.setText("Author");
        AuthorPanel.add(AuthorLabel, java.awt.BorderLayout.CENTER);

        BookInfoPanel.add(AuthorPanel);

        PricePanel.setPreferredSize(new java.awt.Dimension(225, 30));
        PricePanel.setLayout(new java.awt.BorderLayout());

        PriceLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        PriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PriceLabel.setText("Price");
        PricePanel.add(PriceLabel, java.awt.BorderLayout.CENTER);

        BookInfoPanel.add(PricePanel);

        add(BookInfoPanel);

        BtnPanel.setPreferredSize(new java.awt.Dimension(218, 50));

        AddToCartBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AddToCartBtn.setText("Add to cart");
        AddToCartBtn.setPreferredSize(new java.awt.Dimension(110, 30));
        AddToCartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddToCartBtnActionPerformed(evt);
            }
        });
        BtnPanel.add(AddToCartBtn);

        OrderNowBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        OrderNowBtn.setText("Order now");
        OrderNowBtn.setPreferredSize(new java.awt.Dimension(110, 30));
        OrderNowBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderNowBtnActionPerformed(evt);
            }
        });
        BtnPanel.add(OrderNowBtn);

        add(BtnPanel);
    }// </editor-fold>//GEN-END:initComponents

     /**
     * Handles the event of adding the book to the cart.
     * If the book is already in the cart, its quantity is increased.
     * Otherwise, it is added as a new item.
     * 
     * @param evt The action event triggered by the "Add to Cart" button.
     */
    private void AddToCartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddToCartBtnActionPerformed

        Toast toast = new Toast(clientPanel, "Added to cart", 1000);
            boolean found = false;

    for (BookInCart item : Cart.getInstance().getItems()) {
        if (item.getBook().id == book.id) {
            item.setQuantity(item.getQuantity() + 1);
            Cart.getInstance().setTotalValue(Cart.getInstance().getTotalValue().add(item.getBook().price));
            found = true;
            break;
        }
    }

    if (!found) {
        BookInCart bookInCart = new BookInCart(book,1);
        Cart.getInstance().addItem(bookInCart);
    }

    }//GEN-LAST:event_AddToCartBtnActionPerformed
    /**
     * Handles the event of ordering the book immediately.
     * Creates a new order form with the selected book.
     * 
     * @param evt The action event triggered by the "Order Now" button.
     */
    private void OrderNowBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderNowBtnActionPerformed
        List<BookInCart> bookInCart = new ArrayList<>();
        bookInCart.add(new BookInCart(book,1));
        OrderFormPanel orderFormPanel = new OrderFormPanel(mainFrame, bookInCart);
        mainFrame.mainPanel.add(orderFormPanel, "orderForm");
        BookInfoPanel bookInfoPanel = new BookInfoPanel(bookInCart.get(0),mainFrame);
        orderFormPanel.getOrderItemsBoxPanel().add(bookInfoPanel);
        orderFormPanel.getTotalValueLabel().setText(String.valueOf(book.price) + "ZŁ");
        mainFrame.showPanel("orderForm");
    }//GEN-LAST:event_OrderNowBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddToCartBtn;
    private javax.swing.JLabel AuthorLabel;
    private javax.swing.JPanel AuthorPanel;
    private javax.swing.JPanel BookInfoPanel;
    private javax.swing.JPanel BtnPanel;
    private javax.swing.JLabel ImageLabel;
    private javax.swing.JPanel ImagePanel;
    private javax.swing.JButton OrderNowBtn;
    private javax.swing.JLabel PriceLabel;
    private javax.swing.JPanel PricePanel;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JPanel TitlePanel;
    // End of variables declaration//GEN-END:variables
}

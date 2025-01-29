/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.example;

import bookshopmanagementsystem.interfaces.Cart;
import com.example.interfaces.BookInCart;

/**
 * This class represents a panel displaying information about a book in the shopping cart.
 * It allows the user to view the book's title, author, price, and quantity, as well as
 * remove the book from the cart or adjust its quantity.
 * This class uses the BookInCart object to manage the book's information and update the cart.
 * 
 * @author Wiktor
 */
public class CartItemPanel extends javax.swing.JPanel {

    private final BookInCart bookInCart;
     /**
     * Creates a new CartItemPanel for a given book in the cart.
     * 
     * @param bookInCart The BookInCart object representing the book in the cart.
     */
    public CartItemPanel(BookInCart bookInCart) {
        initComponents();
        TitleLabel.setText(bookInCart.getBook().getTitle());
        AuthorLabel.setText(bookInCart.getBook().getAuthor());
        PriceLabel.setText(String.valueOf(bookInCart.getBook().getPrice()) + " ZŁ");
        this.bookInCart = bookInCart;
        QuantitySpinner.setValue(bookInCart.getQuantity());
        
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
        CartItemInfoPanel = new javax.swing.JPanel();
        TitlePanel = new javax.swing.JPanel();
        TitleLabel = new javax.swing.JLabel();
        AuthorPanel = new javax.swing.JPanel();
        AuthorLabel = new javax.swing.JLabel();
        PricePanel = new javax.swing.JPanel();
        PriceLabel = new javax.swing.JLabel();
        QuantityPanel = new javax.swing.JPanel();
        QuantityLabel = new javax.swing.JLabel();
        QuantitySpinner = new javax.swing.JSpinner();
        RemoveBtnPanel = new javax.swing.JPanel();
        RemoveBtn = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(15, 1, 15, 1), javax.swing.BorderFactory.createTitledBorder("")));
        setMaximumSize(new java.awt.Dimension(415, 255));
        setPreferredSize(new java.awt.Dimension(415, 255));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.X_AXIS));

        ImagePanel.setPreferredSize(new java.awt.Dimension(218, 200));
        ImagePanel.setLayout(new java.awt.BorderLayout());

        ImageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/no-image-icon-23485.png"))); // NOI18N
        ImagePanel.add(ImageLabel, java.awt.BorderLayout.CENTER);

        add(ImagePanel);

        CartItemInfoPanel.setPreferredSize(new java.awt.Dimension(218, 120));
        CartItemInfoPanel.setLayout(new javax.swing.BoxLayout(CartItemInfoPanel, javax.swing.BoxLayout.Y_AXIS));

        TitlePanel.setPreferredSize(new java.awt.Dimension(180, 30));
        TitlePanel.setLayout(new java.awt.BorderLayout());

        TitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel.setText("Title");
        TitleLabel.setToolTipText("");
        TitlePanel.add(TitleLabel, java.awt.BorderLayout.CENTER);

        CartItemInfoPanel.add(TitlePanel);

        AuthorPanel.setPreferredSize(new java.awt.Dimension(180, 30));
        AuthorPanel.setLayout(new java.awt.BorderLayout());

        AuthorLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AuthorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AuthorLabel.setText("Author");
        AuthorPanel.add(AuthorLabel, java.awt.BorderLayout.CENTER);

        CartItemInfoPanel.add(AuthorPanel);

        PricePanel.setPreferredSize(new java.awt.Dimension(225, 30));
        PricePanel.setLayout(new java.awt.BorderLayout());

        PriceLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        PriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PriceLabel.setText("Price");
        PricePanel.add(PriceLabel, java.awt.BorderLayout.CENTER);

        CartItemInfoPanel.add(PricePanel);

        QuantityPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 15, 5));

        QuantityLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        QuantityLabel.setText("Quantity:");
        QuantityPanel.add(QuantityLabel);

        QuantitySpinner.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        QuantitySpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        QuantitySpinner.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        QuantitySpinner.setPreferredSize(new java.awt.Dimension(50, 26));
        QuantitySpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                QuantitySpinnerStateChanged(evt);
            }
        });
        QuantityPanel.add(QuantitySpinner);

        CartItemInfoPanel.add(QuantityPanel);

        RemoveBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RemoveBtn.setText("Remove");
        RemoveBtn.setPreferredSize(new java.awt.Dimension(90, 37));
        RemoveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveBtnActionPerformed(evt);
            }
        });
        RemoveBtnPanel.add(RemoveBtn);

        CartItemInfoPanel.add(RemoveBtnPanel);

        add(CartItemInfoPanel);
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Handles the action when the "Remove" button is clicked. 
     * Removes the current book from the shopping cart.
     * 
     * @param evt The event triggered by the button click.
     */
    private void RemoveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveBtnActionPerformed
        Cart.getInstance().removeItem(bookInCart);
    }//GEN-LAST:event_RemoveBtnActionPerformed
    /**
     * Handles the change in quantity when the user adjusts the quantity spinner.
     * Updates the quantity of the book in the cart and recalculates the total value of the cart.
     * 
     * @param evt The event triggered by the spinner value change.
     */
    private void QuantitySpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_QuantitySpinnerStateChanged
        int newQuantity = (int) QuantitySpinner.getValue();
        bookInCart.setQuantity(newQuantity);
        Cart.getInstance().recalculateTotalValue();
    }//GEN-LAST:event_QuantitySpinnerStateChanged

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AuthorLabel;
    private javax.swing.JPanel AuthorPanel;
    private javax.swing.JPanel CartItemInfoPanel;
    private javax.swing.JLabel ImageLabel;
    private javax.swing.JPanel ImagePanel;
    private javax.swing.JLabel PriceLabel;
    private javax.swing.JPanel PricePanel;
    private javax.swing.JLabel QuantityLabel;
    private javax.swing.JPanel QuantityPanel;
    private javax.swing.JSpinner QuantitySpinner;
    private javax.swing.JButton RemoveBtn;
    private javax.swing.JPanel RemoveBtnPanel;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JPanel TitlePanel;
    // End of variables declaration//GEN-END:variables
}

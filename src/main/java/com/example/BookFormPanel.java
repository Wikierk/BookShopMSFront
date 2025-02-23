/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.example;

import com.example.dto.BookDto;
import com.example.dto.NewBookDto;
import com.example.requests.AddBookRequest;
import java.math.BigDecimal;

/**
 * The {@code BookFormPanel} class represents a JPanel that allows users to input
 * book details such as title, author, and price, and add a new book to the system.
 * This panel interacts with the {@code MainFrame} and communicates with the server
 * to add books.
 *
 * @author Wiktor
 */
public class BookFormPanel extends javax.swing.JPanel {

    /**
     * Creates new form BookFormPanel
     */
    MainFrame mainFrame;
    BookDto book;
    /**
     * Creates a new BookFormPanel for adding a new book.
     *
     * @param mainFrame the main frame of the application
     */
    public BookFormPanel(MainFrame mainFrame) {
        initComponents();
        this.mainFrame = mainFrame;
    }
    /**
     * Creates a new BookFormPanel pre-filled with an existing book's details.
     *
     * @param mainFrame the main frame of the application
     * @param book      the book whose details will be pre-filled in the form
     */
    public BookFormPanel(MainFrame mainFrame, BookDto book) {
        initComponents();
        this.mainFrame = mainFrame;
        this.book = book;
        TitleTextField.setText(book.title);
        AuthorTextField.setText(book.author);
        PriceTextField.setText(String.valueOf(book.price));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NewBookPanel = new javax.swing.JPanel();
        HeaderPanel = new javax.swing.JPanel();
        NewBookLabel = new javax.swing.JLabel();
        NewBookFormPanel = new javax.swing.JPanel();
        NamePanel = new javax.swing.JPanel();
        TitleLabel = new javax.swing.JLabel();
        TitleTextField = new javax.swing.JTextField();
        LastNamePanel = new javax.swing.JPanel();
        AuthorLabel = new javax.swing.JLabel();
        AuthorTextField = new javax.swing.JTextField();
        EmailPanel = new javax.swing.JPanel();
        PriceLabel = new javax.swing.JLabel();
        PriceTextField = new javax.swing.JTextField();
        infoPanel = new javax.swing.JPanel();
        InfoLabel = new javax.swing.JLabel();
        NewBookBtnPanel = new javax.swing.JPanel();
        AddButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        NewBookPanel.setPreferredSize(new java.awt.Dimension(400, 0));

        HeaderPanel.setPreferredSize(new java.awt.Dimension(400, 100));

        NewBookLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        NewBookLabel.setText("New Book");
        HeaderPanel.add(NewBookLabel);

        NewBookPanel.add(HeaderPanel);

        NewBookFormPanel.setPreferredSize(new java.awt.Dimension(400, 220));

        NamePanel.setPreferredSize(new java.awt.Dimension(280, 50));
        NamePanel.setLayout(new java.awt.BorderLayout(4, 4));

        TitleLabel.setText("Title");
        NamePanel.add(TitleLabel, java.awt.BorderLayout.PAGE_START);

        TitleTextField.setPreferredSize(new java.awt.Dimension(64, 25));
        TitleTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TitleTextFieldActionPerformed(evt);
            }
        });
        NamePanel.add(TitleTextField, java.awt.BorderLayout.CENTER);

        NewBookFormPanel.add(NamePanel);

        LastNamePanel.setPreferredSize(new java.awt.Dimension(280, 50));
        LastNamePanel.setLayout(new java.awt.BorderLayout(4, 4));

        AuthorLabel.setText("Author");
        LastNamePanel.add(AuthorLabel, java.awt.BorderLayout.PAGE_START);

        AuthorTextField.setPreferredSize(new java.awt.Dimension(64, 25));
        AuthorTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AuthorTextFieldActionPerformed(evt);
            }
        });
        LastNamePanel.add(AuthorTextField, java.awt.BorderLayout.CENTER);

        NewBookFormPanel.add(LastNamePanel);

        EmailPanel.setPreferredSize(new java.awt.Dimension(280, 50));
        EmailPanel.setLayout(new java.awt.BorderLayout(4, 4));

        PriceLabel.setText("Price");
        EmailPanel.add(PriceLabel, java.awt.BorderLayout.PAGE_START);

        PriceTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        PriceTextField.setPreferredSize(new java.awt.Dimension(64, 25));
        PriceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceTextFieldActionPerformed(evt);
            }
        });
        EmailPanel.add(PriceTextField, java.awt.BorderLayout.CENTER);

        NewBookFormPanel.add(EmailPanel);

        infoPanel.setPreferredSize(new java.awt.Dimension(280, 50));
        infoPanel.setLayout(new java.awt.BorderLayout(4, 4));

        InfoLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        InfoLabel.setForeground(new java.awt.Color(255, 51, 51));
        infoPanel.add(InfoLabel, java.awt.BorderLayout.CENTER);

        NewBookFormPanel.add(infoPanel);

        NewBookPanel.add(NewBookFormPanel);

        NewBookBtnPanel.setPreferredSize(new java.awt.Dimension(400, 50));

        AddButton.setText("Add");
        AddButton.setPreferredSize(new java.awt.Dimension(150, 30));
        AddButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddButtonMouseClicked(evt);
            }
        });
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        NewBookBtnPanel.add(AddButton);

        BackButton.setText("Back");
        BackButton.setPreferredSize(new java.awt.Dimension(150, 30));
        BackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackButtonMouseClicked(evt);
            }
        });
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        NewBookBtnPanel.add(BackButton);

        NewBookPanel.add(NewBookBtnPanel);

        add(NewBookPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void TitleTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TitleTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TitleTextFieldActionPerformed

    private void AuthorTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AuthorTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AuthorTextFieldActionPerformed

    private void PriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceTextFieldActionPerformed
    /**
     * Handles the event when the Add button is clicked.
     * It validates input fields, converts price to BigDecimal, and sends a request to the server.
     *
     * @param evt the mouse click event
     */
    private void AddButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddButtonMouseClicked
        String title = TitleTextField.getText();
        String author = AuthorTextField.getText();
        String priceText = PriceTextField.getText();

        if (!title.isEmpty() && !author.isEmpty() && !priceText.isEmpty()) {
            try {
                // Próba konwersji ceny na BigDecimal
                BigDecimal price = new BigDecimal(priceText);

                NewBookDto newBookDto = new NewBookDto(title, author, price);
                AddBookRequest addBookRequest = new AddBookRequest(newBookDto);

                try {
                    Client client = BookShopManagementSystem.getClient();
                    if (client != null) {
                        String response = client.sendMessage(addBookRequest.create());
                        System.out.println("Server response: " + response);
                    } else {
                        System.out.println("Client is not connected.");
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }

                // Czyszczenie pól i informacja o sukcesie
                TitleTextField.setText("");
                AuthorTextField.setText("");
                PriceTextField.setText("");
                InfoLabel.setForeground(new java.awt.Color(40, 252, 3));
                InfoLabel.setText("Book added!");

            } catch (NumberFormatException e) {
                // Obsługa błędu jeśli użytkownik podał niepoprawną wartość w priceText
                InfoLabel.setForeground(new java.awt.Color(255, 51, 51));
                InfoLabel.setText("Invalid price! Enter a number.");
            }
        } else {
            // Jeśli którekolwiek pole jest puste
            InfoLabel.setForeground(new java.awt.Color(255, 51, 51));
            InfoLabel.setText("Fill all fields!");
        }


    }//GEN-LAST:event_AddButtonMouseClicked

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddButtonActionPerformed
    /**
     * Handles the event when the Back button is clicked.
     * Returns to the admin panel.
     *
     * @param evt the mouse click event
     */
    private void BackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseClicked
        mainFrame.showPanel("admin");
    }//GEN-LAST:event_BackButtonMouseClicked

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JLabel AuthorLabel;
    private javax.swing.JTextField AuthorTextField;
    private javax.swing.JButton BackButton;
    private javax.swing.JPanel EmailPanel;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JLabel InfoLabel;
    private javax.swing.JPanel LastNamePanel;
    private javax.swing.JPanel NamePanel;
    private javax.swing.JPanel NewBookBtnPanel;
    private javax.swing.JPanel NewBookFormPanel;
    private javax.swing.JLabel NewBookLabel;
    private javax.swing.JPanel NewBookPanel;
    private javax.swing.JLabel PriceLabel;
    private javax.swing.JTextField PriceTextField;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JTextField TitleTextField;
    private javax.swing.JPanel infoPanel;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the TitleTextField component
     */
    public javax.swing.JTextField getTitleTextField() {
        return this.TitleTextField;
    }

    /**
     * @return the AuthorTextField component
     */
    public javax.swing.JTextField getAuthorTextField() {
        return this.AuthorTextField;
    }
    /**
     * @return the PriceTextField component
     */
    public javax.swing.JTextField getPriceTextField() {
        return this.PriceTextField;
    }
  /**
     * @return the InfoLabel component
     */
    public javax.swing.JLabel getInfoLabel() {
        return this.InfoLabel;
    }

    /**
     * @return the AddButton component
     */
    public javax.swing.JButton getAddButton() {
        return this.AddButton;
    }

    /**
     * @return the NewBookLabel component
     */
    public javax.swing.JLabel getTitleLabel() {
        return this.NewBookLabel;
    }
}

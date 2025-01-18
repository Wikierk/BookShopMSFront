/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.example;

/**
 *
 * @author Wiktor
 */
public class UserAdminPanel extends javax.swing.JPanel {

    /**
     * Creates new form UserPanel
     */
    public UserAdminPanel() {
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

        UserInfoPanel = new javax.swing.JPanel();
        NamePanel = new javax.swing.JPanel();
        TitleLabel = new javax.swing.JLabel();
        LastNamePanel = new javax.swing.JPanel();
        AuthorLabel = new javax.swing.JLabel();
        EmailPanel = new javax.swing.JPanel();
        EmailLabel = new javax.swing.JLabel();
        RolePanel = new javax.swing.JPanel();
        RoleLabel = new javax.swing.JLabel();
        BtnPanel = new javax.swing.JPanel();
        EditBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        UserInfoPanel.setPreferredSize(new java.awt.Dimension(218, 120));
        UserInfoPanel.setLayout(new javax.swing.BoxLayout(UserInfoPanel, javax.swing.BoxLayout.Y_AXIS));

        NamePanel.setPreferredSize(new java.awt.Dimension(225, 10));
        NamePanel.setLayout(new java.awt.BorderLayout());

        TitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel.setText("Name");
        TitleLabel.setToolTipText("");
        TitleLabel.setPreferredSize(new java.awt.Dimension(38, 20));
        NamePanel.add(TitleLabel, java.awt.BorderLayout.CENTER);

        UserInfoPanel.add(NamePanel);

        LastNamePanel.setPreferredSize(new java.awt.Dimension(225, 30));
        LastNamePanel.setLayout(new java.awt.BorderLayout());

        AuthorLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AuthorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AuthorLabel.setText("Last Name");
        LastNamePanel.add(AuthorLabel, java.awt.BorderLayout.CENTER);

        UserInfoPanel.add(LastNamePanel);

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

        BtnPanel.setPreferredSize(new java.awt.Dimension(218, 50));

        EditBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EditBtn.setText("Edit");
        EditBtn.setPreferredSize(new java.awt.Dimension(110, 30));
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });
        BtnPanel.add(EditBtn);

        DeleteBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DeleteBtn.setText("Delete");
        DeleteBtn.setPreferredSize(new java.awt.Dimension(110, 30));
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });
        BtnPanel.add(DeleteBtn);

        UserInfoPanel.add(BtnPanel);

        add(UserInfoPanel);
    }// </editor-fold>//GEN-END:initComponents

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed

    }//GEN-LAST:event_EditBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed

    }//GEN-LAST:event_DeleteBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AuthorLabel;
    private javax.swing.JPanel BtnPanel;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JPanel EmailPanel;
    private javax.swing.JPanel LastNamePanel;
    private javax.swing.JPanel NamePanel;
    private javax.swing.JLabel RoleLabel;
    private javax.swing.JPanel RolePanel;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JPanel UserInfoPanel;
    // End of variables declaration//GEN-END:variables
}

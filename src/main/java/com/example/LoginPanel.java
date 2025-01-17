/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.example;

/**
 *
 * @author Wiktor
 */
public class LoginPanel extends javax.swing.JPanel {

    /**
     * Creates new form LoginPanel
     */
    private MainFrame mainFrame;
    public LoginPanel(MainFrame mainFrame) {
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

        LoginPanel = new javax.swing.JPanel();
        HeaderPanel = new javax.swing.JPanel();
        LogInLabel = new javax.swing.JLabel();
        LoginFormPanel = new javax.swing.JPanel();
        EmailPanel = new javax.swing.JPanel();
        EmailLabel = new javax.swing.JLabel();
        EmailTextField = new javax.swing.JTextField();
        PasswordPanel = new javax.swing.JPanel();
        PasswordLabel = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        RememeberForgotPanel = new javax.swing.JPanel();
        RememberMeCheckBox = new javax.swing.JCheckBox();
        ForgotPasswordLabel = new javax.swing.JLabel();
        LoginBtnPanel = new javax.swing.JPanel();
        LoginButton = new javax.swing.JButton();
        SignUpPanel = new javax.swing.JPanel();
        SignUpLabel = new javax.swing.JLabel();
        SidePanel = new javax.swing.JPanel();
        IconLabel = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(700, 430));
        setLayout(new java.awt.BorderLayout());

        LoginPanel.setPreferredSize(new java.awt.Dimension(400, 0));

        HeaderPanel.setPreferredSize(new java.awt.Dimension(400, 100));

        LogInLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LogInLabel.setText("Log in");

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(LogInLabel)
                .addContainerGap(166, Short.MAX_VALUE))
        );
        HeaderPanelLayout.setVerticalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(LogInLabel)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        LoginPanel.add(HeaderPanel);

        LoginFormPanel.setPreferredSize(new java.awt.Dimension(400, 180));

        EmailPanel.setPreferredSize(new java.awt.Dimension(280, 50));
        EmailPanel.setLayout(new java.awt.BorderLayout(4, 4));

        EmailLabel.setText("Email Address");
        EmailPanel.add(EmailLabel, java.awt.BorderLayout.PAGE_START);

        EmailTextField.setPreferredSize(new java.awt.Dimension(64, 25));
        EmailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailTextFieldActionPerformed(evt);
            }
        });
        EmailPanel.add(EmailTextField, java.awt.BorderLayout.CENTER);

        LoginFormPanel.add(EmailPanel);

        PasswordPanel.setPreferredSize(new java.awt.Dimension(280, 50));
        PasswordPanel.setLayout(new java.awt.BorderLayout(4, 4));

        PasswordLabel.setText("Password");
        PasswordPanel.add(PasswordLabel, java.awt.BorderLayout.PAGE_START);

        PasswordField.setPreferredSize(new java.awt.Dimension(64, 25));
        PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldActionPerformed(evt);
            }
        });
        PasswordPanel.add(PasswordField, java.awt.BorderLayout.CENTER);

        LoginFormPanel.add(PasswordPanel);

        RememeberForgotPanel.setPreferredSize(new java.awt.Dimension(250, 25));
        RememeberForgotPanel.setLayout(new java.awt.BorderLayout());

        RememberMeCheckBox.setText("Remember me");
        RememberMeCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RememberMeCheckBoxActionPerformed(evt);
            }
        });
        RememeberForgotPanel.add(RememberMeCheckBox, java.awt.BorderLayout.WEST);

        ForgotPasswordLabel.setForeground(new java.awt.Color(255, 153, 153));
        ForgotPasswordLabel.setText("Forgot your password?");
        ForgotPasswordLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RememeberForgotPanel.add(ForgotPasswordLabel, java.awt.BorderLayout.EAST);

        LoginFormPanel.add(RememeberForgotPanel);

        LoginPanel.add(LoginFormPanel);

        LoginBtnPanel.setPreferredSize(new java.awt.Dimension(400, 50));

        LoginButton.setText("Login");
        LoginButton.setPreferredSize(new java.awt.Dimension(250, 30));
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        LoginBtnPanel.add(LoginButton);

        LoginPanel.add(LoginBtnPanel);

        SignUpPanel.setPreferredSize(new java.awt.Dimension(400, 50));

        SignUpLabel.setForeground(new java.awt.Color(0, 153, 153));
        SignUpLabel.setText("Don't have an account? Sign up. ");
        SignUpLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SignUpLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignUpLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SignUpLabelMouseEntered(evt);
            }
        });
        SignUpPanel.add(SignUpLabel);

        LoginPanel.add(SignUpPanel);

        add(LoginPanel, java.awt.BorderLayout.WEST);

        SidePanel.setBackground(new java.awt.Color(255, 255, 255));
        SidePanel.setPreferredSize(new java.awt.Dimension(400, 430));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 100);
        flowLayout1.setAlignOnBaseline(true);
        SidePanel.setLayout(flowLayout1);

        IconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/LoginIcon.png"))); // NOI18N
        SidePanel.add(IconLabel);

        add(SidePanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void EmailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailTextFieldActionPerformed

    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordFieldActionPerformed

    private void RememberMeCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RememberMeCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RememberMeCheckBoxActionPerformed

    private void SignUpLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpLabelMouseClicked
        mainFrame.showPanel("registration");
    }//GEN-LAST:event_SignUpLabelMouseClicked

    private void SignUpLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpLabelMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_SignUpLabelMouseEntered

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
       mainFrame.showPanel("admin");
    }//GEN-LAST:event_LoginButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JPanel EmailPanel;
    private javax.swing.JTextField EmailTextField;
    private javax.swing.JLabel ForgotPasswordLabel;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JLabel IconLabel;
    private javax.swing.JLabel LogInLabel;
    private javax.swing.JPanel LoginBtnPanel;
    private javax.swing.JButton LoginButton;
    private javax.swing.JPanel LoginFormPanel;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JPanel PasswordPanel;
    private javax.swing.JCheckBox RememberMeCheckBox;
    private javax.swing.JPanel RememeberForgotPanel;
    private javax.swing.JPanel SidePanel;
    private javax.swing.JLabel SignUpLabel;
    private javax.swing.JPanel SignUpPanel;
    // End of variables declaration//GEN-END:variables
}

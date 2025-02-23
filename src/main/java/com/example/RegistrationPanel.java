/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.example;

import com.example.dto.NewUserDto;
import com.example.requests.AddUserRequest;

/**
 * This class represents a panel used for registering a new user in the application.
 * It provides fields for inputting user data such as name, last name, email, password, 
 * and repeating the password, as well as buttons for submitting the registration or 
 * navigating back to the login screen.
 * 
 * It communicates with a server to register a new user through the BookShopManagementSystem.
 * 
 * @author Wiktor
 */
public class RegistrationPanel extends javax.swing.JPanel {

    private MainFrame mainFrame;
    
     /**
     * Constructs a RegistrationPanel.
     * 
     * @param mainFrame The main frame of the application, used to navigate between panels.
     */
    public RegistrationPanel(MainFrame mainFrame) {
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
        IconLabel = new javax.swing.JLabel();
        RegistrationPanel = new javax.swing.JPanel();
        HeaderPanel = new javax.swing.JPanel();
        LogInLabel = new javax.swing.JLabel();
        RegistrationFormPanel = new javax.swing.JPanel();
        NamePanel = new javax.swing.JPanel();
        NameLabel = new javax.swing.JLabel();
        NameTextField = new javax.swing.JTextField();
        LastNamePanel = new javax.swing.JPanel();
        LastNameLabel = new javax.swing.JLabel();
        LastNameTextField = new javax.swing.JTextField();
        EmailPanel = new javax.swing.JPanel();
        EmailLabel = new javax.swing.JLabel();
        EmailTextField = new javax.swing.JTextField();
        PasswordPanel = new javax.swing.JPanel();
        PasswordLabel = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        RepeatPasswordPanel = new javax.swing.JPanel();
        RepeatPasswordLabel = new javax.swing.JLabel();
        RepeatPasswordField = new javax.swing.JPasswordField();
        infoPanel = new javax.swing.JPanel();
        InfoLabel = new javax.swing.JLabel();
        RegistrationBtnPanel = new javax.swing.JPanel();
        RegisterButton = new javax.swing.JButton();
        BackToLoginButton = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(651, 500));
        setPreferredSize(new java.awt.Dimension(400, 520));
        setLayout(new java.awt.BorderLayout());

        SidePanel.setBackground(new java.awt.Color(255, 255, 255));
        SidePanel.setPreferredSize(new java.awt.Dimension(400, 420));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 100);
        flowLayout1.setAlignOnBaseline(true);
        SidePanel.setLayout(flowLayout1);

        IconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/LoginIcon.png"))); // NOI18N
        SidePanel.add(IconLabel);

        add(SidePanel, java.awt.BorderLayout.CENTER);

        RegistrationPanel.setPreferredSize(new java.awt.Dimension(400, 0));

        HeaderPanel.setPreferredSize(new java.awt.Dimension(400, 100));

        LogInLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LogInLabel.setText("Register");

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(LogInLabel)
                .addContainerGap(143, Short.MAX_VALUE))
        );
        HeaderPanelLayout.setVerticalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(LogInLabel)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        RegistrationPanel.add(HeaderPanel);

        RegistrationFormPanel.setPreferredSize(new java.awt.Dimension(400, 330));

        NamePanel.setPreferredSize(new java.awt.Dimension(280, 50));
        NamePanel.setLayout(new java.awt.BorderLayout(4, 4));

        NameLabel.setText("Name");
        NamePanel.add(NameLabel, java.awt.BorderLayout.PAGE_START);

        NameTextField.setPreferredSize(new java.awt.Dimension(64, 25));
        NameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTextFieldActionPerformed(evt);
            }
        });
        NamePanel.add(NameTextField, java.awt.BorderLayout.CENTER);

        RegistrationFormPanel.add(NamePanel);

        LastNamePanel.setPreferredSize(new java.awt.Dimension(280, 50));
        LastNamePanel.setLayout(new java.awt.BorderLayout(4, 4));

        LastNameLabel.setText("Last Name");
        LastNamePanel.add(LastNameLabel, java.awt.BorderLayout.PAGE_START);

        LastNameTextField.setPreferredSize(new java.awt.Dimension(64, 25));
        LastNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastNameTextFieldActionPerformed(evt);
            }
        });
        LastNamePanel.add(LastNameTextField, java.awt.BorderLayout.CENTER);

        RegistrationFormPanel.add(LastNamePanel);

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

        RegistrationFormPanel.add(EmailPanel);

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

        RegistrationFormPanel.add(PasswordPanel);

        RepeatPasswordPanel.setPreferredSize(new java.awt.Dimension(280, 50));
        RepeatPasswordPanel.setLayout(new java.awt.BorderLayout(4, 4));

        RepeatPasswordLabel.setText("Repeat Password ");
        RepeatPasswordPanel.add(RepeatPasswordLabel, java.awt.BorderLayout.PAGE_START);

        RepeatPasswordField.setPreferredSize(new java.awt.Dimension(64, 25));
        RepeatPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RepeatPasswordFieldActionPerformed(evt);
            }
        });
        RepeatPasswordPanel.add(RepeatPasswordField, java.awt.BorderLayout.CENTER);

        RegistrationFormPanel.add(RepeatPasswordPanel);

        infoPanel.setPreferredSize(new java.awt.Dimension(280, 50));
        infoPanel.setLayout(new java.awt.BorderLayout(4, 4));

        InfoLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        InfoLabel.setForeground(new java.awt.Color(255, 51, 51));
        infoPanel.add(InfoLabel, java.awt.BorderLayout.CENTER);

        RegistrationFormPanel.add(infoPanel);

        RegistrationPanel.add(RegistrationFormPanel);

        RegistrationBtnPanel.setPreferredSize(new java.awt.Dimension(400, 50));

        RegisterButton.setText("Register me");
        RegisterButton.setPreferredSize(new java.awt.Dimension(150, 30));
        RegisterButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterButtonMouseClicked(evt);
            }
        });
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonActionPerformed(evt);
            }
        });
        RegistrationBtnPanel.add(RegisterButton);

        BackToLoginButton.setText("Back to login");
        BackToLoginButton.setPreferredSize(new java.awt.Dimension(150, 30));
        BackToLoginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackToLoginButtonMouseClicked(evt);
            }
        });
        BackToLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToLoginButtonActionPerformed(evt);
            }
        });
        RegistrationBtnPanel.add(BackToLoginButton);

        RegistrationPanel.add(RegistrationBtnPanel);

        add(RegistrationPanel, java.awt.BorderLayout.WEST);
    }// </editor-fold>//GEN-END:initComponents

    private void EmailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailTextFieldActionPerformed

    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordFieldActionPerformed

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegisterButtonActionPerformed

    private void RepeatPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RepeatPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RepeatPasswordFieldActionPerformed

    private void NameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameTextFieldActionPerformed

    private void LastNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastNameTextFieldActionPerformed

    private void BackToLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToLoginButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackToLoginButtonActionPerformed

    private void BackToLoginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackToLoginButtonMouseClicked
        mainFrame.showPanel("login");
    }//GEN-LAST:event_BackToLoginButtonMouseClicked

     /**
     * Handles the action when the user clicks on the "Register" button.
     * Collects the user's input data, checks for password confirmation, 
     * creates a new user object, and sends it to the server for registration.
     * Displays success or error messages based on the outcome.
     * 
     * @param evt The event triggered by the user clicking the "Register" button.
     */
    private void RegisterButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterButtonMouseClicked
         String name = NameTextField.getText();
         String lastName = LastNameTextField.getText();
         String email = EmailTextField.getText();
         String password = new String(PasswordField.getPassword());
         String repeatPassword = new String(RepeatPasswordField.getPassword());
         String fullName = name + " " + lastName;
        
        if(!password.equals(repeatPassword)) {
            InfoLabel.setForeground(new java.awt.Color(255, 51, 51));
            InfoLabel.setText("Passwords are not the same.");
        }else{
            
            NewUserDto newUserDto = new NewUserDto(fullName,email,password);
            AddUserRequest addUserRequest = new AddUserRequest(newUserDto);
            
            try {
                Client client = BookShopManagementSystem.getClient();
                if (client != null) {
                    String response = client.sendMessage(addUserRequest.create());
                    System.out.println("Server response: " + response);
            }   else {
                    System.out.println("Client is not connected.");
            }
            }catch(Exception e) {
                System.out.println(e);
            }
            
           InfoLabel.setText("");
           NameTextField.setText("");
           LastNameTextField.setText("");
           EmailTextField.setText("");
           PasswordField.setText("");
           RepeatPasswordField.setText("");
           InfoLabel.setForeground(new java.awt.Color(40, 252, 3));
           InfoLabel.setText("Success you have been registered!");
           
        }
        
       
    }//GEN-LAST:event_RegisterButtonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToLoginButton;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JPanel EmailPanel;
    private javax.swing.JTextField EmailTextField;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JLabel IconLabel;
    private javax.swing.JLabel InfoLabel;
    private javax.swing.JLabel LastNameLabel;
    private javax.swing.JPanel LastNamePanel;
    private javax.swing.JTextField LastNameTextField;
    private javax.swing.JLabel LogInLabel;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JPanel NamePanel;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JPanel PasswordPanel;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JPanel RegistrationBtnPanel;
    private javax.swing.JPanel RegistrationFormPanel;
    private javax.swing.JPanel RegistrationPanel;
    private javax.swing.JPasswordField RepeatPasswordField;
    private javax.swing.JLabel RepeatPasswordLabel;
    private javax.swing.JPanel RepeatPasswordPanel;
    private javax.swing.JPanel SidePanel;
    private javax.swing.JPanel infoPanel;
    // End of variables declaration//GEN-END:variables
}

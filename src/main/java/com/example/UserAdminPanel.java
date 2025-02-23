/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.example;

import com.example.dto.Role;
import com.example.dto.UserDto;
import com.example.requests.DeleteUserRequest;
import com.example.requests.UpdateUserRequest;
import java.awt.event.MouseListener;

/**
 * This class represents the admin panel for managing user information. It displays
 * user details such as name, email, and role, and provides options to edit or delete
 * a user.
 * 
 * The UserAdminPanel allows an administrator to view, edit, or delete user
 * information from the system. The user information is displayed in a structured format,
 * and clicking on buttons allows the user to edit or delete the user data.
 * 
 * @author Wiktor
 */
public class UserAdminPanel extends javax.swing.JPanel {

    /**
     * Creates new form UserPanel
     */
    private MainFrame mainFrame;
    UserDto user;
    AdminUsersPanel adminUsersPanel;
    
     /**
     * Constructs a new UserAdminPanel to display information about a specific user.
     * 
     * @param user the user whose information will be displayed in the panel
     * @param mainFrame the main frame containing the application
     * @param adminUsersPanel the panel containing a list of all users in the system
     */
    public UserAdminPanel(UserDto user,MainFrame mainFrame, AdminUsersPanel adminUsersPanel ) {
        initComponents();
        this.mainFrame = mainFrame;
        this.user = user;
        NameLabel.setText(user.name);
        EmailLabel.setText(user.email);
        RoleLabel.setText(user.role.toString());
        this.adminUsersPanel = adminUsersPanel;
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
        NameLabel = new javax.swing.JLabel();
        EmailPanel = new javax.swing.JPanel();
        EmailLabel = new javax.swing.JLabel();
        RolePanel = new javax.swing.JPanel();
        RoleLabel = new javax.swing.JLabel();
        BtnPanel = new javax.swing.JPanel();
        EditBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), javax.swing.BorderFactory.createTitledBorder("")));
        setMaximumSize(new java.awt.Dimension(250, 420));
        setMinimumSize(new java.awt.Dimension(250, 420));
        setPreferredSize(new java.awt.Dimension(250, 420));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        UserInfoPanel.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), javax.swing.BorderFactory.createTitledBorder("")));
        UserInfoPanel.setPreferredSize(new java.awt.Dimension(218, 120));
        UserInfoPanel.setLayout(new javax.swing.BoxLayout(UserInfoPanel, javax.swing.BoxLayout.Y_AXIS));

        NamePanel.setPreferredSize(new java.awt.Dimension(225, 30));
        NamePanel.setLayout(new java.awt.BorderLayout());

        NameLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        NameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NameLabel.setText("Name");
        NameLabel.setToolTipText("");
        NameLabel.setPreferredSize(new java.awt.Dimension(38, 20));
        NamePanel.add(NameLabel, java.awt.BorderLayout.CENTER);

        UserInfoPanel.add(NamePanel);

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

     /**
     * Handles the event when the "Edit" button is clicked. This action opens a form to
     * edit the user details. The form allows modifying the user's name, email, password,
     * and role.
     * 
     * The user details are validated before sending a request to update the user on the server.
     * 
     * @param evt the action event triggered by the "Edit" button click
     */
    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        UserFormPanel userFormPanel = new UserFormPanel(mainFrame,user);
        mainFrame.mainPanel.add(userFormPanel,"userEditForm");
        mainFrame.showPanel("userEditForm");
        userFormPanel.getAddButton().setText("Edit");
        userFormPanel.getTitleLabel().setText("Edit User");
        MouseListener[] listeners = userFormPanel.getAddButton().getMouseListeners();
        for (MouseListener listener : listeners) {
            userFormPanel.getAddButton().removeMouseListener(listener);
        }
        userFormPanel.getAddButton().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
        String name = userFormPanel.getNameTextField().getText();
        String lastName = userFormPanel.getLastNameTextField().getText();
        String fullName = name + " " + lastName;
        String email = userFormPanel.getEmailTextField().getText();
        String password = new String(userFormPanel.getPasswordField().getPassword());
        String role = userFormPanel.getRoleComboBox().getSelectedItem().toString();

                if (!name.isEmpty() && !lastName.isEmpty() && !email.isEmpty() && !password.isEmpty() && !role.isEmpty()) {
                    UserDto updatedUserDto = new UserDto(user.id,fullName, email, password,Role.fromString(role));
                    UpdateUserRequest updateUserRequest = new UpdateUserRequest(updatedUserDto);
                 

                    try {
                        Client client = BookShopManagementSystem.getClient();
                        if (client != null) {
                            System.out.println(updateUserRequest.create());
                            String response = client.sendMessage(updateUserRequest.create());
                            System.out.println("Server response: " + response);
                        } else {
                            System.out.println("Client is not connected.");
                        }
                    } catch (Exception e) {
                        System.out.println(e);
                    }

                    userFormPanel.getInfoLabel().setForeground(new java.awt.Color(40, 252, 3));
                    userFormPanel.getInfoLabel().setText("User edited!");
                } else {
                    userFormPanel.getInfoLabel().setForeground(new java.awt.Color(255, 51, 51));
                    userFormPanel.getInfoLabel().setText("Fill all field!");
                }
            }
        });
    }//GEN-LAST:event_EditBtnActionPerformed
    /**
     * Handles the event when the "Delete" button is clicked. This action sends a request
     * to delete the user from the system.
     * 
     * @param evt the action event triggered by the "Delete" button click
     */
    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        DeleteUserRequest deleteUserRequest = new DeleteUserRequest(user.id);
        try {
            Client client = BookShopManagementSystem.getClient();
            if (client != null) {
                String response = client.sendMessage(deleteUserRequest.create());
                System.out.println("Server response: " + response);
                adminUsersPanel.refreshUsersBoxPanel();
            }   else {
                System.out.println("Client is not connected.");
            }
        }catch(Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_DeleteBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BtnPanel;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JPanel EmailPanel;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JPanel NamePanel;
    private javax.swing.JLabel RoleLabel;
    private javax.swing.JPanel RolePanel;
    private javax.swing.JPanel UserInfoPanel;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bookshopmanagementsystem;

/**
 *
 * @author Wiktor
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        PasswordPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        RememeberForgotPanel = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        LoginBtnPanel = new javax.swing.JPanel();
        LoginButton = new javax.swing.JButton();
        SignUpPanel = new javax.swing.JPanel();
        SignUpLabel = new javax.swing.JLabel();
        SidePanel = new javax.swing.JPanel();
        IconLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(910, 500));
        setPreferredSize(new java.awt.Dimension(910, 500));

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

        jLabel2.setText("Email Address");
        EmailPanel.add(jLabel2, java.awt.BorderLayout.PAGE_START);

        jTextField1.setPreferredSize(new java.awt.Dimension(64, 25));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        EmailPanel.add(jTextField1, java.awt.BorderLayout.CENTER);

        LoginFormPanel.add(EmailPanel);

        PasswordPanel.setPreferredSize(new java.awt.Dimension(280, 50));
        PasswordPanel.setLayout(new java.awt.BorderLayout(4, 4));

        jLabel4.setText("Password");
        PasswordPanel.add(jLabel4, java.awt.BorderLayout.PAGE_START);

        jPasswordField1.setPreferredSize(new java.awt.Dimension(64, 25));
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        PasswordPanel.add(jPasswordField1, java.awt.BorderLayout.CENTER);

        LoginFormPanel.add(PasswordPanel);

        RememeberForgotPanel.setPreferredSize(new java.awt.Dimension(250, 25));
        RememeberForgotPanel.setLayout(new java.awt.BorderLayout());

        jCheckBox1.setText("Remember me");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        RememeberForgotPanel.add(jCheckBox1, java.awt.BorderLayout.WEST);

        jLabel3.setForeground(new java.awt.Color(255, 153, 153));
        jLabel3.setText("Forgot your password?");
        RememeberForgotPanel.add(jLabel3, java.awt.BorderLayout.EAST);

        LoginFormPanel.add(RememeberForgotPanel);

        LoginPanel.add(LoginFormPanel);

        LoginBtnPanel.setPreferredSize(new java.awt.Dimension(400, 50));

        LoginButton.setText("Login");
        LoginButton.setPreferredSize(new java.awt.Dimension(250, 30));
        LoginBtnPanel.add(LoginButton);

        LoginPanel.add(LoginBtnPanel);

        SignUpPanel.setPreferredSize(new java.awt.Dimension(400, 50));

        SignUpLabel.setText("Don't have an account? Sign up. ");
        SignUpLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignUpLabelMouseClicked(evt);
            }
        });
        SignUpPanel.add(SignUpLabel);

        LoginPanel.add(SignUpPanel);

        getContentPane().add(LoginPanel, java.awt.BorderLayout.WEST);

        SidePanel.setBackground(new java.awt.Color(255, 255, 255));
        SidePanel.setPreferredSize(new java.awt.Dimension(400, 430));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 100);
        flowLayout1.setAlignOnBaseline(true);
        SidePanel.setLayout(flowLayout1);

        IconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/LoginIcon.png"))); // NOI18N
        SidePanel.add(IconLabel);

        getContentPane().add(SidePanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void SignUpLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpLabelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_SignUpLabelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel EmailPanel;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JLabel IconLabel;
    private javax.swing.JLabel LogInLabel;
    private javax.swing.JPanel LoginBtnPanel;
    private javax.swing.JButton LoginButton;
    private javax.swing.JPanel LoginFormPanel;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JPanel PasswordPanel;
    private javax.swing.JPanel RememeberForgotPanel;
    private javax.swing.JPanel SidePanel;
    private javax.swing.JLabel SignUpLabel;
    private javax.swing.JPanel SignUpPanel;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

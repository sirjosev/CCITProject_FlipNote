/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlipList;

import java.sql.*;

/**
 *
 * @author USER
 */
public class WelcomeForm extends javax.swing.JFrame {

    /**
     * Creates new form WelcomeForm
     */
    public WelcomeForm() {
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

        jPanel1 = new javax.swing.JPanel();
        newAccountButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        account_fullname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        account_password = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        account_username = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        account_email = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        login_password = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        login_username = new javax.swing.JTextField();
        login_btn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        login_error = new javax.swing.JLabel();
        newAccountStatus = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome to FlipList");
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        jPanel1.setLayout(null);

        newAccountButton.setText("Sign Up");
        newAccountButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newAccountButtonMouseClicked(evt);
            }
        });
        newAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newAccountButtonActionPerformed(evt);
            }
        });
        jPanel1.add(newAccountButton);
        newAccountButton.setBounds(430, 500, 190, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Create New Account");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(320, 330, 240, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 153));
        jLabel5.setText("or");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(270, 440, 30, 30);

        account_fullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                account_fullnameActionPerformed(evt);
            }
        });
        jPanel1.add(account_fullname);
        account_fullname.setBounds(320, 400, 190, 30);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Full Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(320, 380, 70, 14);
        jPanel1.add(account_password);
        account_password.setBounds(320, 460, 190, 30);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(60, 440, 80, 14);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Username");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(540, 380, 70, 14);

        account_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                account_usernameActionPerformed(evt);
            }
        });
        jPanel1.add(account_username);
        account_username.setBounds(540, 400, 190, 30);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Password");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(320, 440, 70, 14);

        account_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                account_emailActionPerformed(evt);
            }
        });
        jPanel1.add(account_email);
        account_email.setBounds(540, 460, 190, 30);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Email Address");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(540, 440, 110, 14);
        jPanel1.add(login_password);
        login_password.setBounds(60, 460, 190, 30);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Username");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(60, 380, 70, 14);

        login_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_usernameActionPerformed(evt);
            }
        });
        jPanel1.add(login_username);
        login_username.setBounds(60, 400, 190, 30);

        login_btn.setText("Log In");
        login_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login_btnMouseClicked(evt);
            }
        });
        login_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_btnActionPerformed(evt);
            }
        });
        jPanel1.add(login_btn);
        login_btn.setBounds(110, 500, 90, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 0));
        jLabel10.setText("Login");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(60, 330, 90, 30);

        login_error.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        login_error.setForeground(new java.awt.Color(102, 255, 255));
        jPanel1.add(login_error);
        login_error.setBounds(60, 360, 240, 20);

        newAccountStatus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        newAccountStatus.setForeground(new java.awt.Color(255, 255, 51));
        jPanel1.add(newAccountStatus);
        newAccountStatus.setBounds(320, 360, 410, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FlipList/background.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void account_fullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_account_fullnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_account_fullnameActionPerformed

    private void account_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_account_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_account_usernameActionPerformed

    private void account_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_account_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_account_emailActionPerformed

    private void login_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_login_usernameActionPerformed

    private void login_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_btnMouseClicked
        // get user submitted data
        String username = login_username.getText();
        String password = login_password.getText();

        // fetch data from database.
        Connection c;
        Statement st;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:fliplist.db");
            c.setAutoCommit(false);
            st = c.createStatement();
            ResultSet rs = st.executeQuery("select * from user where `username` = '" + username + "' and `password` = '" + password + "' limit 1");
            while (rs.next()) {
                String user = rs.getString("username");
                String pass = rs.getString("password");
                String fullname = rs.getString("fullname");
                if (!user.isEmpty() && !pass.isEmpty() && username.equals(user) && password.equals(pass)) {
                    // create new instance of page.
                    Page mainPage = new Page();
                    mainPage.setVisible(true);
                    mainPage.jLabel3.setText("Welcome " + fullname);
                    // hide the welcome page.
                    this.setVisible(false);
                } else {
                    this.login_error.setText("Password or Username Incorrect");
                }
            }
            rs.close();
            st.close();
            c.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }

//        if (username.equals(u) && password.equals(p)) {
//            // create new instance of page.
//            Page mainPage = new Page();
//            mainPage.setVisible(true);
//            mainPage.jLabel3.setText("Welcome " + username);
//            // hide the welcome page.
//            this.setVisible(false);
//        } else {
//            this.login_error.setText("Password or Username Incorrect");
//        }
    }//GEN-LAST:event_login_btnMouseClicked

    private void login_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_login_btnActionPerformed

    private void newAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newAccountButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newAccountButtonActionPerformed

    private void newAccountButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newAccountButtonMouseClicked
//        String username = login_username.getText();
        String fullname = account_fullname.getText();
        String username = account_username.getText();
        String password = account_password.getText();
        String email = account_email.getText();
        Database db = new Database();
        String res = db.insert("INSERT INTO user (fullname, username, password, email) VALUES ('" + fullname + "', '" + username + "','" + password + "','" + email + "')");
//        if(res)
        if (res.equals("true")) {
            this.newAccountStatus.setText("Your accout has created, please login.");
        } else {
            this.newAccountStatus.setText("Account Creation Failed: " + res);
        }
    }//GEN-LAST:event_newAccountButtonMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField account_email;
    private javax.swing.JTextField account_fullname;
    private javax.swing.JPasswordField account_password;
    private javax.swing.JTextField account_username;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login_btn;
    private javax.swing.JLabel login_error;
    private javax.swing.JPasswordField login_password;
    private javax.swing.JTextField login_username;
    private javax.swing.JButton newAccountButton;
    private javax.swing.JLabel newAccountStatus;
    // End of variables declaration//GEN-END:variables
}
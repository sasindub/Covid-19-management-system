/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package covid19databank;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import conn.connection;
import javax.swing.JOptionPane;
import java.sql.*;
import java.sql.Connection;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import conn.getid;
import java.net.URL;
import javax.swing.ImageIcon;


/**
 *
 * @author sasin
 */
public class Login extends javax.swing.JFrame implements Runnable {

    @Override
    public void run() {
        int i = 1;
        while (i == 1) {
            SimpleDateFormat obj = new SimpleDateFormat("HH:mm:ss");
            Date d = new Date();

            lblDate.setText(obj.format(d));

            SimpleDateFormat obj2 = new SimpleDateFormat("aa");
            SimpleDateFormat obj3 = new SimpleDateFormat("hh");

            int time = Integer.parseInt(obj3.format(d));

            if (time < 6 && "PM".equals(obj2.format(d))) {
                lblGreeting.setText("Good Afternoon!");
            } else {
                lblGreeting.setText("Good Evening!");

            }

            if ("AM".equals(obj2.format(d))) {
                lblGreeting.setText("Good Morning!");
            }

        }

    }
    /**
     * Creates new form Login
     */

    private Statement st;
    private Connection con;
    public String UID;

    public Login() {
        this.setUndecorated(true);
        //this.setOpacity(0.9f);
        initComponents();

        con = connection.connect();

        //invisible vcard login
        pnlVcard.setVisible(false);

        //invisible label hide
        lblInvisiblePsd.setVisible(false);
        //visible text of password
        txtPassword.setEchoChar((char) 0);

        Thread t1 = new Thread(this);
        t1.start();
        
        //set an icon
         URL image = getClass().getResource("/source/microbe_48px.png");
        ImageIcon img = new ImageIcon(image);
   
        this.setIconImage(img.getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBack = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblDate = new javax.swing.JLabel();
        lblGreeting = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pnlVcard = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        btnLogInVaccineCard = new javax.swing.JButton();
        lblClose1 = new javax.swing.JLabel();
        txtNIC = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnLogIn = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        lblSignIn = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        lblForgotPswd = new javax.swing.JLabel();
        lblInvisiblePsd = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblClose = new javax.swing.JLabel();
        lblVisiblePswd1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblerror = new javax.swing.JLabel();
        lblSignIn2 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(4, 170, 109));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDate.setBackground(new java.awt.Color(255, 255, 255));
        lblDate.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDate.setForeground(new java.awt.Color(255, 255, 255));
        lblDate.setText("Date");
        jPanel1.add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 404, 371, -1));

        lblGreeting.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblGreeting.setForeground(new java.awt.Color(150, 226, 169));
        lblGreeting.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblGreeting, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 240, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/thiaaa.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 300, 250));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(4, 170, 109));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlVcard.setBackground(new java.awt.Color(255, 255, 255));
        pnlVcard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/user_30px.png"))); // NOI18N
        pnlVcard.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 30, 30));

        btnLogInVaccineCard.setBackground(new java.awt.Color(4, 170, 104));
        btnLogInVaccineCard.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnLogInVaccineCard.setForeground(new java.awt.Color(255, 255, 255));
        btnLogInVaccineCard.setText("Vaccine Card");
        btnLogInVaccineCard.setBorder(null);
        btnLogInVaccineCard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogInVaccineCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogInVaccineCardActionPerformed(evt);
            }
        });
        pnlVcard.add(btnLogInVaccineCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 290, 30));

        lblClose1.setBackground(new java.awt.Color(255, 255, 255));
        lblClose1.setForeground(new java.awt.Color(255, 0, 0));
        lblClose1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClose1.setText("X");
        lblClose1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblClose1.setOpaque(true);
        lblClose1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblClose1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblClose1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblClose1MousePressed(evt);
            }
        });
        pnlVcard.add(lblClose1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 30, 30));

        txtNIC.setBackground(new java.awt.Color(244, 244, 244));
        txtNIC.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNIC.setForeground(new java.awt.Color(204, 204, 204));
        txtNIC.setText("Enter NIC number");
        txtNIC.setBorder(null);
        txtNIC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNICMouseClicked(evt);
            }
        });
        pnlVcard.add(txtNIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 246, 30));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 204, 102))); // NOI18N
        pnlVcard.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 360, 300));

        jPanel2.add(pnlVcard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 400, 340));

        txtUser.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtUser.setForeground(new java.awt.Color(204, 204, 204));
        txtUser.setText("User");
        txtUser.setBorder(null);
        txtUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUserMouseClicked(evt);
            }
        });
        jPanel2.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 246, 30));

        jSeparator1.setForeground(new java.awt.Color(4, 170, 109));
        jSeparator1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 250, 10));

        jSeparator2.setForeground(new java.awt.Color(4, 170, 109));
        jSeparator2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 250, 10));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/password_26px.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 30, 30));

        txtPassword.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(204, 204, 204));
        txtPassword.setText("Password");
        txtPassword.setBorder(null);
        txtPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPasswordMouseClicked(evt);
            }
        });
        jPanel2.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 220, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/login_24px_1.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 30, 30));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(4, 170, 104));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("LOG IN");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 400, 50));

        btnLogIn.setBackground(new java.awt.Color(4, 170, 104));
        btnLogIn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnLogIn.setForeground(new java.awt.Color(255, 255, 255));
        btnLogIn.setText("Log In");
        btnLogIn.setBorder(null);
        btnLogIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogInActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 290, 30));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 360, 20));

        lblSignIn.setBackground(new java.awt.Color(153, 255, 153));
        lblSignIn.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lblSignIn.setForeground(new java.awt.Color(4, 170, 109));
        lblSignIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSignIn.setText("VACCINE CARD");
        lblSignIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSignIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSignInMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSignInMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSignInMouseExited(evt);
            }
        });
        jPanel2.add(lblSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 30));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, -1, 30));

        lblForgotPswd.setForeground(new java.awt.Color(0, 0, 255));
        lblForgotPswd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblForgotPswd.setText("Forgotten Password?");
        lblForgotPswd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblForgotPswd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblForgotPswdMouseClicked(evt);
            }
        });
        jPanel2.add(lblForgotPswd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 400, -1));

        lblInvisiblePsd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInvisiblePsd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/invisible_24px.png"))); // NOI18N
        lblInvisiblePsd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblInvisiblePsd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInvisiblePsdMouseClicked(evt);
            }
        });
        jPanel2.add(lblInvisiblePsd, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 30, 30));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/thiaaa.png"))); // NOI18N
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 180, 150));

        lblClose.setBackground(new java.awt.Color(104, 170, 109));
        lblClose.setForeground(new java.awt.Color(255, 255, 255));
        lblClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClose.setText("X");
        lblClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblClose.setOpaque(true);
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCloseMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCloseMousePressed(evt);
            }
        });
        jPanel2.add(lblClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 30, 30));

        lblVisiblePswd1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVisiblePswd1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/eye_24px_1.png"))); // NOI18N
        lblVisiblePswd1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblVisiblePswd1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVisiblePswd1MouseClicked(evt);
            }
        });
        jPanel2.add(lblVisiblePswd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 30, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/user_30px.png"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 30, 30));

        lblerror.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(lblerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        lblSignIn2.setBackground(new java.awt.Color(153, 255, 153));
        lblSignIn2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblSignIn2.setForeground(new java.awt.Color(153, 255, 153));
        lblSignIn2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSignIn2.setText("I am new staff member");
        lblSignIn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSignIn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSignIn2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSignIn2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSignIn2MouseExited(evt);
            }
        });
        jPanel2.add(lblSignIn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 400, 30));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        javax.swing.GroupLayout pnlBackLayout = new javax.swing.GroupLayout(pnlBack);
        pnlBack.setLayout(pnlBackLayout);
        pnlBackLayout.setHorizontalGroup(
            pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlBackLayout.setVerticalGroup(
            pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblSignInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSignInMouseEntered
        // TODO add your handling code here:

        //mouse hover sign in label
        lblSignIn.setForeground(Color.RED);
    }//GEN-LAST:event_lblSignInMouseEntered

    private void lblSignInMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSignInMouseExited
        // TODO add your handling code here:

        //mouse exit sign in label
        lblSignIn.setForeground(Color.getColor("#3aa96c"));
    }//GEN-LAST:event_lblSignInMouseExited

    private void txtUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserMouseClicked
        // TODO add your handling code here:
        txtUser.setForeground(Color.BLACK);
        txtUser.setText(null);

    }//GEN-LAST:event_txtUserMouseClicked

    private void lblInvisiblePsdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInvisiblePsdMouseClicked
        // TODO add your handling code here:
        lblInvisiblePsd.setVisible(false);
        lblVisiblePswd1.setVisible(true);
        txtPassword.setEchoChar('\u25cf');
    }//GEN-LAST:event_lblInvisiblePsdMouseClicked

    private void lblVisiblePswd1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVisiblePswd1MouseClicked
        // TODO add your handling code here:

        lblVisiblePswd1.setVisible(false);
        lblInvisiblePsd.setVisible(true);
        //visible the pswd
        txtPassword.setEchoChar((char) 0);
    }//GEN-LAST:event_lblVisiblePswd1MouseClicked

    private void txtPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPasswordMouseClicked
        // TODO add your handling code here:

        txtPassword.setText(null);
        txtPassword.setEchoChar('\u25cf');
        txtPassword.setForeground(Color.BLACK);

    }//GEN-LAST:event_txtPasswordMouseClicked

    private void lblCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseExited
        // TODO add your handling code here:

        // lblClose.setBackground(Color.getColor("#04aa6d"));

    }//GEN-LAST:event_lblCloseMouseExited

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        // TODO add your handling code here:

        this.dispose();
    }//GEN-LAST:event_lblCloseMouseClicked

    private void lblCloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMousePressed
        // TODO add your handling code here:
        lblClose.setBackground(Color.RED);
    }//GEN-LAST:event_lblCloseMousePressed

    private void lblSignInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSignInMouseClicked
        // TODO add your handling code here:
        pnlVcard.setVisible(true);
        lblSignIn2.setVisible(false);
        txtPassword.setVisible(false);
        txtUser.setVisible(false);

    }//GEN-LAST:event_lblSignInMouseClicked

    private void btnLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogInActionPerformed
        // TODO add your handling code here:

        if ((txtUser.getText().isEmpty()) == false && (txtPassword.getText().isEmpty()) == false) {

            try {
                String uid = txtUser.getText();
                String pass = txtPassword.getText();
                String query = "select pass from userdetails where id = '" + uid + "';";

                st = con.createStatement();

                ResultSet rs = st.executeQuery(query);

                if (rs.next()) {
                    if (rs.getString("pass").equals(pass)) {
                        UID = uid;
                        getid.id(UID);

                        home obj = new home();
                        obj.show();
                        this.dispose();
                    } else {
                        lblerror.setText("Invalid password or user id!");
                    }
                } else {
                    lblerror.setText("Please sign in first!");
                }

            } catch (Exception e) {
                System.out.println(e.toString());
            }

        } else {
            lblerror.setText("Please enter your user id and password!");
        }


    }//GEN-LAST:event_btnLogInActionPerformed

    private void lblForgotPswdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblForgotPswdMouseClicked
        // TODO add your handling code here:
        resetPass obj = new resetPass();
        obj.show();
        this.dispose();
    }//GEN-LAST:event_lblForgotPswdMouseClicked

    private void lblSignIn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSignIn2MouseClicked
        // TODO add your handling code here:
        this.hide();
        signIn obj = new signIn();
        obj.show();
    }//GEN-LAST:event_lblSignIn2MouseClicked

    private void lblSignIn2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSignIn2MouseEntered
        // TODO add your handling code here:
        //mouse hover sign in label

        lblSignIn2.setForeground(Color.getColor("#3aa96c"));
    }//GEN-LAST:event_lblSignIn2MouseEntered

    private void lblSignIn2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSignIn2MouseExited
        // TODO add your handling code here:
        lblSignIn2.setForeground(Color.getHSBColor(153, 255, 153));
    }//GEN-LAST:event_lblSignIn2MouseExited

    private void btnLogInVaccineCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogInVaccineCardActionPerformed
        // TODO add your handling code here:
        
        String nic = txtNIC.getText();
        try{
            st = con.createStatement();
            
            String query = "select nic from addvacc where nic = '" + nic + "';";
            ResultSet rs = st.executeQuery(query);
            
            if(rs.next())
            {
                 getid.nic(nic);
                personDetails obj = new personDetails();
                obj.show();
                this.dispose();
                             
            }
            
            else
            {
                JOptionPane.showMessageDialog(this,"Invalid NIC!!","Invalid",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception e)
        {
            System.out.println(e.toString());      
                        
        }
        
      
    }//GEN-LAST:event_btnLogInVaccineCardActionPerformed

    private void lblClose1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClose1MouseClicked
        // TODO add your handling code here:
        pnlVcard.setVisible(false);
        lblSignIn2.setVisible(true);

        txtPassword.setVisible(true);
        txtUser.setVisible(true);
    }//GEN-LAST:event_lblClose1MouseClicked

    private void lblClose1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClose1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblClose1MouseExited

    private void lblClose1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClose1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblClose1MousePressed

    private void txtNICMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNICMouseClicked
        // TODO add your handling code here:
        
        txtNIC.setText(null);
        txtNIC.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtNICMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogIn;
    private javax.swing.JButton btnLogInVaccineCard;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblClose1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblForgotPswd;
    private javax.swing.JLabel lblGreeting;
    private javax.swing.JLabel lblInvisiblePsd;
    private javax.swing.JLabel lblSignIn;
    private javax.swing.JLabel lblSignIn2;
    private javax.swing.JLabel lblVisiblePswd1;
    private javax.swing.JLabel lblerror;
    private javax.swing.JPanel pnlBack;
    private javax.swing.JPanel pnlVcard;
    private javax.swing.JTextField txtNIC;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
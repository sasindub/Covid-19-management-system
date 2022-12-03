/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package covid19databank;

import java.awt.Color;
import java.awt.Font;
import java.sql.*;
import java.sql.Connection;
import java.sql.Statement;
import conn.connection;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.io.Writer;
import java.io.*;
import javax.swing.table.DefaultTableModel;
import conn.vaccinedPData;
import conn.*;
import java.net.URL;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;


/**
 *
 * @author sasin
 */
public class affectedPersons extends javax.swing.JFrame {

    /**
     * Creates new form affectedPersons
     */
    Connection con;
    Statement st;
    
    String name1;
    String nic1;
  

    public affectedPersons() {
        this.setUndecorated(true);
        setResizable(false);
        initComponents();

         //set an icon
         URL image = getClass().getResource("/source/microbe_48px.png");
        ImageIcon img = new ImageIcon(image);
   
        this.setIconImage(img.getImage());
        
        //get connection
        con = connection.connect();
        st = null;

        //table details
        tableDetail();

        //get table data
        getData();
        
        
         pnlDeadPersons.setVisible(false);
      

    }

    public void tableDetail() {
        tblVaccinedPerson.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
        tblVaccinedPerson.getTableHeader().setOpaque(false);
        tblVaccinedPerson.getTableHeader().setBackground(new Color(4, 170, 109));
        tblVaccinedPerson.getTableHeader().setForeground(new Color(255, 255, 255));
        tblVaccinedPerson.setRowHeight(25);

    }

    public void getData() {

        try {

            //create statement
            st = con.createStatement();

            //count affected perosons
            String query1 = "select count(id) from affected;";

            ResultSet rs1 = st.executeQuery(query1);

            if (rs1.next()) {
                //call vaccine data method 
                vaccinedPData.count();
                double avg = (rs1.getInt("count(id)") / (vaccinedPData.COUNT * 1.0)) * 100.0;
                 DecimalFormat df = new DecimalFormat("####0.00");
                lbltotalAffected.setText(Integer.toString(rs1.getInt("count(id)")));
                lblAVGAffected.setText(df.format(avg) + "%");

            }

      
            //get all affected persons details
            String query = "select * from affected;";

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
 
                String nic = rs.getString("nic");
                String rno = rs.getString("reportNo");
                String day = rs.getString("day");
                
                String tbData[] = {nic,rno,day};
                
                DefaultTableModel tblModel = (DefaultTableModel)tblVaccinedPerson.getModel();
                
                tblModel.addRow(tbData);

            }

        } catch (Exception e) {
            System.out.println(e.toString());
        }
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
        pnlDeadPersons = new javax.swing.JPanel();
        txtReportIssuedDate = new javax.swing.JTextField();
        txtDeathReportNo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnAffected = new javax.swing.JButton();
        lblDeadPersonName = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVaccinedPerson = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnEndQu = new javax.swing.JButton();
        btnMoreDetails = new javax.swing.JButton();
        btnReport = new javax.swing.JButton();
        lblAVGAffected = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lbltotalAffected = new javax.swing.JLabel();
        lblMinimize = new javax.swing.JLabel();
        lblClose = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbltotalAffected1 = new javax.swing.JLabel();
        lblAVGAffected1 = new javax.swing.JLabel();
        btnDie1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlDeadPersons.setBackground(new java.awt.Color(255, 255, 255));
        pnlDeadPersons.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtReportIssuedDate.setBackground(new java.awt.Color(244, 244, 244));
        txtReportIssuedDate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtReportIssuedDate.setForeground(new java.awt.Color(204, 204, 204));
        txtReportIssuedDate.setText("Enter Death Report Issued Date");
        txtReportIssuedDate.setBorder(null);
        txtReportIssuedDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtReportIssuedDateMouseClicked(evt);
            }
        });
        pnlDeadPersons.add(txtReportIssuedDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 246, 30));

        txtDeathReportNo.setBackground(new java.awt.Color(244, 244, 244));
        txtDeathReportNo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtDeathReportNo.setForeground(new java.awt.Color(204, 204, 204));
        txtDeathReportNo.setText("Enter Death Report No.");
        txtDeathReportNo.setBorder(null);
        txtDeathReportNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDeathReportNoMouseClicked(evt);
            }
        });
        pnlDeadPersons.add(txtDeathReportNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 246, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(4, 170, 109));
        jLabel3.setText("Date :");
        pnlDeadPersons.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, -1, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(4, 170, 109));
        jLabel4.setText("Death Report No :");
        pnlDeadPersons.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, -1, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("X");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        pnlDeadPersons.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, -1, -1));

        btnAffected.setBackground(new java.awt.Color(255, 102, 102));
        btnAffected.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAffected.setForeground(new java.awt.Color(255, 255, 255));
        btnAffected.setText("CONFIRM");
        btnAffected.setBorder(null);
        btnAffected.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAffected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAffectedActionPerformed(evt);
            }
        });
        pnlDeadPersons.add(btnAffected, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 80, 30));

        lblDeadPersonName.setBackground(new java.awt.Color(255, 255, 255));
        lblDeadPersonName.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblDeadPersonName.setForeground(new java.awt.Color(255, 102, 102));
        lblDeadPersonName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDeadPersonName.setText("DEAD PERSON");
        pnlDeadPersons.add(lblDeadPersonName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 510, 40));

        jLabel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 255, 153))); // NOI18N
        pnlDeadPersons.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 510, 270));

        jPanel1.add(pnlDeadPersons, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 760, 410));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(4, 170, 104));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("CURRENT AFFECTED PATIENT");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 420, 60));

        jLabel2.setBackground(new java.awt.Color(4, 170, 109));
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 29, 410, 23));

        jScrollPane1.setBackground(new java.awt.Color(4, 170, 109));
        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        tblVaccinedPerson.setAutoCreateRowSorter(true);
        tblVaccinedPerson.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tblVaccinedPerson.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIC", "Report Code", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblVaccinedPerson.setFocusable(false);
        tblVaccinedPerson.setGridColor(new java.awt.Color(255, 255, 255));
        tblVaccinedPerson.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tblVaccinedPerson.setRowHeight(25);
        tblVaccinedPerson.setSelectionBackground(new java.awt.Color(204, 255, 204));
        tblVaccinedPerson.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tblVaccinedPerson.setShowVerticalLines(false);
        tblVaccinedPerson.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblVaccinedPerson);
        if (tblVaccinedPerson.getColumnModel().getColumnCount() > 0) {
            tblVaccinedPerson.getColumnModel().getColumn(0).setResizable(false);
            tblVaccinedPerson.getColumnModel().getColumn(1).setResizable(false);
            tblVaccinedPerson.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 760, 280));

        btnBack.setBackground(new java.awt.Color(4, 170, 109));
        btnBack.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.setBorder(null);
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 440, 100, 30));

        btnEndQu.setBackground(new java.awt.Color(4, 170, 109));
        btnEndQu.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEndQu.setForeground(new java.awt.Color(255, 255, 255));
        btnEndQu.setText("End Quarantine");
        btnEndQu.setBorder(null);
        btnEndQu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEndQu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEndQuActionPerformed(evt);
            }
        });
        jPanel1.add(btnEndQu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 130, 30));

        btnMoreDetails.setBackground(new java.awt.Color(4, 170, 109));
        btnMoreDetails.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnMoreDetails.setForeground(new java.awt.Color(255, 255, 255));
        btnMoreDetails.setText("More Details");
        btnMoreDetails.setBorder(null);
        btnMoreDetails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMoreDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoreDetailsActionPerformed(evt);
            }
        });
        jPanel1.add(btnMoreDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 440, 100, 30));

        btnReport.setBackground(new java.awt.Color(255, 255, 255));
        btnReport.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnReport.setForeground(new java.awt.Color(255, 255, 255));
        btnReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/download_graph_report_32px.png"))); // NOI18N
        btnReport.setBorder(null);
        btnReport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });
        jPanel1.add(btnReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 440, 40, 30));

        lblAVGAffected.setBackground(new java.awt.Color(153, 153, 153));
        lblAVGAffected.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblAVGAffected.setForeground(new java.awt.Color(255, 28, 47));
        lblAVGAffected.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAVGAffected.setText("AVARAGE COVID AFFECTED PERSONS : ");
        jPanel1.add(lblAVGAffected, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 100, 50, -1));

        btnSearch.setBackground(new java.awt.Color(255, 255, 255));
        btnSearch.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/search_24px.png"))); // NOI18N
        btnSearch.setBorder(null);
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 30, 30));

        txtSearch.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtSearch.setForeground(new java.awt.Color(204, 204, 204));
        txtSearch.setText("Search by NIC");
        txtSearch.setBorder(null);
        txtSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSearchMouseClicked(evt);
            }
        });
        jPanel1.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 200, -1));

        jSeparator1.setForeground(new java.awt.Color(4, 170, 109));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 200, 20));

        lbltotalAffected.setBackground(new java.awt.Color(153, 153, 153));
        lbltotalAffected.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbltotalAffected.setForeground(new java.awt.Color(255, 28, 47));
        lbltotalAffected.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbltotalAffected.setText("TOTAL COVID AFFECTED PERSONS");
        jPanel1.add(lbltotalAffected, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 80, 50, -1));

        lblMinimize.setBackground(new java.awt.Color(255, 255, 255));
        lblMinimize.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblMinimize.setForeground(new java.awt.Color(4, 170, 109));
        lblMinimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMinimize.setText("-");
        lblMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMinimize.setOpaque(true);
        lblMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseClicked(evt);
            }
        });
        jPanel1.add(lblMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, 30, 20));

        lblClose.setBackground(new java.awt.Color(255, 255, 255));
        lblClose.setForeground(new java.awt.Color(255, 0, 0));
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
        jPanel1.add(lblClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 30, 20));

        jLabel1.setBackground(new java.awt.Color(4, 170, 109));
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 820, 10));

        lbltotalAffected1.setBackground(new java.awt.Color(153, 153, 153));
        lbltotalAffected1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbltotalAffected1.setForeground(new java.awt.Color(255, 102, 102));
        lbltotalAffected1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbltotalAffected1.setText("TOTAL CURRENT AFFECTED PATIENTS : ");
        jPanel1.add(lbltotalAffected1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 390, -1));

        lblAVGAffected1.setBackground(new java.awt.Color(153, 153, 153));
        lblAVGAffected1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblAVGAffected1.setForeground(new java.awt.Color(255, 102, 102));
        lblAVGAffected1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAVGAffected1.setText("AVARAGE CURRENT AFFECTED PATIENTS : ");
        jPanel1.add(lblAVGAffected1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 390, -1));

        btnDie1.setBackground(new java.awt.Color(4, 170, 109));
        btnDie1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnDie1.setForeground(new java.awt.Color(255, 255, 255));
        btnDie1.setText("Die");
        btnDie1.setBorder(null);
        btnDie1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDie1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDie1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDie1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 440, 100, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        
        home obj = new home();
        obj.show();
        this.dispose();

    }//GEN-LAST:event_btnBackActionPerformed

    private void btnEndQuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEndQuActionPerformed
        // TODO add your handling code here:

        try {

            int row = tblVaccinedPerson.getSelectedRow();
            String cell = tblVaccinedPerson.getModel().getValueAt(row, 0).toString();
            String query = "delete from affected where nic = '" + cell + "'";

            st = con.createStatement();

            int d = JOptionPane.showConfirmDialog(this,"Are you sure this person quarantine \n period has finished?","delete",  JOptionPane.WARNING_MESSAGE);

            if (d == 0) {
                st.executeUpdate(query);
                //clear table
                tblVaccinedPerson.setModel(new DefaultTableModel(null, new String[]{"NIC", "Report Code", "Day"}));
                getData();

            }
        }
            
             catch(ArrayIndexOutOfBoundsException ee)
             {
            JOptionPane.showMessageDialog(this,"Please Select A Patient!","empty",JOptionPane.ERROR_MESSAGE);
              }

         catch (Exception e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnEndQuActionPerformed

    private void btnMoreDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoreDetailsActionPerformed
        // TODO add your handling code here:
          try{  
         int row = tblVaccinedPerson.getSelectedRow();
         String cell = tblVaccinedPerson.getModel().getValueAt(row, 0).toString();
         
         getid.nic(cell);
         
         personDetails obj = new personDetails();
         obj.show();
          }
          catch(ArrayIndexOutOfBoundsException ee)
             {
            JOptionPane.showMessageDialog(this,"Please Select A Patient!","empty",JOptionPane.ERROR_MESSAGE);
              }
        

    }//GEN-LAST:event_btnMoreDetailsActionPerformed

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed
        // TODO add your handling code here:

        //file saving path
        File file = new File("CurrentCovidPatients.txt");

        try {
            //make a new file
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            fw.write("\t\t---Current Covid 19 Patient List----");
            fw.write("\n\n");

            fw.write("\t\tNIC   |   REPORT CODE  |  DATE \n");

            bw.newLine();
            bw.newLine();

            for (int i = 0; i < tblVaccinedPerson.getRowCount(); i++) {//rows

                for (int j = 0; j < tblVaccinedPerson.getColumnCount(); j++) {//columns

                    bw.write("\t| " + tblVaccinedPerson.getValueAt(i, j).toString() + "\t");

                }
                bw.newLine();
            }

            bw.close();
            fw.close();

            JOptionPane.showMessageDialog(this, "Report has been genareted!", "report", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            System.out.println(e.toString());
        } catch (Exception ee) {
            System.out.println(ee.toString());
        }

    }//GEN-LAST:event_btnReportActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:

        try {

            //create statement
            st = con.createStatement();

            String search = txtSearch.getText();

            //get all vaccined persons details
            String query = "select * from affected where nic like '" + search + "%';";

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                tblVaccinedPerson.setModel(new DefaultTableModel(null, new String[]{"NIC", "Report Code", "Day"}));
                
               

                 String nic = rs.getString("nic");
                String rno = rs.getString("reportNo");
                String day = rs.getString("day");
                
                String tbData[] = {nic,rno,day};
                
                DefaultTableModel tblModel = (DefaultTableModel)tblVaccinedPerson.getModel();
                
                tblModel.addRow(tbData);
            }

        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchMouseClicked
        // TODO add your handling code here:
        txtSearch.setText(null);
        txtSearch.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtSearchMouseClicked

    private void lblMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseClicked
        // TODO add your handling code here:
        this.setState(home.ICONIFIED);
    }//GEN-LAST:event_lblMinimizeMouseClicked

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        // TODO add your handling code here:

        this.dispose();
    }//GEN-LAST:event_lblCloseMouseClicked

    private void lblCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseExited
        // TODO add your handling code here:

        // lblClose.setBackground(Color.getColor("#04aa6d"));
    }//GEN-LAST:event_lblCloseMouseExited

    private void lblCloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMousePressed
        // TODO add your handling code here:
        lblClose.setBackground(Color.RED);
    }//GEN-LAST:event_lblCloseMousePressed

    private void btnDie1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDie1ActionPerformed
        // TODO add your handling code here:
       
        try{
         int row = tblVaccinedPerson.getSelectedRow();
        String cell = tblVaccinedPerson.getModel().getValueAt(row,0).toString();
      
                 st = con.createStatement();
                //check whether the person is dead or not
                String query2 = "select nic from deathpersons where nic = '" + cell + "'";
                
                ResultSet rs1 = st.executeQuery(query2);
                
                if(rs1.next())
                {
                    JOptionPane.showMessageDialog(this, "This person is already die! \naffected patient!","warning",JOptionPane.WARNING_MESSAGE);
                      
                }
                
                else
                {
        
                     
                     pnlDeadPersons.setVisible(true);
                     tblVaccinedPerson.setVisible(false);
                     jScrollPane1.setVisible(false);
                     btnBack.setVisible(false);
                    btnMoreDetails.setVisible(false);
                    btnDie1.setVisible(false);
                    
                    String query = "select * from addvacc where nic = '" + cell + "';";
        
                    ResultSet rs = st.executeQuery(query);
        
                    if(rs.next())
                    {
                       lblDeadPersonName.setText(rs.getString("name"));
            
                         //assign values to variables
                        name1 = rs.getString("name");
                         nic1 = rs.getString("nic");
             
                    }
                }
       
        }
        catch(ArrayIndexOutOfBoundsException ee)
        {
            JOptionPane.showMessageDialog(this,"Please Select A Patient!","empty",JOptionPane.ERROR_MESSAGE);
            
            pnlDeadPersons.setVisible(false);
        tblVaccinedPerson.setVisible(true);
        jScrollPane1.setVisible(true);
        btnDie1.setVisible(true);
        btnBack.setVisible(true);
        btnMoreDetails.setVisible(true);
         
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        
    }//GEN-LAST:event_btnDie1ActionPerformed

    private void txtReportIssuedDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtReportIssuedDateMouseClicked
        // TODO add your handling code here:

        txtReportIssuedDate.setText(null);
        txtReportIssuedDate.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtReportIssuedDateMouseClicked

    private void txtDeathReportNoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDeathReportNoMouseClicked
        // TODO add your handling code here:
        txtDeathReportNo.setText(null);
        txtDeathReportNo.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtDeathReportNoMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        pnlDeadPersons.setVisible(false);
        tblVaccinedPerson.setVisible(true);
        jScrollPane1.setVisible(true);
         btnBack.setVisible(true);
        btnMoreDetails.setVisible(true);  
          btnDie1.setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void btnAffectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAffectedActionPerformed
        // TODO add your handling code here:
        if(txtReportIssuedDate.getText().isEmpty() | txtDeathReportNo.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Please enter report no. and date!","empty",JOptionPane.ERROR_MESSAGE);
        }
        else{

            try{
                int row = tblVaccinedPerson.getSelectedRow();

                String report = txtDeathReportNo.getText();
                String day = txtReportIssuedDate.getText();
                String cell = tblVaccinedPerson.getModel().getValueAt(row,0).toString();
                st = con.createStatement();

                String query = "insert into deathPersons(name,nic,reportNo,day) values('" + name1 + "','" + cell + "','" + report + "','" + day +"');";
                st.executeUpdate(query);
                
                //delete the data from the table after dead
                 String query1 = "delete from affected where nic = '" + cell + "';"; 
                         
                 st.executeUpdate(query1);
                //get data to table
                getData();

                JOptionPane.showMessageDialog(this, "Covid 19 Death Added!","add",JOptionPane.INFORMATION_MESSAGE);

            }catch(Exception e)
            {
                System.out.println(e.toString());
            }

        }
    }//GEN-LAST:event_btnAffectedActionPerformed

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
            java.util.logging.Logger.getLogger(affectedPersons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(affectedPersons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(affectedPersons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(affectedPersons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new affectedPersons().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAffected;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDie1;
    private javax.swing.JButton btnEndQu;
    private javax.swing.JButton btnMoreDetails;
    private javax.swing.JButton btnReport;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAVGAffected;
    private javax.swing.JLabel lblAVGAffected1;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblDeadPersonName;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JLabel lbltotalAffected;
    private javax.swing.JLabel lbltotalAffected1;
    private javax.swing.JPanel pnlDeadPersons;
    private javax.swing.JTable tblVaccinedPerson;
    private javax.swing.JTextField txtDeathReportNo;
    private javax.swing.JTextField txtReportIssuedDate;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}

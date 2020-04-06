package com.banking.view;

import com.banking.daoImp.AccountImp;
import com.banking.pojo.Account;
import com.banking.pojo.Summary;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Md Yasin Arif
 */
public class CoustomerListView extends javax.swing.JFrame {

    /**
     * Creates new form Coustomer_List
     */
    public CoustomerListView() {
        initComponents();
         setLocationRelativeTo(null);
        displaySummary();
        day() ;
        showTime();
    }
    
    
    
    
    public void day() {
        Calendar cal = new GregorianCalendar();
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);

        date.setText("Date :" + day + ":" + (month + 1) + ":" + year);

    }
      void showTime() {

        new Timer(0, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
                lblTime.setText(sdf.format(d));
            }
        }).start();

    }
    public void clearSummaryTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
    }
public void displaySummary() {
        clearSummaryTable();
        AccountImp accImp = new AccountImp();
        List<Account> list = accImp.getAccounts();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object col[] = new Object[6];
        for (int i = 0; i < list.size(); i++) {
            col[0] = list.get(i).getAccout_no();
            col[1] = list.get(i).getName();
            col[2] = list.get(i).getDate_of_birth();
            col[3] = list.get(i).getAccount_type();
            col[4] = list.get(i).getGender();
            col[5] = list.get(i).getMobile();
           
            model.addRow(col);

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

        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        pft = new javax.swing.JButton();
        depst = new javax.swing.JButton();
        trnfr = new javax.swing.JButton();
        withdrw = new javax.swing.JButton();
        cus_list = new javax.swing.JButton();
        trnsctn = new javax.swing.JButton();
        view_blnce = new javax.swing.JButton();
        stmnt = new javax.swing.JButton();
        chng_pin = new javax.swing.JButton();
        about = new javax.swing.JButton();
        date = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        delete = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Profit");

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("Deposite");

        jButton3.setBackground(new java.awt.Color(204, 204, 255));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setText("Transfer");

        jButton4.setBackground(new java.awt.Color(204, 204, 255));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setText("Withdraw");

        jButton5.setBackground(new java.awt.Color(204, 204, 255));
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton5.setText("Customer List");

        jButton6.setBackground(new java.awt.Color(204, 204, 255));
        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton6.setText("Transaction");

        jButton7.setBackground(new java.awt.Color(204, 204, 255));
        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton7.setText("View Balamce");

        jButton10.setBackground(new java.awt.Color(204, 204, 255));
        jButton10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton10.setText("Statement");

        jButton8.setBackground(new java.awt.Color(204, 204, 255));
        jButton8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton8.setText("Change Pin");

        jButton9.setBackground(new java.awt.Color(204, 204, 255));
        jButton9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton9.setText("About");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton10)
                .addGap(18, 18, 18)
                .addComponent(jButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton9)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Islami Bank Banglades Ltd.");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("User");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Compass_Eye_16px.png"))); // NOI18N

        lblTime.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblTime.setForeground(new java.awt.Color(255, 255, 255));
        lblTime.setText("Time");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/images1.png"))); // NOI18N
        jLabel3.setText("jLabel3");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Acc", "Name", "DOB", "Acc_Type", "Gender", "Mob"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        pft.setBackground(new java.awt.Color(204, 204, 255));
        pft.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        pft.setText("Profile");
        pft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pftActionPerformed(evt);
            }
        });

        depst.setBackground(new java.awt.Color(204, 204, 255));
        depst.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        depst.setText("Deposite");
        depst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depstActionPerformed(evt);
            }
        });

        trnfr.setBackground(new java.awt.Color(204, 204, 255));
        trnfr.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        trnfr.setText("Transfer");
        trnfr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trnfrActionPerformed(evt);
            }
        });

        withdrw.setBackground(new java.awt.Color(204, 204, 255));
        withdrw.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        withdrw.setText("Withdraw");
        withdrw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrwActionPerformed(evt);
            }
        });

        cus_list.setBackground(new java.awt.Color(204, 204, 255));
        cus_list.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cus_list.setText("Customer List");

        trnsctn.setBackground(new java.awt.Color(204, 204, 255));
        trnsctn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        trnsctn.setText("Transaction");
        trnsctn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trnsctnActionPerformed(evt);
            }
        });

        view_blnce.setBackground(new java.awt.Color(204, 204, 255));
        view_blnce.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        view_blnce.setText("View Balamce");
        view_blnce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_blnceActionPerformed(evt);
            }
        });

        stmnt.setBackground(new java.awt.Color(204, 204, 255));
        stmnt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        stmnt.setText("Statement");
        stmnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stmntActionPerformed(evt);
            }
        });

        chng_pin.setBackground(new java.awt.Color(204, 204, 255));
        chng_pin.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        chng_pin.setText("Change Pin");
        chng_pin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chng_pinActionPerformed(evt);
            }
        });

        about.setBackground(new java.awt.Color(204, 204, 255));
        about.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        about.setText("About");
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(depst, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(trnfr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(withdrw, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(cus_list, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
            .addComponent(trnsctn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(stmnt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(chng_pin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(about, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(view_blnce, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(pft)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(depst)
                .addGap(18, 18, 18)
                .addComponent(trnfr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(withdrw)
                .addGap(18, 18, 18)
                .addComponent(cus_list)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(trnsctn)
                .addGap(18, 18, 18)
                .addComponent(view_blnce)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(stmnt)
                .addGap(18, 18, 18)
                .addComponent(chng_pin)
                .addGap(18, 18, 18)
                .addComponent(about)
                .addContainerGap())
        );

        date.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        date.setForeground(new java.awt.Color(255, 255, 255));
        date.setText("Date");

        exit.setBackground(new java.awt.Color(204, 204, 255));
        exit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(102, 102, 255));
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_shutdown_16px.png"))); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(204, 204, 255));
        delete.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        delete.setForeground(new java.awt.Color(102, 102, 255));
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_delete_sign_16px.png"))); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(37, 37, 37)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(130, 130, 130))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(delete)
                                .addGap(116, 116, 116))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(date)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(exit)
                            .addComponent(delete))))
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pftActionPerformed
        // TODO add your handling code here:
        new ProfileView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pftActionPerformed

    private void depstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depstActionPerformed
        // TODO add your handling code here:
        new DepositeView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_depstActionPerformed

    private void trnfrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trnfrActionPerformed
        // TODO add your handling code here:
        new TransferView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_trnfrActionPerformed

    private void withdrwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrwActionPerformed
        // TODO add your handling code here:
       new WithdrawView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_withdrwActionPerformed

    private void trnsctnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trnsctnActionPerformed
        // TODO add your handling code here:
        new TransactionView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_trnsctnActionPerformed

    private void view_blnceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_blnceActionPerformed
        // TODO add your handling code here:
        new ViewBalanceView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_view_blnceActionPerformed

    private void stmntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stmntActionPerformed
        // TODO add your handling code here:
        
        new StatementView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_stmntActionPerformed

    private void chng_pinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chng_pinActionPerformed
        // TODO add your handling code here:
        new ChangePinView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_chng_pinActionPerformed

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed
        // TODO add your handling code here:
        new About().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_aboutActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
       
        JFrame frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Banking System", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_exitActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        try {
            int SelectedRowIndex = jTable1.getSelectedRow();
            model.removeRow(SelectedRowIndex);
            
        } catch (Exception e) {
            JFrame frame = new JFrame("Delete");
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to delete", "Banking System", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            
        }
        }
        
        
    }//GEN-LAST:event_deleteActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CoustomerListView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CoustomerListView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CoustomerListView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CoustomerListView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CoustomerListView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton about;
    private javax.swing.JButton chng_pin;
    private javax.swing.JButton cus_list;
    private javax.swing.JLabel date;
    private javax.swing.JButton delete;
    private javax.swing.JButton depst;
    private javax.swing.JButton exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblTime;
    private javax.swing.JButton pft;
    private javax.swing.JButton stmnt;
    private javax.swing.JButton trnfr;
    private javax.swing.JButton trnsctn;
    private javax.swing.JButton view_blnce;
    private javax.swing.JButton withdrw;
    // End of variables declaration//GEN-END:variables
}
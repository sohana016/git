package com.banking.view;


import com.banking.daoImp.AccountImp;
import com.banking.daoImp.SummaryImp;
import com.banking.pojo.Account;
import com.banking.pojo.Summary;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Md Yasin Arif
 */
public class AccountView extends javax.swing.JFrame {
            public static JFrame backe = new AccountView();
            public JFrame authentication;
    
    public AccountView() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        birth_date = new javax.swing.JLabel();
        inp_Bdate = new javax.swing.JTextField();
        seq_q = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        create = new javax.swing.JButton();
        inp_name = new javax.swing.JTextField();
        inp_micr_vo = new javax.swing.JTextField();
        gender = new javax.swing.JLabel();
        clr = new javax.swing.JButton();
        inp_add = new javax.swing.JTextField();
        inp_pin = new javax.swing.JPasswordField();
        inp_acc_no = new javax.swing.JTextField();
        mobile = new javax.swing.JLabel();
        i_banking = new javax.swing.JLabel();
        inp_caste = new javax.swing.JTextField();
        select_acc_typ = new javax.swing.JComboBox<>();
        micr_no = new javax.swing.JLabel();
        inp_seq_q = new javax.swing.JTextField();
        acc_no = new javax.swing.JLabel();
        inp_mobl = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        inp_ans = new javax.swing.JTextField();
        acc_typ = new javax.swing.JLabel();
        thnk = new javax.swing.JTextField();
        caste = new javax.swing.JLabel();
        natinality = new javax.swing.JLabel();
        select_natnlty = new javax.swing.JComboBox<>();
        pin = new javax.swing.JLabel();
        ans = new javax.swing.JLabel();
        amount = new javax.swing.JLabel();
        inp_amount = new javax.swing.JTextField();
        select_gender = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 51), 3), "Account", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        birth_date.setBackground(new java.awt.Color(255, 255, 255));
        birth_date.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        birth_date.setForeground(new java.awt.Color(255, 255, 255));
        birth_date.setText("Date of Birth");

        inp_Bdate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        seq_q.setBackground(new java.awt.Color(255, 255, 255));
        seq_q.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        seq_q.setForeground(new java.awt.Color(255, 255, 255));
        seq_q.setText("Sequrity Q.");

        address.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        address.setForeground(new java.awt.Color(255, 255, 255));
        address.setText("Address");

        create.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        create.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_add_user_male_16px_2.png"))); // NOI18N
        create.setText("Create");
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });

        inp_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        inp_micr_vo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        gender.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        gender.setForeground(new java.awt.Color(255, 255, 255));
        gender.setText("Gender");

        clr.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        clr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_broom_16px_1.png"))); // NOI18N
        clr.setText("Clear");
        clr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clrActionPerformed(evt);
            }
        });

        inp_add.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inp_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inp_addActionPerformed(evt);
            }
        });

        inp_acc_no.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        mobile.setBackground(new java.awt.Color(255, 255, 255));
        mobile.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        mobile.setForeground(new java.awt.Color(255, 255, 255));
        mobile.setText("Mobile");

        i_banking.setFont(new java.awt.Font("Tw Cen MT", 1, 48)); // NOI18N
        i_banking.setForeground(new java.awt.Color(255, 255, 255));
        i_banking.setText("iBANKING");

        inp_caste.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        select_acc_typ.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        select_acc_typ.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "saving", "Current" }));

        micr_no.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        micr_no.setForeground(new java.awt.Color(255, 255, 255));
        micr_no.setText("MICR NO.");

        inp_seq_q.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        acc_no.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        acc_no.setForeground(new java.awt.Color(255, 255, 255));
        acc_no.setText("Account No.");

        inp_mobl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        back.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_back_16px_4.png"))); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        inp_ans.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inp_ans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inp_ansActionPerformed(evt);
            }
        });

        acc_typ.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        acc_typ.setForeground(new java.awt.Color(255, 255, 255));
        acc_typ.setText("Account Type");

        thnk.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        thnk.setForeground(new java.awt.Color(204, 0, 0));
        thnk.setText("Thank you For Banking with Us....");

        caste.setBackground(new java.awt.Color(255, 255, 255));
        caste.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        caste.setForeground(new java.awt.Color(255, 255, 255));
        caste.setText("Caste");

        natinality.setBackground(new java.awt.Color(255, 255, 255));
        natinality.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        natinality.setForeground(new java.awt.Color(255, 255, 255));
        natinality.setText("Natinality");

        select_natnlty.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        select_natnlty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Bangladeshi", "Indian" }));

        pin.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pin.setForeground(new java.awt.Color(255, 255, 255));
        pin.setText("Pin");

        ans.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ans.setForeground(new java.awt.Color(255, 255, 255));
        ans.setText("Answer");

        amount.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        amount.setForeground(new java.awt.Color(255, 255, 255));
        amount.setText("Amount");

        inp_amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inp_amountActionPerformed(evt);
            }
        });

        select_gender.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        select_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Male", "Female" }));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(i_banking))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(acc_no, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(inp_acc_no, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addComponent(inp_name, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(micr_no)
                .addGap(61, 61, 61)
                .addComponent(inp_micr_vo, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126)
                .addComponent(birth_date)
                .addGap(94, 94, 94)
                .addComponent(inp_Bdate, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(pin, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(inp_pin, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126)
                .addComponent(natinality, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(select_natnlty, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(acc_typ)
                .addGap(44, 44, 44)
                .addComponent(select_acc_typ, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124)
                .addComponent(caste, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(inp_caste, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(select_gender, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124)
                .addComponent(mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(inp_mobl, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(inp_add, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124)
                .addComponent(seq_q, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(inp_seq_q, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(inp_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124)
                .addComponent(ans, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(inp_ans, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(create)
                .addGap(117, 117, 117)
                .addComponent(back)
                .addGap(116, 116, 116)
                .addComponent(clr))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(thnk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(i_banking, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inp_acc_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inp_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(acc_no)
                            .addComponent(jLabel1))))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(micr_no))
                    .addComponent(inp_micr_vo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(birth_date)
                    .addComponent(inp_Bdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(pin))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(inp_pin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(natinality)
                    .addComponent(select_natnlty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(select_acc_typ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inp_caste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(acc_typ)
                            .addComponent(caste))))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(gender))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(select_gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(mobile))
                    .addComponent(inp_mobl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(address))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(inp_add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(seq_q)
                    .addComponent(inp_seq_q, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(amount)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(inp_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(ans))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(inp_ans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(create)
                    .addComponent(back)
                    .addComponent(clr))
                .addGap(18, 18, 18)
                .addComponent(thnk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, new java.awt.GridBagConstraints());

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
               new Authentication().setVisible(true);
             this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void clrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clrActionPerformed
        // TODO add your handling code here:
       inp_acc_no.setText("");
       inp_micr_vo.setText("");
       inp_pin.setText("");
       inp_add.setText("");
       inp_amount.setText("");
       inp_name.setText("");
       inp_Bdate.setText("");
       inp_caste.setText("");
       inp_mobl.setText("");
       inp_seq_q.setText("");
       inp_ans.setText("");
       
       
    }//GEN-LAST:event_clrActionPerformed

    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed
        String accountNo = inp_acc_no.getText();
        String micr_no = inp_micr_vo.getText();
        int pin = Integer.parseInt(inp_pin.getText());
        String acc_typ = select_acc_typ.getItemAt(select_acc_typ.getSelectedIndex());
        String gender = select_gender.getItemAt(select_gender.getSelectedIndex());
        
        String address = inp_add.getText();
        Double amount = Double.parseDouble(inp_amount.getText());
        String name = inp_name.getText();
        String dateOfBirth = inp_Bdate.getText();
        String nationality = select_natnlty.getItemAt(select_natnlty.getSelectedIndex());
        String caste = inp_caste.getText();
        int mobile = Integer.parseInt(inp_mobl.getText());
        String seqQsn = inp_seq_q.getText();
        String ans= inp_ans.getText();
        
        try {
            Account account = new Account(accountNo, micr_no, pin, acc_typ, gender, address, amount, name, dateOfBirth, nationality, caste, mobile, seqQsn, ans);
            
            AccountImp accImp = new AccountImp();
            accImp.save(account);
            
            Summary summary = new Summary(name, accountNo, amount);
            SummaryImp sumImp = new SummaryImp();
            sumImp.save(summary);
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_createActionPerformed

    private void inp_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inp_addActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inp_addActionPerformed

    private void inp_ansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inp_ansActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inp_ansActionPerformed

    private void inp_amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inp_amountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inp_amountActionPerformed

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
            java.util.logging.Logger.getLogger(AccountView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccountView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccountView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccountView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              backe.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acc_no;
    private javax.swing.JLabel acc_typ;
    private javax.swing.JLabel address;
    private javax.swing.JLabel amount;
    private javax.swing.JLabel ans;
    private javax.swing.JButton back;
    private javax.swing.JLabel birth_date;
    private javax.swing.JLabel caste;
    private javax.swing.JButton clr;
    private javax.swing.JButton create;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel i_banking;
    private javax.swing.JTextField inp_Bdate;
    private javax.swing.JTextField inp_acc_no;
    private javax.swing.JTextField inp_add;
    private javax.swing.JTextField inp_amount;
    private javax.swing.JTextField inp_ans;
    private javax.swing.JTextField inp_caste;
    private javax.swing.JTextField inp_micr_vo;
    private javax.swing.JTextField inp_mobl;
    private javax.swing.JTextField inp_name;
    private javax.swing.JPasswordField inp_pin;
    private javax.swing.JTextField inp_seq_q;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel micr_no;
    private javax.swing.JLabel mobile;
    private javax.swing.JLabel natinality;
    private javax.swing.JLabel pin;
    private javax.swing.JComboBox<String> select_acc_typ;
    private javax.swing.JComboBox<String> select_gender;
    private javax.swing.JComboBox<String> select_natnlty;
    private javax.swing.JLabel seq_q;
    private javax.swing.JTextField thnk;
    // End of variables declaration//GEN-END:variables
}

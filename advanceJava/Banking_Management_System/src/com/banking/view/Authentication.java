package com.banking.view;


import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
public class Authentication extends javax.swing.JFrame {

    public static JFrame login = new Authentication();
    public JFrame myPage;
    public JFrame createAccount;
    
    public Authentication() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        create_acc = new javax.swing.JButton();
        inp_pin = new javax.swing.JPasswordField();
        En_acc_no = new javax.swing.JLabel();
        logIn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        i_banking = new javax.swing.JLabel();
        Inp_ent_acc_no = new javax.swing.JTextField();
        pin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 3), "Authentication", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 0, 36), new java.awt.Color(204, 0, 0))); // NOI18N
        jPanel1.setLayout(new java.awt.GridBagLayout());

        create_acc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        create_acc.setForeground(new java.awt.Color(51, 51, 255));
        create_acc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_add_list_16px.png"))); // NOI18N
        create_acc.setText("Create Account");
        create_acc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_accActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(43, 27, 44, 51);
        jPanel1.add(create_acc, gridBagConstraints);

        inp_pin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 216;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(29, 31, 0, 0);
        jPanel1.add(inp_pin, gridBagConstraints);

        En_acc_no.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        En_acc_no.setForeground(new java.awt.Color(255, 255, 255));
        En_acc_no.setText("Enter  Account No.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(19, 29, 0, 0);
        jPanel1.add(En_acc_no, gridBagConstraints);

        logIn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        logIn.setForeground(new java.awt.Color(51, 51, 255));
        logIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_login_rounded_right_16px.png"))); // NOI18N
        logIn.setText("LogIn");
        logIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(43, 22, 44, 0);
        jPanel1.add(logIn, gridBagConstraints);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_lock_16px.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(19, 10, 0, 0);
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_key_16px.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(36, 18, 0, 0);
        jPanel1.add(jLabel2, gridBagConstraints);

        i_banking.setFont(new java.awt.Font("Perpetua", 1, 48)); // NOI18N
        i_banking.setForeground(new java.awt.Color(255, 255, 255));
        i_banking.setText("iBANKING");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 48;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(42, 2, 0, 0);
        jPanel1.add(i_banking, gridBagConstraints);

        Inp_ent_acc_no.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 216;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 31, 0, 0);
        jPanel1.add(Inp_ent_acc_no, gridBagConstraints);

        pin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pin.setForeground(new java.awt.Color(255, 255, 255));
        pin.setText("PIN");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 84, 0, 0);
        jPanel1.add(pin, gridBagConstraints);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -1, 620, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInActionPerformed
        // TODO add your handling code here:
              String userid;
              userid = Inp_ent_acc_no.getText();
              String pwd = new String(inp_pin.getPassword());
             if(userid.equals("m") && pwd.equals("1")){
    
             JOptionPane.showMessageDialog(this, "Login Successfull");
             new HomePageView().setVisible(true);
             this.dispose();
    }else{
             JOptionPane.showMessageDialog(this,"Invalid Account No or Pin");
             inp_pin.setText(null);
             }
        
        
    }//GEN-LAST:event_logInActionPerformed

    private void create_accActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_create_accActionPerformed
        // TODO add your handling code here:
      login.setVisible(false);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
               //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
               createAccount = new AccountView();
               createAccount.setVisible(true);
            
            
            }
        });
    }//GEN-LAST:event_create_accActionPerformed

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
            java.util.logging.Logger.getLogger(Authentication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Authentication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Authentication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Authentication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               login.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel En_acc_no;
    private javax.swing.JTextField Inp_ent_acc_no;
    private javax.swing.JButton create_acc;
    private javax.swing.JLabel i_banking;
    private javax.swing.JPasswordField inp_pin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logIn;
    private javax.swing.JLabel pin;
    // End of variables declaration//GEN-END:variables
}

package exammanagementsystem;

import javax.swing.JOptionPane;
public class AdminLogin extends javax.swing.JFrame {
   

    public AdminLogin() {
        initComponents();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        admind_txt = new javax.swing.JTextField();
        userid_lbl = new javax.swing.JLabel();
        pw_lbl = new javax.swing.JLabel();
        login_btn = new javax.swing.JButton();
        back_btn = new javax.swing.JButton();
        password_txt = new javax.swing.JPasswordField();
        adlog_lbl = new javax.swing.JLabel();
        bg_lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Login\n\n");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setExtendedState(6);
        setForeground(new java.awt.Color(240, 240, 240));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        admind_txt.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        admind_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(admind_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, 640, 50));

        userid_lbl.setFont(new java.awt.Font("Tahoma", 3, 38)); // NOI18N
        userid_lbl.setForeground(new java.awt.Color(153, 0, 0));
        userid_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userid_lbl.setText("User ID");
        userid_lbl.setToolTipText("");
        jPanel1.add(userid_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 90, 158, 50));

        pw_lbl.setFont(new java.awt.Font("Tahoma", 3, 38)); // NOI18N
        pw_lbl.setForeground(new java.awt.Color(153, 0, 0));
        pw_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pw_lbl.setText("Password\n");
        pw_lbl.setToolTipText("");
        jPanel1.add(pw_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 250, 430, 40));

        login_btn.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        login_btn.setForeground(new java.awt.Color(0, 0, 204));
        login_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logiuser.png"))); // NOI18N
        login_btn.setText("Login");
        login_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_btnActionPerformed(evt);
            }
        });
        jPanel1.add(login_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, 230, 90));

        back_btn.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        back_btn.setForeground(new java.awt.Color(255, 51, 51));
        back_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        back_btn.setText("Back");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });
        jPanel1.add(back_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 420, 220, 90));

        password_txt.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        password_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(password_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, 650, 50));

        adlog_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adlog.png"))); // NOI18N
        jPanel1.add(adlog_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 310, 260));

        bg_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginbg.jpg"))); // NOI18N
        jPanel1.add(bg_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -180, 2020, 1180));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 2241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 146, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void login_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_btnActionPerformed
        if(admind_txt.getText().equals("admin") && password_txt.getText().equals("ad123")){
            setVisible(false);
            new AdminHome().setVisible(true);
        }
        else
        {
            admind_txt.setText("");
            password_txt.setText("");
            JOptionPane.showMessageDialog(null,"<html><b style=\"color: red; font-size:10px\">Something is Wrong <br> Please check your Userid or Password </b></html>","Show",JOptionPane.INFORMATION_MESSAGE);   
        }
    }//GEN-LAST:event_login_btnActionPerformed
    
    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
      
        setVisible(false);
        new IndexFrame().setVisible(true);
    }//GEN-LAST:event_back_btnActionPerformed

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
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adlog_lbl;
    private javax.swing.JTextField admind_txt;
    private javax.swing.JButton back_btn;
    private javax.swing.JLabel bg_lbl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login_btn;
    private javax.swing.JPasswordField password_txt;
    private javax.swing.JLabel pw_lbl;
    private javax.swing.JLabel userid_lbl;
    // End of variables declaration//GEN-END:variables

}


package exammanagementsystem;

import javax.swing.JOptionPane;

public class IndexFrame extends javax.swing.JFrame {

    public IndexFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        in_panel = new javax.swing.JPanel();
        stu_btn = new javax.swing.JButton();
        admin_btn = new javax.swing.JButton();
        exit_btn = new javax.swing.JButton();
        in_lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Index Frame\n");
        setExtendedState(6);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        in_panel.setLayout(null);

        stu_btn.setBackground(new java.awt.Color(204, 204, 255));
        stu_btn.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        stu_btn.setForeground(new java.awt.Color(255, 0, 51));
        stu_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stu.png"))); // NOI18N
        stu_btn.setText("Student");
        stu_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stu_btnActionPerformed(evt);
            }
        });
        in_panel.add(stu_btn);
        stu_btn.setBounds(1040, 150, 250, 80);

        admin_btn.setBackground(new java.awt.Color(204, 204, 255));
        admin_btn.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        admin_btn.setForeground(new java.awt.Color(255, 0, 51));
        admin_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin.png"))); // NOI18N
        admin_btn.setText("Admin");
        admin_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_btnActionPerformed(evt);
            }
        });
        in_panel.add(admin_btn);
        admin_btn.setBounds(1350, 150, 225, 80);

        exit_btn.setBackground(new java.awt.Color(204, 204, 255));
        exit_btn.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        exit_btn.setForeground(new java.awt.Color(255, 0, 51));
        exit_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exit.png"))); // NOI18N
        exit_btn.setText("Exit");
        exit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_btnActionPerformed(evt);
            }
        });
        in_panel.add(exit_btn);
        exit_btn.setBounds(1640, 150, 200, 80);

        in_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/index_img.jpg"))); // NOI18N
        in_panel.add(in_lbl);
        in_lbl.setBounds(-10, 90, 2590, 1130);

        getContentPane().add(in_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -130, 2330, 1220));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_btnActionPerformed
        // TODO add your handling code here:
        int e= JOptionPane.showConfirmDialog(null,"Do You want Exit","Select",JOptionPane.YES_NO_OPTION);
        
        if(e==0)
        {
            System.exit(0);
        }
        
    }//GEN-LAST:event_exit_btnActionPerformed

    private void admin_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_btnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new AdminLogin().setVisible(true);
                
    }//GEN-LAST:event_admin_btnActionPerformed

    private void stu_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stu_btnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new StudentDetail().setVisible(true);
    }//GEN-LAST:event_stu_btnActionPerformed

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
            java.util.logging.Logger.getLogger(IndexFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IndexFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IndexFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IndexFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IndexFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admin_btn;
    private javax.swing.JButton exit_btn;
    private javax.swing.JLabel in_lbl;
    private javax.swing.JPanel in_panel;
    private javax.swing.JButton stu_btn;
    // End of variables declaration//GEN-END:variables
}

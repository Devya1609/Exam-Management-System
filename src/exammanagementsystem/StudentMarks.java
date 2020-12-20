
package exammanagementsystem;

public class StudentMarks extends javax.swing.JFrame {

    
    public StudentMarks() {
        initComponents();
    }
    public StudentMarks(String marks) {
        initComponents();
        String marks1 = "Marks Obtained: "+marks;
        marks_lbl.setText(marks1);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        marks_lbl = new javax.swing.JLabel();
        ss_lbl = new javax.swing.JLabel();
        close_btn = new javax.swing.JButton();
        bg_lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setExtendedState(6);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        marks_lbl.setFont(new java.awt.Font("Tahoma", 1, 68)); // NOI18N
        marks_lbl.setForeground(new java.awt.Color(0, 51, 204));
        marks_lbl.setText("Marks Obtained: 10");
        getContentPane().add(marks_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, 710, 160));

        ss_lbl.setFont(new java.awt.Font("Tahoma", 1, 68)); // NOI18N
        ss_lbl.setForeground(new java.awt.Color(255, 0, 0));
        ss_lbl.setText("You have Successfully Completed the Exam");
        getContentPane().add(ss_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 1510, 180));

        close_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exit.png"))); // NOI18N
        close_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_btnActionPerformed(evt);
            }
        });
        getContentPane().add(close_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1770, 20, 70, 70));

        bg_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/markbg.png"))); // NOI18N
        getContentPane().add(bg_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -400, 1990, 1650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void close_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_btnActionPerformed
        // TDO add your handling code here:
        
        setVisible(false);
        System.exit(0);
       // new IndexFrame().setVisible(true);
    }//GEN-LAST:event_close_btnActionPerformed

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
            java.util.logging.Logger.getLogger(StudentMarks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentMarks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentMarks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentMarks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentMarks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg_lbl;
    private javax.swing.JButton close_btn;
    private javax.swing.JLabel marks_lbl;
    private javax.swing.JLabel ss_lbl;
    // End of variables declaration//GEN-END:variables
}

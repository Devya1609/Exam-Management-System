
package exammanagementsystem;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AdminHome extends javax.swing.JFrame {

public static int open=0;    
    public AdminHome() {
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

        jLabel1 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        adnewque = new javax.swing.JMenu();
        upque = new javax.swing.JMenu();
        academicInfo_mitem = new javax.swing.JMenuItem();
        profil_mitem = new javax.swing.JMenuItem();
        allque = new javax.swing.JMenu();
        deleque = new javax.swing.JMenu();
        allsturesl = new javax.swing.JMenu();
        logout = new javax.swing.JMenu();
        exit_menu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Home\n");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminbg.jpg"))); // NOI18N

        jMenuBar2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Navigation Bar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 36), new java.awt.Color(255, 51, 51))); // NOI18N

        adnewque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adque.png"))); // NOI18N
        adnewque.setText("Add New Question ");
        adnewque.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        adnewque.setMargin(new java.awt.Insets(0, 40, 0, 0));
        adnewque.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                adnewqueFocusLost(evt);
            }
        });
        adnewque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adnewqueMouseClicked(evt);
            }
        });
        adnewque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adnewqueActionPerformed(evt);
            }
        });
        jMenuBar2.add(adnewque);

        upque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/updateque.png"))); // NOI18N
        upque.setText("Update Question");
        upque.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        upque.setMargin(new java.awt.Insets(0, 40, 0, 0));
        upque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                upqueMouseClicked(evt);
            }
        });

        academicInfo_mitem.setText("Academic Information");
        academicInfo_mitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                academicInfo_mitemActionPerformed(evt);
            }
        });
        upque.add(academicInfo_mitem);

        profil_mitem.setText("Profil Entry");
        upque.add(profil_mitem);

        jMenuBar2.add(upque);

        allque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/allque.png"))); // NOI18N
        allque.setText("All Question ");
        allque.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        allque.setMargin(new java.awt.Insets(0, 40, 0, 0));
        allque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                allqueMouseClicked(evt);
            }
        });
        jMenuBar2.add(allque);

        deleque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/deleteque.png"))); // NOI18N
        deleque.setText("Delete Question");
        deleque.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        deleque.setMargin(new java.awt.Insets(0, 50, 0, 0));
        deleque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delequeMouseClicked(evt);
            }
        });
        jMenuBar2.add(deleque);

        allsturesl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/allresult.png"))); // NOI18N
        allsturesl.setText("All Student Result ");
        allsturesl.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        allsturesl.setMargin(new java.awt.Insets(0, 60, 0, 0));
        allsturesl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                allstureslMouseClicked(evt);
            }
        });
        jMenuBar2.add(allsturesl);

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout.png"))); // NOI18N
        logout.setText("Logout");
        logout.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        logout.setMargin(new java.awt.Insets(0, 60, 0, 0));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        jMenuBar2.add(logout);

        exit_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exit_1.png"))); // NOI18N
        exit_menu.setText("Exit");
        exit_menu.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        exit_menu.setMargin(new java.awt.Insets(0, 65, 0, 0));
        exit_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit_menuMouseClicked(evt);
            }
        });
        jMenuBar2.add(exit_menu);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2080, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 2068, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 12, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 832, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setBounds(0, 0, 2080, 907);
    }// </editor-fold>//GEN-END:initComponents

    private void academicInfo_mitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_academicInfo_mitemActionPerformed

    }//GEN-LAST:event_academicInfo_mitemActionPerformed

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        // TODO add your handling code here:
        JFrame jf = new JFrame();
        jf.setAlwaysOnTop(true);
        int a = JOptionPane.showConfirmDialog(jf,"Do You Really Want to Logout","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            setVisible(false);
            new AdminLogin().setVisible(true);
        }
    }//GEN-LAST:event_logoutMouseClicked

    private void exit_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_menuMouseClicked
        // TODO add your handling code here:
        JFrame jf = new JFrame();
        jf.setAlwaysOnTop(true);
        int a = JOptionPane.showConfirmDialog(jf,"Do You Really Want to Exit Application","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
                System.exit(0);
        }
    }//GEN-LAST:event_exit_menuMouseClicked

    private void adnewqueFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_adnewqueFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_adnewqueFocusLost

    private void adnewqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adnewqueActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_adnewqueActionPerformed

    private void adnewqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adnewqueMouseClicked
        // TODO add your handling code here:
        if(open==0){
            new AddNewQuestion().setVisible(true);
            open=1;
        } 
        else
        {
            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf,"One form is Allready Open");
        }
    }//GEN-LAST:event_adnewqueMouseClicked

    private void upqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upqueMouseClicked
        // TODO add your handling code here:
        if(open==0){
            new UpdateQuestion().setVisible(true);
            open=1;
        } 
        else
        {
            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf,"One form is Allready Open");
        }
    }//GEN-LAST:event_upqueMouseClicked

    private void allqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allqueMouseClicked
        // TODO add your handling code here:
        if(open==0){
            new AllQuestion().setVisible(true);
            open=1;
        } 
        else
        {
            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf,"One form is Allready Open");
        }
        
        
        
    }//GEN-LAST:event_allqueMouseClicked

    private void delequeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delequeMouseClicked
        // TODO add your handling code here:
        if(open==0){
            new DeleteQuestion().setVisible(true);
            open=1;
        } 
        else
        {
            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf,"One form is Allready Open");
        }
        
    }//GEN-LAST:event_delequeMouseClicked

    private void allstureslMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allstureslMouseClicked
        // TODO add your handling code here:
        if(open==0){
            new AllStudentMarks().setVisible(true);
            open=1;
        } 
        else
        {
            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf,"One form is Allready Open");
        }
    }//GEN-LAST:event_allstureslMouseClicked

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
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem academicInfo_mitem;
    private javax.swing.JMenu adnewque;
    private javax.swing.JMenu allque;
    private javax.swing.JMenu allsturesl;
    private javax.swing.JMenu deleque;
    private javax.swing.JMenu exit_menu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenu logout;
    private javax.swing.JMenuItem profil_mitem;
    private javax.swing.JMenu upque;
    // End of variables declaration//GEN-END:variables
}

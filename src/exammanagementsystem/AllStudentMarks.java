
package exammanagementsystem;

import static exammanagementsystem.UpdateQuestion.con;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import projectconnection.ConnectionProj;


public class AllStudentMarks extends javax.swing.JFrame {

    static Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    public AllStudentMarks() {
        initComponents();
        try
        {
            con = ConnectionProj.getConnection();
            stmt= con.createStatement();
            rs = stmt.executeQuery("select * from student "); //database query using preparaStatement
             
            quetable.setAutoResizeMode(quetable.AUTO_RESIZE_OFF);//using r2xml jar file we can access all question from database
            quetable.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e)
        {
            
            JOptionPane.showMessageDialog(null, e);
        }
    
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        quetable = new javax.swing.JTable();
        close_btn = new javax.swing.JButton();
        allque_lbl = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        fil_lbl = new javax.swing.JLabel();
        fimark_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 200));
        setMinimumSize(new java.awt.Dimension(2040, 830));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(2040, 830));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        quetable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        quetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(quetable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 1380, 230));

        close_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exit.png"))); // NOI18N
        close_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_btnActionPerformed(evt);
            }
        });
        getContentPane().add(close_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1770, 20, 70, 70));

        allque_lbl.setBackground(new java.awt.Color(255, 153, 153));
        allque_lbl.setFont(new java.awt.Font("Algerian", 1, 50)); // NOI18N
        allque_lbl.setForeground(new java.awt.Color(0, 51, 204));
        allque_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/allresult.png"))); // NOI18N
        allque_lbl.setText("All Student Result");
        getContentPane().add(allque_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, 90));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 102, 2220, 10));

        fil_lbl.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        fil_lbl.setForeground(new java.awt.Color(0, 255, 255));
        fil_lbl.setText("Filter Students By Marks");
        getContentPane().add(fil_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 370, 50));

        fimark_txt.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        fimark_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fimark_txtKeyReleased(evt);
            }
        });
        getContentPane().add(fimark_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 130, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/allquebg.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2040, 830));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void close_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_btnActionPerformed
        // TDO add your handling code here:
        AdminHome.open=0;
        setVisible(false);
    }//GEN-LAST:event_close_btnActionPerformed

    private void fimark_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fimark_txtKeyReleased
        // TODO add your handling code here:
        
        int marks;
        if(fimark_txt.getText().equals(""))
        {
            marks=0;
        }
        else
        {
            marks = Integer.parseInt(fimark_txt.getText());
            try
        {
            con = ConnectionProj.getConnection();
            stmt= con.createStatement();
            rs = stmt.executeQuery("select * from student where marks >="+marks+""); //database query using preparaStatement
             
            quetable.setAutoResizeMode(quetable.AUTO_RESIZE_OFF);//using r2xml jar file we can access all question from database
            quetable.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        }
    }//GEN-LAST:event_fimark_txtKeyReleased

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
            java.util.logging.Logger.getLogger(AllStudentMarks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AllStudentMarks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AllStudentMarks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AllStudentMarks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AllStudentMarks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel allque_lbl;
    private javax.swing.JButton close_btn;
    private javax.swing.JLabel fil_lbl;
    private javax.swing.JTextField fimark_txt;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable quetable;
    // End of variables declaration//GEN-END:variables
}


package exammanagementsystem;

import javax.swing.JOptionPane;

public class InstructionStudent extends javax.swing.JFrame {

    public String rollNo;
    public InstructionStudent() {
        initComponents();
    }
    public InstructionStudent(String rollno1) {
        initComponents();
        studnot_txt.setEditable(false);
        //JOptionPane.showMessageDialog(null,rollno1);
        rollNo = rollno1;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        upque_lbl = new javax.swing.JLabel();
        in_panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        studnot_txt = new javax.swing.JTextArea();
        exam_btn = new javax.swing.JButton();
        in_lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Index Frame\n");
        setExtendedState(6);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 112, 2120, 20));

        upque_lbl.setBackground(new java.awt.Color(255, 153, 153));
        upque_lbl.setFont(new java.awt.Font("Algerian", 1, 55)); // NOI18N
        upque_lbl.setForeground(new java.awt.Color(255, 51, 51));
        upque_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stu.png"))); // NOI18N
        upque_lbl.setText(" instruction");
        getContentPane().add(upque_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, 90));

        in_panel.setLayout(null);

        studnot_txt.setEditable(false);
        studnot_txt.setBackground(new java.awt.Color(255, 204, 204));
        studnot_txt.setColumns(20);
        studnot_txt.setFont(new java.awt.Font("Monospaced", 1, 30)); // NOI18N
        studnot_txt.setForeground(new java.awt.Color(0, 0, 255));
        studnot_txt.setRows(5);
        studnot_txt.setText("> Fill up your personal details carefully.\n\n> All questions are compulsory.\n\n> Try to submit the paper in 40-45 minutes.\n\n> You are allowed to submit only once, make sure that you have \n  correctly attempted all the questions before submission.\n\n> Make sure you clicked on submit button to successfully complete the test.\n\n> New students must contact their class teacher for the admission number.\n\n                            All The Best..!!");
        jScrollPane1.setViewportView(studnot_txt);

        in_panel.add(jScrollPane1);
        jScrollPane1.setBounds(270, 270, 1380, 580);

        exam_btn.setBackground(new java.awt.Color(204, 204, 255));
        exam_btn.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 36)); // NOI18N
        exam_btn.setForeground(new java.awt.Color(255, 0, 51));
        exam_btn.setText("Start Exam");
        exam_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exam_btnActionPerformed(evt);
            }
        });
        in_panel.add(exam_btn);
        exam_btn.setBounds(750, 940, 310, 80);

        in_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/index_img.jpg"))); // NOI18N
        in_panel.add(in_lbl);
        in_lbl.setBounds(0, 110, 2590, 1130);

        getContentPane().add(in_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -130, 2330, 1220));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exam_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exam_btnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new ExamSystem(rollNo).setVisible(true);
    }//GEN-LAST:event_exam_btnActionPerformed

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
            java.util.logging.Logger.getLogger(InstructionStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InstructionStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InstructionStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InstructionStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InstructionStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exam_btn;
    private javax.swing.JLabel in_lbl;
    private javax.swing.JPanel in_panel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea studnot_txt;
    private javax.swing.JLabel upque_lbl;
    // End of variables declaration//GEN-END:variables
}

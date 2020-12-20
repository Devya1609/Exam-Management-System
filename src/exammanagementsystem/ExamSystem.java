
package exammanagementsystem;
import static exammanagementsystem.AddNewQuestion.con;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import projectconnection.ConnectionProj;
import javax.swing.JOptionPane;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.Timer;
public class ExamSystem extends javax.swing.JFrame {

    static Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    public String queid ="1";
    public String answer;
    public int min =0;
    public int sec =0;
    public int marks = 0;
    Timer time;
     
    //answercheck method
    public void answerCheck()
    {
        String studnet_answer="";
        
        if(op1_btn.isSelected())
        {
            studnet_answer = op1_btn.getText();
        }
        else if(op2_btn.isSelected())
        {
            studnet_answer = op2_btn.getText();
        }
        else if(op3_btn.isSelected())
        {
            studnet_answer = op3_btn.getText();
        }
        else 
        {
            studnet_answer = op4_btn.getText();
        }
        if(studnet_answer.equals(answer))
        {
            marks = marks+1;
            
            String marks1= String.valueOf(marks);
            ymkrs_lbl.setText(marks1);   
           // System.out.println("markshhh"+marks1);
        }
        //question number change
        int questionId1 = Integer.parseInt(queid);
        questionId1 = questionId1+1;
        queid = String.valueOf(questionId1);
        
        //clear option
        op1_btn.setSelected(false);
        op2_btn.setSelected(false);
        op3_btn.setSelected(false);
        op4_btn.setSelected(false);
        
        // last question hide next btn
        if(queid.equals("10"))
        {
            nxt_btn1.setVisible(false);             
        }
        
    } 
    //question method
    public void question()
    {
        try
        {
            con = ConnectionProj.getConnection();
            stmt = con.createStatement();
            rs = stmt.executeQuery("select * from question where id='"+queid+"'");
            while(rs.next())
            {
                queno_lbl.setText(rs.getString(1));
                quedemo_lbl.setText(rs.getString(2));
                op1_btn.setText(rs.getString(3));
                op2_btn.setText(rs.getString(4));
                op3_btn.setText(rs.getString(5));
                op4_btn.setText(rs.getString(6));
                answer=rs.getString(7);                
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    } 
    //submit mehtod  
    public void submit()
    {
        String rollNo = rollno1_lbl.getText();
        answerCheck();
        try
        {
            con = ConnectionProj.getConnection();
            stmt = con.createStatement();
            stmt.executeUpdate("update student set marks ='"+marks+"'where rollNo='"+rollNo+"'");
            String marks2= String.valueOf(marks);
        //    JOptionPane.showMessageDialog(null, marks1);
            setVisible(false);
            new StudentMarks(marks2).setVisible(true); 
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
         
    public ExamSystem() {
        initComponents();
    }
    public ExamSystem(String rollno) {
        initComponents();
        rollno1_lbl.setText(rollno);
        //dateformat
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy"); //date format    
        Date date = new Date();
        det_lbl.setText(df.format(date));
        
        //first question and student details
        try
        {
            con = ConnectionProj.getConnection();
            stmt = con.createStatement();
            rs = stmt.executeQuery("select * from student where rollNo='"+rollno+"'");
            while(rs.next())
            {
                name1_lbl.setText(rs.getString(2));
            }
            rs = stmt.executeQuery("select * from question where id='"+queid+"'");
            while(rs.next())
            {
                queno_lbl.setText(rs.getString(1));
                quedemo_lbl.setText(rs.getString(2));
                op1_btn.setText(rs.getString(3));
                op2_btn.setText(rs.getString(4));
                op3_btn.setText(rs.getString(5));
                op4_btn.setText(rs.getString(6));
                answer=rs.getString(7);
                
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        //time program 
        setLocationRelativeTo(this);
        time = new Timer(1000,new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sec_lbl.setText(String.valueOf(sec));
                min_lbl.setText(String.valueOf(min));
                if(sec==60)
                {
                    sec=0;
                    min++;
                    if(min==10)
                    {
                        time.stop();
                        answerCheck();
                        submit();
                    }
                }
                sec++;
                
            }
        }); 
        time.start();
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        time_lbl = new javax.swing.JLabel();
        date_lbl = new javax.swing.JLabel();
        sec_lbl = new javax.swing.JLabel();
        ttken_lbl1 = new javax.swing.JLabel();
        upque_lbl = new javax.swing.JLabel();
        time1_lbl1 = new javax.swing.JLabel();
        min_lbl = new javax.swing.JLabel();
        det_lbl = new javax.swing.JLabel();
        bkpan_pnel = new javax.swing.JPanel();
        quedemo_lbl = new javax.swing.JLabel();
        op4_btn = new javax.swing.JRadioButton();
        op1_btn = new javax.swing.JRadioButton();
        op2_btn = new javax.swing.JRadioButton();
        op3_btn = new javax.swing.JRadioButton();
        sub_btn = new javax.swing.JButton();
        nxt_btn1 = new javax.swing.JButton();
        pan3_panel = new javax.swing.JPanel();
        rollno_lbl = new javax.swing.JLabel();
        ymark_lbl = new javax.swing.JLabel();
        queno_lbl = new javax.swing.JLabel();
        rollno1_lbl = new javax.swing.JLabel();
        name1_lbl = new javax.swing.JLabel();
        ttque_lbl = new javax.swing.JLabel();
        ymkrs_lbl = new javax.swing.JLabel();
        name_lbl = new javax.swing.JLabel();
        ttlque_lbl = new javax.swing.JLabel();
        name_lbl3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        time_lbl.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        time_lbl.setForeground(new java.awt.Color(0, 0, 153));
        time_lbl.setText("Total Time:");
        jPanel1.add(time_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 20, 170, 40));

        date_lbl.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        date_lbl.setForeground(new java.awt.Color(0, 0, 153));
        date_lbl.setText("Date:");
        jPanel1.add(date_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 40, -1, 60));

        sec_lbl.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        sec_lbl.setForeground(new java.awt.Color(255, 255, 51));
        sec_lbl.setText("00");
        jPanel1.add(sec_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1570, 70, 40, 30));

        ttken_lbl1.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        ttken_lbl1.setForeground(new java.awt.Color(0, 0, 153));
        ttken_lbl1.setText("Time Taken:");
        jPanel1.add(ttken_lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 70, 180, 30));

        upque_lbl.setBackground(new java.awt.Color(255, 153, 153));
        upque_lbl.setFont(new java.awt.Font("Algerian", 1, 55)); // NOI18N
        upque_lbl.setForeground(new java.awt.Color(0, 0, 204));
        upque_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stu.png"))); // NOI18N
        upque_lbl.setText("Welcome");
        jPanel1.add(upque_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, 90));

        time1_lbl1.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        time1_lbl1.setForeground(new java.awt.Color(255, 255, 51));
        time1_lbl1.setText("10min");
        jPanel1.add(time1_lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1520, 20, 90, 40));

        min_lbl.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        min_lbl.setForeground(new java.awt.Color(255, 255, 51));
        min_lbl.setText("00");
        jPanel1.add(min_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 70, 40, 30));

        det_lbl.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        det_lbl.setForeground(new java.awt.Color(255, 255, 51));
        jPanel1.add(det_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 40, 250, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, 2020, 140));

        bkpan_pnel.setBackground(new java.awt.Color(153, 153, 255));
        bkpan_pnel.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        bkpan_pnel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        quedemo_lbl.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        quedemo_lbl.setText("Question Demo");
        bkpan_pnel.add(quedemo_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 1290, 40));

        op4_btn.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        op4_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op4_btnActionPerformed(evt);
            }
        });
        bkpan_pnel.add(op4_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 570, 780, 50));

        op1_btn.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        op1_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op1_btnActionPerformed(evt);
            }
        });
        bkpan_pnel.add(op1_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 760, 50));

        op2_btn.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        op2_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op2_btnActionPerformed(evt);
            }
        });
        bkpan_pnel.add(op2_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 760, 50));

        op3_btn.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        op3_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op3_btnActionPerformed(evt);
            }
        });
        bkpan_pnel.add(op3_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 770, 50));

        sub_btn.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        sub_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/submit_btn.png"))); // NOI18N
        sub_btn.setText("Submit");
        sub_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub_btnActionPerformed(evt);
            }
        });
        bkpan_pnel.add(sub_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 720, 190, 60));

        nxt_btn1.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        nxt_btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nxt_btn.png"))); // NOI18N
        nxt_btn1.setText("Next\n");
        nxt_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nxt_btn1ActionPerformed(evt);
            }
        });
        bkpan_pnel.add(nxt_btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 720, 180, 60));

        getContentPane().add(bkpan_pnel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 1600, 930));

        pan3_panel.setBackground(new java.awt.Color(255, 153, 153));
        pan3_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rollno_lbl.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        rollno_lbl.setForeground(new java.awt.Color(0, 0, 153));
        rollno_lbl.setText("Roll No.");
        pan3_panel.add(rollno_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 100, 40));

        ymark_lbl.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        ymark_lbl.setForeground(new java.awt.Color(0, 0, 153));
        ymark_lbl.setText("Your Marks:\n\n");
        pan3_panel.add(ymark_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 160, 30));

        queno_lbl.setFont(new java.awt.Font("Tahoma", 1, 29)); // NOI18N
        queno_lbl.setForeground(new java.awt.Color(255, 255, 51));
        queno_lbl.setText("00");
        pan3_panel.add(queno_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 40, 40));

        rollno1_lbl.setFont(new java.awt.Font("Tahoma", 1, 29)); // NOI18N
        rollno1_lbl.setForeground(new java.awt.Color(255, 255, 51));
        pan3_panel.add(rollno1_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 110, 40));

        name1_lbl.setFont(new java.awt.Font("Tahoma", 1, 29)); // NOI18N
        name1_lbl.setForeground(new java.awt.Color(255, 255, 51));
        pan3_panel.add(name1_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 160, 40));

        ttque_lbl.setFont(new java.awt.Font("Tahoma", 1, 29)); // NOI18N
        ttque_lbl.setForeground(new java.awt.Color(255, 255, 51));
        ttque_lbl.setText("10");
        pan3_panel.add(ttque_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, -1, 40));

        ymkrs_lbl.setFont(new java.awt.Font("Tahoma", 1, 29)); // NOI18N
        ymkrs_lbl.setForeground(new java.awt.Color(255, 255, 51));
        ymkrs_lbl.setText("00");
        pan3_panel.add(ymkrs_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 40, 30));

        name_lbl.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        name_lbl.setForeground(new java.awt.Color(0, 0, 153));
        name_lbl.setText("Name");
        pan3_panel.add(name_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 80, 30));

        ttlque_lbl.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        ttlque_lbl.setForeground(new java.awt.Color(0, 0, 153));
        ttlque_lbl.setText("Total Question:");
        pan3_panel.add(ttlque_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 200, 30));

        name_lbl3.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        name_lbl3.setForeground(new java.awt.Color(0, 0, 153));
        name_lbl3.setText("Question Number:");
        pan3_panel.add(name_lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 230, 30));

        getContentPane().add(pan3_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 450, 930));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nxt_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nxt_btn1ActionPerformed
        // TODO add your handling code here:
        answerCheck();
        question();
        
    }//GEN-LAST:event_nxt_btn1ActionPerformed

    private void sub_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_btnActionPerformed
        // TODO add your handling code here:
        int a =JOptionPane.showConfirmDialog(null,"Do You want Exit","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            answerCheck();
            submit();
        }
    }//GEN-LAST:event_sub_btnActionPerformed

    private void op1_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op1_btnActionPerformed
        // TODO add your handling code here:
        if(op1_btn.isSelected())
        {
            op2_btn.setSelected(false);
            op3_btn.setSelected(false);
            op4_btn.setSelected(false);
        }
    }//GEN-LAST:event_op1_btnActionPerformed

    private void op2_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op2_btnActionPerformed
        // TODO add your handling code here:
        op1_btn.setSelected(false);
        op3_btn.setSelected(false);
        op4_btn.setSelected(false);
    }//GEN-LAST:event_op2_btnActionPerformed

    private void op3_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op3_btnActionPerformed
        // TODO add your handling code here:
        op1_btn.setSelected(false);
        op2_btn.setSelected(false);
        op4_btn.setSelected(false);
    }//GEN-LAST:event_op3_btnActionPerformed

    private void op4_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op4_btnActionPerformed
        // TODO add your handling code here:
        op1_btn.setSelected(false);
        op2_btn.setSelected(false);
        op3_btn.setSelected(false);
    }//GEN-LAST:event_op4_btnActionPerformed

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
            java.util.logging.Logger.getLogger(ExamSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExamSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExamSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExamSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExamSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bkpan_pnel;
    private javax.swing.JLabel date_lbl;
    private javax.swing.JLabel det_lbl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel min_lbl;
    private javax.swing.JLabel name1_lbl;
    private javax.swing.JLabel name_lbl;
    private javax.swing.JLabel name_lbl3;
    private javax.swing.JButton nxt_btn1;
    private javax.swing.JRadioButton op1_btn;
    private javax.swing.JRadioButton op2_btn;
    private javax.swing.JRadioButton op3_btn;
    private javax.swing.JRadioButton op4_btn;
    private javax.swing.JPanel pan3_panel;
    private javax.swing.JLabel quedemo_lbl;
    private javax.swing.JLabel queno_lbl;
    private javax.swing.JLabel rollno1_lbl;
    private javax.swing.JLabel rollno_lbl;
    private javax.swing.JLabel sec_lbl;
    private javax.swing.JButton sub_btn;
    private javax.swing.JLabel time1_lbl1;
    private javax.swing.JLabel time_lbl;
    private javax.swing.JLabel ttken_lbl1;
    private javax.swing.JLabel ttlque_lbl;
    private javax.swing.JLabel ttque_lbl;
    private javax.swing.JLabel upque_lbl;
    private javax.swing.JLabel ymark_lbl;
    private javax.swing.JLabel ymkrs_lbl;
    // End of variables declaration//GEN-END:variables
}

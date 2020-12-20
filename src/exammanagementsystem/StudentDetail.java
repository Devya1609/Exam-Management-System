
package exammanagementsystem;
import static exammanagementsystem.AddNewQuestion.con;
import java.awt.Color;
import java.sql.*;
import projectconnection.ConnectionProj;
import javax.swing.JOptionPane;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;

public class StudentDetail extends javax.swing.JFrame {

    static Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    public StudentDetail() {
        initComponents();
        not_txt.setEditable(false);
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy"); //date format
        
        Date date = new Date();
        date_lbl.setText(df.format(date));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        upque_lbl = new javax.swing.JLabel();
        back_btn = new javax.swing.JButton();
        close_btn = new javax.swing.JButton();
        name_lbl = new javax.swing.JLabel();
        fa_lbl = new javax.swing.JLabel();
        ma_lbl = new javax.swing.JLabel();
        gender_lbl = new javax.swing.JLabel();
        email_lbl = new javax.swing.JLabel();
        ten_lbl = new javax.swing.JLabel();
        twel_lbl = new javax.swing.JLabel();
        gradu_lbl = new javax.swing.JLabel();
        address_lbl = new javax.swing.JLabel();
        date_lbl = new javax.swing.JLabel();
        rollno_lbl = new javax.swing.JLabel();
        fa_txt = new javax.swing.JTextField();
        ma_txt = new javax.swing.JTextField();
        tenper_txt = new javax.swing.JTextField();
        ten_txt = new javax.swing.JTextField();
        twe_txt = new javax.swing.JTextField();
        email_txt = new javax.swing.JTextField();
        tenyear_txt = new javax.swing.JTextField();
        gradu_txt = new javax.swing.JTextField();
        graper_txt = new javax.swing.JTextField();
        tweyear_txt = new javax.swing.JTextField();
        grayear_txt = new javax.swing.JTextField();
        rollno_txt = new javax.swing.JTextField();
        tweper_txt = new javax.swing.JTextField();
        ge_combo = new javax.swing.JComboBox<>();
        date_lbl1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        not_txt = new javax.swing.JTextArea();
        cont_txt = new javax.swing.JTextField();
        savenext_btn = new javax.swing.JButton();
        address_txtarea = new javax.swing.JScrollPane();
        add_txt = new javax.swing.JTextArea();
        contact_lbl = new javax.swing.JLabel();
        name_txt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        bg_lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Index Frame\n");
        setExtendedState(6);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        upque_lbl.setBackground(new java.awt.Color(255, 153, 153));
        upque_lbl.setFont(new java.awt.Font("Algerian", 1, 50)); // NOI18N
        upque_lbl.setForeground(new java.awt.Color(0, 51, 204));
        upque_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stu.png"))); // NOI18N
        upque_lbl.setText("Student Information");
        getContentPane().add(upque_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, 90));

        back_btn.setBackground(new java.awt.Color(204, 204, 255));
        back_btn.setFont(new java.awt.Font("Algerian", 1, 25)); // NOI18N
        back_btn.setForeground(new java.awt.Color(255, 51, 51));
        back_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        back_btn.setText("Back\n");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });
        getContentPane().add(back_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1480, 30, 170, 70));

        close_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exit.png"))); // NOI18N
        close_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_btnActionPerformed(evt);
            }
        });
        getContentPane().add(close_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1760, 30, 70, 70));

        name_lbl.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        name_lbl.setForeground(new java.awt.Color(0, 0, 153));
        name_lbl.setText("Name");
        getContentPane().add(name_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 100, 60));

        fa_lbl.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        fa_lbl.setForeground(new java.awt.Color(0, 0, 153));
        fa_lbl.setText("Father Name");
        getContentPane().add(fa_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 180, 60));

        ma_lbl.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        ma_lbl.setForeground(new java.awt.Color(0, 0, 153));
        ma_lbl.setText("Mother Name");
        getContentPane().add(ma_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 190, 60));

        gender_lbl.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        gender_lbl.setForeground(new java.awt.Color(0, 0, 153));
        gender_lbl.setText("Gender");
        getContentPane().add(gender_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, 100, 30));

        email_lbl.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        email_lbl.setForeground(new java.awt.Color(0, 0, 153));
        email_lbl.setText("Email");
        getContentPane().add(email_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 560, 100, 50));

        ten_lbl.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        ten_lbl.setForeground(new java.awt.Color(0, 0, 153));
        ten_lbl.setText("10th");
        getContentPane().add(ten_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 630, 80, 60));

        twel_lbl.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        twel_lbl.setForeground(new java.awt.Color(0, 0, 153));
        twel_lbl.setText("12th");
        getContentPane().add(twel_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 710, 80, 60));

        gradu_lbl.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        gradu_lbl.setForeground(new java.awt.Color(0, 0, 153));
        gradu_lbl.setText("Graduation");
        getContentPane().add(gradu_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 800, 160, 30));

        address_lbl.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        address_lbl.setForeground(new java.awt.Color(0, 0, 153));
        address_lbl.setText("Address");
        getContentPane().add(address_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 870, -1, 40));

        date_lbl.setBackground(new java.awt.Color(204, 204, 255));
        date_lbl.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        date_lbl.setForeground(new java.awt.Color(51, 255, 51));
        getContentPane().add(date_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 80, 210, 60));

        rollno_lbl.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        rollno_lbl.setForeground(new java.awt.Color(0, 0, 153));
        rollno_lbl.setText("Roll No.");
        getContentPane().add(rollno_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 120, 60));

        fa_txt.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        getContentPane().add(fa_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 510, 40));

        ma_txt.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        getContentPane().add(ma_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 510, 40));

        tenper_txt.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        tenper_txt.setForeground(new java.awt.Color(153, 153, 153));
        tenper_txt.setText("Enter Percentage");
        tenper_txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tenper_txtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tenper_txtFocusLost(evt);
            }
        });
        getContentPane().add(tenper_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 630, 420, 40));

        ten_txt.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        ten_txt.setForeground(new java.awt.Color(153, 153, 153));
        ten_txt.setText("Enter School Name");
        ten_txt.setCaretColor(new java.awt.Color(255, 0, 255));
        ten_txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ten_txtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ten_txtFocusLost(evt);
            }
        });
        getContentPane().add(ten_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 630, 520, 40));

        twe_txt.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        twe_txt.setForeground(new java.awt.Color(153, 153, 153));
        twe_txt.setText("Enter College Name");
        twe_txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                twe_txtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                twe_txtFocusLost(evt);
            }
        });
        getContentPane().add(twe_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 710, 520, 40));

        email_txt.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        getContentPane().add(email_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 560, 520, 40));

        tenyear_txt.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        tenyear_txt.setForeground(new java.awt.Color(153, 153, 153));
        tenyear_txt.setText("Passout Year");
        tenyear_txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tenyear_txtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tenyear_txtFocusLost(evt);
            }
        });
        getContentPane().add(tenyear_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 630, 320, 40));

        gradu_txt.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        gradu_txt.setForeground(new java.awt.Color(153, 153, 153));
        gradu_txt.setText("Enter University Name");
        gradu_txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                gradu_txtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                gradu_txtFocusLost(evt);
            }
        });
        getContentPane().add(gradu_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 790, 520, 40));

        graper_txt.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        graper_txt.setForeground(new java.awt.Color(153, 153, 153));
        graper_txt.setText("Enter Percentage");
        graper_txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                graper_txtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                graper_txtFocusLost(evt);
            }
        });
        getContentPane().add(graper_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 790, 420, 40));

        tweyear_txt.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        tweyear_txt.setForeground(new java.awt.Color(153, 153, 153));
        tweyear_txt.setText("Passout Year");
        tweyear_txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tweyear_txtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tweyear_txtFocusLost(evt);
            }
        });
        getContentPane().add(tweyear_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 710, 320, 40));

        grayear_txt.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        grayear_txt.setForeground(new java.awt.Color(153, 153, 153));
        grayear_txt.setText("Passout Year");
        grayear_txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                grayear_txtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                grayear_txtFocusLost(evt);
            }
        });
        getContentPane().add(grayear_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 790, 320, 40));

        rollno_txt.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        getContentPane().add(rollno_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 510, 40));

        tweper_txt.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        tweper_txt.setForeground(new java.awt.Color(153, 153, 153));
        tweper_txt.setText("Enter Percentage");
        tweper_txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tweper_txtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tweper_txtFocusLost(evt);
            }
        });
        getContentPane().add(tweper_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 710, 420, 40));

        ge_combo.setBackground(new java.awt.Color(51, 102, 255));
        ge_combo.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        ge_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        getContentPane().add(ge_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 480, 510, 40));

        date_lbl1.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        date_lbl1.setForeground(new java.awt.Color(0, 0, 153));
        date_lbl1.setText("Date");
        getContentPane().add(date_lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 80, 70, 60));

        not_txt.setColumns(20);
        not_txt.setFont(new java.awt.Font("Monospaced", 1, 27)); // NOI18N
        not_txt.setForeground(new java.awt.Color(255, 0, 51));
        not_txt.setRows(5);
        not_txt.setText("Note:\nExamination Management System is managing\nall the activities related to examination management \nrights from recipient of Enrollment form\nand Examination form through the processing of \nResults and Certificates and Grading Reports.");
        jScrollPane1.setViewportView(not_txt);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 240, 860, 240));

        cont_txt.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        getContentPane().add(cont_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 160, 430, 40));

        savenext_btn.setBackground(new java.awt.Color(204, 204, 255));
        savenext_btn.setFont(new java.awt.Font("Algerian", 1, 30)); // NOI18N
        savenext_btn.setForeground(new java.awt.Color(255, 0, 51));
        savenext_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sevnext.png"))); // NOI18N
        savenext_btn.setText("Save & Next");
        savenext_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savenext_btnActionPerformed(evt);
            }
        });
        getContentPane().add(savenext_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 950, 1370, 60));

        add_txt.setColumns(20);
        add_txt.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        add_txt.setRows(5);
        address_txtarea.setViewportView(add_txt);

        getContentPane().add(address_txtarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 850, 520, 70));

        contact_lbl.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        contact_lbl.setForeground(new java.awt.Color(0, 0, 153));
        contact_lbl.setText("Contact No.");
        getContentPane().add(contact_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 160, 150, 40));

        name_txt.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        getContentPane().add(name_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 510, 40));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 132, 2120, 10));

        bg_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studreg.jpg"))); // NOI18N
        getContentPane().add(bg_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 2120, 1090));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        // TDO add your handling code here:
        
        setVisible(false);
        new IndexFrame().setVisible(true);
    }//GEN-LAST:event_back_btnActionPerformed

    private void close_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_btnActionPerformed
        // TDO add your handling code here:
        int e= JOptionPane.showConfirmDialog(null,"Do You want Exit","Select",JOptionPane.YES_NO_OPTION);
        
        if(e==0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_close_btnActionPerformed

    private void savenext_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savenext_btnActionPerformed
        String rollno = rollno_txt.getText();
        String name = name_txt.getText();
        String fatherName = fa_txt.getText();
        String motherName = ma_txt.getText();
        String gender = (String)ge_combo.getSelectedItem();
        String contactNo = cont_txt.getText();
        String email = email_txt.getText();
        String tenthUniversityName = ten_txt.getText();
        String tenthPercentage = tenper_txt.getText();
        String tenthPassoutYear = tenyear_txt.getText();
        String twelveUniversityName = twe_txt.getText();
        String twelvePercentage = tweper_txt.getText();
        String twelvePassoutYear = tweyear_txt.getText();
        String graduationUniversityName = gradu_txt.getText();
        String graduationPercentage = graper_txt.getText();
        String graduationPassoutYear = grayear_txt.getText();
        String address = add_txt.getText();
        String marks = "0";
        try{
            con = ConnectionProj.getConnection();
            pst = con.prepareStatement("insert into student values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        
            pst.setString(1,rollno);
            pst.setString(2,name);
            pst.setString(3,fatherName);
            pst.setString(4,motherName);
            pst.setString(5,gender);
            pst.setString(6,contactNo);
            pst.setString(7,email);
            pst.setString(8,tenthUniversityName);
            pst.setString(9,tenthPercentage);
            pst.setString(10,tenthPassoutYear);
            pst.setString(11,twelveUniversityName);
            pst.setString(12,twelvePercentage);
            pst.setString(13,twelvePassoutYear);
            pst.setString(14,graduationUniversityName);
            pst.setString(15,graduationPercentage);
            pst.setString(16,graduationPassoutYear);
            pst.setString(17,address);
            pst.setString(18,marks);
            pst.executeUpdate();
            setVisible(false);
            new InstructionStudent(rollno).setVisible(true);
            
        }    
        catch(Exception e) 
        {
           // JFrame jf = new JFrame();
           // jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(null, e);
            
        }

    }//GEN-LAST:event_savenext_btnActionPerformed

    private void ten_txtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ten_txtFocusGained
        // TODO add your handling code here:
        if(ten_txt.getText().equals("Enter School Name"))
        {
            ten_txt.setText("");
            ten_txt.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_ten_txtFocusGained

    private void twe_txtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_twe_txtFocusGained
        // TODO add your handling code here:
        if(twe_txt.getText().equals("Enter College Name"))
        {
            twe_txt.setText("");
            twe_txt.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_twe_txtFocusGained

    private void gradu_txtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gradu_txtFocusGained
        // TODO add your handling code here:
        if(gradu_txt.getText().equals("Enter University Name"))
        {
            gradu_txt.setText("");
            gradu_txt.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_gradu_txtFocusGained

    private void tenper_txtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tenper_txtFocusGained
        // TODO add your handling code here:
        if(tenper_txt.getText().equals("Enter Percentage"))
        {
            tenper_txt.setText("");
            tenper_txt.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_tenper_txtFocusGained

    private void tweper_txtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tweper_txtFocusGained
        // TODO add your handling code here:
        if(tweper_txt.getText().equals("Enter Percentage"))
        {
            tweper_txt.setText("");
            tweper_txt.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_tweper_txtFocusGained

    private void graper_txtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_graper_txtFocusGained
        // TODO add your handling code here:
        if(graper_txt.getText().equals("Enter Percentage"))
        {
            graper_txt.setText("");
            graper_txt.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_graper_txtFocusGained

    private void tenyear_txtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tenyear_txtFocusGained
        // TODO add your handling code here:
        if(tenyear_txt.getText().equals("Passout Year"))
        {
            tenyear_txt.setText("");
            tenyear_txt.setForeground(new Color(0,0,0));
        }        
    }//GEN-LAST:event_tenyear_txtFocusGained

    private void tweyear_txtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tweyear_txtFocusGained
        // TODO add your handling code here:
        if(tweyear_txt.getText().equals("Passout Year"))
        {
            tweyear_txt.setText("");
            tweyear_txt.setForeground(new Color(0,0,0));
        }  
    }//GEN-LAST:event_tweyear_txtFocusGained

    private void grayear_txtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_grayear_txtFocusGained
        // TODO add your handling code here:
        if(grayear_txt.getText().equals("Passout Year"))
        {
            grayear_txt.setText("");
            grayear_txt.setForeground(new Color(0,0,0));
        }  
    }//GEN-LAST:event_grayear_txtFocusGained

    private void ten_txtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ten_txtFocusLost
        // TODO add your handling code here:
        if(ten_txt.getText().equals(""))
        {
            ten_txt.setText("Enter School Name");
            ten_txt.setForeground(Color.red);
        }
    }//GEN-LAST:event_ten_txtFocusLost

    private void twe_txtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_twe_txtFocusLost
        // TODO add your handling code here:
        if(twe_txt.getText().equals(""))
        {
            twe_txt.setText("Enter College Name");
            twe_txt.setForeground(Color.red);
        }
    }//GEN-LAST:event_twe_txtFocusLost

    private void gradu_txtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gradu_txtFocusLost
        // TODO add your handling code here:
        if(gradu_txt.getText().equals(""))
        {
            gradu_txt.setText("Enter University Name");
            gradu_txt.setForeground(Color.red);
        }
    }//GEN-LAST:event_gradu_txtFocusLost

    private void tenper_txtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tenper_txtFocusLost
        // TODO add your handling code here:
        if(tenper_txt.getText().equals(""))
        {
            tenper_txt.setText("Enter Percentage");
            tenper_txt.setForeground(Color.red);
        }
    }//GEN-LAST:event_tenper_txtFocusLost

    private void tweper_txtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tweper_txtFocusLost
        // TODO add your handling code here:
        if(tweper_txt.getText().equals(""))
        {
            tweper_txt.setText("Enter Percentage");
            tweper_txt.setForeground(Color.red);
        }
    }//GEN-LAST:event_tweper_txtFocusLost

    private void graper_txtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_graper_txtFocusLost
        // TODO add your handling code here:
        if(graper_txt.getText().equals(""))
        {
            graper_txt.setText("Enter Percentage");
            graper_txt.setForeground(Color.red);
        }
    }//GEN-LAST:event_graper_txtFocusLost

    private void tenyear_txtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tenyear_txtFocusLost
        // TODO add your handling code here:
        if(tenyear_txt.getText().equals(""))
        {
            tenyear_txt.setText("Passout Year");
            tenyear_txt.setForeground( Color.red);
        } 
    }//GEN-LAST:event_tenyear_txtFocusLost

    private void tweyear_txtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tweyear_txtFocusLost
        // TODO add your handling code here:
        if(tweyear_txt.getText().equals(""))
        {
            tweyear_txt.setText("Passout Year");
            tweyear_txt.setForeground( Color.red);
        } 
    }//GEN-LAST:event_tweyear_txtFocusLost

    private void grayear_txtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_grayear_txtFocusLost
        // TODO add your handling code here:
        if(grayear_txt.getText().equals(""))
        {
            grayear_txt.setText("Passout Year");
            grayear_txt.setForeground( Color.red);
        } 
    }//GEN-LAST:event_grayear_txtFocusLost

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
            java.util.logging.Logger.getLogger(StudentDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentDetail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea add_txt;
    private javax.swing.JLabel address_lbl;
    private javax.swing.JScrollPane address_txtarea;
    private javax.swing.JButton back_btn;
    private javax.swing.JLabel bg_lbl;
    private javax.swing.JButton close_btn;
    private javax.swing.JTextField cont_txt;
    private javax.swing.JLabel contact_lbl;
    private javax.swing.JLabel date_lbl;
    private javax.swing.JLabel date_lbl1;
    private javax.swing.JLabel email_lbl;
    private javax.swing.JTextField email_txt;
    private javax.swing.JLabel fa_lbl;
    private javax.swing.JTextField fa_txt;
    private javax.swing.JComboBox<String> ge_combo;
    private javax.swing.JLabel gender_lbl;
    private javax.swing.JLabel gradu_lbl;
    private javax.swing.JTextField gradu_txt;
    private javax.swing.JTextField graper_txt;
    private javax.swing.JTextField grayear_txt;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel ma_lbl;
    private javax.swing.JTextField ma_txt;
    private javax.swing.JLabel name_lbl;
    private javax.swing.JTextField name_txt;
    private javax.swing.JTextArea not_txt;
    private javax.swing.JLabel rollno_lbl;
    private javax.swing.JTextField rollno_txt;
    private javax.swing.JButton savenext_btn;
    private javax.swing.JLabel ten_lbl;
    private javax.swing.JTextField ten_txt;
    private javax.swing.JTextField tenper_txt;
    private javax.swing.JTextField tenyear_txt;
    private javax.swing.JTextField twe_txt;
    private javax.swing.JLabel twel_lbl;
    private javax.swing.JTextField tweper_txt;
    private javax.swing.JTextField tweyear_txt;
    private javax.swing.JLabel upque_lbl;
    // End of variables declaration//GEN-END:variables
}

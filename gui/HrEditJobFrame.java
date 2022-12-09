
package TrnPl.gui;

import TrnPl.dao.HrDAO;
import TrnPl.dao.JobDAO;
import TrnPl.pojo.CurrentUser;
import TrnPl.pojo.JobPojo;
import java.awt.Image;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class HrEditJobFrame extends javax.swing.JFrame {

    private JobPojo job;
    public HrEditJobFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        jlblcom.setText(CurrentUser.getName());
        
        Icon im = jlblworld.getIcon();
        ImageIcon icon = (ImageIcon) im;
        Image image = icon.getImage().getScaledInstance(850, 200, Image.SCALE_SMOOTH);
        jlblworld.setIcon(new ImageIcon(image));
        
        Icon jim = jlbljob.getIcon();
        ImageIcon jicon = (ImageIcon) jim;
        Image jimage = jicon.getImage().getScaledInstance(280, 320, Image.SCALE_SMOOTH);
        jlbljob.setIcon(new ImageIcon(jimage));
    }
     public HrEditJobFrame(JobPojo job){
        this(); 
        this.job=job;
        showJobData();
    }
     
     private void showJobData(){
         String CompanyName=""; 
         try{
             CompanyName=HrDAO.getCompanyNameById(job.getHrId());
         }
         catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "SQL Error","DB problem  ",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
            return;
        } 
         lbljobId.setText(job.getJobId());
         txtjobtitle.setText(job.getJobTitle());
         txtcompyname.setText(CompanyName);
         String []allSkills=job.getTags().split(",");
         txtskill1.setText(allSkills[0]);
         txtskill2.setText(allSkills[1]);
         txtskill3.setText(allSkills[2]);
         txtskill4.setText(allSkills[3]);
          
     }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlblworld = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jlblcom = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbljobId = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        txtjobtitle = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtcompyname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txtskill1 = new javax.swing.JTextField();
        txtskill2 = new javax.swing.JTextField();
        txtskill3 = new javax.swing.JTextField();
        txtskill4 = new javax.swing.JTextField();
        jlbljob = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        btnback = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(243, 246, 254));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/transparent logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 60));

        jlblworld.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblworld.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/World-Map.png"))); // NOI18N
        jPanel1.add(jlblworld, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 70, 850, 120));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 195, 850, 8));

        jLabel2.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jLabel2.setText("Welcome ,");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 200, 80, 25));

        jlblcom.setFont(new java.awt.Font("Noteworthy", 1, 16)); // NOI18N
        jPanel1.add(jlblcom, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 300, 25));

        jLabel4.setFont(new java.awt.Font("Noteworthy", 1, 16)); // NOI18N
        jLabel4.setText("Job - ID :-");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 250, 80, 25));

        lbljobId.setFont(new java.awt.Font("Noteworthy", 1, 16)); // NOI18N
        jPanel1.add(lbljobId, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 150, 25));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 280, 620, 10));

        jLabel6.setFont(new java.awt.Font("Noteworthy", 1, 16)); // NOI18N
        jLabel6.setText("Job Title");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 290, 80, 25));

        txtjobtitle.setBackground(new java.awt.Color(173, 192, 234));
        txtjobtitle.setBorder(null);
        jPanel1.add(txtjobtitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 320, 255, 35));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tg_image_915734271.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 285, 35));

        jLabel8.setFont(new java.awt.Font("Noteworthy", 1, 16)); // NOI18N
        jLabel8.setText("Company Name");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 290, 120, 25));

        txtcompyname.setBackground(new java.awt.Color(173, 192, 234));
        txtcompyname.setBorder(null);
        jPanel1.add(txtcompyname, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 320, 255, 35));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tg_image_915734271.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 285, 35));

        jLabel10.setFont(new java.awt.Font("Noteworthy", 1, 16)); // NOI18N
        jLabel10.setText("Skills Required :-");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 380, 150, 25));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 410, 620, 8));

        txtskill1.setBackground(new java.awt.Color(173, 192, 234));
        txtskill1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(txtskill1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 425, 250, 30));

        txtskill2.setBackground(new java.awt.Color(173, 192, 234));
        txtskill2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(txtskill2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 425, 250, 30));

        txtskill3.setBackground(new java.awt.Color(173, 192, 234));
        txtskill3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(txtskill3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 250, 30));

        txtskill4.setBackground(new java.awt.Color(173, 192, 234));
        txtskill4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtskill4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtskill4ActionPerformed(evt);
            }
        });
        jPanel1.add(txtskill4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 470, 250, 30));

        jlbljob.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbljob.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/JobPng.png"))); // NOI18N
        jPanel1.add(jlbljob, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 220, 240, 300));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 530, 850, 8));

        btnback.setBackground(new java.awt.Color(173, 192, 234));
        btnback.setFont(new java.awt.Font("Tempus Sans ITC", 1, 16)); // NOI18N
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        jPanel1.add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 545, 100, 25));

        jButton2.setBackground(new java.awt.Color(173, 192, 234));
        jButton2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 16)); // NOI18N
        jButton2.setText("Save Changes");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 545, 200, 25));

        jButton3.setBackground(new java.awt.Color(173, 192, 234));
        jButton3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 16)); // NOI18N
        jButton3.setText("Logout");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(785, 545, 100, 25));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtskill4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtskill4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtskill4ActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        new HrChangeJobDetilsFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnbackActionPerformed

    private boolean validateInputs(){
        if(txtjobtitle.getText().trim().isEmpty()||txtskill1.getText().trim().isEmpty()||txtskill2.getText().trim().isEmpty()||txtskill3.getText().trim().isEmpty()
                ||txtskill4.getText().trim().isEmpty())
            return false;
        return true;
             
        
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(!validateInputs()){
             JOptionPane.showMessageDialog(null, "Please Fills the all the data","Empty Data",JOptionPane.INFORMATION_MESSAGE);
             return;
        }
         job.setJobTitle(txtjobtitle.getText().trim());
         job.setTags(txtskill1.getText().trim()+","+txtskill2.getText().trim()+","+txtskill3.getText().trim()+","+txtskill4.getText().trim());
         try{
             boolean result=JobDAO.editJobByJobId(job);
             if(result){
                 JOptionPane.showMessageDialog(null, "Job Edited Successfuly","Success",JOptionPane.INFORMATION_MESSAGE);
                 return;
             }
             JOptionPane.showMessageDialog(null, "Job Not Edited","Editing Failed",JOptionPane.INFORMATION_MESSAGE);
         }
         catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "SQL Error","DB problem  ",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
            return;
         }
    }//GEN-LAST:event_jButton2ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HrEditJobFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel jlblcom;
    private javax.swing.JLabel jlbljob;
    private javax.swing.JLabel jlblworld;
    private javax.swing.JLabel lbljobId;
    private javax.swing.JTextField txtcompyname;
    private javax.swing.JTextField txtjobtitle;
    private javax.swing.JTextField txtskill1;
    private javax.swing.JTextField txtskill2;
    private javax.swing.JTextField txtskill3;
    private javax.swing.JTextField txtskill4;
    // End of variables declaration//GEN-END:variables
}

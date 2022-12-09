
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


public class HrAddNewJobFrame extends javax.swing.JFrame {

    
    public HrAddNewJobFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        jlblcom.setText(CurrentUser.getName());
        
         loadData();
        
        
        Icon im = jlblworld.getIcon();
        ImageIcon icon = (ImageIcon) im;
        Image image = icon.getImage().getScaledInstance(840, 200, Image.SCALE_SMOOTH);
        jlblworld.setIcon(new ImageIcon(image));
        
        Icon jim = jlbljob.getIcon();
        ImageIcon jicon = (ImageIcon) jim;
        Image jimage = jicon.getImage().getScaledInstance(280, 300, Image.SCALE_SMOOTH);
        jlbljob.setIcon(new ImageIcon(jimage));
        
    }
    
    private void loadData()
    {
        try{
            lblJobId.setText("Job-"+JobDAO.getNewJobId());
            if(txtcompanyname.getText().trim().isEmpty())
                 txtcompanyname.setText(HrDAO.getCompanyNameById(CurrentUser.getId()));
            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "DB load Error " ,"Error",JOptionPane.ERROR_MESSAGE);
               ex.printStackTrace();
        }
    }
    
    private  boolean validateInput(){
        if(txtjobtitle.getText().trim().isEmpty()||txtskills1.getText().trim().isEmpty()||txtskills2.getText().trim().isEmpty()||
                txtskills3.getText().trim().isEmpty()||txtskills4.getText().trim().isEmpty())
            return false;
        return true;
        
    }
    
    private void clearTxt()
    {
        txtjobtitle.setText("");
        txtskills1.setText("");
        txtskills2.setText("");
        txtskills3.setText("");
        txtskills4.setText("");
        
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
        jLabel3 = new javax.swing.JLabel();
        lblJobId = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        txtjobtitle = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtcompanyname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jlbljob = new javax.swing.JLabel();
        txtskills1 = new javax.swing.JTextField();
        txtskills2 = new javax.swing.JTextField();
        txtskills3 = new javax.swing.JTextField();
        txtskills4 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        btnback = new javax.swing.JButton();
        btnaddjob = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(243, 246, 254));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/transparent logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 50));

        jlblworld.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblworld.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/World-Map.png"))); // NOI18N
        jPanel1.add(jlblworld, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 65, 840, 120));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 190, 835, 8));

        jLabel2.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jLabel2.setText("Welcome ,");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 80, 25));

        jlblcom.setFont(new java.awt.Font("Noteworthy", 1, 16)); // NOI18N
        jPanel1.add(jlblcom, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 300, 25));

        jLabel3.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jLabel3.setText("Job - ID :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 80, 25));

        lblJobId.setFont(new java.awt.Font("Noteworthy", 1, 16)); // NOI18N
        jPanel1.add(lblJobId, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 260, 150, 25));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 295, 610, 8));

        jLabel5.setFont(new java.awt.Font("Noteworthy", 1, 17)); // NOI18N
        jLabel5.setText("Job Titlee");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 100, 25));

        txtjobtitle.setBackground(new java.awt.Color(173, 192, 234));
        txtjobtitle.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtjobtitle.setBorder(null);
        jPanel1.add(txtjobtitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 340, 255, 35));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tg_image_915734271.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 290, 35));

        jLabel7.setFont(new java.awt.Font("Noteworthy", 1, 17)); // NOI18N
        jLabel7.setText("Company Name");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 130, 25));

        txtcompanyname.setBackground(new java.awt.Color(173, 192, 234));
        txtcompanyname.setBorder(null);
        jPanel1.add(txtcompanyname, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 255, 35));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tg_image_915734271.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 340, 285, 35));

        jLabel9.setFont(new java.awt.Font("Noteworthy", 1, 17)); // NOI18N
        jLabel9.setText("Skills Required :-");
        jLabel9.setToolTipText("");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 150, 25));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 610, 8));

        jlbljob.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbljob.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/JobPng.png"))); // NOI18N
        jPanel1.add(jlbljob, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 250, 235, 290));

        txtskills1.setBackground(new java.awt.Color(173, 192, 234));
        jPanel1.add(txtskills1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 250, 30));

        txtskills2.setBackground(new java.awt.Color(173, 192, 234));
        jPanel1.add(txtskills2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, 250, 30));

        txtskills3.setBackground(new java.awt.Color(173, 192, 234));
        jPanel1.add(txtskills3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 250, 30));

        txtskills4.setBackground(new java.awt.Color(173, 192, 234));
        jPanel1.add(txtskills4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 500, 250, 30));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, 840, 8));

        btnback.setBackground(new java.awt.Color(173, 192, 234));
        btnback.setFont(new java.awt.Font("Tempus Sans ITC", 1, 17)); // NOI18N
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        jPanel1.add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 565, 100, 25));

        btnaddjob.setBackground(new java.awt.Color(171, 185, 249));
        btnaddjob.setFont(new java.awt.Font("Tempus Sans ITC", 1, 17)); // NOI18N
        btnaddjob.setText("Add  Job");
        btnaddjob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddjobActionPerformed(evt);
            }
        });
        jPanel1.add(btnaddjob, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 565, 150, 25));

        jButton3.setBackground(new java.awt.Color(171, 185, 249));
        jButton3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 17)); // NOI18N
        jButton3.setText("Logout");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 565, 100, 25));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        new HrJobOptionFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnaddjobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddjobActionPerformed
        if(validateInput()==false)
        {
            JOptionPane.showMessageDialog(null, "Please fills all the fields","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        JobPojo job=new JobPojo();
        job.setJobId(lblJobId.getText().trim());
        job.setJobTitle(txtjobtitle.getText().trim());
        job.setHrId(CurrentUser.getId());
        job.setTags(txtskills1.getText().trim()+","+txtskills2.getText().trim()+","+txtskills3.getText().trim()+","+txtskills4.getText().trim());
        job.setStatus(0);
        try
        {
            boolean result=JobDAO.addNewJob(job);
            if(result)
            {
                JOptionPane.showMessageDialog(null, "Job Added Successfully","Success!",JOptionPane.INFORMATION_MESSAGE);
                clearTxt();
                loadData();
                return;
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Could Not Add the Job","UnSuccessfull?!",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "DB Error " ,"Error",JOptionPane.ERROR_MESSAGE);
               ex.printStackTrace();
        }
                
        
    }//GEN-LAST:event_btnaddjobActionPerformed

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
            java.util.logging.Logger.getLogger(HrAddNewJobFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HrAddNewJobFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HrAddNewJobFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HrAddNewJobFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HrAddNewJobFrame().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddjob;
    private javax.swing.JButton btnback;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
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
    private javax.swing.JLabel lblJobId;
    private javax.swing.JTextField txtcompanyname;
    private javax.swing.JTextField txtjobtitle;
    private javax.swing.JTextField txtskills1;
    private javax.swing.JTextField txtskills2;
    private javax.swing.JTextField txtskills3;
    private javax.swing.JTextField txtskills4;
    // End of variables declaration//GEN-END:variables
}

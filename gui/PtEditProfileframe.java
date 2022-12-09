
package TrnPl.gui;

import TrnPl.dao.ParticipantsDAO;
import TrnPl.dao.UsersDAO;
import TrnPl.pojo.CurrentUser;
import TrnPl.pojo.ParticipantsPojo;
import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class PtEditProfileframe extends javax.swing.JFrame {

    private File file;
    private String oldpwd,npwd,cnfpwd;
    
    public PtEditProfileframe() {
        initComponents();
        this.setLocationRelativeTo(null);
        pwdpanel.setVisible(false);
        resumepanel.setVisible(false);
        
        loadData();
        
        Icon im = jlblworld.getIcon();
        ImageIcon icon = (ImageIcon) im;
        Image image = icon.getImage().getScaledInstance(850, 200, Image.SCALE_SMOOTH);
        jlblworld.setIcon(new ImageIcon(image));
    }

    private void loadData(){
        try{
            ParticipantsPojo pt=ParticipantsDAO.getParticipantById(CurrentUser.getId());
            txtName.setText(pt.getName());
            txtmobileno.setText(pt.getPhone());
            txtAddress.setText(pt.getUserId());
            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "DB Error In Edit Profile" ,"Error",JOptionPane.ERROR_MESSAGE);
               ex.printStackTrace();
        } 
    }
    
    private boolean validateInput(){
        char[]arrOldpwd=txtOldpwd.getPassword();
        char[]arrnpwd=txtnpwd.getPassword();
        char[] arrcnfpwd=txtcnfpwd.getPassword();
        if(arrOldpwd.length==0||arrnpwd.length==0||arrcnfpwd.length==0)
            return false;
        oldpwd=String.valueOf(arrOldpwd);
        npwd=String.valueOf(arrnpwd);
        cnfpwd=String.valueOf(arrcnfpwd);
           return true;
    }
    private boolean matchpassword(){
       return npwd.equals(cnfpwd);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlblworld = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnback = new javax.swing.JButton();
        btnSavechange = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtmobileno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        boxpwd = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        pwdpanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtOldpwd = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtnpwd = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtcnfpwd = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        boxresume = new javax.swing.JCheckBox();
        resumepanel = new javax.swing.JPanel();
        txtfile = new javax.swing.JTextField();
        btnBrowser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(243, 246, 254));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/transparent logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 50));

        jlblworld.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblworld.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/World-Map.png"))); // NOI18N
        jPanel1.add(jlblworld, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 60, 850, 120));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 185, 850, 8));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 520, 855, 10));

        btnback.setBackground(new java.awt.Color(173, 192, 234));
        btnback.setFont(new java.awt.Font("Tempus Sans ITC", 1, 16)); // NOI18N
        btnback.setText("Discard Change");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        jPanel1.add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, 190, 25));

        btnSavechange.setBackground(new java.awt.Color(173, 192, 234));
        btnSavechange.setFont(new java.awt.Font("Tempus Sans ITC", 1, 16)); // NOI18N
        btnSavechange.setText("Save Change");
        btnSavechange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSavechangeActionPerformed(evt);
            }
        });
        jPanel1.add(btnSavechange, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 530, 190, 25));

        jLabel2.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jLabel2.setText("Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 205, 160, 30));

        txtName.setEditable(false);
        txtName.setBackground(new java.awt.Color(173, 192, 234));
        txtName.setBorder(null);
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 240, 260, 30));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tg_image_915734271.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 285, 30));

        jLabel4.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jLabel4.setText("Mobile Number");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 150, 30));

        txtmobileno.setEditable(false);
        txtmobileno.setBackground(new java.awt.Color(173, 192, 234));
        txtmobileno.setBorder(null);
        jPanel1.add(txtmobileno, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 315, 260, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tg_image_915734271.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 315, 285, 30));

        jLabel6.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jLabel6.setText("Email Address");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 355, 150, 30));

        txtAddress.setEditable(false);
        txtAddress.setBackground(new java.awt.Color(173, 192, 234));
        txtAddress.setBorder(null);
        jPanel1.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 390, 260, 30));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tg_image_915734271.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 285, 30));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 850, 10));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 205, 8, 215));

        boxpwd.setBackground(new java.awt.Color(243, 246, 254));
        boxpwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxpwdActionPerformed(evt);
            }
        });
        jPanel1.add(boxpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, -1, -1));

        jLabel8.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jLabel8.setText("Want to Change password");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 205, -1, -1));

        pwdpanel.setBackground(new java.awt.Color(243, 246, 254));
        pwdpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Noteworthy", 1, 16)); // NOI18N
        jLabel9.setText("Current PassWord");
        pwdpanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 10, 150, 35));

        txtOldpwd.setBackground(new java.awt.Color(172, 192, 234));
        txtOldpwd.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtOldpwd.setBorder(null);
        pwdpanel.add(txtOldpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 10, 300, 35));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/2021-12-23 00.04.59.png"))); // NOI18N
        pwdpanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 330, 35));

        jLabel11.setFont(new java.awt.Font("Noteworthy", 1, 16)); // NOI18N
        jLabel11.setText("New PassWord");
        pwdpanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 60, 150, 35));

        txtnpwd.setBackground(new java.awt.Color(172, 192, 234));
        txtnpwd.setBorder(null);
        pwdpanel.add(txtnpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 60, 300, 35));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/2021-12-23 00.04.59.png"))); // NOI18N
        pwdpanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 330, 35));

        jLabel13.setFont(new java.awt.Font("Noteworthy", 1, 16)); // NOI18N
        jLabel13.setText("Re-Enter PassWord");
        pwdpanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 110, 150, 35));

        txtcnfpwd.setBackground(new java.awt.Color(172, 192, 234));
        txtcnfpwd.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtcnfpwd.setBorder(null);
        pwdpanel.add(txtcnfpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 110, 300, 35));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/2021-12-23 00.04.59.png"))); // NOI18N
        pwdpanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 330, 35));

        jPanel1.add(pwdpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 520, 160));

        jLabel15.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jLabel15.setText("Went to Change Resume");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 435, 200, 30));

        boxresume.setBackground(new java.awt.Color(243, 246, 254));
        boxresume.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        boxresume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxresumeActionPerformed(evt);
            }
        });
        jPanel1.add(boxresume, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 435, 20, 30));

        resumepanel.setBackground(new java.awt.Color(243, 246, 254));
        resumepanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtfile.setEditable(false);
        txtfile.setBackground(new java.awt.Color(255, 255, 255));
        resumepanel.add(txtfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 8, 470, 30));

        btnBrowser.setFont(new java.awt.Font("Noteworthy", 1, 16)); // NOI18N
        btnBrowser.setText("Browser");
        btnBrowser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowserActionPerformed(evt);
            }
        });
        resumepanel.add(btnBrowser, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 8, 140, 30));

        jPanel1.add(resumepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 475, 720, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        new UserParticipantsOptionFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnbackActionPerformed

    private void boxpwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxpwdActionPerformed
        if(boxpwd.isSelected()){
            pwdpanel.setVisible(true);
        }
        else
        {
            pwdpanel.setVisible(false);
        }
        
    }//GEN-LAST:event_boxpwdActionPerformed

    private void boxresumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxresumeActionPerformed
        // TODO add your handling code here:
        if(boxresume.isSelected()){
            resumepanel.setVisible(true);
        }
        else{
            resumepanel.setVisible(false);
            
        }
    }//GEN-LAST:event_boxresumeActionPerformed

    private void btnBrowserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowserActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser=new JFileChooser();
       fileChooser.setDialogTitle("select you resume");
       
       fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
       int result=fileChooser.showOpenDialog(null);
       if(result==JFileChooser.APPROVE_OPTION){
           file=fileChooser.getSelectedFile();
           txtfile.setText(file.getName());
           
       }
    }//GEN-LAST:event_btnBrowserActionPerformed

    private void btnSavechangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSavechangeActionPerformed
        boolean PasswordChange=false,ResumeUpdate=false;
        if(boxpwd.isSelected()){
            if(validateInput()==false){
                JOptionPane.showMessageDialog(null, "Please fill All the Fileds","Empty Fileds",JOptionPane.WARNING_MESSAGE);
                return;
            }
            if(matchpassword()==false){
                JOptionPane.showMessageDialog(null, "Password and Confrom Password Not Match","Password Mismatching",JOptionPane.WARNING_MESSAGE);
                return;
            }
            try{
                boolean resp=UsersDAO.checkOldPassword( CurrentUser.getId(), oldpwd);
                PasswordChange=true;
                if(resp==true){
                    UsersDAO.updateParticipantPassword(CurrentUser.getId(), npwd);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Old Password is Rong Please \nInput Currect password","Empty Fileds",JOptionPane.WARNING_MESSAGE);
                }
            }
            catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "DB Error In Change Password" ,"Error",JOptionPane.ERROR_MESSAGE);
               ex.printStackTrace();
        } 
        }
        
        //your code resume seleted 
        if(boxresume.isSelected()){
            if(txtfile.getText().trim()!=""){
                try{
                ParticipantsDAO.updateResume(CurrentUser.getId(), file);
                ResumeUpdate=true;
            }
            catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "DB Error In Change Password" ,"Error",JOptionPane.ERROR_MESSAGE);
               ex.printStackTrace();
        } 
           catch(FileNotFoundException ex){
           JOptionPane.showMessageDialog(null, "File Error In Change Resume" ,"Error",JOptionPane.ERROR_MESSAGE);
           ex.printStackTrace();
        } 
      }
      }  
        if(PasswordChange && ResumeUpdate){
            JOptionPane.showMessageDialog(null," Password and Resume Update Successfully" ,"Success",JOptionPane.   INFORMATION_MESSAGE);
        }
        else if(PasswordChange){
            JOptionPane.showMessageDialog(null," Password  Update Successfully" ,"Success",JOptionPane.   INFORMATION_MESSAGE);
        }
        else if(ResumeUpdate){
            JOptionPane.showMessageDialog(null," P Resume Update Successfully" ,"Success",JOptionPane.   INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null," No Change Done!" ,"Message!",JOptionPane.   INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_btnSavechangeActionPerformed

    
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
            java.util.logging.Logger.getLogger(PtEditProfileframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PtEditProfileframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PtEditProfileframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PtEditProfileframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PtEditProfileframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox boxpwd;
    private javax.swing.JCheckBox boxresume;
    private javax.swing.JButton btnBrowser;
    private javax.swing.JButton btnSavechange;
    private javax.swing.JButton btnback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JLabel jlblworld;
    private javax.swing.JPanel pwdpanel;
    private javax.swing.JPanel resumepanel;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtOldpwd;
    private javax.swing.JPasswordField txtcnfpwd;
    private javax.swing.JTextField txtfile;
    private javax.swing.JTextField txtmobileno;
    private javax.swing.JPasswordField txtnpwd;
    // End of variables declaration//GEN-END:variables
}

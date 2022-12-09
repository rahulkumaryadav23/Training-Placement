
package TrnPl.gui;

import TrnPl.dao.ParticipantsDAO;
import TrnPl.pojo.ParticipantsPojo;
import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class UserSingUpFrame extends javax.swing.JFrame {

    private File file;
    private String pwd;
    private String cnfpwd;
    
    
    public UserSingUpFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        loadId();
                
        Icon im = jlblworld.getIcon();
        ImageIcon icon = (ImageIcon) im;
        Image image = icon.getImage().getScaledInstance(900, 200, Image.SCALE_SMOOTH);
        jlblworld.setIcon(new ImageIcon(image));
    }
    
    private void loadId(){
        try{
            int pId=ParticipantsDAO.getNewParticipantsId();
            lblpid.setText("P-"+pId);
            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "DB Error","Error in generatinh HrId",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
    
    private boolean validateInput(){
       //  char[]chpwd=txtPassword.getPassword();
       // char[]chnfPwd=txtconfrompass.getPassword();

        pwd=String.valueOf(txtPassword.getPassword());
        cnfpwd=String.valueOf(txtconfrompass.getPassword());
        
        if(txtName.getText().trim().isEmpty()||txtEmail.getText().trim().isEmpty()||txtMobile.getText().trim().isEmpty()||pwd.isEmpty()||
                txtskills1.getText().trim().isEmpty()||txtskills2.getText().trim().isEmpty()||txtskills3.getText().trim().isEmpty()||txtskills4.getText().trim().isEmpty()||
                lblfile.getText().trim().isEmpty()||txtqulification.getText().trim().isEmpty())
        
        return false;
        return true;
        
    }
    
     private boolean matchPasswords(){
        //pwd =String.valueOf(txtPassword.getPassword());
        //cnfpwd=String.valueOf(txtconfrompass.getPassword());
        return pwd.equals(cnfpwd);

        
    }
     
    private void clearAll()
    {
        txtName.setText("");
        txtEmail.setText("");
        txtMobile.setText("");
        lblfile.setText("");
        txtskills1.setText("");
        txtskills2.setText("");
        txtskills3.setText("");
        txtskills4.setText("");
        txtqulification.setText("");
        txtPassword.setText("");
        txtconfrompass.setText("");
        
    }
    
   
      

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlblworld = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        lblpid = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtMobile = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        browsefile = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        txtskills1 = new javax.swing.JTextField();
        txtskills2 = new javax.swing.JTextField();
        txtskills3 = new javax.swing.JTextField();
        txtskills4 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        txtqulification = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtconfrompass = new javax.swing.JPasswordField();
        jLabel17 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        btnlogin = new javax.swing.JButton();
        btncreateAccount = new javax.swing.JButton();
        lblfile = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(243, 249, 252));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/transparent logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 50));

        jlblworld.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblworld.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/World-Map.png"))); // NOI18N
        jPanel1.add(jlblworld, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 65, 900, 120));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 900, 8));

        jLabel2.setFont(new java.awt.Font("Noteworthy", 1, 16)); // NOI18N
        jLabel2.setText("Participant Id:-");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 105, 25));

        lblpid.setFont(new java.awt.Font("Noteworthy", 1, 16)); // NOI18N
        jPanel1.add(lblpid, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 200, 25));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 325, 8));

        jLabel4.setFont(new java.awt.Font("Noteworthy", 1, 16)); // NOI18N
        jLabel4.setText("Name:-");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 90, 25));

        txtName.setBackground(new java.awt.Color(172, 192, 234));
        txtName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtName.setBorder(null);
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 270, 405, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tg_image_1147698449.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 440, 30));

        jLabel6.setFont(new java.awt.Font("Noteworthy", 1, 16)); // NOI18N
        jLabel6.setText("Email :-");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 70, 25));

        txtEmail.setBackground(new java.awt.Color(172, 192, 234));
        txtEmail.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtEmail.setBorder(null);
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 270, 410, 30));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tg_image_1147698449.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 270, 440, 30));

        txtMobile.setBackground(new java.awt.Color(172, 192, 234));
        txtMobile.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtMobile.setBorder(null);
        jPanel1.add(txtMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 340, 405, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tg_image_1147698449.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 440, 30));

        jLabel9.setFont(new java.awt.Font("Noteworthy", 1, 16)); // NOI18N
        jLabel9.setText("Mobile Number :-");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 150, 25));

        jLabel10.setFont(new java.awt.Font("Noteworthy", 1, 16)); // NOI18N
        jLabel10.setText("Upload Resume :-");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, 200, 25));

        browsefile.setBackground(new java.awt.Color(204, 204, 255));
        browsefile.setFont(new java.awt.Font("Noteworthy", 1, 14)); // NOI18N
        browsefile.setText("Browse File");
        browsefile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browsefileActionPerformed(evt);
            }
        });
        jPanel1.add(browsefile, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 340, 115, 30));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 385, 915, 8));

        jLabel11.setFont(new java.awt.Font("Noteworthy", 1, 16)); // NOI18N
        jLabel11.setText("Skills :-");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 395, 100, 25));

        txtskills1.setBackground(new java.awt.Color(172, 192, 234));
        txtskills1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtskills1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.add(txtskills1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 425, 195, 30));

        txtskills2.setBackground(new java.awt.Color(172, 192, 234));
        txtskills2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtskills2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.add(txtskills2, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 425, 195, 30));

        txtskills3.setBackground(new java.awt.Color(172, 192, 234));
        txtskills3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtskills3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtskills3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtskills3ActionPerformed(evt);
            }
        });
        jPanel1.add(txtskills3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 425, 195, 30));

        txtskills4.setBackground(new java.awt.Color(172, 192, 234));
        txtskills4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtskills4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtskills4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtskills4ActionPerformed(evt);
            }
        });
        jPanel1.add(txtskills4, new org.netbeans.lib.awtextra.AbsoluteConstraints(745, 425, 195, 30));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 470, 910, 10));

        jLabel13.setFont(new java.awt.Font("Noteworthy", 1, 16)); // NOI18N
        jLabel13.setText("Qualification :-");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 150, 25));

        txtqulification.setBackground(new java.awt.Color(172, 192, 234));
        txtqulification.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtqulification.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtqulification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtqulificationActionPerformed(evt);
            }
        });
        jPanel1.add(txtqulification, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 900, 30));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 550, 910, 8));

        jLabel14.setFont(new java.awt.Font("Noteworthy", 1, 16)); // NOI18N
        jLabel14.setText("PassWord :-");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, 150, 25));

        txtPassword.setBackground(new java.awt.Color(172, 192, 234));
        txtPassword.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtPassword.setBorder(null);
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 590, 405, 30));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tg_image_1147698449.png"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 590, 440, 30));

        jLabel16.setFont(new java.awt.Font("Noteworthy", 1, 16)); // NOI18N
        jLabel16.setText("Confrom PassWord :-");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 560, 200, 25));

        txtconfrompass.setBackground(new java.awt.Color(172, 192, 234));
        txtconfrompass.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtconfrompass.setBorder(null);
        jPanel1.add(txtconfrompass, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 590, 405, 30));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tg_image_1147698449.png"))); // NOI18N
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 590, 440, 30));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 630, 910, 8));

        btnlogin.setBackground(new java.awt.Color(172, 192, 234));
        btnlogin.setFont(new java.awt.Font("Tempus Sans ITC", 1, 16)); // NOI18N
        btnlogin.setText("Login Page");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        jPanel1.add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 640, 200, 25));

        btncreateAccount.setBackground(new java.awt.Color(172, 192, 234));
        btncreateAccount.setFont(new java.awt.Font("Tempus Sans ITC", 1, 16)); // NOI18N
        btncreateAccount.setText("Create Account");
        btncreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncreateAccountActionPerformed(evt);
            }
        });
        jPanel1.add(btncreateAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 640, 200, 25));

        lblfile.setBackground(new java.awt.Color(172, 192, 234));
        lblfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblfileActionPerformed(evt);
            }
        });
        jPanel1.add(lblfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, 315, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtskills4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtskills4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtskills4ActionPerformed

    private void txtskills3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtskills3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtskills3ActionPerformed

    private void txtqulificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtqulificationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtqulificationActionPerformed

    private void browsefileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browsefileActionPerformed
       JFileChooser fileChooser=new JFileChooser();
       fileChooser.setDialogTitle("select you resume");
       
       fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
       int result=fileChooser.showOpenDialog(null);
       if(result==JFileChooser.APPROVE_OPTION){
           file=fileChooser.getSelectedFile();
           lblfile.setText(file.getName());
           
       }
    }//GEN-LAST:event_browsefileActionPerformed

    private void btncreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreateAccountActionPerformed
        if(validateInput()==false){
            JOptionPane.showMessageDialog(null, "Please input all the fields","Incompleted Data!",JOptionPane.WARNING_MESSAGE);
            return;
            
        }
        if(matchPasswords()==false){
            JOptionPane.showMessageDialog(null, "Password do not match ","Mismatched Password!",JOptionPane.WARNING_MESSAGE);
            return;
        }
        try{
            ParticipantsPojo pt=new ParticipantsPojo();
            pt.setpId(lblpid.getText().trim());
            pt.setUserId(txtEmail.getText().trim().toUpperCase());
            pt.setName(txtName.getText().trim());
            pt.setPhone(txtMobile.getText().trim());
            pt.setResume(file);
            pt.setSkills(txtskills1.getText().trim()+","+txtskills2.getText().trim()+","+txtskills3.getText().trim()+","+txtskills4.getText().trim());
            pt.setQulification(txtqulification.getText().trim());
            pt.setPassword(pwd);
            pt.setType("Student");
            int result=ParticipantsDAO.addNewParticipant(pt);
            
            if(result==1){
                JOptionPane.showMessageDialog(null, "Participants Added Sucessfully ! ","Success",JOptionPane.INFORMATION_MESSAGE);
                clearAll();
                loadId();
                return;
            }
            else if(result==-1){
                JOptionPane.showMessageDialog(null, "Email-Id Already taken!","Registraion Failed!",JOptionPane.ERROR_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null, "Cannot Add the Record! ","Registraion Failed!",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "SQL Error","DB probleam",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        catch(FileNotFoundException ex){
            JOptionPane.showMessageDialog(null, "File Error","File probleam",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
            return;
        }
    }//GEN-LAST:event_btncreateAccountActionPerformed

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        new AdminLogginFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnloginActionPerformed

    private void lblfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblfileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblfileActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserSingUpFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browsefile;
    private javax.swing.JButton btncreateAccount;
    private javax.swing.JButton btnlogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel jlblworld;
    private javax.swing.JTextField lblfile;
    private javax.swing.JLabel lblpid;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtconfrompass;
    private javax.swing.JTextField txtqulification;
    private javax.swing.JTextField txtskills1;
    private javax.swing.JTextField txtskills2;
    private javax.swing.JTextField txtskills3;
    private javax.swing.JTextField txtskills4;
    // End of variables declaration//GEN-END:variables
}

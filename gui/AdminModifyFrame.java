
package TrnPl.gui;

import TrnPl.dao.UsersDAO;
import TrnPl.pojo.CurrentUser;
import TrnPl.pojo.HrPojo;
import java.awt.Image;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import sun.security.util.Password;


public class AdminModifyFrame extends javax.swing.JFrame {

    private Map <String, HrPojo> allHr;
    
     private String Password;
        
    public AdminModifyFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        jlblcom.setText("Welcome ,"+CurrentUser.getName());
        
       
        loadHrDetails();
        
        Icon im = jlblworld.getIcon();
        ImageIcon icon = (ImageIcon) im;
        Image image = icon.getImage().getScaledInstance(840, 200, Image.SCALE_SMOOTH);
        jlblworld.setIcon(new ImageIcon(image));
    }
       private boolean validateInput(){
         char [] pwd=txtpwd.getPassword();
         char[] repwd=txtconfrompwd.getPassword();
    if(pwd.length<4 || repwd.length<4 )
    {
        JOptionPane.showMessageDialog(null, "Password must be atleast four digit logn");
        return false;
        
    }
    Password=String.valueOf(pwd);
    String confirmpass=String.valueOf(repwd);
    if(Password.equals(confirmpass)==false)
    {
        JOptionPane.showMessageDialog(null, "Password not matching!");
        return false;
    }
    return true;
}
private void clearText(){
    txtpwd.setText("");
    txtconfrompwd.setText("");
    jcAllUserId.setSelectedIndex(0);
    
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlblworld = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jlblcom = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jcAllUserId = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txthrid = new javax.swing.JTextField();
        jlblHrId = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jlblname = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtpwd = new javax.swing.JPasswordField();
        jlblnewpsd = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtconfrompwd = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnback = new javax.swing.JButton();
        btnmodify = new javax.swing.JButton();
        btnlogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(243, 246, 254));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/transparent logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 50));

        jlblworld.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblworld.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/World-Map.png"))); // NOI18N
        jPanel1.add(jlblworld, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 60, 840, 120));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 185, 835, 8));

        jlblcom.setFont(new java.awt.Font("Noteworthy", 1, 16)); // NOI18N
        jPanel1.add(jlblcom, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 600, 25));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/modify-emp.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 165, 185));

        jLabel4.setFont(new java.awt.Font("Noteworthy", 1, 16)); // NOI18N
        jLabel4.setText("User Id");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 100, 25));

        jcAllUserId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcAllUserIdActionPerformed(evt);
            }
        });
        jPanel1.add(jcAllUserId, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 270, 30));

        jLabel5.setFont(new java.awt.Font("Noteworthy", 1, 16)); // NOI18N
        jLabel5.setText("Hr Id");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, 70, 25));

        txthrid.setEditable(false);
        txthrid.setBackground(new java.awt.Color(172, 192, 234));
        txthrid.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        txthrid.setBorder(null);
        jPanel1.add(txthrid, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 280, 260, 30));

        jlblHrId.setBackground(new java.awt.Color(172, 192, 234));
        jlblHrId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlblHrId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblHrId.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tg_image_915734271.png"))); // NOI18N
        jPanel1.add(jlblHrId, new org.netbeans.lib.awtextra.AbsoluteConstraints(595, 280, -1, 30));

        txtname.setEditable(false);
        txtname.setBackground(new java.awt.Color(172, 192, 234));
        txtname.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtname.setBorder(null);
        jPanel1.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 260, 30));

        jlblname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblname.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tg_image_915734271.png"))); // NOI18N
        jPanel1.add(jlblname, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, 285, 30));

        jLabel7.setFont(new java.awt.Font("Noteworthy", 1, 16)); // NOI18N
        jLabel7.setText("Hr Name");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 80, 25));

        jLabel9.setFont(new java.awt.Font("Noteworthy", 1, 16)); // NOI18N
        jLabel9.setText("New Password");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 120, 25));

        txtpwd.setBackground(new java.awt.Color(172, 192, 234));
        txtpwd.setBorder(null);
        jPanel1.add(txtpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 440, 260, 30));

        jlblnewpsd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblnewpsd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tg_image_915734271.png"))); // NOI18N
        jPanel1.add(jlblnewpsd, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, 285, 30));

        jLabel10.setFont(new java.awt.Font("Noteworthy", 1, 16)); // NOI18N
        jLabel10.setText("Conform Password");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 410, 150, 25));

        txtconfrompwd.setBackground(new java.awt.Color(173, 192, 234));
        txtconfrompwd.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtconfrompwd.setBorder(null);
        jPanel1.add(txtconfrompwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(607, 440, 260, 30));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tg_image_915734271.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(595, 440, 285, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 840, 10));

        btnback.setBackground(new java.awt.Color(172, 192, 234));
        btnback.setFont(new java.awt.Font("Tempus Sans ITC", 1, 16)); // NOI18N
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        jPanel1.add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 100, 25));

        btnmodify.setBackground(new java.awt.Color(172, 192, 234));
        btnmodify.setFont(new java.awt.Font("Tempus Sans ITC", 1, 15)); // NOI18N
        btnmodify.setText("Modify Change Of Hr");
        btnmodify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodifyActionPerformed(evt);
            }
        });
        jPanel1.add(btnmodify, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 500, 220, 25));

        btnlogout.setBackground(new java.awt.Color(172, 192, 234));
        btnlogout.setFont(new java.awt.Font("Tempus Sans ITC", 1, 16)); // NOI18N
        btnlogout.setText("Logout");
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 500, 100, 25));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcAllUserIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcAllUserIdActionPerformed
        // TODO add your handling code here:
        String userId=(String)jcAllUserId.getSelectedItem();
        HrPojo hr=allHr.get(userId);
        txthrid.setText(hr.getHrId());
        txtname.setText(hr.getHrName());
    }//GEN-LAST:event_jcAllUserIdActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        new AdminHrModuleFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnmodifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodifyActionPerformed
        
        if(!validateInput())
        {
            return;
        }
        try{
            boolean results=UsersDAO.updatePwd( jcAllUserId.getSelectedItem().toString(), Password);
            if(results){
                JOptionPane.showMessageDialog(null, "Password changed successfully ","Done",JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Sorry! could not changed Password ","Unsuccessful",JOptionPane.ERROR_MESSAGE);
            }
            clearText();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "DB Error " ,"Error",JOptionPane.ERROR_MESSAGE);
               ex.printStackTrace();
        } catch (Exception ex) {
            Logger.getLogger(AdminModifyFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
           
    }//GEN-LAST:event_btnmodifyActionPerformed

        
      
    
    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        // TODO add your handling code here:
        new AdminLogginFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnlogoutActionPerformed
    
    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminModifyFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnmodify;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox<String> jcAllUserId;
    private javax.swing.JLabel jlblHrId;
    private javax.swing.JLabel jlblcom;
    private javax.swing.JLabel jlblname;
    private javax.swing.JLabel jlblnewpsd;
    private javax.swing.JLabel jlblworld;
    private javax.swing.JPasswordField txtconfrompwd;
    private javax.swing.JTextField txthrid;
    private javax.swing.JTextField txtname;
    private javax.swing.JPasswordField txtpwd;
    // End of variables declaration//GEN-END:variables

    private void loadHrDetails() {
        try{
            allHr=UsersDAO.getHrList();
            Set <String> keys=allHr.keySet();
            
            for(String userId:keys)
            {
                jcAllUserId.addItem(userId);
                
            }
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "DB Error " ,"Error",JOptionPane.ERROR_MESSAGE);
               ex.printStackTrace();
        }
    }

    
}

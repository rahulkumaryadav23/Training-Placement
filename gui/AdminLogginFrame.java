
package TrnPl.gui;

import TrnPl.dao.UsersDAO;
import TrnPl.pojo.CurrentUser;
import TrnPl.pojo.UserPojo;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class AdminLogginFrame extends javax.swing.JFrame {

    
    private String userId;                                                                           
    private String password; 
    public AdminLogginFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        
        Icon hm=jlbllogi.getIcon();
        ImageIcon hmicon=(ImageIcon)hm;
        Image hmimage=hmicon.getImage().getScaledInstance(450, 400, Image.SCALE_SMOOTH);
        jlbllogi.setIcon(new ImageIcon (hmimage));
    }
        private String validateUser()
    {
        if(jrbAdmin.isSelected())
            return "Admin";
        else if(jrbHr.isSelected())
            return "Hr";
        else if(jrbStudent.isSelected())
            return "Student";
        else
            return null;
    }
    private boolean validateInputs()
    {
        userId=jtxtMail.getText().trim();
        char [] pwd=jpaswd.getPassword();
        if(userId.isEmpty()||pwd.length==0)
            return false;
        password=String.valueOf(pwd); 
        return true;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtxtMail = new javax.swing.JTextField();
        jpaswd = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jlblemail = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnsingup = new javax.swing.JButton();
        jlbllogi = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jrbAdmin = new javax.swing.JRadioButton();
        jrbHr = new javax.swing.JRadioButton();
        jrbStudent = new javax.swing.JRadioButton();
        btnLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(243, 249, 249));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/transparent logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, -1));

        jtxtMail.setBackground(new java.awt.Color(172, 192, 234));
        jtxtMail.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jtxtMail.setBorder(null);
        jtxtMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtMailActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 190, 300, 30));

        jpaswd.setBackground(new java.awt.Color(172, 192, 234));
        jpaswd.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jpaswd.setBorder(null);
        jpaswd.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jpaswd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpaswdActionPerformed(evt);
            }
        });
        jPanel1.add(jpaswd, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 290, 300, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/2021-12-23 00.04.59.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 330, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/2021-12-23 00.04.59.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 340, 30));

        jlblemail.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jlblemail.setText("Email or User Id:");
        jPanel1.add(jlblemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 160, 20));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 350, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 350, 10));

        btnsingup.setBackground(new java.awt.Color(172, 192, 234));
        btnsingup.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        btnsingup.setText("Sing Up");
        btnsingup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsingupActionPerformed(evt);
            }
        });
        jPanel1.add(btnsingup, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, 110, 25));

        jlbllogi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/homePage2.jpg"))); // NOI18N
        jPanel1.add(jlbllogi, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 450, 390));

        jLabel3.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jLabel3.setText("Password:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 120, 30));

        jLabel5.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jLabel5.setText("Select User Type:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 150, 30));

        jrbAdmin.setBackground(new java.awt.Color(243, 249, 249));
        buttonGroup1.add(jrbAdmin);
        jrbAdmin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jrbAdmin.setText("Admin");
        jPanel1.add(jrbAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, -1));

        jrbHr.setBackground(new java.awt.Color(243, 249, 249));
        buttonGroup1.add(jrbHr);
        jrbHr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jrbHr.setText("Company Hr");
        jPanel1.add(jrbHr, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, -1, -1));

        jrbStudent.setBackground(new java.awt.Color(243, 249, 249));
        buttonGroup1.add(jrbStudent);
        jrbStudent.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jrbStudent.setText("User");
        jPanel1.add(jrbStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 390, -1, -1));

        btnLogin.setBackground(new java.awt.Color(172, 192, 234));
        btnLogin.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 110, 25));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtMailActionPerformed

    private void jpaswdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpaswdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpaswdActionPerformed

    private void btnsingupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsingupActionPerformed
        new UserSingUpFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnsingupActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
            if(validateInputs()==false)
        {
            JOptionPane.showMessageDialog(null, "Please fill all the fields ","Error",JOptionPane.ERROR_MESSAGE );
            return;
        }
        String type=validateUser();
        if(type==null)
        {
            JOptionPane.showMessageDialog(null, "Please select the user type ","Error",JOptionPane.ERROR_MESSAGE );
            return;
        }
        UserPojo user=new UserPojo ();
        user.setUserid(userId.toUpperCase());
        user.setPassword(password);
        user.setType(type);
         try
         {
              boolean result=UsersDAO.validateUsers(user);
             if(result)
             {
                 if(CurrentUser.getType().equals("Admin"))
                 {
                     JOptionPane.showMessageDialog(null, "Welcome Admin "+ CurrentUser.getName(),"Sucess",JOptionPane.INFORMATION_MESSAGE);
                     new AdminOptionFrame().setVisible(result);
                     this.dispose();
                 }
               else if (CurrentUser.getType().equals("Hr"))
                       {
                        JOptionPane.showMessageDialog(null, "Welcome Hr "+ CurrentUser.getName(),"Sucess",JOptionPane.INFORMATION_MESSAGE);
                     new HrOptionFrame().setVisible(true);
                     this.dispose();
                       } 
                      else
                         {
                         JOptionPane.showMessageDialog(null, "Welcome Student "+ CurrentUser.getName(),"Sucess",JOptionPane.INFORMATION_MESSAGE);
                     new UserParticipantsOptionFrame().setVisible(result);
                     
                     this.dispose();
                         }
               
             }
             else
             {
                 JOptionPane.showMessageDialog(null, "Invalid a User Id or Password or User type" ,"Error",JOptionPane.ERROR_MESSAGE);
                 return;
             }
         }
         catch( Exception ex)
         {
             JOptionPane.showMessageDialog(null, "DB Error " ,"Error",JOptionPane.ERROR_MESSAGE);
               ex.printStackTrace();
         } 
         
        
    
    }//GEN-LAST:event_btnLoginActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnsingup;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jlblemail;
    private javax.swing.JLabel jlbllogi;
    private javax.swing.JPasswordField jpaswd;
    private javax.swing.JRadioButton jrbAdmin;
    private javax.swing.JRadioButton jrbHr;
    private javax.swing.JRadioButton jrbStudent;
    private javax.swing.JTextField jtxtMail;
    // End of variables declaration//GEN-END:variables
}

package TrnPl.gui;

import TrnPl.dao.HrDAO;
import TrnPl.pojo.CurrentUser;
import TrnPl.pojo.HrPojo;
import java.awt.Image;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class AdminAddNewHrFrame extends javax.swing.JFrame {

    private String password;
    private String confrmpwd;
    public AdminAddNewHrFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        jlblcom.setText("Welcome ,"+CurrentUser.getName());
        loadId();

        Icon im = jlblworld.getIcon();
        ImageIcon icon = (ImageIcon) im;
        Image image = icon.getImage().getScaledInstance(840, 200, Image.SCALE_SMOOTH);
        jlblworld.setIcon(new ImageIcon(image));
        
        Icon addim = jlbladdim.getIcon();
        ImageIcon addicon = (ImageIcon) addim;
        Image addimage = addicon.getImage().getScaledInstance(150, 160, Image.SCALE_SMOOTH);
        jlbladdim.setIcon(new ImageIcon(addimage));
        
        
    }
    private void loadId(){
        try{
            int hrId=HrDAO.getNewHrId();
            jlblhrid.setText("HR-"+hrId);
            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "DB Error","Error in generatinh HrId",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
private boolean validateInputs()
    {
        password=String.valueOf(jfpass.getPassword());
        confrmpwd=String.valueOf(jfcompass.getPassword());
        int Index=jcmProffession.getSelectedIndex();
        if(txtName.getText().isEmpty()||txtCompany.getText().isEmpty()||txtEmail.getText().isEmpty()||jtxtMobile.getText().isEmpty() 
              ||password.isEmpty()||confrmpwd.isEmpty()||Index==0 )
            return false;
          return true;
    
    }

private boolean matchPassword(){
    return password.equals(confrmpwd);
    
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlblworld = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jlblcom = new javax.swing.JLabel();
        jlbladdim = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jlblhrid = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jlblname = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jlblemail = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtxtMobile = new javax.swing.JTextField();
        jlblMob = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jcmProffession = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jfpass = new javax.swing.JPasswordField();
        jlblpass = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jfcompass = new javax.swing.JPasswordField();
        jlblcmpass = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jbtnback = new javax.swing.JButton();
        btnaddnewhr = new javax.swing.JButton();
        jbtnlogout = new javax.swing.JButton();
        txtCompany = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(243, 249, 249));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/transparent logo.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 50));

        jlblworld.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/World-Map.png"))); // NOI18N
        jPanel2.add(jlblworld, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 60, 840, 120));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 185, 840, 8));

        jlblcom.setFont(new java.awt.Font("Noteworthy", 1, 16)); // NOI18N
        jPanel2.add(jlblcom, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 620, 30));

        jlbladdim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/addNewEmp.png"))); // NOI18N
        jlbladdim.setText("jLabel3");
        jPanel2.add(jlbladdim, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 150, 160));

        jLabel3.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jLabel3.setText("Hr Id:-");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 60, 25));

        jlblhrid.setFont(new java.awt.Font("Tempus Sans ITC", 1, 17)); // NOI18N
        jPanel2.add(jlblhrid, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 100, 25));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 255, 130, 5));

        jLabel5.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jLabel5.setText("Company Name:-");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 140, 25));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 255, 180, 5));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 265, 630, 8));

        jLabel7.setFont(new java.awt.Font("Noteworthy", 1, 16)); // NOI18N
        jLabel7.setText("Name");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 275, 60, 20));

        txtName.setBackground(new java.awt.Color(172, 192, 234));
        txtName.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtName.setBorder(null);
        jPanel2.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 300, 260, 30));

        jlblname.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tg_image_915734271.png"))); // NOI18N
        jPanel2.add(jlblname, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, -1, 30));

        jLabel8.setFont(new java.awt.Font("Noteworthy", 1, 16)); // NOI18N
        jLabel8.setText("Email");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 270, 80, 25));

        txtEmail.setBackground(new java.awt.Color(172, 192, 234));
        txtEmail.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtEmail.setBorder(null);
        jPanel2.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(603, 300, 260, 30));

        jlblemail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tg_image_915734271.png"))); // NOI18N
        jlblemail.setText("jLabel9");
        jPanel2.add(jlblemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, 290, 30));

        jLabel9.setFont(new java.awt.Font("Noteworthy", 1, 16)); // NOI18N
        jLabel9.setText("Mobile No .");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 100, 25));

        jtxtMobile.setBackground(new java.awt.Color(172, 192, 234));
        jtxtMobile.setBorder(null);
        jPanel2.add(jtxtMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 375, 260, 30));

        jlblMob.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tg_image_915734271.png"))); // NOI18N
        jPanel2.add(jlblMob, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 375, 290, 30));

        jLabel10.setFont(new java.awt.Font("Noteworthy", 1, 16)); // NOI18N
        jLabel10.setText("Proffession in ");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 350, 160, 25));

        jcmProffession.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Perffesion ", "Developer", "Web Desinge", " " }));
        jPanel2.add(jcmProffession, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 375, 285, 30));

        jLabel11.setFont(new java.awt.Font("Noteworthy", 1, 16)); // NOI18N
        jLabel11.setText("Password ");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, 100, 25));

        jfpass.setBackground(new java.awt.Color(172, 192, 234));
        jfpass.setBorder(null);
        jPanel2.add(jfpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 447, 260, 30));

        jlblpass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tg_image_915734271.png"))); // NOI18N
        jPanel2.add(jlblpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 447, 285, 30));

        jLabel12.setFont(new java.awt.Font("Noteworthy", 1, 16)); // NOI18N
        jLabel12.setText("Conform Password");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 420, 160, 25));

        jfcompass.setBackground(new java.awt.Color(172, 192, 234));
        jfcompass.setBorder(null);
        jPanel2.add(jfcompass, new org.netbeans.lib.awtextra.AbsoluteConstraints(603, 447, 260, 30));

        jlblcmpass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tg_image_915734271.png"))); // NOI18N
        jPanel2.add(jlblcmpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 447, 290, 30));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 510, 840, 8));

        jbtnback.setBackground(new java.awt.Color(171, 185, 249));
        jbtnback.setFont(new java.awt.Font("Tempus Sans ITC", 1, 17)); // NOI18N
        jbtnback.setText("Back");
        jbtnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnbackActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 520, 100, 25));

        btnaddnewhr.setBackground(new java.awt.Color(171, 185, 249));
        btnaddnewhr.setFont(new java.awt.Font("Tempus Sans ITC", 1, 17)); // NOI18N
        btnaddnewhr.setText("Add New Hr");
        btnaddnewhr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddnewhrActionPerformed(evt);
            }
        });
        jPanel2.add(btnaddnewhr, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 520, 150, 25));

        jbtnlogout.setBackground(new java.awt.Color(171, 185, 249));
        jbtnlogout.setFont(new java.awt.Font("Tempus Sans ITC", 1, 17)); // NOI18N
        jbtnlogout.setText("Logout");
        jbtnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnlogoutActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(775, 520, 100, 25));

        txtCompany.setBackground(new java.awt.Color(243, 249, 249));
        txtCompany.setBorder(null);
        jPanel2.add(txtCompany, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 230, 180, 25));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 912, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnbackActionPerformed
        // TODO add your handling code here:
        new AdminHrModuleFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnbackActionPerformed

    private void jbtnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnlogoutActionPerformed
        // TODO add your handling code here:
        new AdminLogginFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnlogoutActionPerformed

    private void btnaddnewhrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddnewhrActionPerformed
        // TODO add your handling code here:
        
        if(validateInputs()==false){
            JOptionPane.showMessageDialog(null, "Please Inputs all the fields","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(matchPassword()==false){
            JOptionPane.showMessageDialog(null, "Password do not match","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        try{
            HrPojo hr=new HrPojo(); 
            hr.setUserId(txtEmail.getText().trim().toUpperCase());
            hr.setHrId(jlblhrid.getText().trim());
            hr.setHrName(txtName.getText().trim());
            hr.setCompanyName(txtCompany.getText().trim());
            hr.setPassword(password);
            hr.setProfession(jcmProffession.getSelectedItem().toString());
            hr.setPhone(jtxtMobile.getText().trim());
            hr.setType("Hr");
            int result=HrDAO.addNewHr(hr);
             if(result==1){
                   JOptionPane.showMessageDialog(null, "Recorded Add","Succesfully",JOptionPane.INFORMATION_MESSAGE);
                   clearAll();
            return;
             }
             else if(result==-1){
                 JOptionPane.showMessageDialog(null, "Your Email Id all ready registered","Error",JOptionPane.ERROR_MESSAGE);
            return;
             }
             else{
                 JOptionPane.showMessageDialog(null, "Can not add the record","ERROR",JOptionPane.INFORMATION_MESSAGE);
            return;
             }
            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "DB Error " ,"Error",JOptionPane.ERROR_MESSAGE);
               ex.printStackTrace();
        }
        
    }//GEN-LAST:event_btnaddnewhrActionPerformed
private void clearAll(){
        txtName.setText("");
        txtEmail.setText("");
        txtCompany.setText("");
        jcmProffession.setSelectedIndex(0);
        jtxtMobile.setText("");
        jfpass.setText("");
        jfcompass.setText("");
          
        
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminAddNewHrFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddnewhr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JButton jbtnback;
    private javax.swing.JButton jbtnlogout;
    private javax.swing.JComboBox<String> jcmProffession;
    private javax.swing.JPasswordField jfcompass;
    private javax.swing.JPasswordField jfpass;
    private javax.swing.JLabel jlblMob;
    private javax.swing.JLabel jlbladdim;
    private javax.swing.JLabel jlblcmpass;
    private javax.swing.JLabel jlblcom;
    private javax.swing.JLabel jlblemail;
    private javax.swing.JLabel jlblhrid;
    private javax.swing.JLabel jlblname;
    private javax.swing.JLabel jlblpass;
    private javax.swing.JLabel jlblworld;
    private javax.swing.JTextField jtxtMobile;
    private javax.swing.JTextField txtCompany;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}

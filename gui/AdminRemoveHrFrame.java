
package TrnPl.gui;

import TrnPl.dao.HrDAO;
import TrnPl.dao.UsersDAO;
import TrnPl.pojo.CurrentUser;
import TrnPl.pojo.HrPojo;
import java.awt.Image;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class AdminRemoveHrFrame extends javax.swing.JFrame {

    private DefaultTableModel model;
    public AdminRemoveHrFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        jlblcom.setText("Welcomes ,"+CurrentUser.getName());
        
        model=(DefaultTableModel)tblallhr.getModel();
        LoadHrData();
        
        Icon im = jlblworld.getIcon();
        ImageIcon icon = (ImageIcon) im;
        Image image = icon.getImage().getScaledInstance(840, 200, Image.SCALE_SMOOTH);
        jlblworld.setIcon(new ImageIcon(image));
        
        Icon rim = jlblremove.getIcon();
        ImageIcon ricon = (ImageIcon) rim;
        Image rimage = ricon.getImage().getScaledInstance(160, 170, Image.SCALE_SMOOTH);
        jlblremove.setIcon(new ImageIcon(rimage));
    }

    private void LoadHrData(){
        
        try{
            List <HrPojo> allHrList=HrDAO.getALLHr();
            for(HrPojo hr:allHrList){
                Vector <String> row=new Vector();
                row.add(hr.getHrId());
                row.add(hr.getUserId());
                row.add(hr.getHrName());
                row.add(hr.getPhone());
                row.add(hr.getCompanyName());  
                model.addRow(row);
                
            }
            if(allHrList.isEmpty()){
                JOptionPane.showMessageDialog(null, "No Hr Present","hr Not Present",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Db Error","Erroe",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlblworld = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jlblcom = new javax.swing.JLabel();
        jlblremove = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblallhr = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        btnback = new javax.swing.JButton();
        btnremove = new javax.swing.JButton();
        btnlogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(243, 246, 254));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/transparent logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 50));

        jlblworld.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblworld.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/World-Map.png"))); // NOI18N
        jlblworld.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(jlblworld, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 840, 120));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 185, 840, 8));

        jlblcom.setFont(new java.awt.Font("Noteworthy", 1, 17)); // NOI18N
        jPanel1.add(jlblcom, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 600, 25));

        jlblremove.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblremove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Remove-Emp.png"))); // NOI18N
        jPanel1.add(jlblremove, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 160, 170));

        jLabel3.setFont(new java.awt.Font("Noteworthy", 1, 16)); // NOI18N
        jLabel3.setText("All Hr's-");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 70, 25));

        tblallhr.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblallhr.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hr Id", "User Id", "Name", "Phone No.", "Company Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblallhr);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 620, 210));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 840, 8));

        btnback.setBackground(new java.awt.Color(173, 192, 234));
        btnback.setFont(new java.awt.Font("Tempus Sans ITC", 1, 17)); // NOI18N
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        jPanel1.add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 100, 25));

        btnremove.setBackground(new java.awt.Color(173, 192, 234));
        btnremove.setFont(new java.awt.Font("Tempus Sans ITC", 1, 17)); // NOI18N
        btnremove.setText("Remove Hr");
        btnremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoveActionPerformed(evt);
            }
        });
        jPanel1.add(btnremove, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 510, 150, 25));

        btnlogout.setBackground(new java.awt.Color(173, 192, 234));
        btnlogout.setFont(new java.awt.Font("Tempus Sans ITC", 1, 17)); // NOI18N
        btnlogout.setText("Logout");
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 510, 100, 25));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoveActionPerformed
        int row=tblallhr.getSelectedRow();
        if(row==-1)
        {
            JOptionPane.showMessageDialog(null, "Please select the any one row");
            return;
        }
      String HrId=(String) tblallhr.getValueAt(row, 0);
      int resp=JOptionPane.showConfirmDialog(null, "Are you sure, you want to remove "+HrId+"?","Conformation",JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);
      if(resp==JOptionPane.OK_OPTION){
          
          try{
              String userId=(String)tblallhr.getValueAt(row, 1);
              boolean result=UsersDAO.removeHr(userId);
              if(result==true){
                  JOptionPane.showMessageDialog(null, "Record Deleted !","Sucess",JOptionPane.INFORMATION_MESSAGE);
                  model.removeRow(row);
                   if(model.getRowCount()==0)
                   {
                       btnremove.setEnabled(false);
                       
                   }
              }
              else
              {
                  JOptionPane.showMessageDialog(null, "Could Not Delet the Record !","Deletion Faield!",JOptionPane.INFORMATION_MESSAGE);
              }
          }
          catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "DB Error " ,"Error",JOptionPane.ERROR_MESSAGE);
               ex.printStackTrace();
        }
      }
    }//GEN-LAST:event_btnremoveActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        new AdminLogginFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        new AdminHrModuleFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnbackActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminRemoveHrFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnremove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jlblcom;
    private javax.swing.JLabel jlblremove;
    private javax.swing.JLabel jlblworld;
    private javax.swing.JTable tblallhr;
    // End of variables declaration//GEN-END:variables

    
}

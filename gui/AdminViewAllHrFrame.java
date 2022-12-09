
package TrnPl.gui;

import TrnPl.dao.HrDAO;
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


public class AdminViewAllHrFrame extends javax.swing.JFrame {

    private DefaultTableModel model; 
    public AdminViewAllHrFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        jlblcom.setText("Welcome , "+CurrentUser.getName());
        
        model=(DefaultTableModel)tblallhr.getModel();
        LoadHrDetails();
        
        Icon im = jlblworld.getIcon();
        ImageIcon icon = (ImageIcon) im;
        Image image = icon.getImage().getScaledInstance(840, 200, Image.SCALE_SMOOTH);
        jlblworld.setIcon(new ImageIcon(image));
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblallhr = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        btnback = new javax.swing.JButton();
        btnlogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(243, 249, 249));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/transparent logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 50));

        jlblworld.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/World-Map.png"))); // NOI18N
        jPanel1.add(jlblworld, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 60, 840, 120));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 185, 840, 8));

        jlblcom.setFont(new java.awt.Font("Tempus Sans ITC", 1, 17)); // NOI18N
        jPanel1.add(jlblcom, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 500, 25));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/viewAllHr.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 274, 160, 190));

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 16)); // NOI18N
        jLabel4.setText("All Hr's-");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, -1, -1));

        tblallhr.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hr Id", "User Id ", "Name", "Phone No", "Company Name"
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 630, 230));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 510, 845, 8));

        btnback.setBackground(new java.awt.Color(171, 185, 249));
        btnback.setFont(new java.awt.Font("Tempus Sans ITC", 1, 16)); // NOI18N
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        jPanel1.add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 525, 100, 25));

        btnlogout.setBackground(new java.awt.Color(171, 185, 249));
        btnlogout.setFont(new java.awt.Font("Tempus Sans ITC", 1, 16)); // NOI18N
        btnlogout.setText("Logout");
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 525, 100, 25));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        new AdminHrModuleFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        // TODO add your handling code here:
        new AdminLogginFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnlogoutActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminViewAllHrFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnlogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jlblcom;
    private javax.swing.JLabel jlblworld;
    private javax.swing.JTable tblallhr;
    // End of variables declaration//GEN-END:variables

    private void LoadHrDetails() {
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
}

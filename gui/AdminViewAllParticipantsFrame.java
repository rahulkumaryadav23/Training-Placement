
package TrnPl.gui;

import TrnPl.dao.HrDAO;
import TrnPl.dao.UsersDAO;
import TrnPl.pojo.CurrentUser;
import TrnPl.pojo.HrPojo;
import java.awt.Image;
import static java.lang.reflect.Array.set;
import java.sql.SQLException;
import java.util.Map;
import java.util.Set;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class AdminViewAllParticipantsFrame extends javax.swing.JFrame {

    private Map<String ,HrPojo> allCompanyname;
    private String companyName;
    public AdminViewAllParticipantsFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        jlblcom.setName("Welcome ,"+CurrentUser.getName());
        
        loadCompanyDeatils();
        
        Icon im = jlblworld.getIcon();
        ImageIcon icon = (ImageIcon) im;
        Image image = icon.getImage().getScaledInstance(840, 200, Image.SCALE_SMOOTH);
        jlblworld.setIcon(new ImageIcon(image));
    }

    private void loadCompanyDeatils(){
        try{
            allCompanyname=UsersDAO.getHrList();
            Set <String> keys=allCompanyname.keySet();
            for(String companyName:keys){
                jcCompanyname.addItem(companyName);
                
            }
            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "DB Error " ,"Error",JOptionPane.ERROR_MESSAGE);
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jcCompanyname = new javax.swing.JComboBox<>();
        jcJobId = new javax.swing.JComboBox<>();
        jcPercentage = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        btnback = new javax.swing.JButton();
        btnlogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(243, 249, 249));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/transparent logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 50));

        jlblworld.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblworld.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/World-Map.png"))); // NOI18N
        jlblworld.setText("jLabel2");
        jPanel1.add(jlblworld, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 840, 120));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 185, 840, 8));

        jlblcom.setFont(new java.awt.Font("Tempus Sans ITC", 1, 16)); // NOI18N
        jPanel1.add(jlblcom, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 500, 25));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/viewAllParticipants.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 180, 190));

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 16)); // NOI18N
        jLabel5.setText("All Qulified Participants-");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, -1, 25));

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel6.setText("Company Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Job Id");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 230, 50, 25));

        jLabel8.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel8.setText("Percent %");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 230, 70, 25));

        jcCompanyname.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jcCompanyname.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Option", "Infotech", "NetLink", "Guva" }));
        jcCompanyname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcCompanynameActionPerformed(evt);
            }
        });
        jPanel1.add(jcCompanyname, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 255, 110, 20));

        jcJobId.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jcJobId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No Choose", "Job-101", "Job-102", "Job-103" }));
        jPanel1.add(jcJobId, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 255, 100, 20));

        jcPercentage.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jcPercentage.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", " ", " ", " " }));
        jPanel1.add(jcPercentage, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 255, 60, 20));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Participant Id", "Name", "Skils", "Qulification"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 590, 220));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, 840, 8));

        btnback.setBackground(new java.awt.Color(172, 192, 234));
        btnback.setFont(new java.awt.Font("Tempus Sans ITC", 1, 16)); // NOI18N
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        jPanel1.add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 545, 100, 25));

        btnlogout.setBackground(new java.awt.Color(172, 192, 234));
        btnlogout.setFont(new java.awt.Font("Tempus Sans ITC", 1, 16)); // NOI18N
        btnlogout.setText("Logout");
        jPanel1.add(btnlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 545, 100, 25));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnbackActionPerformed

    private void jcCompanynameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcCompanynameActionPerformed
        // TODO add your handling code here:
//        String userId=(String)jcAllUserId.getSelectedItem();
//        HrPojo hr=allHr.get(userId);
//        txthrid.setText(hr.getHrId());
          String CompanyName=(String)jcCompanyname.getSelectedItem();
          HrPojo hr=allCompanyname.get(companyName);
          


        
    }//GEN-LAST:event_jcCompanynameActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminViewAllParticipantsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnlogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> jcCompanyname;
    private javax.swing.JComboBox<String> jcJobId;
    private javax.swing.JComboBox<String> jcPercentage;
    private javax.swing.JLabel jlblcom;
    private javax.swing.JLabel jlblworld;
    // End of variables declaration//GEN-END:variables
}

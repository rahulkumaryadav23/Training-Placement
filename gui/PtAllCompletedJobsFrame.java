
package TrnPl.gui;

import TrnPl.dao.ResultDAO;
import TrnPl.pojo.CurrentUser;
import TrnPl.pojo.ParticipantResultPojo;
import java.awt.Image;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class PtAllCompletedJobsFrame extends javax.swing.JFrame {

    private DefaultTableModel model;
    private List<ParticipantResultPojo> allResultList;
    
    public PtAllCompletedJobsFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        jlblcom.setText("Welcome , "+CurrentUser.getName());
        model=(DefaultTableModel)tblAlljobs.getModel();
        loadResultDeatils();
        
        Icon im = jlblworld.getIcon();
        ImageIcon icon = (ImageIcon) im;
        Image image = icon.getImage().getScaledInstance(850, 200, Image.SCALE_SMOOTH);
        jlblworld.setIcon(new ImageIcon(image));
        
        Icon jim = lbljobs.getIcon();
        ImageIcon jicon = (ImageIcon) jim;
        Image jimage = jicon.getImage().getScaledInstance(190, 240, Image.SCALE_SMOOTH);
        lbljobs.setIcon(new ImageIcon(jimage));
    }
    private void loadResultDeatils(){
        try{
            allResultList=ResultDAO.getAllCompletedJobs(CurrentUser.getId());
            for(ParticipantResultPojo result:allResultList){
                Vector<String> row=new Vector<String>();
                  row.add(result.getJobId());
                  row.add(result.getJobTitle());
                  row.add(result.getCompanyname());
                  row.add(result.getTags());
                  row.add(String.valueOf(result.getPercentage()));
                  model.addRow(row);
                  
            }
            if(allResultList.isEmpty()){
                JOptionPane.showMessageDialog(null, "No Completed Job Persent " ,"Completed Job Not Persent",JOptionPane.INFORMATION_MESSAGE);
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
        lbljobs = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAlljobs = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnback = new javax.swing.JButton();
        btnlogout = new javax.swing.JButton();

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

        jlblcom.setFont(new java.awt.Font("Noteworthy", 1, 16)); // NOI18N
        jPanel1.add(jlblcom, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 195, 500, 25));

        lbljobs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbljobs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/job.png"))); // NOI18N
        jPanel1.add(lbljobs, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 190, 240));

        tblAlljobs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "JobId", "Job Title", "Company Name", "Skills Requried", "Percentage"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAlljobs);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 630, 220));

        jLabel4.setFont(new java.awt.Font("Noteworthy", 1, 16)); // NOI18N
        jLabel4.setText("All Completed Jobs :-");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 150, 25));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 520, 855, 10));

        btnback.setBackground(new java.awt.Color(173, 192, 234));
        btnback.setFont(new java.awt.Font("Tempus Sans ITC", 1, 16)); // NOI18N
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        jPanel1.add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, 100, 25));

        btnlogout.setBackground(new java.awt.Color(173, 192, 234));
        btnlogout.setFont(new java.awt.Font("Tempus Sans ITC", 1, 16)); // NOI18N
        btnlogout.setText("Logout");
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 530, 100, 25));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        new UserParticipantsOptionFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        new AdminLogginFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnlogoutActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PtAllCompletedJobsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnlogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jlblcom;
    private javax.swing.JLabel jlblworld;
    private javax.swing.JLabel lbljobs;
    private javax.swing.JTable tblAlljobs;
    // End of variables declaration//GEN-END:variables
}

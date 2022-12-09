
package TrnPl.gui;

import TrnPl.dao.JobDAO;
import TrnPl.dao.ResultDAO;
import TrnPl.pojo.CurrentUser;
import TrnPl.pojo.ParticipantJobPojo;
import TrnPl.pojo.ParticipantsPojo;
import TrnPl.pojo.ResultPojo;
import java.awt.Image;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class PtViewAllAppliedJobsFrame extends javax.swing.JFrame {

       private DefaultTableModel model;
       private List<ParticipantJobPojo> allAppliedJobList;
       
    public PtViewAllAppliedJobsFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        jlblcom.setText("Welcome ,"+CurrentUser.getName());
        model=(DefaultTableModel)tblAppliedjobs.getModel();
        loadAppliedJobsDetails();
        
        Icon im = jlblworld.getIcon();
        ImageIcon icon = (ImageIcon) im;
        Image image = icon.getImage().getScaledInstance(840, 200, Image.SCALE_SMOOTH);
        jlblworld.setIcon(new ImageIcon(image));
        
        Icon jim = lbljob.getIcon();
        ImageIcon jicon = (ImageIcon) jim;
        Image jimage = jicon.getImage().getScaledInstance(200, 230, Image.SCALE_SMOOTH);
        lbljob.setIcon(new ImageIcon(jimage));
      
    }
    
    private void loadAppliedJobsDetails(){
        try{
            allAppliedJobList=ResultDAO.getAllAppliedJobs(CurrentUser.getId());
            
            for(ParticipantJobPojo job:allAppliedJobList){
                Vector row=new Vector();
                row.add(job.getJobId());
                row.add(job.getJobTitle());
                row.add(job.getCompanyname());
                row.add(job.getTags());
                model.addRow(row);
                
                
            }
            if(allAppliedJobList.isEmpty()){
                JOptionPane.showMessageDialog(null, "You Have't Apply for any job Yet" ,"Applied Job not parsent",JOptionPane.INFORMATION_MESSAGE);
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
        lbljob = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAppliedjobs = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        btnback = new javax.swing.JButton();
        btnlogout = new javax.swing.JButton();
        btntakeQuize = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(243, 249, 249));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/transparent logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 50));

        jlblworld.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblworld.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/World-Map.png"))); // NOI18N
        jPanel1.add(jlblworld, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 60, 840, 120));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 185, 840, 8));

        jlblcom.setFont(new java.awt.Font("Noteworthy", 1, 16)); // NOI18N
        jPanel1.add(jlblcom, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 540, 25));

        lbljob.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbljob.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/job.png"))); // NOI18N
        jPanel1.add(lbljob, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 210, 230));

        jLabel5.setFont(new java.awt.Font("Noteworthy", 1, 16)); // NOI18N
        jLabel5.setText("All Applied Jobs :-");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 130, 25));

        tblAppliedjobs.setBackground(new java.awt.Color(172, 192, 234));
        tblAppliedjobs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Job Id", "Job Title", "Company Name", "Skills Required"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAppliedjobs);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 590, 210));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 840, 5));

        btnback.setBackground(new java.awt.Color(171, 185, 249));
        btnback.setFont(new java.awt.Font("Tempus Sans ITC", 1, 17)); // NOI18N
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        jPanel1.add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 515, 100, 25));

        btnlogout.setBackground(new java.awt.Color(171, 185, 249));
        btnlogout.setFont(new java.awt.Font("Tempus Sans ITC", 1, 17)); // NOI18N
        btnlogout.setText("Logout");
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 515, 100, 25));

        btntakeQuize.setBackground(new java.awt.Color(170, 190, 234));
        btntakeQuize.setFont(new java.awt.Font("Tempus Sans ITC", 1, 16)); // NOI18N
        btntakeQuize.setText("Take Quize");
        btntakeQuize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntakeQuizeActionPerformed(evt);
            }
        });
        jPanel1.add(btntakeQuize, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 520, 200, 25));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
       
        new UserParticipantsOptionFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        // TODO add your handling code here:
        new AdminLogginFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void btntakeQuizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntakeQuizeActionPerformed
        int row=tblAppliedjobs.getSelectedRow();
        if(row==-1){
            JOptionPane.showMessageDialog(null,"Please select a row first");
            return;
        }
        String jobId=tblAppliedjobs.getValueAt(row,0).toString().trim();
        String jobTitle=tblAppliedjobs.getValueAt(row,1).toString().trim();
         PtTakeQuizeFrame quizFrame=new PtTakeQuizeFrame(jobId,jobTitle);

          
    }//GEN-LAST:event_btntakeQuizeActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PtViewAllAppliedJobsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btntakeQuize;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jlblcom;
    private javax.swing.JLabel jlblworld;
    private javax.swing.JLabel lbljob;
    private javax.swing.JTable tblAppliedjobs;
    // End of variables declaration//GEN-END:variables
}

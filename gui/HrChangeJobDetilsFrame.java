
package TrnPl.gui;

import TrnPl.dao.JobDAO;
import TrnPl.pojo.CurrentUser;
import TrnPl.pojo.JobPojo;
import java.awt.Image;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class HrChangeJobDetilsFrame extends javax.swing.JFrame {

   DefaultTableModel model;
    public HrChangeJobDetilsFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        jlblcom.setText(CurrentUser.getName());
        
        model=(DefaultTableModel)tblAllJobs.getModel();
        loadData();
        
        Icon im = jlblworld.getIcon();
        ImageIcon icon = (ImageIcon) im;
        Image image = icon.getImage().getScaledInstance(840, 200, Image.SCALE_SMOOTH);
        jlblworld.setIcon(new ImageIcon(image));
    }
    
    
        
       private void loadData(){
        try{
            List <JobPojo> alljobsList=JobDAO.getAllEditableJobByCurrentHr(CurrentUser.getId());
            for(JobPojo job:alljobsList)
            {
                Vector <String> row=new Vector<>();
                row.add(job.getJobId());
                row.add(job.getJobTitle());
                row.add(job.getTags());
                row.add(String.valueOf(job.getStatus()));
                model.addRow(row);
            }
            if(alljobsList.isEmpty()){
                JOptionPane.showMessageDialog(null, "No Editable Job Present","Editable Job Not present",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "SQL Error","DB problem  ",JOptionPane.ERROR_MESSAGE);
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
        jLabel2 = new javax.swing.JLabel();
        jlblcom = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAllJobs = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        btnback = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btnlogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(243, 246, 254));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/transparent logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jlblworld.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblworld.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/World-Map.png"))); // NOI18N
        jPanel1.add(jlblworld, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 65, 840, 120));

        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 840, 8));

        jLabel2.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jLabel2.setText("Welcome ,");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 195, 80, 25));

        jlblcom.setFont(new java.awt.Font("Noteworthy", 1, 17)); // NOI18N
        jPanel1.add(jlblcom, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 195, 300, 25));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/new/removeJob.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 280, 160, 200));

        jLabel5.setFont(new java.awt.Font("Noteworthy", 1, 16)); // NOI18N
        jLabel5.setText("View All Jobs :-");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 110, 25));

        tblAllJobs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Job ID", "Job Title", "Skills", "Status"
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
        jScrollPane1.setViewportView(tblAllJobs);
        if (tblAllJobs.getColumnModel().getColumnCount() > 0) {
            tblAllJobs.getColumnModel().getColumn(0).setResizable(false);
            tblAllJobs.getColumnModel().getColumn(1).setResizable(false);
            tblAllJobs.getColumnModel().getColumn(2).setResizable(false);
            tblAllJobs.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 620, 220));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 840, 8));

        btnback.setBackground(new java.awt.Color(173, 192, 234));
        btnback.setFont(new java.awt.Font("Tempus Sans ITC", 1, 16)); // NOI18N
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        jPanel1.add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 525, 100, 25));

        btnedit.setBackground(new java.awt.Color(173, 192, 234));
        btnedit.setFont(new java.awt.Font("Tempus Sans ITC", 1, 16)); // NOI18N
        btnedit.setText("Hr Edit Job");
        btnedit.setToolTipText("");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });
        jPanel1.add(btnedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 525, 200, 25));

        btnlogout.setBackground(new java.awt.Color(173, 192, 234));
        btnlogout.setFont(new java.awt.Font("Tempus Sans ITC", 1, 16)); // NOI18N
        btnlogout.setText("Logout");
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 525, 100, 25));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 922, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        new HrJobOptionFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        new AdminLogginFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        int row=tblAllJobs.getSelectedRow();
        if(row==-1)
        {
            JOptionPane.showMessageDialog(null, "Please select any one row","No Selection!!",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        JobPojo job=new JobPojo();
        job.setJobId(tblAllJobs.getValueAt(row, 0).toString().trim());
        job.setJobTitle(tblAllJobs.getValueAt(row, 1).toString().trim());
        job.setTags(tblAllJobs.getValueAt(row, 2).toString().trim());
        job.setHrId(CurrentUser.getId());
        job.setStatus(0);
         new HrEditJobFrame(job ).setVisible(true);
         this.dispose();
                   
    }//GEN-LAST:event_btneditActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HrChangeJobDetilsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnlogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jlblcom;
    private javax.swing.JLabel jlblworld;
    private javax.swing.JTable tblAllJobs;
    // End of variables declaration//GEN-END:variables
}

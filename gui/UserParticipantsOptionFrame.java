
package TrnPl.gui;

import TrnPl.pojo.CurrentUser;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class UserParticipantsOptionFrame extends javax.swing.JFrame {

        public UserParticipantsOptionFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        lblcom.setText(CurrentUser.getName());
        
        
        Icon im = jlblworld.getIcon();
        ImageIcon icon = (ImageIcon) im;
        Image image = icon.getImage().getScaledInstance(780, 190, Image.SCALE_SMOOTH);
        jlblworld.setIcon(new ImageIcon(image));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlblworld = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        lblcom = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        btnviewalljobs = new javax.swing.JButton();
        btnAppliedjob = new javax.swing.JButton();
        btncompletedjobs = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnlogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(243, 249, 249));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/transparent logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jlblworld.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblworld.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/World-Map.png"))); // NOI18N
        jPanel1.add(jlblworld, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 60, 780, 110));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 175, 780, 8));

        jLabel2.setFont(new java.awt.Font("Noteworthy", 1, 17)); // NOI18N
        jLabel2.setText("Welcome ,");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 80, 25));

        lblcom.setFont(new java.awt.Font("Noteworthy", 1, 17)); // NOI18N
        jPanel1.add(lblcom, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 180, 520, 25));

        btnEdit.setBackground(new java.awt.Color(170, 192, 234));
        btnEdit.setFont(new java.awt.Font("Tempus Sans ITC", 1, 16)); // NOI18N
        btnEdit.setText("Edit Profile");
        btnEdit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jPanel1.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 270, 35));

        btnviewalljobs.setBackground(new java.awt.Color(170, 192, 234));
        btnviewalljobs.setFont(new java.awt.Font("Tempus Sans ITC", 1, 16)); // NOI18N
        btnviewalljobs.setText("View All Available Jobs");
        btnviewalljobs.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        btnviewalljobs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewalljobsActionPerformed(evt);
            }
        });
        jPanel1.add(btnviewalljobs, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 335, 270, 35));

        btnAppliedjob.setBackground(new java.awt.Color(170, 192, 234));
        btnAppliedjob.setFont(new java.awt.Font("Tempus Sans ITC", 1, 16)); // NOI18N
        btnAppliedjob.setText("View All Applied Jobs");
        btnAppliedjob.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        btnAppliedjob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAppliedjobActionPerformed(evt);
            }
        });
        jPanel1.add(btnAppliedjob, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 270, 35));

        btncompletedjobs.setBackground(new java.awt.Color(170, 192, 234));
        btncompletedjobs.setFont(new java.awt.Font("Tempus Sans ITC", 1, 16)); // NOI18N
        btncompletedjobs.setText("View All Completed Jobs");
        btncompletedjobs.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        btncompletedjobs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncompletedjobsActionPerformed(evt);
            }
        });
        jPanel1.add(btncompletedjobs, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 465, 270, 35));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/new/ptHomeImg.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 410, 280));

        btnlogout.setBackground(new java.awt.Color(170, 192, 234));
        btnlogout.setFont(new java.awt.Font("Tempus Sans ITC", 1, 16)); // NOI18N
        btnlogout.setText("Logout");
        btnlogout.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 530, 100, 25));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        new PtEditProfileframe().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        new AdminLogginFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void btnviewalljobsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewalljobsActionPerformed
        new PtViewAllAvailableJobsFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnviewalljobsActionPerformed

    private void btnAppliedjobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAppliedjobActionPerformed
        new PtViewAllAppliedJobsFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAppliedjobActionPerformed

    private void btncompletedjobsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncompletedjobsActionPerformed
        new PtAllCompletedJobsFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btncompletedjobsActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserParticipantsOptionFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAppliedjob;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btncompletedjobs;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnviewalljobs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jlblworld;
    private javax.swing.JLabel lblcom;
    // End of variables declaration//GEN-END:variables
}

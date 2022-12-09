
package TrnPl.gui;

import TrnPl.pojo.CurrentUser;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class HrJobOptionFrame extends javax.swing.JFrame {

    
    
    public HrJobOptionFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        jlblcom.setText(CurrentUser.getName());
        
        
        Icon im = jlblworld.getIcon();
        ImageIcon icon = (ImageIcon) im;
        Image image = icon.getImage().getScaledInstance(850, 200, Image.SCALE_SMOOTH);
        jlblworld.setIcon(new ImageIcon(image));
        
        Icon jim = jlbljob.getIcon();
        ImageIcon jicon = (ImageIcon) jim;
        Image jimage = jicon.getImage().getScaledInstance(260, 270, Image.SCALE_SMOOTH);
        jlbljob.setIcon(new ImageIcon(jimage));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jlblworld = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jlblcom = new javax.swing.JLabel();
        jlbljob = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnaddjob = new javax.swing.JButton();
        btnremove = new javax.swing.JButton();
        btneditjob = new javax.swing.JButton();
        btnsetquiz = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        btnlogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(243, 246, 254));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/transparent logo.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 50));

        jlblworld.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblworld.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/World-Map.png"))); // NOI18N
        jPanel2.add(jlblworld, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 70, 850, 120));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 195, 850, 8));

        jLabel1.setFont(new java.awt.Font("Noteworthy", 1, 17)); // NOI18N
        jLabel1.setText("Welcome ,");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 205, -1, 25));

        jlblcom.setFont(new java.awt.Font("Noteworthy", 1, 11)); // NOI18N
        jlblcom.setText("jLabel2");
        jPanel2.add(jlblcom, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 205, 300, 25));

        jlbljob.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbljob.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/new/istockphoto-1285196602-612x612.jpg"))); // NOI18N
        jPanel2.add(jlbljob, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 290, 160, 170));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/new/removeJob.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 160, 170));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/new/editJob.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 290, 160, 170));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/new/setQuiz.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 290, 180, 170));

        btnaddjob.setBackground(new java.awt.Color(173, 192, 234));
        btnaddjob.setFont(new java.awt.Font("Tempus Sans ITC", 1, 16)); // NOI18N
        btnaddjob.setText("Add New Job");
        btnaddjob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddjobActionPerformed(evt);
            }
        });
        jPanel2.add(btnaddjob, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 480, 160, 30));

        btnremove.setBackground(new java.awt.Color(173, 192, 234));
        btnremove.setFont(new java.awt.Font("Tempus Sans ITC", 1, 17)); // NOI18N
        btnremove.setText("Remove Job");
        btnremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoveActionPerformed(evt);
            }
        });
        jPanel2.add(btnremove, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 480, 160, 30));

        btneditjob.setBackground(new java.awt.Color(173, 192, 234));
        btneditjob.setFont(new java.awt.Font("Tempus Sans ITC", 1, 16)); // NOI18N
        btneditjob.setText("Edit Job");
        btneditjob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditjobActionPerformed(evt);
            }
        });
        jPanel2.add(btneditjob, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 480, 160, 30));

        btnsetquiz.setBackground(new java.awt.Color(173, 192, 234));
        btnsetquiz.setFont(new java.awt.Font("Tempus Sans ITC", 1, 16)); // NOI18N
        btnsetquiz.setText("Set Quiz");
        btnsetquiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsetquizActionPerformed(evt);
            }
        });
        jPanel2.add(btnsetquiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 480, 160, 30));

        btnback.setBackground(new java.awt.Color(173, 192, 234));
        btnback.setFont(new java.awt.Font("Tempus Sans ITC", 1, 16)); // NOI18N
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        jPanel2.add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 100, 25));

        btnlogout.setBackground(new java.awt.Color(173, 192, 234));
        btnlogout.setFont(new java.awt.Font("Tempus Sans ITC", 1, 16)); // NOI18N
        btnlogout.setText("Logout");
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });
        jPanel2.add(btnlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 530, 100, 25));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 935, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddjobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddjobActionPerformed
        new HrAddNewJobFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnaddjobActionPerformed

    private void btnsetquizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsetquizActionPerformed
        new HrQuizOptionFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnsetquizActionPerformed

    private void btneditjobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditjobActionPerformed
         new HrChangeJobDetilsFrame().setVisible(true);
         this.dispose();
    }//GEN-LAST:event_btneditjobActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        new HrOptionFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoveActionPerformed
        new HrJobRemoveFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnremoveActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        new AdminLogginFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnlogoutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HrJobOptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HrJobOptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HrJobOptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HrJobOptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HrJobOptionFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddjob;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btneditjob;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnremove;
    private javax.swing.JButton btnsetquiz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jlblcom;
    private javax.swing.JLabel jlbljob;
    private javax.swing.JLabel jlblworld;
    // End of variables declaration//GEN-END:variables
}


package TrnPl.gui;

import TrnPl.pojo.CurrentUser;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class AdminOptionFrame extends javax.swing.JFrame {

    
    public AdminOptionFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        jlblcom.setText("Welcome ,"+CurrentUser.getName());
        
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
        btnHrmodule = new javax.swing.JButton();
        btnviewalljob = new javax.swing.JButton();
        btnallStudent = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jbtnlogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(243, 249, 249));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/transparent logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 50));

        jlblworld.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/World-Map.png"))); // NOI18N
        jlblworld.setText("jLabel2");
        jPanel1.add(jlblworld, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 60, 840, 120));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 185, 840, 8));

        jlblcom.setFont(new java.awt.Font("Tempus Sans ITC", 1, 17)); // NOI18N
        jPanel1.add(jlblcom, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 600, 25));

        btnHrmodule.setBackground(new java.awt.Color(171, 185, 249));
        btnHrmodule.setFont(new java.awt.Font("Tempus Sans ITC", 1, 16)); // NOI18N
        btnHrmodule.setText("HR Module");
        btnHrmodule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHrmoduleActionPerformed(evt);
            }
        });
        jPanel1.add(btnHrmodule, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 250, 35));

        btnviewalljob.setBackground(new java.awt.Color(171, 185, 249));
        btnviewalljob.setFont(new java.awt.Font("Tempus Sans ITC", 1, 16)); // NOI18N
        btnviewalljob.setText("View All Job");
        btnviewalljob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewalljobActionPerformed(evt);
            }
        });
        jPanel1.add(btnviewalljob, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 325, 250, 35));

        btnallStudent.setBackground(new java.awt.Color(171, 185, 249));
        btnallStudent.setFont(new java.awt.Font("Tempus Sans ITC", 1, 16)); // NOI18N
        btnallStudent.setText("View All Student");
        btnallStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnallStudentActionPerformed(evt);
            }
        });
        jPanel1.add(btnallStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 250, 35));

        jButton4.setBackground(new java.awt.Color(171, 185, 249));
        jButton4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 16)); // NOI18N
        jButton4.setText("View All Selected Student");
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 455, 250, 35));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/purepng.com-white-paper-planpaper-planeaeroplanepaper-gliderpaper-dartaircraftfolded-paperpaperboardclipartblack-1421526588279c5fht.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 510, 220));

        jbtnlogout.setBackground(new java.awt.Color(171, 185, 249));
        jbtnlogout.setFont(new java.awt.Font("Tempus Sans ITC", 1, 16)); // NOI18N
        jbtnlogout.setText("Logout");
        jbtnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnlogoutActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 510, 100, 25));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHrmoduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHrmoduleActionPerformed
        // TODO add your handling code here:
        new AdminHrModuleFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHrmoduleActionPerformed

    private void jbtnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnlogoutActionPerformed
        // TODO add your handling code here:
        new AdminLogginFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnlogoutActionPerformed

    private void btnviewalljobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewalljobActionPerformed
        // TODO add your handling code here:
        new AdminViewAllJobFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnviewalljobActionPerformed

    private void btnallStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnallStudentActionPerformed
        // TODO add your handling code here:
        new AdminViellAllStudentFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnallStudentActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminOptionFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHrmodule;
    private javax.swing.JButton btnallStudent;
    private javax.swing.JButton btnviewalljob;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbtnlogout;
    private javax.swing.JLabel jlblcom;
    private javax.swing.JLabel jlblworld;
    // End of variables declaration//GEN-END:variables
}

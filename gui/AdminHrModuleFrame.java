
package TrnPl.gui;

import TrnPl.pojo.CurrentUser;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class AdminHrModuleFrame extends javax.swing.JFrame {

    
    public AdminHrModuleFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        jlblcom.setText("Welcome ,"+CurrentUser.getName());
        
        Icon im = jlblworld.getIcon();
        ImageIcon icon = (ImageIcon) im;
        Image image = icon.getImage().getScaledInstance(840, 200, Image.SCALE_SMOOTH);
        jlblworld.setIcon(new ImageIcon(image));
        
        Icon add=jlbladdhr.getIcon();
        ImageIcon addicon=(ImageIcon) add;
        Image addimg=addicon.getImage().getScaledInstance(150, 155, Image.SCALE_SMOOTH);
        jlbladdhr.setIcon(new ImageIcon(addimg));
        
        Icon remove=jlblremovehr.getIcon();
        ImageIcon remicon=(ImageIcon) remove;
        Image remimg=remicon.getImage().getScaledInstance(150, 155, Image.SCALE_SMOOTH);
        jlblremovehr.setIcon(new ImageIcon(remimg));
        
        Icon modfy=jlblmodifyhr.getIcon();
        ImageIcon mdfyicon=(ImageIcon) modfy;
        Image mdfyimg=mdfyicon.getImage().getScaledInstance(150, 155, Image.SCALE_SMOOTH);
        jlblmodifyhr.setIcon(new ImageIcon(mdfyimg));
        
        Icon allvew=jlblallhr.getIcon();
        ImageIcon allicon=(ImageIcon) allvew;
        Image allimg=allicon.getImage().getScaledInstance(150, 155, Image.SCALE_SMOOTH);
        jlblallhr.setIcon(new ImageIcon(allimg));
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlblworld = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jlblcom = new javax.swing.JLabel();
        jlbladdhr = new javax.swing.JLabel();
        jlblremovehr = new javax.swing.JLabel();
        jlblmodifyhr = new javax.swing.JLabel();
        jlblallhr = new javax.swing.JLabel();
        jbtnback = new javax.swing.JButton();
        jbtnlogout = new javax.swing.JButton();
        btnaddhr = new javax.swing.JButton();
        btnremove = new javax.swing.JButton();
        btnmodfy = new javax.swing.JButton();
        btnAllHr = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(243, 249, 252));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/transparent logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 191, -1));

        jlblworld.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/World-Map.png"))); // NOI18N
        jPanel1.add(jlblworld, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 70, 840, 130));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 205, 840, 8));

        jlblcom.setFont(new java.awt.Font("Noteworthy", 1, 17)); // NOI18N
        jPanel1.add(jlblcom, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 215, 610, 25));

        jlbladdhr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbladdhr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/addNewEmp.png"))); // NOI18N
        jPanel1.add(jlbladdhr, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 150, 155));

        jlblremovehr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblremovehr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Remove-Emp.png"))); // NOI18N
        jPanel1.add(jlblremovehr, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 150, 155));

        jlblmodifyhr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblmodifyhr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/modify-emp.png"))); // NOI18N
        jPanel1.add(jlblmodifyhr, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, 150, 155));

        jlblallhr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblallhr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/viewAllHr.png"))); // NOI18N
        jPanel1.add(jlblallhr, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 290, 150, 155));

        jbtnback.setBackground(new java.awt.Color(172, 192, 234));
        jbtnback.setFont(new java.awt.Font("Tempus Sans ITC", 1, 16)); // NOI18N
        jbtnback.setText("Back");
        jbtnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnbackActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 530, 90, 25));

        jbtnlogout.setBackground(new java.awt.Color(172, 192, 234));
        jbtnlogout.setFont(new java.awt.Font("Tempus Sans ITC", 1, 16)); // NOI18N
        jbtnlogout.setText("Logout");
        jbtnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnlogoutActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(815, 530, 90, 25));

        btnaddhr.setBackground(new java.awt.Color(204, 204, 255));
        btnaddhr.setFont(new java.awt.Font("Noteworthy", 1, 17)); // NOI18N
        btnaddhr.setText("Add New Hr");
        btnaddhr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddhrActionPerformed(evt);
            }
        });
        jPanel1.add(btnaddhr, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 465, 150, 30));

        btnremove.setBackground(new java.awt.Color(204, 204, 255));
        btnremove.setFont(new java.awt.Font("Noteworthy", 1, 17)); // NOI18N
        btnremove.setText("Remove Hr");
        btnremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoveActionPerformed(evt);
            }
        });
        jPanel1.add(btnremove, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 465, 150, 30));

        btnmodfy.setBackground(new java.awt.Color(204, 204, 255));
        btnmodfy.setFont(new java.awt.Font("Noteworthy", 1, 17)); // NOI18N
        btnmodfy.setText("Modify Hr");
        btnmodfy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodfyActionPerformed(evt);
            }
        });
        jPanel1.add(btnmodfy, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 465, 150, 30));

        btnAllHr.setBackground(new java.awt.Color(204, 204, 255));
        btnAllHr.setFont(new java.awt.Font("Noteworthy", 1, 17)); // NOI18N
        btnAllHr.setText(" View All Hr");
        btnAllHr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllHrActionPerformed(evt);
            }
        });
        jPanel1.add(btnAllHr, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 465, 150, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddhrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddhrActionPerformed
        // TODO add your handling code here:
        new AdminAddNewHrFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnaddhrActionPerformed

    private void jbtnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnbackActionPerformed
        // TODO add your handling code here:
        new AdminOptionFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnbackActionPerformed

    private void jbtnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnlogoutActionPerformed
        // TODO add your handling code here:
        new AdminLogginFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnlogoutActionPerformed

    private void btnAllHrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllHrActionPerformed
        // TODO add your handling code here:
        new AdminViewAllHrFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAllHrActionPerformed

    private void btnmodfyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodfyActionPerformed
       new AdminModifyFrame().setVisible(true);
       this.dispose();
       
    }//GEN-LAST:event_btnmodfyActionPerformed

    private void btnremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoveActionPerformed
        new AdminRemoveHrFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnremoveActionPerformed

    
    public static void main(String args[]) {
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHrModuleFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAllHr;
    private javax.swing.JButton btnaddhr;
    private javax.swing.JButton btnmodfy;
    private javax.swing.JButton btnremove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbtnback;
    private javax.swing.JButton jbtnlogout;
    private javax.swing.JLabel jlbladdhr;
    private javax.swing.JLabel jlblallhr;
    private javax.swing.JLabel jlblcom;
    private javax.swing.JLabel jlblmodifyhr;
    private javax.swing.JLabel jlblremovehr;
    private javax.swing.JLabel jlblworld;
    // End of variables declaration//GEN-END:variables
}

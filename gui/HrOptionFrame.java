
package TrnPl.gui;

import TrnPl.pojo.CurrentUser;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class HrOptionFrame extends javax.swing.JFrame {

    
    public HrOptionFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        jlblcom.setText(CurrentUser.getName());
        
        
        Icon im = jlblworld.getIcon();
        ImageIcon icon = (ImageIcon) im;
        Image image = icon.getImage().getScaledInstance(840, 200, Image.SCALE_SMOOTH);
        jlblworld.setIcon(new ImageIcon(image));
        
        Icon Bwrld = jlblblankworld.getIcon();
        ImageIcon wrldicon = (ImageIcon) Bwrld;
        Image wrldimage = wrldicon.getImage().getScaledInstance(540, 300, Image.SCALE_SMOOTH);
        jlblblankworld.setIcon(new ImageIcon(wrldimage));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlblworld = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jlblcom = new javax.swing.JLabel();
        btnjobmodule = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jlblblankworld = new javax.swing.JLabel();
        btnlogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(243, 249, 249));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/transparent logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 50));

        jlblworld.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblworld.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/World-Map.png"))); // NOI18N
        jPanel1.add(jlblworld, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 840, 120));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 185, 840, 8));

        jLabel3.setFont(new java.awt.Font("Noteworthy", 1, 17)); // NOI18N
        jLabel3.setText("Welcome ,");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 80, 25));

        jlblcom.setFont(new java.awt.Font("Noteworthy", 1, 16)); // NOI18N
        jPanel1.add(jlblcom, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 300, 25));

        btnjobmodule.setBackground(new java.awt.Color(171, 185, 249));
        btnjobmodule.setFont(new java.awt.Font("Tempus Sans ITC", 1, 16)); // NOI18N
        btnjobmodule.setText("Job Module");
        btnjobmodule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnjobmoduleActionPerformed(evt);
            }
        });
        jPanel1.add(btnjobmodule, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 250, 35));

        jButton2.setBackground(new java.awt.Color(171, 185, 249));
        jButton2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 16)); // NOI18N
        jButton2.setText("View All Participants");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 325, 250, 35));

        jButton3.setBackground(new java.awt.Color(171, 185, 249));
        jButton3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 16)); // NOI18N
        jButton3.setText("View Test Result");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 250, 35));

        jButton4.setBackground(new java.awt.Color(171, 185, 249));
        jButton4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 16)); // NOI18N
        jButton4.setText("View All Open Jobs");
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 455, 250, 35));

        jlblblankworld.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblblankworld.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/worlp-map-in-black-h9i.png"))); // NOI18N
        jPanel1.add(jlblblankworld, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 540, 300));

        btnlogout.setBackground(new java.awt.Color(171, 185, 249));
        btnlogout.setFont(new java.awt.Font("Tempus Sans ITC", 1, 17)); // NOI18N
        btnlogout.setText("Logout");
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 530, 100, 25));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnjobmoduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnjobmoduleActionPerformed
        new HrJobOptionFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnjobmoduleActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        new AdminLogginFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnlogoutActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HrOptionFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnjobmodule;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jlblblankworld;
    private javax.swing.JLabel jlblcom;
    private javax.swing.JLabel jlblworld;
    // End of variables declaration//GEN-END:variables
}

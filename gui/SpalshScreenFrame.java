
package TrnPl.gui;

import java.util.Random;
import javax.swing.JOptionPane;


public class SpalshScreenFrame extends javax.swing.JFrame {

    
    public SpalshScreenFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        jProgeressBar.setStringPainted(true);
        SplashThread sp=new SplashThread();
        sp.start();
    }

    class SplashThread extends Thread{
        public void run(){
            int count=1;
            Random rn=new Random();
            while(jProgeressBar.getValue()<jProgeressBar.getMaximum()){
            try{
                jProgeressBar.setValue(count);
                Thread.sleep(1200);
                count=count+rn.nextInt(100);
            }
            catch(InterruptedException ex){
                JOptionPane.showMessageDialog(null, "Exception In Thread:"+ex,"Error!",JOptionPane.ERROR_MESSAGE);
            }
        }
            dispose();
                AdminLogginFrame loginFrame=new AdminLogginFrame();
                loginFrame.setVisible(true);

        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jProgeressBar = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(243, 249, 249));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/new/razorpay.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 230, 250));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/transparent logo name.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 340, 150, 40));

        jProgeressBar.setBackground(new java.awt.Color(255, 255, 255));
        jProgeressBar.setForeground(new java.awt.Color(55, 222, 18));
        jPanel1.add(jProgeressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 650, 15));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SpalshScreenFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgeressBar;
    // End of variables declaration//GEN-END:variables
}



package TrnPl.gui;

import TrnPl.dao.QuestionDAO;
import TrnPl.dao.ResultDAO;
import TrnPl.pojo.CurrentUser;
import TrnPl.pojo.QuestionPojo;
import TrnPl.pojo.ResultPojo;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class PtTakeQuizeFrame extends javax.swing.JFrame {

    private String jobId;
    private String jobTitle;
    int counter = 0;
    private List<QuestionPojo> QuestionList;
    private QuestionPojo currentQuestion;
    private List<Integer> AnswerList;
    
    public PtTakeQuizeFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
            

}

    PtTakeQuizeFrame(String jobId, String jobTitle) {
        this();
        this.jobId=jobId;
        this.jobTitle=jobTitle;
        lbltitle.setText("Paper for "+this.jobTitle);
        lblQno.setText(""+(counter+1));
        this.setVisible(true);
        loadQuestionPaper();
        
    }
    
    private void loadQuestionPaper(){
    try{
        QuestionList=QuestionDAO.getQuestionPaperByJobId(jobId);
        AnswerList=new ArrayList<>(QuestionList.size());
        for(int i=0;i<QuestionList.size();i++){
            AnswerList.add(i,0);
         }
        showNextQuestionFrame();
        
    }
    catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "DB Error quiz...","Error in generatinh HrId",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
}
   private void showNextQuestionFrame(){
     currentQuestion=QuestionList.get(counter);
     txtquestion.setText(currentQuestion.getQuestion());
     jrbOption1.setText(currentQuestion.getOption1());
     jrbOption2.setText(currentQuestion.getOption2());
     jrbOption3.setText(currentQuestion.getOption3());
     jrbOption4.setText(currentQuestion.getOption4());
     int answer=AnswerList.get(counter);
     switch(answer){
         case 1:
             jrbOption1.setSelected(true);
             break;
         case 2:
             jrbOption2.setSelected(true);
             break;
         case 3:
             jrbOption3.setSelected(true);
             break;
         case 4:
             jrbOption4.setSelected(true);
             break;    
         default:
             buttonGroup1.clearSelection();
             
     }
     
   }
   private int validateChooseOption(){
       if(jrbOption1.isSelected())
           return 1;
       else if(jrbOption2.isSelected())
           return 2;
       else if(jrbOption3.isSelected())
           return 3;
       else if(jrbOption4.isSelected())
           return 4; 
       else
           return 0;
   }
   
   private double getPercentage(){
       int marksOptained=0;
       for(int i=0;i<QuestionList.size();i++){
           QuestionPojo question=QuestionList.get(i);
           if(question.getCorrectOption()==AnswerList.get(i))
           {
               ++marksOptained;
           }
       }
       double per=((double)marksOptained/QuestionList.size())*100;
       return per;
   }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lbltitle = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        lblQno = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtquestion = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jrbOption1 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jrbOption2 = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jrbOption3 = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jrbOption4 = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        btnpervious = new javax.swing.JButton();
        btnnext = new javax.swing.JButton();
        btndiscard = new javax.swing.JButton();
        btnsubmit = new javax.swing.JButton();
        lbltime = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(243, 249, 249));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/transparent logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 50));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/World-Map.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 840, 120));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 185, 840, 8));

        lbltitle.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lbltitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltitle.setText("Paper for SDE-4");
        jPanel1.add(lbltitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 300, 25));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 840, 8));

        jLabel5.setFont(new java.awt.Font("Noteworthy", 1, 17)); // NOI18N
        jLabel5.setText("Que .");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 40, 25));

        lblQno.setFont(new java.awt.Font("Noteworthy", 1, 16)); // NOI18N
        lblQno.setText("6");
        jPanel1.add(lblQno, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 30, 25));

        txtquestion.setBackground(new java.awt.Color(173, 192, 234));
        txtquestion.setColumns(20);
        txtquestion.setRows(5);
        jScrollPane1.setViewportView(txtquestion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 770, 70));

        jLabel7.setFont(new java.awt.Font("Noteworthy", 1, 17)); // NOI18N
        jLabel7.setText("Options :-");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 100, 25));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 840, 10));

        jLabel8.setFont(new java.awt.Font("Noteworthy", 1, 16)); // NOI18N
        jLabel8.setText("Options 1");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 80, 25));

        jrbOption1.setBackground(new java.awt.Color(173, 192, 234));
        buttonGroup1.add(jrbOption1);
        jrbOption1.setText("jRadioButton1");
        jPanel1.add(jrbOption1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 250, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tg_image_915734271.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 285, 30));

        jLabel10.setFont(new java.awt.Font("Noteworthy", 1, 16)); // NOI18N
        jLabel10.setText("Option 2");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 370, 80, 25));

        jrbOption2.setBackground(new java.awt.Color(172, 192, 234));
        buttonGroup1.add(jrbOption2);
        jrbOption2.setText("jRadioButton2");
        jPanel1.add(jrbOption2, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 370, 250, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tg_image_915734271.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 370, 285, 30));

        jLabel12.setFont(new java.awt.Font("Noteworthy", 1, 16)); // NOI18N
        jLabel12.setText("Option 3");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 70, 25));

        jrbOption3.setBackground(new java.awt.Color(173, 192, 234));
        buttonGroup1.add(jrbOption3);
        jrbOption3.setText("jRadioButton3");
        jPanel1.add(jrbOption3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 250, 30));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tg_image_915734271.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 285, 30));

        jLabel14.setFont(new java.awt.Font("Noteworthy", 1, 16)); // NOI18N
        jLabel14.setText("Option 4");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 440, 80, 25));

        jrbOption4.setBackground(new java.awt.Color(173, 192, 234));
        buttonGroup1.add(jrbOption4);
        jrbOption4.setText("jRadioButton4");
        jPanel1.add(jrbOption4, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 440, 240, 30));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tg_image_915734271.png"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 440, 285, 30));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 485, 840, 8));

        btnpervious.setFont(new java.awt.Font("Tempus Sans ITC", 1, 16)); // NOI18N
        btnpervious.setText("Pervious");
        btnpervious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnperviousActionPerformed(evt);
            }
        });
        jPanel1.add(btnpervious, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 120, 25));

        btnnext.setFont(new java.awt.Font("Tempus Sans ITC", 1, 16)); // NOI18N
        btnnext.setText("Next");
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });
        jPanel1.add(btnnext, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 500, 120, 25));

        btndiscard.setFont(new java.awt.Font("Tempus Sans ITC", 1, 16)); // NOI18N
        btndiscard.setText("Discard");
        btndiscard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndiscardActionPerformed(evt);
            }
        });
        jPanel1.add(btndiscard, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 500, 120, 25));

        btnsubmit.setFont(new java.awt.Font("Tempus Sans ITC", 1, 16)); // NOI18N
        btnsubmit.setText("Submit");
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });
        jPanel1.add(btnsubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 500, 120, 25));

        lbltime.setFont(new java.awt.Font("Tempus Sans ITC", 1, 16)); // NOI18N
        lbltime.setForeground(new java.awt.Color(245, 4, 4));
        lbltime.setText("Time Left:-    00:00");
        jPanel1.add(lbltime, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 500, 170, 25));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
        int res=validateChooseOption();
        if(res==0){
            JOptionPane.showMessageDialog(null, "Please Select An Option ","No Select Option",JOptionPane.WARNING_MESSAGE);
            return;
        }
        AnswerList.set(counter, res);
        double per=getPercentage();
        ResultPojo result=new ResultPojo();
        result.setJobId(jobId);
        result.setpId(CurrentUser.getId());
        if(per<5){
            per=5.0;
        }
        result.setPercentage(per);
        result.setSelectedByHr("No");
        
        try{
            boolean resp=ResultDAO.setResult(result);
            if(resp==true)
            {
                JOptionPane.showMessageDialog(null, "You Got "+per+"% marks+\n And Result Has been set on your mail","Result!",JOptionPane.INFORMATION_MESSAGE);
                new PtViewAllAppliedJobsFrame().setVisible(true);
                this.dispose();
            }
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "DB Error in Take Quze " ,"Error",JOptionPane.ERROR_MESSAGE);
               ex.printStackTrace();
        }
    }//GEN-LAST:event_btnsubmitActionPerformed

    private void btnperviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnperviousActionPerformed
        int res=validateChooseOption();
        if(res==0){
            JOptionPane.showMessageDialog(null, "Please Select An Option ","No Select Option",JOptionPane.WARNING_MESSAGE);
            return;
        }
        AnswerList.set(counter, res);
        --counter;
        if(counter==-1)
        {
            counter=QuestionList.size()-1;        
        }
        showNextQuestionFrame();
        lblQno.setText(""+(counter+1)); 
    }//GEN-LAST:event_btnperviousActionPerformed

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
        int res=validateChooseOption();
        if(res==0){
            JOptionPane.showMessageDialog(null, "Please Select An Option ","No Select Option",JOptionPane.WARNING_MESSAGE);
            return;
        }
        AnswerList.set(counter, res);
        ++counter;
        if(counter==QuestionList.size())
        {
            counter=0;        
        }
        showNextQuestionFrame();
        lblQno.setText(""+(counter+1));
        
    }//GEN-LAST:event_btnnextActionPerformed
 
    private void btndiscardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndiscardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btndiscardActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PtTakeQuizeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndiscard;
    private javax.swing.JButton btnnext;
    private javax.swing.JButton btnpervious;
    private javax.swing.JButton btnsubmit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JRadioButton jrbOption1;
    private javax.swing.JRadioButton jrbOption2;
    private javax.swing.JRadioButton jrbOption3;
    private javax.swing.JRadioButton jrbOption4;
    private javax.swing.JLabel lblQno;
    private javax.swing.JLabel lbltime;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JTextArea txtquestion;
    // End of variables declaration//GEN-END:variables

}

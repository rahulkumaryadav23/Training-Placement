
package TrnPl.gui;

import TrnPl.dao.JobDAO;
import TrnPl.dao.QuestionDAO;
import TrnPl.pojo.QuestionPojo;
import java.awt.Image;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class HrEditQuizeFrame extends javax.swing.JFrame {

     int counter=0,total=0;
    private String jobId;
    private List<QuestionPojo> questionList;
    private QuestionPojo currentQuestion;
    
    
    public HrEditQuizeFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        
                
                
        Icon im = jlblworld.getIcon();
        ImageIcon icon = (ImageIcon) im;
        Image image = icon.getImage().getScaledInstance(850, 200, Image.SCALE_SMOOTH);
        jlblworld.setIcon(new ImageIcon(image));
    }
public HrEditQuizeFrame(String jobId){
    this();
    this.jobId=jobId;
    lblQno.setText(""+(counter+1));
    loadQuestionPaper();
}
private void loadQuestionPaper(){
    try{
        questionList=QuestionDAO.getQuestionPaperByJobId(jobId);
        showNextQuestionFrame();
    }
    catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "DB Error quiz...","Error in generatinh HrId",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
}
private void showNextQuestionFrame(){
     currentQuestion=questionList.get(counter);
     txtquestion.setText(currentQuestion.getQuestion());
     txtOption1.setText(currentQuestion.getOption1());
     txtOption2.setText(currentQuestion.getOption2());
     txtOption3.setText(currentQuestion.getOption3());
     txtOption4.setText(currentQuestion.getOption4());
     comCrrectOption.setSelectedIndex(currentQuestion.getCorrectOption());
}
        boolean validateInput(){
        if(txtquestion.getText().equals("")||txtOption1.getText().equals("")||txtOption2.getText().equals("")||txtOption3.equals("")||txtOption4.getText().equals("")||comCrrectOption.getSelectedIndex()==0 )
                return false;
                return true;
               
    }
     
    
    private void setQuestionList(){
        
        currentQuestion.setJoId(jobId);
        currentQuestion.setQno(counter+1);
        currentQuestion.setQuestion(txtquestion.getText().trim());
        currentQuestion.setOption1(txtOption1.getText().trim());
        currentQuestion.setOption2(txtOption2.getText().trim());
        currentQuestion.setOption3(txtOption3.getText().trim());
        currentQuestion.setOption4(txtOption4.getText().trim());
        currentQuestion.setCorrectOption(comCrrectOption.getSelectedIndex());
        
        questionList.set(counter, currentQuestion);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlblworld = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        lblQno = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtquestion = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtOption1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtOption2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtOption3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtOption4 = new javax.swing.JTextField();
        lbl = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        comCrrectOption = new javax.swing.JComboBox<>();
        jSeparator4 = new javax.swing.JSeparator();
        btnprevious = new javax.swing.JButton();
        btnnext = new javax.swing.JButton();
        btndiscard = new javax.swing.JButton();
        btnsubmit = new javax.swing.JButton();

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

        jLabel2.setFont(new java.awt.Font("Noteworthy", 1, 16)); // NOI18N
        jLabel2.setText("Qno .");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 40, 25));

        lblQno.setFont(new java.awt.Font("Noteworthy", 1, 17)); // NOI18N
        jPanel1.add(lblQno, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 30, 25));

        txtquestion.setBackground(new java.awt.Color(172, 192, 234));
        txtquestion.setColumns(20);
        txtquestion.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txtquestion.setRows(5);
        jScrollPane1.setViewportView(txtquestion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 760, 70));

        jLabel4.setFont(new java.awt.Font("Noteworthy", 1, 17)); // NOI18N
        jLabel4.setText("Options :-");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 335, 840, 8));

        txtOption1.setBackground(new java.awt.Color(172, 192, 234));
        txtOption1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txtOption1.setBorder(null);
        jPanel1.add(txtOption1, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 350, 255, 30));

        jLabel5.setFont(new java.awt.Font("Noteworthy", 1, 17)); // NOI18N
        jLabel5.setText("Option 1.");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, 25));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tg_image_915734271.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 285, 30));

        jLabel7.setFont(new java.awt.Font("Noteworthy", 1, 17)); // NOI18N
        jLabel7.setText("Option 2.");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, -1, 25));

        txtOption2.setBackground(new java.awt.Color(172, 192, 234));
        txtOption2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txtOption2.setBorder(null);
        jPanel1.add(txtOption2, new org.netbeans.lib.awtextra.AbsoluteConstraints(595, 350, 255, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tg_image_915734271.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 285, 30));

        jLabel9.setFont(new java.awt.Font("Noteworthy", 1, 17)); // NOI18N
        jLabel9.setText("Option 3.");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 410, -1, 25));

        txtOption3.setBackground(new java.awt.Color(172, 192, 234));
        txtOption3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txtOption3.setBorder(null);
        jPanel1.add(txtOption3, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 410, 255, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tg_image_915734271.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 285, 30));

        jLabel11.setFont(new java.awt.Font("Noteworthy", 1, 17)); // NOI18N
        jLabel11.setText("Option 4.");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, -1, 25));

        txtOption4.setBackground(new java.awt.Color(172, 192, 234));
        txtOption4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txtOption4.setBorder(null);
        jPanel1.add(txtOption4, new org.netbeans.lib.awtextra.AbsoluteConstraints(595, 410, 255, 30));

        lbl.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tg_image_915734271.png"))); // NOI18N
        jPanel1.add(lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 410, 285, 30));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 455, 840, 8));

        jLabel12.setFont(new java.awt.Font("Noteworthy", 1, 17)); // NOI18N
        jLabel12.setText("Correct Option");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 465, -1, 25));

        comCrrectOption.setFont(new java.awt.Font("Noteworthy", 1, 17)); // NOI18N
        comCrrectOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Correct Option", "Option 1", "Option 2", "Option 3", "Option4" }));
        jPanel1.add(comCrrectOption, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 465, 330, 30));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 840, 8));

        btnprevious.setBackground(new java.awt.Color(172, 192, 234));
        btnprevious.setFont(new java.awt.Font("Tempus Sans ITC", 1, 17)); // NOI18N
        btnprevious.setText("Previous");
        btnprevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpreviousActionPerformed(evt);
            }
        });
        jPanel1.add(btnprevious, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 120, 25));

        btnnext.setBackground(new java.awt.Color(172, 192, 234));
        btnnext.setFont(new java.awt.Font("Tempus Sans ITC", 1, 17)); // NOI18N
        btnnext.setText("Next");
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });
        jPanel1.add(btnnext, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 520, 120, 25));

        btndiscard.setBackground(new java.awt.Color(172, 192, 234));
        btndiscard.setFont(new java.awt.Font("Tempus Sans ITC", 1, 17)); // NOI18N
        btndiscard.setText("Discard");
        btndiscard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndiscardActionPerformed(evt);
            }
        });
        jPanel1.add(btndiscard, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 520, 120, 25));

        btnsubmit.setBackground(new java.awt.Color(172, 192, 234));
        btnsubmit.setFont(new java.awt.Font("Tempus Sans ITC", 1, 17)); // NOI18N
        btnsubmit.setText("Submit");
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });
        jPanel1.add(btnsubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 520, 120, 25));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    
    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
       
        if(validateInput()){
            this.setQuestionList();
            ++counter;
            if(counter==questionList.size())
            counter=0;
            lblQno.setText(""+(counter+1));
            showNextQuestionFrame();
               
            
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Please fill all the fields", "Empty Question",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnnextActionPerformed

    private void btndiscardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndiscardActionPerformed
         new HrChooseJobForEditQuizFrame().setVisible(true);
         this.dispose();
    }//GEN-LAST:event_btndiscardActionPerformed

    private void btnpreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpreviousActionPerformed
        if(validateInput()){
            this.setQuestionList();
            --counter;
            if(counter==-1)
                counter=questionList.size()-1;
            lblQno.setText(""+counter+1);
            showNextQuestionFrame();
        }
        else{
            JOptionPane.showMessageDialog(null, "Please fill all the fields", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        
    }//GEN-LAST:event_btnpreviousActionPerformed

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
        System.out.println(questionList);
        if(validateInput()){
            this.setQuestionList();
            try{
                boolean result=QuestionDAO.editQuestionPaper(questionList);
                if(result){
                    JOptionPane.showMessageDialog(null, "Paper Edited Sucessfully ", "Success",JOptionPane.INFORMATION_MESSAGE);
                    new HrChooseJobForEditQuizFrame().setVisible(true);
                    this.dispose();
                }
            }
            catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "DB Error while editing paper","Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        }
        else{
            JOptionPane.showMessageDialog(null, "Please fill all the fields", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
            
    }//GEN-LAST:event_btnsubmitActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HrEditQuizeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndiscard;
    private javax.swing.JButton btnnext;
    private javax.swing.JButton btnprevious;
    private javax.swing.JButton btnsubmit;
    private javax.swing.JComboBox<String> comCrrectOption;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel jlblworld;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lblQno;
    private javax.swing.JTextField txtOption1;
    private javax.swing.JTextField txtOption2;
    private javax.swing.JTextField txtOption3;
    private javax.swing.JTextField txtOption4;
    private javax.swing.JTextArea txtquestion;
    // End of variables declaration//GEN-END:variables
}

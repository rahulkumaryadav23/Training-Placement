
package TrnPl.dao;

import TrnPl.dbutil.DBConnection;
import TrnPl.pojo.QuestionPojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import oracle.net.nt.ConnOption;


public class QuestionDAO {
    
    public static boolean setPaper(List<QuestionPojo>questionList)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        int count=0;
        PreparedStatement ps=conn.prepareStatement("insert into questions values(?,?,?,?,?,?,?,?)");
        //PreparedStatement pp=conn.prepareStatement("select max(qno) from questions");
        for(QuestionPojo question:questionList){
            ps.setString(1, question.getJoId());
            ps.setInt(2, question.getQno());
            ps.setString(3, question.getQuestion());
            ps.setString(4, question.getOption1());
            ps.setString(5, question.getOption2());
            ps.setString(6, question.getOption3());
            ps.setString(7, question.getOption4());
            ps.setInt(8, question.getCorrectOption());
            int res=ps.executeUpdate();
            if(res==1)
                ++count;
            }
        if(count==questionList.size())
            return true;
        return false;
        
    }
    public static List<QuestionPojo> getQuestionPaperByJobId(String jobId)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select * from  questions where jobid=?");
        ps.setString(1, jobId);
        ResultSet rs=ps.executeQuery();
        
        List<QuestionPojo> questionList=new ArrayList<QuestionPojo>();
        while(rs.next()){
            QuestionPojo ques=new QuestionPojo();
            ques.setJoId(rs.getString(1));
            ques.setQno(rs.getInt(2));
            ques.setQuestion(rs.getString(3));
            ques.setOption1(rs.getString(4));
            ques.setOption2(rs.getString(5));
            ques.setOption3(rs.getString(6));
            ques.setOption4(rs.getString(7));
            ques.setCorrectOption(rs.getInt(8));
            questionList.add(ques);
            
        }
        return questionList;
    }
    
    public static boolean editQuestionPaper(List<QuestionPojo>questionList)throws SQLException{
         Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update questions set question=? ,option1=?, option2=?,option3=?, option4=?,correctOption=? where jobid=? and qno=?");
        
        int count=0;
        for(QuestionPojo ques:questionList){
            ps.setString(1, ques.getQuestion());
            ps.setString(2, ques.getOption1());
            ps.setString(3, ques.getOption2());
            ps.setString(4, ques.getOption3());
            ps.setString(5, ques.getOption4());
            ps.setInt(6, ques.getCorrectOption());
            ps.setString(7, ques.getJoId());
            ps.setInt(8, ques.getQno());
            int res=ps.executeUpdate();
            if(res==1)
               ++count; 
            
        }
        return count==questionList.size();
    }
    
    
}

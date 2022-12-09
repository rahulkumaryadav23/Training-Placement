 
package TrnPl.dao;

import TrnPl.dbutil.DBConnection;
import TrnPl.pojo.HrPojo;
import TrnPl.pojo.JobPojo;
import TrnPl.pojo.ParticipantJobPojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class JobDAO {
    
    public static int getNewJobId()throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("select max(jobid) from jobs");
        rs.next();
       String strid=rs.getString(1);
       int jobId=101;
       if(strid!=null){
           String id=strid.substring(4);
           jobId=Integer.parseInt(id)+1;
       }
       return jobId;
    }
    
    public static boolean addNewJob(JobPojo job)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("insert into jobs values(?,?,?,?,?)");
        ps.setString(1, job.getJobId());
        ps.setString(2, job.getJobTitle());
        ps.setString(3, job.getHrId());
        ps.setString(4, job.getTags());
        ps.setInt(5, job.getStatus());
        return 1==ps.executeUpdate();
    }
    
    public static List <JobPojo> getAllactiveJobByCurrentHr(String hrId)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("Select jobid,jobtitle,tags,status from jobs where hrid=? and status!=-1");
        ps.setString(1, hrId);
        ResultSet rs=ps.executeQuery();
        
        List <JobPojo> alljobsList=new ArrayList<>();
        while(rs.next()){
            JobPojo obj=new JobPojo();
            obj.setJobId(rs.getString(1));
            obj.setJobTitle(rs.getString(2));
            obj.setTags(rs.getString(3));
            obj.setStatus(rs.getInt(4));
                      
            alljobsList.add(obj);
        }
        
        return alljobsList; 
        }
    
     public static List <JobPojo> getAllactiveJobByCurrentHrForSettingQuiz(String hrId)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("Select jobid,jobtitle,tags,status from jobs where hrid=? and status=0");
        ps.setString(1, hrId);
        ResultSet rs=ps.executeQuery();
        
        List <JobPojo> alljobsList=new ArrayList<>();
        while(rs.next()){
            JobPojo obj=new JobPojo();
            obj.setJobId(rs.getString(1));
            obj.setJobTitle(rs.getString(2));
            obj.setTags(rs.getString(3));
            obj.setStatus(rs.getInt(4));
                      
            alljobsList.add(obj);
        }
        
        return alljobsList; 
        }
    
    
      public static boolean removeJobbyJobId(String JobId)throws SQLException
      {
          Connection conn=DBConnection.getConnection();
          PreparedStatement ps=conn.prepareStatement("update jobs set status=-1 where jobid=?");
          ps.setString(1, JobId);
          return ps.executeUpdate()==1; 
      }
      
      public static List <JobPojo> getAllEditableJobByCurrentHr(String hrId)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("Select jobid,jobtitle,tags,status from jobs where hrid=? and status=0");
        ps.setString(1, hrId);
        ResultSet rs=ps.executeQuery();
        
        List <JobPojo> alljobsList=new ArrayList<>();
        while(rs.next()){
            JobPojo obj=new JobPojo();
            obj.setJobId(rs.getString(1));
            obj.setJobTitle(rs.getString(2));
            obj.setTags(rs.getString(3));
            obj.setStatus(rs.getInt(4));
                      
            alljobsList.add(obj);
        }
        
        return alljobsList; 
        }
      
      public static boolean editJobByJobId(JobPojo job)throws SQLException{
          Connection conn=DBConnection.getConnection();
          PreparedStatement ps=conn.prepareStatement("update jobs set jobtitle=?,tags=? where jobid=?");
          ps.setString(1, job.getJobTitle());
          ps.setString(2, job.getTags());
          ps.setString(3, job.getJobId());
          
          return 1==ps.executeUpdate();
      }
      
      public static void setJobStatus(String jobId)throws SQLException{
          PreparedStatement ps;
          ps=DBConnection.getConnection().prepareStatement("update jobs set status=1 where jobId=?");
          ps.setString(1, jobId);
          ps.executeUpdate();
      }
      
      public static List <JobPojo> getAllOpenJobByCurrentHr(String hrId)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("Select jobid,jobtitle,tags,status from jobs where hrid=? and status=1 order by jobid");
        ps.setString(1, hrId);
        ResultSet rs=ps.executeQuery();
        
        List <JobPojo> alljobsList=new ArrayList<>();
        while(rs.next()){
            JobPojo obj=new JobPojo();
            obj.setJobId(rs.getString(1));
            obj.setJobTitle(rs.getString(2));
            obj.setTags(rs.getString(3));
            obj.setStatus(rs.getInt(4));
                      
            alljobsList.add(obj);
        }
        
        return alljobsList; 
        }
      
      public static List<ParticipantJobPojo> getallOpenJobsAdmin() throws SQLException{
         // Connection conn=DBConnection.getConnection();
          Statement st=DBConnection.getConnection().createStatement();
          ResultSet rs=st.executeQuery("select jobid,jobtitle,companyname,tags,status,jobs.hrid from jobs,hr where jobs.hrid=hr.hrid   order by jobid "); 
          List<ParticipantJobPojo> allOpenJobsList=new ArrayList<>();
         while(rs.next()){
             ParticipantJobPojo obj=new ParticipantJobPojo();
             obj.setJobId(rs.getString(1));
             obj.setJobTitle(rs.getString(2));
             obj.setCompanyname(rs.getString(3));
             obj.setTags(rs.getString(4));
             obj.setStatus(rs.getInt(5));
             allOpenJobsList.add(obj);

      }
         return allOpenJobsList;
}
      public static List<ParticipantJobPojo> getAllAvailableJobs() throws SQLException{
          Connection conn=DBConnection.getConnection();
          Statement st=conn.createStatement();
          ResultSet rs=st.executeQuery("select jobid,jobtitle,companyname,tags,jobs.hrid from jobs,hr where jobs.hrid=hr.hrid and status=1 order by jobid");
          List<ParticipantJobPojo> allAvailablejobsList=new ArrayList<>();
          while(rs.next()){
              ParticipantJobPojo obj=new ParticipantJobPojo();
              obj.setJobId(rs.getString(1));
              obj.setJobTitle(rs.getString(2));
              obj.setCompanyname(rs.getString(3));
              obj.setTags(rs.getString(4));
              allAvailablejobsList.add(obj);
              
          }
          return allAvailablejobsList;
      }
      
}

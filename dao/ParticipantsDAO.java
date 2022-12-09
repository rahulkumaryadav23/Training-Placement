
package TrnPl.dao;

import TrnPl.dbutil.DBConnection;
import TrnPl.pojo.HrPojo;
import TrnPl.pojo.ParticipantsPojo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class ParticipantsDAO {
    public static int getNewParticipantsId()throws SQLException{
        Connection con=DBConnection.getConnection();
        Statement st=con.createStatement();
        
        ResultSet rs=st.executeQuery("select max(pid) from participants");
        int pId=101;
        rs.next();
        
            String strid=rs.getString(1);
            if(strid!=null){
            String id=strid.substring(2);
            pId=Integer.parseInt(id)+1;
            }
        return pId;
    }
    
    public static int addNewParticipant(ParticipantsPojo pt)throws SQLException,FileNotFoundException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select userid from users where userid=?");
        ps.setString(1, pt.getUserId().toUpperCase().trim());
       
        ResultSet rs=ps.executeQuery();
        
        if(rs.next()){
            return -1;
        }
        ps=conn.prepareStatement("insert into users values(?,?,?,?,?,?)");
            ps.setString(1, pt.getUserId());
            ps.setString(2, pt.getpId());
            ps.setString(3, pt.getName());
            ps.setString(4 , pt.getPassword());
            ps.setString(5 , pt.getType());
            ps.setString(6 , "Y");
            int x=ps.executeUpdate();
            
            int y=0;
            if(x==1){
                ps=conn.prepareStatement("insert into participants values(?,?,?,?,?)");
            ps.setString(1, pt.getpId());
            ps.setString(2, pt.getPhone());
            ps.setString(3, pt.getSkills());
            ps.setString(4 , pt.getQulification());
            File f=pt.getResume();
            InputStream file=new FileInputStream(f.getPath());
            ps.setBlob(5, file);
            y=ps.executeUpdate();
            }
           return y;
    }

public static List <ParticipantsPojo> getAllStudent()throws SQLException{
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("select participants.pid,users.userid,users.name,participants.phone,participants.qualification from users,participants where participants.pid=users.id   order by participants.pid");
        List <ParticipantsPojo> allStudent=new ArrayList<>();
        while(rs.next()){
            ParticipantsPojo obj=new ParticipantsPojo();
            obj.setpId(rs.getString(1));
            obj.setName(rs.getString(2));
            obj.setUserId(rs.getString(3));
            obj.setPhone(rs.getString(4));
            obj.setQulification(rs.getString(5));
            allStudent.add(obj);
            
             }
        return allStudent;
    }

public static ParticipantsPojo getParticipantById(String id)throws SQLException{
    Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select name,userid,phone from  users,participants where users.id=participants.pid and pid=?");
        ps.setString(1,  id);
        ResultSet rs=ps.executeQuery();
        rs.next();
        ParticipantsPojo pt=new ParticipantsPojo();
        pt.setName(rs.getString(1));
        pt.setUserId(rs.getString(2));
        pt.setPhone(rs.getString(3));
         return pt;
}

public static boolean updateResume(String pId,File file)throws SQLException,FileNotFoundException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update participants set resume=? where pid=?");
        FileInputStream resume = new FileInputStream(file);
        ps.setBlob(1,resume);
        ps.setString(2,pId);
        return ps.executeUpdate()==1;   
    }

}

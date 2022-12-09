
package TrnPl.dao;

import TrnPl.dbutil.DBConnection;
import TrnPl.pojo.CurrentUser;
import TrnPl.pojo.HrPojo;
import TrnPl.pojo.UserPojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;


public class UsersDAO {
    public static boolean validateUsers(UserPojo user) throws Exception
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select * from users where userid=? and password=? and type=? and active='Y'");
        
        ps.setString(1, user.getUserid());
        ps.setString(2, user.getPassword());
        ps.setString(3, user.getType());
        
        ResultSet rs=ps.executeQuery();
        if(rs.next())
        {
        CurrentUser.setUserId(rs.getString(1));
        CurrentUser.setId(rs.getString(2));
        CurrentUser.setName(rs.getString(3));
        CurrentUser.setType(rs.getString(5));
        
        return true;
        }
        return false;
        
    }
    public static Map<String,HrPojo> getHrList() throws SQLException{
    Connection conn=DBConnection.getConnection();
    Statement st=conn.createStatement();
     ResultSet rs=st.executeQuery("select userid,id,name from users where type='Hr'");
    Map<String,HrPojo> allHr=new HashMap<>();
    while(rs.next())
    {
        String userid=rs.getString(1);
        String hrid=rs.getString(2);
        String name=rs.getString(3);
        HrPojo obj=new HrPojo();
        obj.setHrId(hrid);
        obj.setHrName(name);
        allHr.put(userid, obj);
    }
        return allHr; 
    }
    
    
    public static boolean updatePwd(String userId, String password)throws SQLException{
        Connection conn= DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update users set password=? ,active='Y' where userid=?");
        ps.setString(1,password);
        ps.setString(2, userId);
        return 1==ps.executeUpdate();    
    }
    
    public static boolean removeHr(String userId)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update users set active='N' where userid=?");
        ps.setString(1, userId);
        return 1==ps.executeUpdate();         
    } 
    public static boolean checkOldPassword(String pId,String oldPwd)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select * from users where password=? and id=?");
        ps.setString(1, oldPwd);
        ps.setString(2,pId);
        ResultSet rs=ps.executeQuery();
        return rs.next();
        
    }
public static boolean updateParticipantPassword(String pId,String pwd)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update users set password=? where id=?");
        ps.setString(1, pwd);
        ps.setString(2,pId);
        return ps.executeUpdate()==1;
    }

}

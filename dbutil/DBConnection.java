
package TrnPl.dbutil;

import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class DBConnection 
{
    private static Connection conn;
    static 
    {
        try
            //DESKTOP-DQ1F4FU:1521/XE
        {
           Class.forName("oracle.jdbc.OracleDriver");
           conn=DriverManager.getConnection("jdbc:oracle:thin:@//DESKTOP-U9M91UJ:1521/XE","tnp","abc");
           JOptionPane.showMessageDialog(null, "Connect in sucessfully to DB");
        }
        catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null,"Error Driver loading"+ex.getMessage());
            ex.printStackTrace();
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Error in the opening  conn to DB"+ex.getMessage());
            ex.printStackTrace();
        }
    }
        public static Connection getConnection()
        {
            return conn;
        }
        public static void coloseConnection(){
        try{
            conn.close();
            JOptionPane.showMessageDialog(null, "Discunnected Sucessfully to the DB");
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Error in  closing  the conn to DB"+ex.getMessage());
            ex.printStackTrace();
        }
        }
}

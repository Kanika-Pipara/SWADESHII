
package connect;
import java.sql.*;

public class MyConnection
{
    static
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static Connection getConnection() throws SQLException 
    {
        Connection con;
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/swadeshi","root","root");
        return con;
    }
    
}

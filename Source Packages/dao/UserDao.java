package dao;

import connect.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.User;

public class UserDao 
{
    public User loginUser(String user,String paw) throws SQLException 
    {
        String sql;
        Connection con;
        
        PreparedStatement ps;
        User S=new User();
        con=MyConnection.getConnection();
        sql="select * from user where username=? and pass=?";
        ps=con.prepareStatement(sql);
        ps.setString(1, user);
        ps.setString(2, paw);
        ResultSet rs;
        rs=ps.executeQuery();
        if(rs.next())
        {
            S.setName(rs.getString(1));
            S.setUsern(rs.getString(2));
            S.setEmail(rs.getString(3));
            S.setPaw(rs.getString(4));
            return S;
        }
        S=null;
        return S;
    }
    
    public boolean checkDatabase(String mail,String user) throws SQLException
    {
        String sql,sql1;
        Connection con;
        PreparedStatement ps;
        ResultSet rs,rs1;
        con=MyConnection.getConnection();
        sql="select * from user where email=?";
        ps=con.prepareStatement(sql);
        ps.setString(1, mail);
        rs=ps.executeQuery();
        sql1="select * from user where username=?";
        ps=con.prepareStatement(sql1);
        ps.setString(1,user);
        rs1=ps.executeQuery();
        return(rs.next()|rs1.next());
    }
    
    public boolean registerUser(User S) throws SQLException
    {
        String sql;
        Connection con;
        PreparedStatement ps;
        con=MyConnection.getConnection();
        sql="insert into user values(?,?,?,?)";
        ps=con.prepareStatement(sql);
        ps.setString(1,S.getName());
        ps.setString(2,S.getUsern());
        ps.setString(3,S.getEmail());
        ps.setString(4,S.getPaw());
        if(checkDatabase(S.getEmail(),S.getUsern()))
            return false;
        else
        {
            return (ps.executeUpdate()>0);
        }
    }
}

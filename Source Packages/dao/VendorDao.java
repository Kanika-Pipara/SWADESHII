
package dao;

import connect.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Vendor;

public class VendorDao 
{
    
    public boolean checkDatabase(String mail,double phon) throws SQLException
    {
        String sql;
        Connection con;
        PreparedStatement ps;
        ResultSet rs,rs1;
        con=MyConnection.getConnection();
        sql="select * from vendor where email=?";
        ps=con.prepareStatement(sql);
        ps.setString(1, mail);
        rs=ps.executeQuery();
        sql="select * from vendor where contact=?";
        ps=con.prepareStatement(sql);
        ps.setDouble(1, phon);
        rs1=ps.executeQuery();
        return(rs.next()|rs1.next());
    }
    
    public boolean vendorRequest(Vendor S) throws SQLException
    {
        String sql;
        Connection con;
        PreparedStatement ps;
        con=MyConnection.getConnection();
        sql="insert into vendor values(?,?,?,?,?)";
        ps=con.prepareStatement(sql);
        ps.setString(1,S.getName());
        ps.setString(2,S.getEmail());
        ps.setDouble(3,S.getPhone());
        ps.setString(4,S.getCategory());
        ps.setString(5,S.getCity());
        if(checkDatabase(S.getEmail(),S.getPhone()))
            return false;
        else
        {
            return (ps.executeUpdate()>0);
        }
    }
    
    public List<Vendor> searchVendor(String category,String city) throws SQLException
    {
        String sql;
        sql="select * from vendor where category=? and city=?";
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        con=MyConnection.getConnection();
        ps=con.prepareStatement(sql);
        List<Vendor>VC=new ArrayList<Vendor>();
        ps.setString(1,category);
        ps.setString(2,city);
        rs=ps.executeQuery();
        while(rs.next())
        {
            Vendor S=new Vendor();
            S.setName(rs.getString(1));
            S.setEmail(rs.getString(2));
            S.setPhone(rs.getDouble(3));
            S.setCategory(rs.getString(4));
            S.setCity(rs.getString(5));
            VC.add(S);
        }
        return VC;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;

/**
 *
 * @author Harsh Saini
 */
public class dblink {
    public Statement dlink() throws SQLException
    {
     Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/mainlogin","vinay","vinay");
     Statement st=conn.createStatement();
     return st;
    
    }
            
    
}

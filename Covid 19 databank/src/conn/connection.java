/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conn;
import java.sql.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;


/**
 *
 * @author sasin
 */


public class connection {
        private static String pass,uname,url;
        private static Connection con;
    public static Connection connect()
    {
        
        url = "jdbc:mysql://localhost:3306/databank"; 
        pass = "";
        uname = "root";
        con = null;
        
        try{
         Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(url,uname,pass);
        
        
        }catch(Exception e)
        {
            System.out.println(e.toString());
        }
        
        return con;
    }
    
   
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conn;

import java.sql.ResultSet;
import conn.connection;
import java.sql.*;
import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author sasin
 */
public class vaccinedPData {
    
    public static int COUNT;
    public static int AFCOUNT;
    public static void count()
    {
       try{
           
           Connection con = connection.connect();
            //create statement
            Statement st = con.createStatement();
            
            //count vaccined perosons
            String query1 = "select count(id) from addvacc;";
            
              ResultSet rs1 = st.executeQuery(query1);
            
            if(rs1.next())
            {
               //store count data 
               
               COUNT = rs1.getInt("count(id)");
                
            }
       }
       catch(Exception e){
           System.out.println(e.toString());
       }
    }
    
    
     public static void affected()
    {
       try{
           
           Connection con = connection.connect();
            //create statement
            Statement st = con.createStatement();
            
            //count affected perosons
            String query1 = "select count(id) from addvacc where covidAffect = 'yes';";
            
              ResultSet rs1 = st.executeQuery(query1);
            
            if(rs1.next())
            {
             
               //store count data 
               
               AFCOUNT = rs1.getInt("count(id)");
                
            }
       }
       catch(Exception e){
           System.out.println(e.toString());
       }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conn;

/**
 *
 * @author sasin
 */
public class positionDetails {
    //getting postion details
    public static String DID,DMAIL,DNAME;
    public static void position(String id, String mail, String dname)
    {
        DID = id;
        DMAIL = mail;
        DNAME = dname;
    }
    
    public static String did()
    {
        return DID;
    }
     public static String mail()
    {
        return DMAIL;
    }
      public static String dname()
    {
        return DNAME;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auction;
import java.sql.*;

/**
 *
 * @author nisch
 */
public class GlobalConnection {
    public static final String Url="jdbc:mysql://localhost:3306/auctions"; //here auctions is db name
    public static final String DatabaseUser="root";
    public static final String DatabasePassword="root";
    public static Connection conn=null;
    public static Statement stmt=null;
    public void Connection(){  
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn=DriverManager.getConnection(Url,DatabaseUser,DatabasePassword);
            stmt = conn.createStatement();
        }
          catch(Exception e){
            System.out.println("Db connection error occured" +e);
        }
      
    }
    
}

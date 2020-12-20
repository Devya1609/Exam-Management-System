
package projectconnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProj {
    
    public static Connection getConnection() {
        Connection con = null;
        String JdbcURL = "jdbc:mysql://localhost:3306/examanagesystem?" + "autoReconnect=true&useSSL=false";
        String Username = "root";
        String password = "root";
      
      try {
         con = DriverManager.getConnection(JdbcURL, Username, password);
         return con;
        // System.out.println("Your JDBC URL is as follows:" + JdbcURL);
      } catch (Exception exec) {
            exec.printStackTrace();
            return null;
      }
   }

    
}

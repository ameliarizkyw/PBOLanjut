
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Conection {
private String database = "projectuas";
  private String url = "jdbc:mysql://localhost/" + database;
  private String username = "root";
  private String password = "";
  private Connection kon;
  private Statement stm;

  
  public Conection(){
      try {
         Class.forName("com.mysql.jdbc.Driver");
         kon = DriverManager.getConnection(url, username, password);
         stm = kon.createStatement();
      } catch (Exception e) {
          System.err.println("koneksi gagal" + e.getMessage());
      }
           
    }
  public Connection getKon(){
      return kon;
  }
  
  public Statement getStm(){
      return stm;
  }
  
  
  
  }


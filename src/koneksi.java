
import java.sql.Connection;
import java.sql.DriverManager;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author riska
 */
public class koneksi {
    public Connection bukakoneksi(){         
          Connection con=null;         
          try{             
              Class.forName("com.mysql.jdbc.Driver");             
              con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/java2db","root","");             System.out.println("berhasil");             return con;         }         catch (Exception e){             System.out.println("gagal");             return null;         }     }     
      public static void main (String args[]){         
          new koneksi().bukakoneksi();
}
}

package cab_booking;
import java.sql.*;
/**
 *
 * @author Sejal
 */
public class ConnectionClass {
   public Connection con;
    Statement stm;
  ConnectionClass(){
      try
      {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cab_booking","root","123456");
        stm=con.createStatement();
        
        if(con.isClosed()){
            System.out.println("yes");
        }else{
            System.out.println("No");
        }
      }
      catch(Exception ex){
          ex.printStackTrace();
       }
  }  
  public static void main(String args[]){
       ConnectionClass connectionClass = new ConnectionClass();
  }
}


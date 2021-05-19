
import java.sql.*;
public class DBConnect {
    public static void main(String[] args) {

               try{
                   String host = "jdbc:mysql://localhost:3306/employee";
                   String uName ="root";
                   String uPass = "root";
                   Connection con = DriverManager.getConnection(host,uName,uPass);

                   Statement stat = con.createStatement();
                   String sql = "select * from workers";
                   ResultSet rs = stat.executeQuery(sql);

                  while(rs.next());
                   int id = rs.getInt("ID");
                   String firstname  =  rs.getString("First name");
                   String lastname  =  rs.getString("Last name");
                   String job  =  rs.getString("Job");

                   String N = id + " " + firstname + " " + lastname + " " + job ;
                   System.out.println(N);



               } catch (SQLException err) {
                   System.out.println(err.getMessage());
               }

    }
}

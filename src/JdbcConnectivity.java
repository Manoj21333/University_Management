import java.sql.*;

public class JdbcConnectivity {
    Connection c;
    Statement s;
    JdbcConnectivity(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");//register of driver class
     //making connection string
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/UniversityManagementSystem","root","Manoj@123");
            s=c.createStatement();//create statement
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

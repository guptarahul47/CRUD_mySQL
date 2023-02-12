import java.sql.*;
import java.util.concurrent.locks.StampedLock;

public class CRUD_INSERT {
    public static void main(String[]args){
        try{
            // Loading the driver
            Class.forName("com.mysql.jdbc.Driver");

            //creating a connection
            String url="jdbc:mysql://localhost:3306/vaibhav";
            String username="root";
            String password="Mummy@80";
            Connection con=DriverManager.getConnection(url,username,password);
             // Inserting into Table
            String s="insert into table1(task,is_completed,end_date) values(?,?,?)";

            // set the values to query
            PreparedStatement pstmt=con.prepareStatement(s);
            pstmt.setString(1,"COMPLETED",9999-12-31);
            pstmt.setString(1,"COMPLETED",9999-12-31);
            pstmt.setString(1,"COMPLETED",9999-12-31);
            pstmt.executeUpdate();

            System.out.println("inserted");

            con.close();
        }catch (Exception e){

        }
    }
}

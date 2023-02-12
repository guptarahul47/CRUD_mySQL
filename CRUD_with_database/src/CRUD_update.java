import java.sql.Connection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class CRUD_update
{
    public static void main(String args[]){
        try{
            Connection con=ConnectionProvider.getConnection();
            String q="update table1 set task=? ,is_completed=? , end_date=? where task=?";
            BufferReader br= new BufferReader (new InputStringReader(System.in));
            System.out.println("ENter new task:");
            String completed=br.readLine();

            System.out.println("ENter new completed task:");
            String date=br.readLine();

            System.out.println("ENter new date:");
            int Task=Integer.ParseInt(br.readLine());

            PreparedStatement pstmt=con.prepareStatement(q);
            pstmt.setString(Task,completed,date);
            pstmt.setString(Task,completed,date);
            pstmt.setString(Task,completed,date);
            pstmt.executeUpdate();
            System.out.println("done ..............");
            con.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

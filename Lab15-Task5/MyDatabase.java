import java.sql.*;

public class MyDatabase{
    public static void main(String[]args)
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oop-lab15","root","");
            
            PreparedStatement ps=con.prepareStatement("delete from students WHERE year='First'");
            ps.executeUpdate(); 
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

import java.sql.*;

public class MyDatabase{
    public static void main(String[]args)
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oop-lab15","root","");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select * from students WHERE semester=2");
            int i=1;
            while(rs.next()){
                System.out.println("********Student "+i+"********");
                System.out.println("Roll No: "+rs.getString(1));
                System.out.println("Name: "+rs.getString(2));
                System.out.println("Batch: "+rs.getInt(3));
                System.out.println("Department: "+rs.getString(4));
                System.out.println("Year: "+rs.getString(5));
                System.out.println("Semester: "+rs.getInt(6));
                i++;
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

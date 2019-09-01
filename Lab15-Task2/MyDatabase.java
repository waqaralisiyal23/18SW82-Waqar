import java.sql.*;

import javax.swing.JOptionPane;

public class MyDatabase{
    public static void main(String[]args)
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oop-lab15","root","");

            String []rollNums = {"18SW82","17SW74","18SW70","16SW56","16SW52"};
            String []names = {"Waqar","Imtiaz","Uzair","Ahmed","Usama"};
            int []batch = {18,17,18,16,16};
            String []dept = {"Software","Software","Software","Software","Software"};
            String []year = {"First","Second","First","Fourth","Fourth"};
            int []semester = {2,4,2,7,7};
            PreparedStatement ps;
            for(int i=0;i<5;i++){
                ps = con.prepareStatement("insert into students(rollnum,name,batch,dept,year,semester) values(?,?,?,?,?,?)");
                ps.setString(1, rollNums[i]);
                ps.setString(2, names[i]);
                ps.setInt(3, batch[i]);
                ps.setString(4, dept[i]);
                ps.setString(5, year[i]);
                ps.setInt(6, semester[i]); 
                ps.executeUpdate();
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

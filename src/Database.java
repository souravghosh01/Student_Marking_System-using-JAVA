
import java.sql.*;

public class Database {
    
    public void result(String query)
    {
        try {
               Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
            Statement stmt=con.createStatement();
            stmt.executeUpdate(query);
        } catch (ClassNotFoundException | SQLException ex) {
            ex.getMessage();
        }
     
        
    }
    public ResultSet resultWithReturn(String query)
    {
        
    try {
        Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(query);
            return rs;
    } catch (ClassNotFoundException | SQLException ex) {
        
    }
        return null;
   
         
        }
        
    }
    




package mini.project;

import java.sql.*;

public class Connections {
    public static void main(String[] args) {
        try{ 
            String url = "jdbc:mysql://localhost:3306/demo";
            String user = "root";
            String pass = "";
            String query = "insert into stdu values('1CR19MCA08', 'SHASHI',20)";
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection(url,user,pass);  
  
            Statement stmt = con.createStatement();  
            int count = stmt.executeUpdate(query);  
                System.out.println("Sucess");  
            con.close();  
        }catch(Exception e){
            System.out.println(e);
        }  
    }  
}

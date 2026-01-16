package JDBC;

import java.lang.management.ManagementFactory;
import java.sql.*;

public class CreateStatement {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/food_001";
        String un="root";
        String pw="Vishnu#08";
        String query="Select * from users";

        ResultSet res=null;
        Statement statement=null;
        Connection connection=null;

        try{
            // loading class
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Driver connected
            connection = DriverManager.getConnection(url, un, pw);
            // statement
            statement= connection.createStatement();
            //result set
            res= statement.executeQuery(query);
            while (res.next()) {
                System.out.println(res.getInt(1)+" | "+res.getString(2)+" | "+res.getString(3));
            }

        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                res.close();
                statement.close();
                connection.close();
                System.out.println("connection closed");
            }
            catch (SQLException e){
                e.printStackTrace();
            }
        }
    }

}

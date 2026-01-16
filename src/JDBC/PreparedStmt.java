package JDBC;

import java.sql.*;
import java.util.Scanner;

public class PreparedStmt {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/food_001";
        String un = "root";
        String pw = "Vishnu#08";
        String query = "Insert into users (`user_id`,`user_name`,`city`,`signup_date`) values (?,?,?,?)";

        Connection connection = null;
        PreparedStatement pstmt = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("ok");

            Scanner scanner = new Scanner(System.in);
            connection = DriverManager.getConnection(url, un, pw);

            pstmt = connection.prepareStatement(query);

            System.out.println("enter id");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter name :");
            String name = scanner.nextLine();

            System.out.println("enter location :");
            String city = scanner.nextLine();

            System.out.println("Enter date of login:");
            String date = scanner.nextLine();

            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.setString(3, city);
            pstmt.setString(4, date);

            pstmt.execute();


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
                pstmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

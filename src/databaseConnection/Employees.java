package databaseConnection;

import java.sql.*;

public class Employees {

    public static void main(String[] args) throws SQLException {

        String url="jdbc:mysql://localhost:3306/pnt_mujahid?serverTimezone=UTC"; //pnt_mujahid is scehams
        String user = "root";
        String password = "shohel_SHIPON20";

        try {// Connention is the built in method
            Connection connection= DriverManager.getConnection(url, user, password);
            System.out.println("Connection to the database");
// Now, i am writing some code to INSERT SQL table through Intellij
// SQL command INSERT INTO the employees table
            String sql = "INSERT INTO employees(Sl, firstName, lastName, phoneNumber, email) VALUE (?,?,?,?, ?)";
// We create a prepared statement
              PreparedStatement statement=connection.prepareStatement(sql);

            statement.setString(1, "123");
            statement.setString(2, "Mujahid");
            statement.setString(3, "Islam");
            statement.setString(4, "4578962314");
            statement.setString(5, "statement@gmail.com");

//            statement.setString(1, "213");
//            statement.setString(2, "Selim");
//            statement.setString(3, "Reza");
//            statement.setString(4, "4577572314");
//            statement.setString(5, "selim@gmail.com");

            int rows = statement.executeUpdate();
            if (rows>0){
                System.out.println("A row has been inserted");
            }

        }catch (SQLDataException e){
            System.out.println("Error");
            //e.printSta();ckTrace
        }

    }
}

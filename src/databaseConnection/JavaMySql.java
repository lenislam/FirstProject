package databaseConnection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JavaMySql {

    public static void main(String[] args) throws SQLException, IOException {
        String url = "jdbc:mysql://localhost:3306/pnt_mujahid?serverTimezone=UTC";
        String user = "root";
        String password = "shohel_SHIPON20";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database");
            String sql1 ="SELECT * FROM customer";
            Statement statement1 = connection.createStatement();
            ResultSet result = statement1.executeQuery(sql1);
            int count =0;
            while (result.next()){
                String firstname = result.getString("firstname");
                String lastname = result.getString("lastname");
                count++;
                System.out.println("Customer "+ count + ": "+ firstname+ " "+ lastname);
            }


         String sql= "INSERT INTO customer (firstname, lastname) VALUES (?,?)";
            PreparedStatement statement=connection.prepareStatement(sql);
            statement.setString(1,"Mizan");
            statement.setString(2," Khan");
            statement.setString(1,"Mujahid");
            statement.setString(2,"Islam");

            int rows = statement.executeUpdate();
            if (rows > 0) {
                System.out.println("A row has been inserted");
            }
        }catch(Exception e){
            System.out.println("Error");
            e.printStackTrace();

        }
    }
}

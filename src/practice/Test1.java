package practice;


import java.sql.*;

public class Test1 {


    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/pnt_mujahid?serverTimezone=UTC"; //pnt_mujahid is scehams
        String user = "root";
        String password = "shohel_SHIPON20";

        try {// Connention is the built in method
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection to the database");
            String sql1 = "SELECT * FROM employees";
            Statement statement1=connection.createStatement();
            ResultSet result = statement1.executeQuery(sql1);
            int count =0;
            while(result.next()){
                String Id = result.getString("Sl");
                String firstName = result.getString("firstName");
                String lastName = result.getString("lastName");
                String phoneNumber = result.getString("phoneNumber");
                String email = result.getString("email");
                count++;
                System.out.println("Customer" + count + ":" + Id +" " + firstName + " " + lastName + " " +
                        phoneNumber + " " + email);
            }


        } catch (SQLDataException e) {
            System.out.println("Error");

        }
    }
}

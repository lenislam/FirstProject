package databaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;

public class TestStudents {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/pnt?serverTimezone=UTC";
        String user = "root";
        String password = "shohel_SHIPON20";
        Connection connection = null;
        Statement statement = null;

        Students mizan = new Students(001, "Mizan", "null", "12345680");
        Students raza = new Students(002, "Raza", "null", "123456786");
        Students sharif = new Students(003, "Sharif", "null", "123456789");
        Students jony = new Students(004, "Jony", "null", "123456897");

        ArrayList<Students> stu = new ArrayList<>();
        stu.add(mizan);
        stu.add(raza);
        stu.add(sharif);
        stu.add(jony);

        try {
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
            for (Students st : stu) {
                String query = "insert into students ( id, firstName, lastName, contactNumber)" +
                        " values( " + st.getId() + ",'" + st.getFirstName() + "'," + st.getLastName() + ",'" + st.getContactNumber() + "') ";
                statement.execute(query);
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("exception is being handled");

        } finally {
            statement.close();
            connection.close();
        }
    }
}

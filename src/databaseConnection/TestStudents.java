package databaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;

public class TestStudents {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/pnt_mujahid?serverTimezone=UTC";
        String user = "root";
        String password = "shohel_SHIPON20";
        Connection connection = null;
        Statement statement = null;

        Students mizan = new Students(001, "Mizan", "Khan", "12345680","AAA");
        Students raza = new Students(002, "Raza", "Islam", "123456786","AA");
        Students sharif = new Students(003, "Sharif", "Vai", "123456789","A");
        Students jony = new Students(004, "Jony", "Hossain", "123456897","F");

        ArrayList<Students> stu = new ArrayList<>();
        stu.add(mizan);
        stu.add(raza);
        stu.add(sharif);
        stu.add(jony);
//VARCHAR ' '
        try {
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
            for (Students st : stu) {
               String query = "insert into students ( id, firstName, lastName, contactNumber, grade)" +
                     " values( " + st.getId() + ",'" + st.getFirstName() + "','" + st.getLastName() + "','" + st.getContactNumber() + "','"+st.getGrade()+"') ";
                //String query = "update students set firstName='Mujahid' where id = 001;" ;
                statement.execute(query);
            }
//update students set firstName='shak' where id =001;
        } catch (Exception e) {
           // e.printStackTrace();
            System.out.println("exception is being handled");

        } finally {
            statement.close();
            connection.close();
        }
    }
}

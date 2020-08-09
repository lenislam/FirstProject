package databaseConnection;

//import mentoring.slide.ArrayFirst;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;

public class TestMovie {

    public static void main(String[] args) throws Exception {
        //JDBC connection
        String url = "jdbc:mysql://localhost:3306/pnt_mujahid?serverTimezone=UTC";
        String user = "root";
        String password = "shohel_SHIPON20";

        Connection connection=null;
        Statement statement = null;

        Movie titanic = new Movie(01,"Titanic",1997, "Romance","PG-10");
        Movie spotlight = new Movie(02,"Spotlight",1987, "Documentary","PG-11");
        Movie gentleman = new Movie(03,"Gentleman",2001, "Thriller","PG-12");
        Movie joker = new Movie(04,"Joker",1990, "Horro","PG-13");
        Movie braveheart = new Movie(05,"Braveheart",1989, "Action","PG-14");

        ArrayList<Movie> mv = new ArrayList<>();
        mv.add(titanic);
        mv.add(spotlight);
        mv.add(gentleman);
        mv.add(joker);
        mv.add(braveheart);

        try {
            connection = DriverManager.getConnection(url, user, password);
            for (Movie mv1 : mv){
                String query = "insert into mv1(id, title, releaseYear, genre, mpaarating )" +
                      " value(" + mv1.getId()+",'"+ mv1.getTitle()+"', "+ mv1.getRaleaseYear()
                        +",'"+ mv1.getGenre()+"','"+ mv1.getMpaaRating()+"')    ";
            statement.execute(query);
            }
        }catch (Exception e){
            //e.printStackTrace();
        }finally {
            statement.close();
            connection.close();
        }

    }
}

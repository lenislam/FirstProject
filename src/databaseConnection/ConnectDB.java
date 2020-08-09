package databaseConnection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;


public class ConnectDB {

    //    // Secret.Property file
//    // jdbc driver
//    // jdbc url
//    // configure jdbc
//    // MySQL Queries
    public static Connection connect = null;
    public static Statement statement = null;
    public static PreparedStatement ps = null;
    public static ResultSet resultSet = null;

    //Load Properties file
    public static Properties loadProperties() throws IOException {
        Properties prop = new Properties();
        InputStream ism = new FileInputStream("");
        prop.load(ism);
        ism.close();
        return prop;
    }

//    public static Connection connectionToSqlDatabase() throws IOException {
//        Properties prop = loadProperties();
//    }

}


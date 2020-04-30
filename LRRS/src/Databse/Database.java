
package Databse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Database {
    private final static String dbPath = "jdbc:mysql://localhost/lrs";
    private final static String dbUsername = "root";
    private final static String dbPassword = "1234";
    private static Connection connection;
    
    private Database(){
        
    }

    public static Connection openConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(dbPath, dbUsername, dbPassword);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return connection;
    }
}
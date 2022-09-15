import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class App {

    private final String url = "jdbc:postgresql://birdti.postgres.database.azure.com:5432/demo?ssl=true&sslmode=require";
    private final String user = "birdAdmin@birdti";
    private final String password = "Bird1234";

    /**
      * Connect to the PostgreSQL database
      * @return a Connection object
    */
    public Connection connect(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        }   catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public static void main(String[] args) {
        App app = new App();
        app.connect();
    }
}


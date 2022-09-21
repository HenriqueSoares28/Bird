package connection;
import java.sql.*;



public class Connect {
    protected Connection connection;


    public Connect(){
        connection = null;
    }

    /**
      * Connect to the PostgreSQL database
      * @return a Connection object
    */
    public boolean connect() {
		String driverName = "org.postgresql.Driver";                    
		String serverName = "birdti.postgres.database.azure.com";
		String mydatabase = "bird_site";
		int porta = 5432;
		String url = "jdbc:postgresql://birdti.postgres.database.azure.com:5432/bird_site?user=birdAdmin@birdti&password={your_password}&sslmode=require";
		String username = "birdAdmin";
		String password = "Bird1234";
		boolean status = false;

		try {
			Class.forName(driverName);
			connection = DriverManager.getConnection(url, username, password);
			status = (connection == null);
			System.out.println("Conexao efetuada com o postgres!");
		} catch (ClassNotFoundException e) { 
			System.err.println("Conexao NAO efetuada com o postgres -- Driver nao encontrado -- " + e.getMessage());
		} catch (SQLException e) {
			System.err.println("Conexao NAO efetuada com o postgres -- " + e.getMessage());
		}

		return status;
	}

    public static void main(String[] args) {
        Connect app = new Connect();
        app.connect();
    }
}


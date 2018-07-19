import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {

    private static ConnectDB connectionUtil = new ConnectDB();

    private ConnectDB(){

    }

    public static ConnectDB getConnectionUtil() {
        if(connectionUtil == null) {
            connectionUtil = new ConnectDB();
        }
        return connectionUtil;
    }

    public Connection getConnection() {
        String url = "jdbc:postgresql://localhost/revature_prj_1_test";
        String username="postgres";
        String password="p@$$w0rd123";
        try {
            return DriverManager.getConnection(url, username, password);
        } catch(SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}

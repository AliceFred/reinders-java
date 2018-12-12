package springopgave;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/hr?useLegacyDatetimeCode=false&serverTimezone=Europe/Berlin";
    private static final String USER = "root";
    private static final String PSW = "";

    public static Connection makeConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(JDBC_URL, USER, PSW);
        }   catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return con;
    }
}

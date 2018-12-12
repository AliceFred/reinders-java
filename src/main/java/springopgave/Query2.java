package springopgave;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Query2 {

    public Query2(){
    }

    public int updatedEmployees(String last_name, int id) {
        DbConnection db = new DbConnection();
        Connection con = db.makeConnection();

        int updateCount = 0;
        try (PreparedStatement stmt = con.prepareStatement("update employees set manager_id = ? " +
                "where last_name = ?")
        ) {
            stmt.setInt(1, id);
            stmt.setString(2, last_name);
            updateCount = stmt.executeUpdate();

        } catch (SQLException e) {
                System.out.println(e);
        }
        return updateCount;
    }
}

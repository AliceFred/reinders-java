package springopgave2;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;

public class Query1 {

    public Query1(){
    }

    public ArrayList filledArrayList(String department) {
        DbConnection db = new DbConnection();
        Connection con = db.makeConnection();
        ArrayList<Salary> salaries = new ArrayList<>();

        try (PreparedStatement stmt = con.prepareStatement("select last_name, salary from employees " +
             "join departments using (department_id) where department_name = ?")
        ) {
            stmt.setString(1, department);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    System.out.println(rs.getString(1));
                    Salary s = new Salary();
                    s.last_name = rs.getString("last_name");
                    s.salary = rs.getBigDecimal("salary");
                    salaries.add(s);
                }
            }

        } catch (SQLException e) {
                System.out.println(e);
        }
        return salaries;
    }

    private class Salary{
        public String last_name;
        public BigDecimal salary;
    }

}

package springopgave2;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;

public class Query {
    private static final String JDBC_URL="jdbc:mysql://localhost:3306/hr";
    private static final String USER="root";
    private static final String PSW="";

    public Query (){
    }

    private static Connection makeConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(JDBC_URL, USER, PSW);
        }   catch (SQLException e) {
                System.out.println(e.getMessage());
        }
        return con;
    }

    public ArrayList filledArrayList(String department) {
        Connection con = makeConnection();
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

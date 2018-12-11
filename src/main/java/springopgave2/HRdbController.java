package springopgave2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

@Controller
public class HRdbController {
    private static final String JDBC_URL="jdbc:mysql://localhost:3306/hr?useLegacyDatetimecode=false&ServerTimezone=Europe/Berlin";
    private static final String USER="root";
    private static final String PSW="";



   // Arraylist<Salary> salaries = new ArrayList<>();
   // try (Connection conn = DriverManager.getConnection(JDBC_URL,USER, PSW);
   //    Statement stmt = conn.createStatement();
   //     ResultSet rs = stmt.executeQuery("Select * from employees")){
   //     while (rs.next()){
   //         Salary s = new Salary();
   //         s.last_name = rs.getString("last_name");
   //         s.salary = rs.getString("salary");
   //         salaries.add;
    //    }
//
 //   }

  //  @RequestMapping("/")
  //  Public
  //  private class Salary {
  //      public String last_name;
  //      public String salary;
   // }

}


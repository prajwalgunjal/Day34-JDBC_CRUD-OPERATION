import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeePayrollMain {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/Emppayroll_service";
        String username = "root";
        String password = "root";
        Connection conn;
        try {
            conn = DriverManager.getConnection(url, username, password);
            Statement stmt = null;
            stmt = conn.createStatement();
//            boolean val = stmt.execute("show databases");
            stmt.executeUpdate("CREATE TABLE employee_payroll (id int not null auto_increment,name varchar(30) not null,salary double not null,start date not null,primary key(id))");
            System.out.println("Created table in given database...");
            boolean val = stmt.execute("select * from employee_payroll");
            System.out.println(val);
           if (val){
                ResultSet rs = stmt.getResultSet();
                while (rs.next()) {
                    // Retrieve by column name
                    System.out.print("ID: " + rs.getInt("id"));
                    System.out.print(", Name: " + rs.getString("name"));
                    System.out.print(", Salary: " + rs.getDouble("salary"));
                    System.out.print(", Date: " + rs.getDate("start"));
                    System.out.println();
                }
            }else {
                int count2=stmt.getUpdateCount();
                System.out.println(count2);
            }

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
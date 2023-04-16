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
            boolean val = stmt.execute("show databases");
            System.out.println(val);
            if (val){
                ResultSet rs = stmt.getResultSet();
                while (rs.next()) {
                    // Retrieve by column name
                    System.out.print("Database:- " + rs.getString("Database"));
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
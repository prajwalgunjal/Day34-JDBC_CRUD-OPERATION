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
//            int count = stmt.executeUpdate("insert into employee_payroll(name,salary,start)values(\"amit\",1000,'2020-01-2'),(\"prajwal\",60000,'2020-08-22'),(\"prathmesh\",600,'2020-08-23')");
//            System.out.println(count+"Employee inserted successfully");
//            stmt.executeUpdate("CREATE TABLE employee_payroll (id int not null auto_increment,name varchar(30) not null,salary double not null,start date not null,primary key(id))");
//            int isupdated = stmt.executeUpdate("alter table employee_payroll add gender varchar(20) after name");
//            System.out.println(isupdated);
//            stmt.executeUpdate("update employee_payroll set gender = 'm' where name = 'prajwal'");
//            stmt.executeUpdate("update employee_payroll set gender = 'm' where name = 'amit'");
//            stmt.executeUpdate("update employee_payroll set gender = 'm' where name = 'prathmesh'");


//            System.out.println("Created table in given database...");
//            boolean val = stmt.execute("select * from employee_payroll");
//            System.out.println("Showing data present in table");
//            boolean val = stmt.execute("select * from employee_payroll where name = 'prajwal'");
//            boolean val = stmt.execute("select * from employee_payroll");
//
//           if (val){
//                ResultSet rs = stmt.getResultSet();
//                while (rs.next()) {
//                    // Retrieve by column name
//                    System.out.print("ID: " + rs.getInt("id"));
//                    System.out.print(", Name: " + rs.   getString("name"));
//                    System.out.print(", gender: " + rs.   getString("gender"));
//                    System.out.print(", Salary: " + rs.getDouble("salary"));
//                    System.out.print(", Date: " + rs.getDate("start"));
//                    System.out.println();
//                }
//            }else {
//                int count2=stmt.getUpdateCount();
//                System.out.println(count2);
//            }

            System.out.println("********************SUM(MALE)********************");
            boolean sum = stmt.execute("select SUM(salary)from employee_payroll where gender ='m'");
            if(sum){
                ResultSet rs = stmt.getResultSet();
                while (rs.next()){
                    System.out.print("sum of all male employee: " + rs.getInt("SUM(salary)"));
                }
            }
            System.out.println();
            System.out.println("********************AVG(MALE)********************");
            boolean avg = stmt.execute("select AVG(salary)from employee_payroll where gender ='m'");
            if(avg){
                ResultSet rs = stmt.getResultSet();
                while (rs.next()){
                    System.out.print("avg of all male employee: " + rs.getInt("AVG(salary)"));
                }
            }
            System.out.println();
            System.out.println("********************MIN(MALE)********************");
            boolean MIN = stmt.execute("select MIN(salary)from employee_payroll where gender ='m'");
            if(MIN){
                ResultSet rs = stmt.getResultSet();
                while (rs.next()){
                    System.out.print("avg of all male employee: " + rs.getInt("MIN(salary)"));
                }
            }
            System.out.println();
            System.out.println("********************MAX(MALE)********************");
            boolean MAX = stmt.execute("select MAX(salary)from employee_payroll where gender ='m'");
            if(MAX){
                ResultSet rs = stmt.getResultSet();
                while (rs.next()){
                    System.out.print("max of all male employee: " + rs.getInt("MAX(salary)"));
                }
            }
            System.out.println();
            System.out.println("********************count(male)********************");
            boolean count = stmt.execute("select COUNT(id)from employee_payroll where gender ='m'");
            if(count){
                ResultSet rs = stmt.getResultSet();
                while (rs.next()){
                    System.out.print("avg of all male employee: " + rs.getInt("count(id)"));
                }
            }
            System.out.println();
            System.out.println("********************SUM(MALE)********************");
            boolean sumf = stmt.execute("select SUM(salary)from employee_payroll where gender ='f'");
            if(sumf){
                ResultSet rs = stmt.getResultSet();
                while (rs.next()){
                    System.out.print("sum of all female employee: " + rs.getInt("SUM(salary)"));
                }
            }
            System.out.println();
            System.out.println("********************AVG(MALE)********************");
            boolean avgf = stmt.execute("select AVG(salary)from employee_payroll where gender ='f'");
            if(avgf){
                ResultSet rs = stmt.getResultSet();
                while (rs.next()){
                    System.out.print("avg of all female employee: " + rs.getInt("AVG(salary)"));
                }
            }
            System.out.println();
            System.out.println("********************MIN(MALE)********************");
            boolean MINf = stmt.execute("select MIN(salary)from employee_payroll where gender ='f'");
            if(MINf){
                ResultSet rs = stmt.getResultSet();
                while (rs.next()){
                    System.out.print("avg of all female employee: " + rs.getInt("MIN(salary)"));
                }
            }
            System.out.println();
            System.out.println("********************MAX(MALE)********************");
            boolean MAXf = stmt.execute("select MAX(salary)from employee_payroll where gender ='f'");
            if(MAXf){
                ResultSet rs = stmt.getResultSet();
                while (rs.next()){
                    System.out.print("max of all female employee: " + rs.getInt("MAX(salary)"));
                }
            }
            System.out.println();
            System.out.println("********************count(male)********************");
            boolean countf = stmt.execute("select COUNT(id)from employee_payroll where gender ='f'");
            if(countf){
                ResultSet rs = stmt.getResultSet();
                while (rs.next()){
                    System.out.print("avg of all female employee: " + rs.getInt("count(id)"));
                }
            }
            System.out.println();




        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
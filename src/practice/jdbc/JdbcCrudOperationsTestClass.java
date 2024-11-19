package practice.jdbc;

import java.sql.*;

public class JdbcCrudOperationsTestClass {
    public static void main(String[] args) throws SQLException {
       // selectRecords();
        //selectColumnFromRecords();
       // selectRecordsWithCondition();
       // selectRecordsWithExternalParameters(24);
        selectRecordsWithPreparedStatement(18);
        //insertRecord();
       // insertRecordWithVariables(18,"SP",780000);
       // insertRecordWithPreparedStatement(11,"MDH",670000);
        //deleteRecord();
        //deleteRecordWithVariables(22);
        //deleteRecordWithPreparedStatement(15);
       // updateRecord();
       // updateRecordWithVariables(18, 850000);
        //updateRecordWithPreparedStatement(17, 880000);
    }
    public static  void selectRecords() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/bmdb";
        String username = "root";
        //Give the password to access MySQL server
        String password = "*********";
        String query = "select * from employee";
        //Step 1 - connect database
        Connection connection = DriverManager.
                getConnection(url,username, password);
        //Step 2 - Creating statement
        Statement stmt = connection.createStatement();
        //Step 3 - Executing query and Processing resultset
        ResultSet rs = stmt.executeQuery(query);
        while(rs.next()) {
            System.out.print("\nId is:" + rs.getInt(1));
            System.out.print("\nName is:" + rs.getString(2));
            System.out.print("\nSalary is:" + rs.getInt(3));
        }
        //Step 4 - Close connection
        connection.close();
    }
    public static  void selectColumnFromRecords() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/bmdb";
        String username = "root";
        //Give the password to access MySQL server
        String password = "*********";
        String query = "select emp_id, emp_name from employee";
        //Step 1 - connect database
        Connection connection = DriverManager.
                getConnection(url,username, password);
        //Step 2 - Creating statement
        Statement stmt = connection.createStatement();
        //Step 3 - Executing query and Processing resultset
        ResultSet rs = stmt.executeQuery(query);
        while(rs.next()) {
            System.out.print("\nId is:" + rs.getInt(1));
            System.out.print("\nName is:" + rs.getString(2));

        }
        //Step 4 - Close connection
        connection.close();
    }

    public static  void selectRecordsWithCondition() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/bmdb";
        String username = "root";
        //Give the password to access MySQL server
        String password = "*********";
        String query = "select emp_id, emp_name from employee " +
                "where emp_id=24";
        //Step 1 - connect database
        Connection connection = DriverManager.
                getConnection(url,username, password);
        //Step 2 - Creating statement
        Statement stmt = connection.createStatement();
        //Step 3 - Executing query and Processing resultset
        ResultSet rs = stmt.executeQuery(query);
        while(rs.next()) {
            System.out.print("\nId is:" + rs.getInt(1));
            System.out.print("\nName is:" + rs.getString(2));

        }
        //Step 4 - Close connection
        connection.close();
    }

    public static  void selectRecordsWithExternalParameters(int id) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/bmdb";
        String username = "root";
        //Give the password to access MySQL server
        String password = "*********";
       // int eid = 24;
       // String query = "select emp_id, emp_name from employee " +
              //  "where emp_id=24";
        String query = "select emp_id, emp_name from employee " +
                "where emp_id="+id+";";
        //Step 1 - connect database
        Connection connection = DriverManager.
                getConnection(url,username, password);
        //Step 2 - Creating statement
        Statement stmt = connection.createStatement();
        //Step 3 - Executing query and Processing resultset
        ResultSet rs = stmt.executeQuery(query);
        while(rs.next()) {
            System.out.print("\nId is:" + rs.getInt(1));
            System.out.print("\nName is:" + rs.getString(2));

        }
        //Step 4 - Close connection
        connection.close();
    }

    public static  void selectRecordsWithPreparedStatement(int id) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/bmdb";
        String username = "root";
        //Give the password to access MySQL server
        String password = "*********";
        // int eid = 24;
        // String query = "select emp_id, emp_name from employee " +
        //  "where emp_id=24";
      //  String query = "select emp_id, emp_name from employee where emp_id=?";
        //Step 1 - connect database
        Connection connection = DriverManager.
                getConnection(url,username, password);
        //Step 2 - Creating statement
        PreparedStatement pstmt = connection.
                prepareStatement("select emp_id, emp_name from employee where emp_id=?");
        pstmt.setInt(1,id);
        ResultSet rs = pstmt.executeQuery();

        //Step 3 - Executing query and Processing resultset
       // ResultSet rs = pstmt.executeQuery(query);
        while(rs.next()) {
            System.out.print("\nId is:" + rs.getInt(1));
            System.out.print("\nName is:" + rs.getString(2));

        }
        //Step 4 - Close connection
        connection.close();
    }

    public static void insertRecord() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/bmdb";
        String username = "root";
        //Give the password to access MySQL server
        String password = "*********";
        String query = "insert into employee values(17, 'ABR',720000);";
        Connection connect = DriverManager.
                getConnection(url,username,password);
        Statement st = connect.createStatement();
        int row = st.executeUpdate(query);
        System.out.println("Number of rows affected:"
                +row);
        connect.close();
    }

    public static void insertRecordWithVariables(int id,
                                                 String  name, int salary) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/bmdb";
        String username = "root";
        //Give the password to access MySQL server
        String password = "*********";
        //String query = "insert into employee values(15, 'ABR',720000);";
        String query = "insert into employee values("+id+", '" +
                name+"',"+salary+");";
        Connection connect = DriverManager.
                getConnection(url,username,password);
        Statement st = connect.createStatement();
        System.out.println("Number of rows affected:"
                +st.executeUpdate(query));
        connect.close();
    }

    public static void insertRecordWithPreparedStatement(int id,
                                                         String  name, int salary) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/bmdb";
        String username = "root";
        //Give the password to access MySQL server
        String password = "*********";
        //String query = "insert into employee values(15, 'ABR',720000);";
        //String query = "insert into employee values("+id+", '" +
        //   name+"',"+salary+");";
        String query = "insert into employee values(?,?,?);";
        Connection connect = DriverManager.
                getConnection(url,username,password);
        PreparedStatement pst = connect.prepareStatement(query);
        pst.setInt(1,id);
        pst.setString(2,name);
        pst.setInt(3,salary);
        System.out.println("Number of rows affected:"
                +pst.executeUpdate());
        connect.close();
    }
    public static void deleteRecord() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/bmdb";
        String username = "root";
        //Give the password to access MySQL server
        String password = "*********";
        String query = "delete from employee where emp_id=11;";
        Connection connect = DriverManager.
                getConnection(url,username,password);
        Statement st = connect.createStatement();
        System.out.println("Number of rows affected:"
                +st.executeUpdate(query));
        connect.close();
    }
    public static void deleteRecordWithVariables(int id) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/bmdb";
        String username = "root";
        //Give the password to access MySQL server
        String password = "*********";
        // String query = "delete from employee where emp_id=11;";
        String query = "delete from employee where emp_id="
                +id+";";
        Connection connect = DriverManager.
                getConnection(url,username,password);
        Statement st = connect.createStatement();
        System.out.println("Number of rows affected:"
                +st.executeUpdate(query));
        connect.close();
    }

    public static void deleteRecordWithPreparedStatement(int id) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/bmdb";
        String username = "root";
        //Give the password to access MySQL server
        String password = "*********";
        // String query = "delete from employee where emp_id=11;";
        // String query = "delete from employee where emp_id="
        // +id+";";
        String query = "delete from employee where emp_id=?;";
        Connection connect = DriverManager.
                getConnection(url,username,password);
        PreparedStatement pst = connect.prepareStatement(query);
        pst.setInt(1,id);
        System.out.println("Number of rows affected:"
                +pst.executeUpdate());
        connect.close();
    }

    public static void updateRecord() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/bmdb";
        String username = "root";
        //Give the password to access MySQL server
        String password = "*********";
        String query = "update employee set salary=800000 where emp_id=17;";
        Connection connect = DriverManager.
                getConnection(url,username,password);
        Statement st = connect.createStatement();
        System.out.println("Number of rows affected:"
                +st.executeUpdate(query));
        connect.close();
    }

    public static void updateRecordWithVariables(int id, int salary) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/bmdb";
        String username = "root";
        //Give the password to access MySQL server
        String password = "*********";
        //String query = "update employee set salary=800000 where emp_id=15;";
        String query = "update employee set salary="+salary+" where " +
                "emp_id="+id+";";
        Connection connect = DriverManager.
                getConnection(url,username,password);
        Statement st = connect.createStatement();
        System.out.println("Number of rows affected:"
                +st.executeUpdate(query));
        connect.close();
    }
    public static void updateRecordWithPreparedStatement(int id, int salary) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/bmdb";
        String username = "root";
        //Give the password to access MySQL server
        String password = "*********";
        //String query = "update employee set salary=800000 where emp_id=15;";
        //String query = "update employee set salary="+salary+" where " +
        // "emp_id="+id+";";
        String query = "update employee set salary=? where emp_id=?;";
        Connection connect = DriverManager.
                getConnection(url,username,password);
        PreparedStatement pst = connect.prepareStatement(query);
        pst.setInt(1,salary);
        pst.setInt(2,id);
        System.out.println("Number of rows affected:"
                +pst.executeUpdate());
        connect.close();
    }

}

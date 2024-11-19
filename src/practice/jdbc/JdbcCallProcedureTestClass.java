package practice.jdbc;

import java.sql.*;

public class JdbcCallProcedureTestClass {
    public static void main(String[] args) throws SQLException {
          callProcedure();
        //callProcedureWithParameter(12);

    }

    public static void callProcedure() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/bmdb";
        String username = "root";
        //Give the password to access MySQL server
        String password = "*********";
        Connection connect = DriverManager.
                getConnection(url,username,password);
        CallableStatement cst = connect.prepareCall("{call SelectEmployees()}");
        ResultSet rs = cst.executeQuery();
        while(rs.next())
        {
            System.out.println("Id is:"+rs.getInt(1));
            System.out.println("Name is:"+rs.getString(2));
            System.out.println("Salary is:"+rs.getInt(3));
        }
        connect.close();
    }

    public static void callProcedureWithParameter(int id) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/bmdb";
        String username = "root";
        //Give the password to access MySQL server
        String password = "*********";
        Connection connect = DriverManager.
                getConnection(url,username,password);
        CallableStatement cst = connect.prepareCall("{call SelectEmployeesById(?)}");
        cst.setInt(1,id);
        ResultSet rs = cst.executeQuery();
        while(rs.next())
        {
            System.out.println("Id is:"+rs.getInt(1));
            System.out.println("Name is:"+rs.getString(2));
            System.out.println("Salary is:"+rs.getInt(3));
        }
        connect.close();
    }
}

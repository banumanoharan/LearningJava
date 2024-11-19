package practice.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcCommitTestClass {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/bmdb";
        String username = "root";
        //Give the password to access MySQL server
        String password = "*********";
        String query1 = "update employee set salary=8888888 where emp_id=17;";
        String query2 = "update employee set salary=926797 where emp_id=12;";
        Connection connect = DriverManager.
                getConnection(url,username,password);
        connect.setAutoCommit(false);
        Statement st = connect.createStatement();
        int row1 = st.executeUpdate(query1);
        System.out.println("Rows:"+row1);
        int row2 = st.executeUpdate(query2);
        System.out.println("Rows:"+row2);

        if(row1>0 && row2>0)
            connect.commit();

        connect.close();
    }
}

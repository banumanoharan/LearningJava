package practice.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcBatchProcessingTestClass {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/bmdb";
        String username = "root";
        //Give the password to access MySQL server
        String password = "*********";
        String query1 = "update employee set salary=150000 where emp_id=24;";
        String query2 = "update employee set salary=150000 where emp_id=17;";
        String query3 = "update employee set salary=150000 where emp_id=12;";
        Connection connect = DriverManager.
                getConnection(url,username,password);
        connect.setAutoCommit(false);
        Statement st = connect.createStatement();
        st.addBatch(query1);
        st.addBatch(query2);
        st.addBatch(query3);

        int[] rows = st.executeBatch();
        for(int i:rows) {
            if (i > 0) {
                System.out.println("Value of i:" + i);
              //  continue;
            }
            else
                connect.rollback();
        }
        connect.commit();
        connect.close();
    }
}

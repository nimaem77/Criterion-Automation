package jdbcTest;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Types;

import com.mysql.cj.protocol.Resultset;

public class GetEmployeesForDepartment {
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Connection myConnection = null;
		CallableStatement myStmt = null;
		ResultSet myRS = null;
		ResultSetMetaData rsmd = null;
		
		try {
			myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "student" , "student");
			String department = "HR";
			
			myStmt = myConnection.prepareCall("{call get_employees_for_department(?)}");
			myStmt.setString(1, department);
		
			myStmt.execute();
			
		
			myRS = myStmt.getResultSet();
			rsmd = myRS.getMetaData();
			
			getResultData( myRS, rsmd);
		}catch(Exception exc) {
			exc.printStackTrace();
		}finally {
			myConnection.close();
			myStmt.close();
		}
		
	}
	public static void getResultData(ResultSet myRS,ResultSetMetaData rsmd) throws SQLException {
	
		
		while (myRS.next()) {
		    for (int i = 1; i <= rsmd.getColumnCount(); i++) {
		        if (i > 1) System.out.print(",  ");
		        String columnValue = myRS.getString(i);
		        System.out.print(columnValue + " " + rsmd.getColumnName(i));
		    }
		    System.out.println("");
		}
	}

}

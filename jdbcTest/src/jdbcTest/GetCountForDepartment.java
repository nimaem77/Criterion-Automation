package jdbcTest;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class GetCountForDepartment {


	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Connection myConnection = null;
		CallableStatement myStmt = null;
		
		try {
			myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "student" , "student");
			String department = "HR";
			
			myStmt = myConnection.prepareCall("{call get_count_for_department(?,?)}");
			myStmt.setString(1, department);
			myStmt.registerOutParameter(2, Types.INTEGER);
		
			myStmt.execute();
			
			int theCount = myStmt.getInt(2);
			System.out.println(theCount);
			
		}catch(Exception exc) {
			exc.printStackTrace();
		}finally {
			myConnection.close();
			myStmt.close();
		}
		
	}

}

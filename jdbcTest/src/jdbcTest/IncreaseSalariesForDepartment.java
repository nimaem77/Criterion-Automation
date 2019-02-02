package jdbcTest;
import java.sql.*;

public class IncreaseSalariesForDepartment {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Connection myConnection = null;
		CallableStatement myStmt = null;
		
		try {
			myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "student" , "student");
			String department = "HR";
			int increaseAmount = 300000;
			
			myStmt = myConnection.prepareCall("{call increase_salaries_for_department(?,?)}");
			myStmt.setString(1, department);
			myStmt.setLong(2, increaseAmount);
		
			myStmt.execute();
			
			
		}catch(Exception exc) {
			exc.printStackTrace();
		}finally {
			myConnection.close();
			myStmt.close();
		}
		
	}

}

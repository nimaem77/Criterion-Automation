import java.sql.*;

/**
 * 
 * @author www.luv2code.com
 *
 */
public class JdbcTest {

	public static void main(String[] args) throws SQLException {

		Connection myConn = null;
		PreparedStatement myStmt = null;
		ResultSet myRs = null;
		
		
		try {
			// 1. Get a connection to database
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "student" , "student");
			
			System.out.println("Database connection successful!\n");
		
			// 2. Create a statement
			myStmt = myConn.prepareStatement("delete from employees where salary > ? and department=?");
			
			myStmt.setDouble(1, 80000);
			myStmt.setString(2, "Legal");
			int rowsAffected = myStmt.executeUpdate();
			
			
			//inserting into database
			/*int rowsAffected = myStmt.executeUpdate("insert into employees " + 
					"(last_name, first_name, email, department, salary) " + "values " + 
							"('Wright', 'ERIC', 'eric@yahoo.com', 'HR' , '500' )");
		
			
			
			// 3. Execute SQL query
			myRs = myStmt.executeQuery("select * from employees");
			
			// 4. Process the result set
			while (myRs.next()) {
				System.out.println(myRs.getString("last_name") + ", " + myRs.getString("first_name"));
			}
				*/
			
		
			
		
		
		//	int rowsAffected = myStmt.executeUpdate("DELETE FROM employees "  + 
		//	" Where last_name ='Wright' and first_name='ERIC'");

		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		finally {
			if (myRs != null) {
				myRs.close();
			}
			
			if (myStmt != null) {
				myStmt.close();
			}
			
			if (myConn != null) {
				myConn.close();
			}
		}
	}

}

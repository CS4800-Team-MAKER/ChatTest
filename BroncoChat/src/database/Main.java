package database;

import java.sql.*;

public class Main
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		try {
			//1. Get a connection to database
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/broncochat", "root", "garbageIO93#sql");
			
			//2. Create a statement
			Statement myStmt = myConn.createStatement();
			
			//3. Execute SQL query
			ResultSet myRs = myStmt.executeQuery("SELECT * FROM broncochat.studentinfo");
			
			//4. Process the result set
			while(myRs.next())
			{
				System.out.println(myRs.getString("firstname") + ", " + myRs.getString("lastname"));
			}
			
		}catch (Exception exc)
		{
			exc.printStackTrace();
		}

	}
}

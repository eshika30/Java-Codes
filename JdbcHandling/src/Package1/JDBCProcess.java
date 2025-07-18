package Package1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class JDBCProcess {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Mil Gaya");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver Problem");
			e.printStackTrace();
		}
		
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test3","root","Eshu@3002");
			System.out.println("Connection Ho Gaya");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Connection Problem");
			e.printStackTrace();
		}
		Statement stmt = null;
		try {
			stmt = con.createStatement();
			System.out.println("Got Statement");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		String query = "select * from StudentTable";
		ResultSet result = null;
		try {
			result = stmt.executeQuery(query);
			System.out.println("Got Result");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Problem in query");
			e.printStackTrace();
		}
		
		
		int rollNumber=0;
		String firstName = null;
		String lastName =  null;
		
		System.out.println("Data is : ");
		System.out.println("---------------------------------");
		System.out.println("Roll FirstName LastName");
		System.out.println("---------------------------------");
		
		try {
			while(result.next()) {
				rollNumber = result.getInt(1);
				firstName = result.getString(2);
				lastName = result .getString(3);
				System.out.println(rollNumber + "     " + firstName + "     " + lastName);
			}
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}

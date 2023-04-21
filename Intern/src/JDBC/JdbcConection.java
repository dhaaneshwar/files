package JDBC;

import java.sql.*;

/*
 * 1.import --->java sql
 * 2.load and register the driver  -->com.mysql.jdbc.Driver
 * 3.create connection  -->connection
 * 4.create a statement  -->statment
 * 5.execute the query
 * 6.process the result
 * 7.close
 * 
 */

public class JdbcConection {

	public static void main(String[] args) throws Exception{
		String url="jdbc:mysql://localhost:3306/test";
		String username="root";
		String password="dhaaneshwar@13";
		String query="Select * from student";
		
		Class.forName("com.mysql.cj.jdbc.Driver");   //load the class
		Connection con=DriverManager.getConnection(url,username,password); 
		Statement st=con.createStatement();
		ResultSet result=st.executeQuery(query);  //stores data in tabular form
		
		while(result.next()) {
			String name=result.getString("name");
			System.out.println(name);
		}
		
		st.close();
		con.close();

	}

}

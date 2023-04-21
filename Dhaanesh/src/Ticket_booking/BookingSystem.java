package Ticket_booking;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BookingSystem {

	public static void main(String args[]) throws Exception{
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","dhaaneshwar@13");
		//here sonoo is database name, root is username and password
			stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			Statement stmt1=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			Statement stmt2=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			Statement stmt3=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			rs=stmt.executeQuery("select * from booking");
			Scanner sc=new Scanner(System.in);


			int flag=0;
			while(true) {
				//Available seats
				boolean available=false;
				while(rs.next()) {
					
					if(rs.getString("booking_status").equals("no")) {
						System.out.println("Seats available:"+rs.getString("seat_no"));
						available=true;
					}
				}
				if(available==false) {
					System.out.println("All seats are booked");
					System.exit(0);
				}
//				rs.close();
				rs=stmt1.executeQuery("select * from booking");
//				rs.beforeFirst();
				
				//checking availablity
				String seatNo="";
				boolean invalidSeat=true;
				while(invalidSeat==true) {
					System.out.println("Enter seat number");
					seatNo=sc.next();
					while(rs.next()) {
						if(rs.getString("seat_no").equals(seatNo))
							invalidSeat=false;
					}
//					rs.close();
					rs=stmt2.executeQuery("select * from booking");
//					rs.beforeFirst();
					if(invalidSeat==true) {
						System.out.println( "invalid seat number enter valid seat number(<available seat number her>)");
					}
				}
				
				
				//checking status
				boolean status=false;
				while(rs.next()) {
					if(rs.getString("seat_no").equals(seatNo) && rs.getString("booking_status").equals("yes"))
						status=true;
				}
//				rs.close();
				rs=stmt2.executeQuery("select * from booking");
//				rs.beforeFirst();
				if(status==true) {
					System.out.println("The seat has been already reserved, kindly choose another.");
				}else {
					stmt.executeUpdate("update booking set booking_status='yes' where seat_no='"+seatNo+"'");
					System.out.println("Enter your name");
					String name=sc.next();
					stmt.executeUpdate("update booking set allocated_user='"+name+"' where seat_no='"+seatNo+"'");
					System.out.println("Your Ticket Has been Booked Successfully!!! and Enjoy the show.");
					System.out.println("Another booking...");
				}
				
				System.out.println("========================================================================================");
				rs.beforeFirst();
				
			}
	
		}catch(Exception e)
		{
			System.out.println(e);
		}finally {
			try {
					if(stmt!=null)
						stmt.close();
					if(rs!=null)
						rs.close();
					if(con!=null)
						con.close();
			}catch(Exception er) {
			System.out.println(er);
		}
			
	}
		
	}	
	
	
	
}
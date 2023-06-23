import java.sql.*;
import java.util.*;


class inter 
{

	public static void main(String[] args) {
		



		try
		{


			//load the drive 
			Class.forName("com.mysql.jdbc.Drive");
			//create the connection con

			String url = "jdbc.mysql://localhost:3306/youtube";
			String username = "root";
			String password= "1234";

			Connection con = DriverManager.getConnection(url,username,password);

			//create query 
			String q = "create table table1 (tID (20) primary key auto_inrement,tName varchar(50) not null, tCity varchar(100))";

//create stataement 
Statement stmt= con.createStatement();
    stmt.executeUpdate(q);
// now we have to check the  

System.out.println("this  Statement is running ");
con.close();
		}


catch(Exception e) {


	e.printStackTrace();


}

	}
}
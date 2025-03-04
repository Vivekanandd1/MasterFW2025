package Resources;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseConnector {
	static String  host = "localhost";
	static String  port = "3306";
	
	public static void main(String[] args) throws SQLException {
		
//		Connection con=DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/demo", "root", "root");
		Connection con = DriverManager.getConnection("jdbc:mysql://"+ host +":"+ port +"/TestDB", "root", "Root");
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("select * from EmployeeInfo where name='Fring'");
		while(rs.next()) {
			System.out.println(rs.getString("id"));
			System.out.println(rs.getString("location"));
			System.out.println(rs.getString("age"));
		}
	}

}

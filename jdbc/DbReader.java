package jdbc;


import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

public class DbReader {
	public static void main(String[] args) {
		Connection con = null;
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println("Driver not found "+e.getMessage());
	}
	String url = "jdbc:oracle:thin:@localhost:1521:orcl"; 
	String username = "hr";
	String password = "hr";
	try {
		con = DriverManager.getConnection(url, username, password);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		System.out.println("Connection Failed "+e.getMessage());
	}
	try {
		DatabaseMetaData dbmeta = con.getMetaData();
		System.out.println(dbmeta.toString());
		System.out.println(dbmeta.getDatabaseMajorVersion());
		System.out.println(dbmeta.getDatabaseProductName());
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	String sql = "select first_name, last_name, employee_id from employees where last_name = 'King'";
	try {
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		ResultSetMetaData rsmd = rs.getMetaData();
		
		int colCount = rsmd.getColumnCount();
		System.out.println(colCount);
		
		int type = rsmd.getColumnType(3);
		if(type == Types.INTEGER) {
			System.out.println("Col 1 has Integer type");
		}
		else if(type == Types.VARCHAR) {
			System.out.println("Col 1 is a string(varchar)");
		}
		else if(type == Types.NUMERIC) {
			System.out.println("Col is type numeric");
		}
		System.out.println(rsmd.getColumnTypeName(3));
		int noOfDepts = 0;
		while(rs.next()) {
			int id = rs.getInt(3);
			String empid = rs.getString("employee_id");
			String fName = rs.getString("first_name");
			String lname = rs.getString("last_name");
			System.out.println(id+":"+fName+":"+lname);
			noOfDepts++;
		}
		System.out.println("total no.of departments"+noOfDepts);
		rs.close();
		st.close();
		con.close();
		
		
	}catch(SQLException sqle) {
		System.out.println(sqle.getMessage());
		
	}
	
}
}
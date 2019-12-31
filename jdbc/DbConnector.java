package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnector {
	private String url;
	private String user;
	private String pass;
	
	public DbConnector() {
		
	}

	public  DbConnector(String url, String user, String pass) {
		super();
		this.url = url;
		this.user = user;
		this.pass = pass;
	}
	
	public Connection getConnection() {
		Connection con = null;
		try {
			con =  DriverManager.getConnection(url, user, pass);
			System.out.println("Connect Success");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
		
	}
	
	public static void main(String[] args) {
		DbConnector dbcon = new DbConnector("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "hr");
		Connection con = dbcon.getConnection();
		System.out.println(con);
	}
	public String getUrl() {
		return url;
	}
}

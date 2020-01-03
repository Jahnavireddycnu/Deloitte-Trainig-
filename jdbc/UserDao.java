package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UserDao {
	private static ArrayList<user> users = new ArrayList<user>();
	private static ArrayList<role> roles = new ArrayList<role>();
	private static Map<Integer,role> checkRoles = new HashMap<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printAllUsers();
		
	}

	private static void printAllUsers() {
		// TODO Auto-generated method stub
		Connection con=null;
		con = new DbConnector("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr").getConnection();
		
		String sql = "select id,username,password,email,user2.role_id,mobile_num,role_name,privs from user2 join role on user2.role_id=role.role_id";
		try {
			PreparedStatement pst =con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				role r=null;
				if(checkRoles.containsKey(rs.getInt(5))) {
					r = checkRoles.get(rs.getInt(5));
				}
				else {
					r = new role(rs.getInt(5),rs.getString(7),rs.getString(8));
					roles.add(r);
				}
				users.add(new user(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),r,rs.getString(7)));
			}
			
			for(user u:users) {
				System.out.println(u);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
}

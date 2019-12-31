package jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class WorkWithDates {
	Connection con = null;
	public WorkWithDates() {}
	
	public void listJoiningDate(String date) {
		DbConnector connector = new DbConnector("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "hr");
		con = connector.getConnection();
		ArrayList<WorkWithDates> JoingList = new ArrayList<>();
		String sql = "select employee_id,first_name, last_name,department_id, salary, hire_date from employees where hire_date between '01-JAN-02' and '01-JAN-08'";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
		
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				int id = rs.getInt(1);
				String fname = rs.getString(2);
				String lname = rs.getString(3);
				int dep_id = rs.getInt(4);
				double sal = rs.getDouble(5);
				String joinDate = rs.getString(6);
				SimpleDateFormat sdf = new SimpleDateFormat();
				Date jDate = null;

				
				Employee e = new Employee(id, fname, lname, dep_id, sal, joinDate); 
				System.out.println(rs.getInt(1)+":"+rs.getString(2));
				
			}
			System.out.println(+JoingList.size());
	}catch (SQLException e) {
		// TODO Auto-generated catch block
		System.out.println(e);
	}}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new WorkWithDates().listJoiningDate("01-FEB-08");
		
	}

}

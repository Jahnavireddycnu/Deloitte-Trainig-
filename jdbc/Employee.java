package jdbc;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Employee {
	private int id;
	private String fname;
	private String lname;
	private int dep_id;
	private double sal;
	private String joinDate;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getDep_id() {
		return dep_id;
	}
	public void setDep_id(int dep_id) {
		this.dep_id = dep_id;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}
	public Employee(int id, String fname, String lname, int dep_id, double sal, String joinDate) {
		super();
		this.dep_id = id;
		this.fname = fname;
		this.lname = lname;
		this.dep_id = dep_id;
		this.sal = sal;
		this.joinDate = joinDate;
	}
	@Override
	public String toString() {
		SimpleDateFormat formatter = new SimpleDateFormat("DD-MM-YYYY");
		String dt = formatter.format(joinDate);
		return "Employee [id=" + id + ", fname=" + fname + ", lname=" + lname + ", dep_id=" + dep_id + ", sal=" + sal
				+ ", joinDate=" + joinDate + "]";
	}
	
	
	

}

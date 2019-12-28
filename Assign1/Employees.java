package Assign1;

public class Employees  {
	private String EmpName;
	public double Salary;
	private Department dept;
	private Role role;
	private Employees manager;
	public boolean IncrementedSalary=false;
	
	
	public boolean isIncrementedSalary() {
		return IncrementedSalary;
	}
	public void setIncrementedSalary(boolean incrementedSalary) {
		IncrementedSalary = incrementedSalary;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Employees [EmpName=" + EmpName + ", Salary=" + Salary + ", dept=" + dept + ", role=" + role
				+ ", manager=" + manager + "]";
	}
	public Employees(String empName, double salary, Department dept, Role role, Employees manager) {
		super();
		EmpName = empName;
		Salary = salary;
		this.dept = dept;
		this.role = role;
		this.manager = manager;
	}
	
	
	
	public Employees getManager() {
		return manager;
	}
	public void setManager(Employees manager) {
		this.manager = manager;
	}
	
	

}

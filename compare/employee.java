package compare;

public class employee {
	private String employee;
	private int id;
	public employee(String employee, int id) {
		super();
		this.employee = employee;
		this.id = id;
	}
	@Override
	public int hashCode() {
		return id/12;
	}
	@Override
	public boolean equals(Object o) {
		employee e = (employee)o;
	
		return this.id==e.id;
		
	}
	public String toString() {
		return "employee [employee=" + employee + ", id=" + id + "]";
	}
	public String getEmployee() {
		return employee;
	}
	public void setEmployee(String employee) {
		this.employee = employee;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		//thi id;
	}
}

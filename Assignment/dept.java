package Assignment;

public class dept {
	private String DeptName;
	private String city;

	
	public String getDeptName() {
		return DeptName;
	}

	public void setDeptName(String deptName) {
		DeptName = deptName;
	}

	

	@Override
	public String toString() {
		return "dept [DeptName=" + DeptName + ", city=" + city + "]";
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public dept(String deptName, String city) {
		super();
		DeptName = deptName;
		this.city = city;
	}

	
	}


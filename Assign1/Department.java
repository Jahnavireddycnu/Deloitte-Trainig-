package Assign1;

public class Department {
	private String name;
	private String Location;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	@Override
	public String toString() {
		return "Department [name=" + name + ", Location=" + Location + "]";
	}
	public Department(String name, String location) {
		super();
		this.name = name;
		Location = location;
	}
	
	
	
	
}

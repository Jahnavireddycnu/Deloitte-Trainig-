package Test2;

public class Publisher {
	private String name;
	private String City;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public Publisher(String name, String city) {
		super();
		this.name = name;
		City = city;
	}
	@Override
	public String toString() {
		return "Publisher [name=" + name + ", City=" + City + "]";
	}
	
	
}

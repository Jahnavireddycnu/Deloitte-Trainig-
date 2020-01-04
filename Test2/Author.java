package Test2;

public class Author {
	private String Name;
	private String Nationality;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getNationality() {
		return Nationality;
	}
	public void setNationality(String nationality) {
		Nationality = nationality;
	}
	public Author(String name, String nationality) {
		super();
		Name = name;
		Nationality = nationality;
	}
	
	@Override
	public String toString() {
		return "Author [Name=" + Name + ", Nationality=" + Nationality + "]";
	}
	
	
	
	

}

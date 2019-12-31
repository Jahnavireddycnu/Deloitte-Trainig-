package Assignment;

public class adress{
	private String H_no;
	private String StreetName;
	private String City;
	private String State;
	public String getH_no() {
		return H_no;
	}
	public void setH_no(String h_no) {
		H_no = h_no;
	}
	public String getStreetName() {
		return StreetName;
	}
	public void setStreetName(String streetName) {
		StreetName = streetName;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	@Override
	public String toString() {
		return "adress [H_no=" + H_no + ", StreetName=" + StreetName + ", City=" + City + ", State=" + State + "]";
	}
	public adress(String h_no, String streetName, String city, String state) {
		super();
		H_no = h_no;
		StreetName = streetName;
		City = city;
		State = state;
	}
	

}

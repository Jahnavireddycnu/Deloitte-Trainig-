package Assignment;

public class person {
	private String Name;
	private adress adr;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public adress getAdr() {
		return adr;
	}
	public void setAdr(adress adr) {
		this.adr = adr;
	}
	@Override
	public String toString() {
		return "person [Name=" + Name + ", adr=" + adr + "]";
	}
	public person(String name, adress adr) {
		super();
		Name = name;
		this.adr = adr;
	}

	
	
	
	
	

}

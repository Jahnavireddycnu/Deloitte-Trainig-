package Assignment;

public class employee extends person {
	private dept dep;
	private int id;
	public dept getDep() {
		return dep;
	}
	public employee(String name, adress addr, int id, dept dep) {
		super(name, addr);
		this.id=id;
		this.dep=dep;
	}
	
	public void setDep(dept dep) {
		this.dep = dep;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "employee [dep=" + dep + ", id=" + id + "]";
	}
	public employee(String name, adress adr, dept dep, int id) {
		super(name, adr);
		this.dep = dep;
		this.id = id;
	}
	
	

}

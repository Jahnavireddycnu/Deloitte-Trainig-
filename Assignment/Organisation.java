package Assignment;

public class Organisation {
	static employee[] emps= new employee[5];
	static dept[] deps = new dept[5];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		adress adr1 = new adress("32/21", "CColony", "KNL", "AP");
		adress adr2 = new adress("43/65", "dcolony", "BPL", "AP");
		adress adr3 = new adress("34/90", "SColony","HYD", "TS");
		adress adr4 = new adress("65/87", "GColony", "HYD", "TS");
		adress adr5 = new adress("56/78", "HColony", "B'lore","KA");
		
		dept dep1= new dept("HR","HYD");
		dept dep2 = new dept("Dev", "HYD");
		dept dep3 = new dept("Dev", "HYD");
		dept dep4 = new dept("Dev","HYD");
		dept dep5 = new dept("Test","B'lore");
		
		employee e1 = new employee("Red", adr1, dep1, 123);
		employee e2 = new employee("Ser", adr2, dep2, 456);
		employee e3 = new employee("Color", adr3, dep3, 345);
		employee e4 = new employee("xyt",adr4, dep4, 453);
		employee e5 = new employee("vfd", adr5, null, 567);
		emps[0] = e1;
		emps[1] = e2;
		emps[2] = e3;
		emps[3] = e4;
		emps[4] = e5;
		
		deps[0] = dep1;
		deps[1] = dep2;
		deps[2] = dep3;
		deps[3] = dep4;
		deps[4] = dep5;
		
		printEmployees("Dev");
		printDeptEmployee(e1);
		printnullemployees(e1);
		
		
		
		
		
		

	}
	public static void printEmployees(String d) {
		for(int i=0;i<5;i++) {
			if(emps[i].getDep()!=null && emps[i].getDep().getDeptName().equals(d)) {
				System.out.println(emps[i]);
			}
				
				}	
			
			
		}
	public static void printDeptEmployee(employee e) {
		System.out.println(e.getDep().getDeptName());
		
	}
	public static void printnullemployees(employee e) {
		for(int i=0; i<5;i++) {
			if(emps[i].getDep()==null) {
				System.out.println(emps[i]);
			}
				
				
		}
		
	}
}

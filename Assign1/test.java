package Assign1;

public class test {

	static Employees[] emps = new Employees[3];
	static Department[] dept = new Department[3];
	static Role[] r = new Role[3];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department dep1 = new Department("HR", "HYD");
		Role r1 = new Role("Manager");
		Employees e1 = new Employees("Jah", 34000, dep1, r1, null);
		
		Department dep2 = new Department("Testing", "B'lore");
		Role r2 = new Role("Tester");
		Employees e2 = new Employees("Red", 23000, dep2, r2, e1);
		
		Department dep3 = new Department("Developing","Delhi");
		Role r3 = new Role("Developer");
		Employees e3 = new Employees("Vangala", 30000, dep3, r3, e1);
		
		emps[0] = e1;
		emps[1] = e2;
		emps[2] = e3;
		
		dept[0] = dep1;
		dept[1] = dep2;
		dept[2] = dep3;
		
		printEmployees(e1);
		printDept("Tester");
		printRole("Manager");
		IncrementSalary("Manager");
		SalaryIncremented(e1);
		EmployeesManager(e1);
		
		

	}
	
	public static void EmployeesManager(Employees e) {
		for(int i=0;i<3;i++) {
			if(emps[i].getManager()==e) {
				System.out.println(emps[i]);
			}
		}
	}
	
	public static void SalaryIncremented(Employees e) {
		for(int i=0;i<3;i++) {
			if(emps[i].isIncrementedSalary() == true) {
				System.out.println(emps[i]);
				
			}
			
		}
	}
	public static void IncrementSalary(String r) {
		for(int i=0; i<3;i++) {
			double Salary = 0.0;
		if(emps[i].getRole().getRoleName().equals("Manager") ){
			Salary = (emps[i].getSalary()+(emps[i].getSalary()*30)/100);
			System.out.println("Manager's Salary is: "+Salary);
			emps[i].Salary=Salary;
			emps[i].IncrementedSalary =true;
	}
		else {
			if(emps[i].getRole().getRoleName().equals("Tester")) {
				Salary = (emps[i].getSalary()+(emps[i].getSalary()*20)/100);
				System.out.println("Tester's Salary is: "+Salary);
				emps[i].Salary=Salary;
				emps[i].IncrementedSalary=true;
			}
		}
	}
	}
	public static void printRole(String r) {
		for(int i=0;i<3;i++) {
			if(emps[i].getRole().getRoleName().equals("Manager")) {
				System.out.println(emps[i]);
			}
		}
	}
	
	public static void printDept(String dept) {
		
		for(int i = 0;i<3;i++) {
		if(emps[i].getDept().getName().equals(dept)) {
			System.out.println(emps[i]);
			
		}
		
	}
	}
	
	public static void printEmployees(Employees e1) {
		for(int i=0;i<3;i++) {
			if(emps[i].getDept()!=null) {
				System.out.println(emps[i]);
			}
		}
	}

}

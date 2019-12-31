package sort;
import java.util.*;
import java.util.Comparator;

public class sorter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a = new String[5];
		a[0] = "Red";
		a[1] = "Del";
		a[2] = "Color";
		a[3] = "Das";
		a[4] = "Rav";
		Arrays.sort(a);
		for(int i=0;i<5;i++) {
			System.out.println(a[i]);
	
			
		}
		Employee e1 = new Employee("Red", 723, 3400);
		Employee e2 = new Employee("Color", 234, 2300);
		Employee e3 = new Employee("Dws", 856, 1400);
		
		Employee emps[] = new Employee[3];
		emps[0] = e1;
		emps[1] = e2;
		emps[2] = e3;
		
		Arrays.sort(emps, new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				return (int) (e2.getSalary()-e1.getSalary());
			}
		});
		
		
		 for(Employee e : emps) {
			 System.out.println(e);
		 }
 		
		
	}

}

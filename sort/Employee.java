package sort;

import java.util.Comparator;

public class Employee implements Comparable<Employee>, Comparator<Employee> {
		private String employee;
		private int id;
		private double salary;
		
		public double getSalary() {
			return salary;
		}
		
		public void setSalary(double salary) {
			this.salary = salary;
		}
		
		public Employee(String employee, int id, double salary) {
			super();
			this.employee = employee;
			this.id = id;
			this.salary = salary;
		}

		@Override
		public int hashCode() {
			return id/12;
		}
		@Override
		public boolean equals(Object o) {
			Employee e = (Employee)o;
		
			return this.id==e.id;
			
		}
		
		@Override
		public String toString() {
			return "Employee [employee=" + employee + ", id=" + id + ", salary=" + salary + "]";
		}

		public String getEmployee() {
			return employee;
		}
		public void setEmployee(String employee) {
			this.employee = employee;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			//this id;
		}
		@Override
		public int compareTo(Employee other) {
			return this.id-other.id;
		}
		//@Override
		//public int compare(Employee e1,Employee e2) {
			//return e1.id-e2.id;
		//}
		@Override
		public int compare(Employee e1, Employee e2) {
			return (int) (e1.salary-e2.salary);
		}
	}



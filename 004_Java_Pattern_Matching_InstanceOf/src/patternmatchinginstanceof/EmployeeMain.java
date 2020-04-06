package patternmatchinginstanceof;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee("Jack", "Smith", 1500.0);
		Employee employee2 = new Employee("Sarah", "Jones", 2500.0);
			
		System.out.println(employee1.equals(employee2));
		
		Employee employee3 = new Employee("Sarah", "Jones", 2500.0);
		System.out.println(employee2.equals(employee3));
	}
}

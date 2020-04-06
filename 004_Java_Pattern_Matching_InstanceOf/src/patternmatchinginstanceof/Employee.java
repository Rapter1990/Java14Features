package patternmatchinginstanceof;

import java.io.Serializable;

public class Employee implements Serializable{

	private String firstName;
	private String lastName;
	private Double salary;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String firstName, String lastName, Double salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((salary == null) ? 0 : salary.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		
		// instanceof before Java 14
		/*
		 
		if (obj instanceof Employee ) {
			   Employee otherObj = (Employee) obj;
	           return firstName.equals(otherObj.firstName) && 
	        		  lastName.equals(otherObj.lastName) &&
	        		  salary.equals(otherObj.salary)
	        		  ;
	    }
	    
		*/
		
		// Pattern Matching - InstanceOf In Java 14 (LONG VERSION)
		/*
		
		if (obj instanceof Employee otherObj) {
			return firstName.equals(otherObj.firstName) && 
	        		  lastName.equals(otherObj.lastName) &&
	        		  salary.equals(otherObj.salary)
	        ;
        }
		
		*/
		
		// Pattern Matching - InstanceOf In Java 14 (SHORT VERSION)
		return obj instanceof Employee otherObj && firstName.equals(otherObj.firstName) &&  lastName.equals(otherObj.lastName) && salary.equals(otherObj.salary);
	}
	
	
}

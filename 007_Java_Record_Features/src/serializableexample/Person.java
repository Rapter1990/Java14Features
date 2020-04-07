package serializableexample;

import java.io.Serializable;

public record Person(String name, String surname ,int age) implements Serializable {
    public Person{
    	System.out.println("Person Constructor");
        System.out.println("\n"
        		+ "Person Information\n"
        		+ "Name :" + name + "\n"  
        		+ "Surname :" + surname + "\n"    
        		+ "Age : " + age
        		);
    }

	@Override
	public String toString() {
		System.out.println("Person -> toString");
		String personInformation = ""
        		+ "Person Information\n"
        		+ "Name :" + name + "\n"  
        		+ "Surname :" + surname + "\n"    
        		+ "Age : " + age;
		
		return personInformation;
	}
    
    
}

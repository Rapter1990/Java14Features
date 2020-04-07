package interfaceexample;

public class InterfaceUsageMain {

	public static void main(String[] args) {
		var person = new Person("Person Name","Person Surname");
		System.out.println("Person Information");
		System.out.println("Person Name : " + person.getName());
		System.out.println("Person Name : " + person.getSurname());
	}
}

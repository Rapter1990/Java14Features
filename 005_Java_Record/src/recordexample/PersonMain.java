package recordexample;

public class PersonMain {
	
	public static void main(String[] args) {
		
	  PersonBeforeJava14 person = new PersonBeforeJava14("Jenny", "Female", 35);
      System.out.println(person.getName());
      System.out.println(person.getGender());
      System.out.println(person.getAge());
      System.out.println(person);
      
       
      System.out.println("-----------------------------------");
      PersonInJava14 person1 = new PersonInJava14("Jenny", "Female", 35);
      System.out.println(person1.name());
      System.out.println(person1.gender());
      System.out.println(person1.age());
      System.out.println(person1);
      
      
      PersonInJava14 person2 = new PersonInJava14("Jenny", "Female", 35);
      System.out.println(person2.name());
      System.out.println(person2.gender());
      System.out.println(person2.age());
      System.out.println(person2);
      
      
      System.out.println(person.equals(person1));
      System.out.println("-----------------------------------");
      System.out.println(person1.equals(person2));
      
   }
}

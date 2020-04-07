package serializableexample;

public class SerializableMain {
	
	static SerializableUtilClass util = null;

	public static void main(String[] args) {
		var person = new Person("Java 14 Developer Name","Java 14 Developer Surname", 30);
        writeToFile(person, "myFile.txt");
        System.out.println("---------------------------------");
        System.out.println(readFromFile("myFile.txt"));
	}


	private static void writeToFile(Person person, String string) {
		System.out.println("SerializableMain ->writeToFile\n");
		// TODO Auto-generated method stub
		util = new SerializableUtilClass();
		util.writeToFile(person, string);
	}
	
	private static Person readFromFile(String path) {
		System.out.println("SerializableMain ->readFromFile\n");
		// TODO Auto-generated method stub
		Person objPerson = null;
		util = new SerializableUtilClass();
		objPerson = util.readFromFile(path);
		return objPerson;
	}
}

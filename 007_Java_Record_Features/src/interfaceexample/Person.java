package interfaceexample;

public record Person(String name, String surname) implements IPersonInformation{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public String getSurname() {
		// TODO Auto-generated method stub
		return this.surname;
	}

}

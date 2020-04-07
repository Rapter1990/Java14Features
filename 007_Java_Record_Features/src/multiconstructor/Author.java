package multiconstructor;

public record Author(String name, String bookName) {

	// Multi constructor Support
	public Author() {
		this(null, null);
	}

	public Author(String name) {
		this(name, null);
	}

	public Author(String name, String bookName) {
		if (name != null && bookName != null) {
			this.name = name;
			this.bookName = bookName;
		} else if(name != null && bookName == null) {
			this.name = name;
			this.bookName = null;
		} else if(name == null && bookName != null) {
			this.name = null;
			this.bookName = bookName;
		} else {
			this.name = null;
			this.bookName = null;
		}
	}
}

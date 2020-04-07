package nullpointerexception;

public class Author {
	
	private int id;
	private String name;
	private String topic;
	
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Author(int id, String name, String topic) {
		super();
		this.id = id;
		this.name = name;
		this.topic = topic;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", topic=" + topic + "]";
	}
	
	
}
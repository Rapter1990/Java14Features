package multiconstructor;

public class MultiConstructorSupportMain {

	public static void main(String[] args) {
		
		// use "var" to define object
		var author1 = new Author("Lev Tolstoy", "War and Peace");
		var author2 = new Author("Fyodor Dostoyevsky", "Crime and Punishment");
		var author3 = new Author("Alexander Pushkin", "The Captain's Daughter");
		
		System.out.println("Author 1");
		System.out.println("Author Name : " + author1.name());
		System.out.println("Author Book Name : " + author1.bookName());
		System.out.println("---------------------------");
		
		System.out.println("Author 2");
		System.out.println("Author Name : " + author2.name());
		System.out.println("Author Book Name : " + author2.bookName());
		System.out.println("---------------------------");
		
		System.out.println("Author 3");
		System.out.println("Author Name : " + author3.name());
		System.out.println("Author Book Name : " + author3.bookName());	
		System.out.println("---------------------------");
		
		var author4 = new Author();
		System.out.println("Author 4");
		System.out.println("Author Name : " + author4.name());
		System.out.println("Author Book Name : " + author4.bookName());
		System.out.println("---------------------------");
		
		var author5 = new Author("Author Name");
		System.out.println("Author 5");
		System.out.println("Author Name : " + author5.name());
		System.out.println("Author Book Name : " + author5.bookName());
		System.out.println("---------------------------");
	}
}

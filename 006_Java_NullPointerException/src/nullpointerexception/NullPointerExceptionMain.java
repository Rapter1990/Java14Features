package nullpointerexception;

public class NullPointerExceptionMain {

	public static void main(String[] args) {
	
		Author author = null;
		System.out.println("Author Name : " + author.getName()); // Line 7
		
		// Before Java 14
		/*
				
		Exception in thread "main" java.lang.NullPointerException
		at nullpointerexception.NullPointerExceptionMain.main(NullPointerExceptionMain.java:7)
				
		*/
		
		
		// In Java 14
		// To enable -XX:+ShowCodeDetailsInExceptionMessages
		// Follow this way
		// Right Click of Project -> "Run" -> "Run Configuration" -> Change tab to "Arguments" ->  
		// copy "-XX:+ShowCodeDetailsInExceptionMessages" and paste in in the box of "VM Arguments"
		
		/* 
		
		Exception in thread "main" java.lang.NullPointerException: Cannot invoke "nullpointerexception.Author.getName()" because "author" is null
		at nullpointerexception.NullPointerExceptionMain.main(NullPointerExceptionMain.java:16)
		
		*/
		
	}
}

package textblocks;

public class TextBlocks {

	public static void main(String[] args) {
		
		String text = getStringBeforeJava14();
		System.out.println("Text : " + text);
		
		text = getStringInJava14();
		System.out.println("Text : " + text);
		
		text = defineStringInSingleLineInJava14();
		System.out.println("Text : " + text);
		
		text = defineStringTheUsageOfSlashSInJava14();
		System.out.println("Text : " + text);
		
	}
	
	
	private static String getStringBeforeJava14() {
		
		String textResult = defineStringBeforeJava14();
		
		return textResult;
	}
	
	private static String getStringInJava14() {
		
		String textResult = defineStringInJava14();
		
		return textResult;
	}
	

	private static String defineStringBeforeJava14() {
		
		String myJSON = "{\n" +
                "    \"name\": \" Java Developer Name before its version under 14\",\n" +
                "    \"username\": \"javabefore14\",\n" +
                "    \"role\": [\"javadeveloperbefore14\"],\n" +
                "    \"password\": \"123456789\"\n" +
                "}";
		
		return myJSON;
		
	}
	
	private static String defineStringInJava14() {
		
		// """ any text """
		
		 String myJSON = """
             {
                 "name": "Java Developer Name with its version 14",
                 "username": "javaIn14",
                 "role": ["javadeveloperIn14"],
                 "password": "123456789"
             }
             """;
		
		
		return myJSON;
	}
	
	private static String defineStringInSingleLineInJava14() {
		
		// \ -> go to next line
		
		String text = """
                Did you know \
                this feature about Java 14 \
                with the usage of single line option\
                """;
		
         return text ; 
	}
	
	private static String defineStringTheUsageOfSlashSInJava14() {
		
		// '\s' -> single line space
		
		String text = """
                First Line
                Second Line First Part '\s' Second Line Other Part
                Third Line
                """;
		
         return text ; 
	}
}

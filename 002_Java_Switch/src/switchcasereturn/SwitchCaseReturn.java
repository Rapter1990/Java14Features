package switchcasereturn;

import java.util.Scanner;

public class SwitchCaseReturn {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);		
		System.out.print("Enter what planet you want to get its name in our solar system: ");
		int planetLocation = console.nextInt();
		String planetName = getPlanetBeforeJava14(planetLocation);
		System.out.println("Planet Name : " + planetName);
		
		System.out.println("-------------------------------------");
		
		System.out.print("Enter what planet you want to get its name in our solar system: ");
		planetLocation = console.nextInt();
		planetName = getPlanetInJava14(planetLocation);
		System.out.println("Planet Name : " + planetName);
		
		console.close();
	}


	private static String getPlanetBeforeJava14(int planetLocation) {
		// TODO Auto-generated method stub
		
		String planetName = "";
		
		switch (planetLocation) {
	    case 1:
	    	planetName = "Mercury";
	        break;
	    case 2:
	    	planetName = "Venus";
	        break;
	    case 3:
	    	planetName = "Earth";
	        break;
	    case 4:
	    	planetName = "Mars";
	        break;
	    case 5:
	    	planetName = "Jupiter";
	        break; 
	    case 6:
	    	planetName = "Saturn";
	        break;
	    case 7:
	    	planetName = "Uranus";
	        break;
	    case 8:
	    	planetName = "Neptune";
	        break;        
	    default:
	    	planetName = "Invalid Planet";
		}
		
		return planetName;
	}
	
	private static String getPlanetInJava14(int planetLocation) {
		// TODO Auto-generated method stub
		
		String planetName = switch (planetLocation) {
		    case 1 -> "Mercury";
		    case 2 -> "Venus";
		    case 3 -> "Earth";
		    case 4 -> "Mars";
		    case 5 -> "Jupiter";
		    case 6 -> "Saturn";
		    case 7 -> "Neptune";
		    case 8 -> {
		    	yield "Mars";
		    }
		    default -> "Invalid Planet";
		};
		
		return planetName;
	}
}

import java.util.Scanner;

/*This program prompts the user to give it a meter and it will
output the measure in feet */ 


public class Question1 {

	 public static void main(String[] args) {
		System.out.println("");
		System.out.println("************FUN FACT************"); 
	 	System.out.println("\n1 meter is equal to 3.28 feet.");
		System.out.println("********************************");
		System.out.println("");
		
	 	double distanceInMeters;
	 	double distanceInFeet;
	 	final double factor = 3.28084;
		
		Scanner in = new Scanner(System.in);
        System.out.println("How many meters need to be converted?");
        distanceInMeters = in.nextDouble();
		distanceInFeet = factor * distanceInMeters;
		System.out.println("\n" + distanceInFeet + " feet.");
       	 	
	 	
	 }

}


import java.util.Scanner;

public class Question2{

	/*This program prompts the user their mass in kg and their height in meters 
	then does the bmi equation to outputs the user's bmi 
	*/
	
    public static void main(String[] args) {
        System.out.println("what is your Bmi? ");		
	double kg;
        double meters;
       

		

        Scanner in = new Scanner(System.in);
        System.out.println("How heavy are you in kg ?");
        kg = in.nextDouble();
        System.out.println("You entered " + kg);
	
	System.out.println("");
        System.out.println("what is your height in meters ?");
        meters = in.nextDouble();
	double square = Math.pow(meters, 2);
	System.out.println("");    
        System.out.println("your Bmi should be " + kg / square);
	System.out.println("");    


	}
}

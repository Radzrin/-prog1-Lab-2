import java.util.Scanner;

/*this program prompts the user the temperature of the past 3 days and makes and ouputs the average temperature
	*/

public class Question4{

	

	public static void main(String[]args){
	
	  int temp1;
	  int temp2;
	  int temp3;
	
	  System.out.println("                                                                                                                                                         ");
	  System.out.println("Welcome to the forecast channel, we have experienced wierd weather these past 3 days, put in the temperature and we will calculate the average temperature");
	  System.out.println("                             ");
	
	       	
	  Scanner in = new Scanner(System.in);
      System.out.println("What is the temperature today in celcius ? ");
	  temp1 = in.nextInt();
	  System.out.println("                             ");	
	  
	  System.out.println("what was the temperature yesterday in celcius ? ");
	  temp2 = in.nextInt();
	  System.out.println("                             ");	
	  
	  System.out.println("what was the temperature the day before that in celcius ? ");
	  temp3 = in.nextInt();
	  System.out.println("                             ");	
	  
	  System.out.println("The average temperature of the past 3 days is "+ (temp1 + temp2 + temp3) / 3 + "*c");
	  System.out.println("                                                                          ");
		
	}
   
}
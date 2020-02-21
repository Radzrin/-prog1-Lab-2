import java.util.Scanner;

/* This program prompts the user their age and the currentYear to
determine and output their age. 
*/

public class Question1i {

	public static void main(String[] args) {
		System.out.println("");
		System.out.println("Remember that age is just a  number ");
		System.out.println("");

		int currentYear;
		int yearOfBirth;
		int age;
		
		Scanner in = new Scanner(System.in);
        System.out.println("When were you born ? ");
        yearOfBirth = in.nextInt();
        System.out.println("");
		
		System.out.println("What year is it ?");
        currentYear = in.nextInt();
		age = currentYear - yearOfBirth;
        System.out.println("your age should be " + age);
 
		System.out.println("");
		
	}

}

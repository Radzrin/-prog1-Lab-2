import java.util.Scanner;

/* This program prompts the user for an amout of seconds and displays
the time in Minutes:seconds
*/

public class Question3{

	public static void main(String[]args){

		System.out.println("                                                                                        ");
		System.out.println("Input a random amount of seconds and the program will convert it in minutes and seconds  ");
		System.out.println("                                                                                         ");

		Scanner input = new Scanner(System.in);

		int totalSeconds = input.nextInt();
		int minutes = totalSeconds / 60;
		int seconds = totalSeconds % 60;

		System.out.println("                              ");

		System.out.printf("%nthe requested output is %d:%d%n ",minutes,seconds);
		System.out.println("                                              ");
		System.out.println("the requested output is " + minutes + ":" + seconds);


	}
}
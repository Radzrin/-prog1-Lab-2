import java.util.Scanner;

/* This program prompts the user to give them a width and a lenght
to mesure out and output the area and the perimeter of a rectangle.
*/


public class Question1ii {

	 public static void main(String[] args) {
		
		System.out.println("          ");
	 	System.out.println("rectangles");
		System.out.println("          ");
		
		
	 	double length;
	 	double width;
	 	double perimeter;
	 	double area;
		
		Scanner in = new Scanner(System.in);
        System.out.println("How long is the rectangle ? ");
        length = in.nextDouble();

		System.out.println("");
		System.out.println("How large is your rectangle (width) ? ");
        width = in.nextDouble();
        perimeter = (2 * length + 2 * width);
	 	area = (length * width);

	 	System.out.println("");
	 	System.out.println("\n the area is " + area + " cm^2");
		System.out.println("");
		System.out.println("and");
		System.out.println("");
	 	System.out.println("\n the perimeter is " + perimeter + " cm");

	 }	

}

import java.util.*;

/*This program prompts the user's last name (in that respective order) and first to 
output his first name then last name with the first letter capitalized */


	public class Question5 {

		public static void main(String[] args){

			 Scanner input = new Scanner(System.in);
        System.out.println("Type in a name in the format 'LastName, FirstName '");

        String firstFormat = input.nextLine();

        int indexComma = firstFormat.indexOf(',');

        System.out.printf("%nYou have inserted '%s'",firstFormat);
        System.out.printf("%nIndex of comma is %d",indexComma);


        String last = firstFormat.substring(0,indexComma);
        last = last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase();

        String first = firstFormat.substring(indexComma + 2);
        first = first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();
		
		System.out.printf(" %nthe first name is %s ", first);
        System.out.printf(" %nthe last name is %s ", last);
        




		}
	}
import java.util.Scanner;

public class PhoneBookPart1 {
	public static void main(String[] args) {
		/*
		 * Scanner is a special variable type that allows you to get what the user types
		 * the keyboard.
		 * 
		 * Once the Scanner variable is declared and initialized as it is below,
		 * you can read an integer from the user by using 'userInput.nextInt();'
		 * and a String by using 'userInput.next();'
		 */
		Scanner userInput = new Scanner(System.in);
		
		/*
		 * First, we print out the prompt to ask the user how big the
		 * phone book should be.
		 */
		System.out.println("How big do you want the phone book to be?");
		int bookSize = userInput.nextInt();
		
		/*
		 * Using the size of the phone book given by the user, we can
		 * create two arrays of type String: one for the names of the people
		 * in the book, and the other for their number.
		 */
		String[] names = new String[bookSize];
		String[] numbers = new String[bookSize];
		
		/*
		 * Once everything is set up, we can loop over the length of the phone
		 * book to allow users to input names and numbers.
		 */
		for(int i = 0 ; i < bookSize ; i= i + 1) {
			System.out.println("Enter a name:");
			names[i] = userInput.next();
			
			System.out.println("Enter a number:");
			numbers[i] = userInput.next();
		}
			
		/*
		 * To verify that everything is in, we can print everything using
		 * another loop.
		 */
		for(int i = 0; i < names.length ; i++) {
			System.out.println(names[i] + " : " + numbers[i]);
			
		}
	}
}
import java.util.Scanner;

public class PhoneBookPart2 {
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
		
		/*
		 * Once everything is set up and our phone book is set up,
		 * we can enter the main application. Here, we have the 
		 * 'application loop'. This simply repeats the program
		 * until we are done. 
		 * 
		 * This is useful if we have a menu-driven application
		 * that requires us to enter an option, and repeat until
		 * the user wants to quit.
		 */
		while(true) {
			
			//We can print the menu
			System.out.println("Press 1 to search for a user");
			System.out.println("Press 2 to search for a number");
			System.out.println("Press 3 to display all numbers");
			System.out.println("Press 4 to add an entry");
			System.out.println("Press 5 to remove an entry");
			System.out.println("Press 6 to quit");
			
			//And get the user's choice
			int choice = userInput.nextInt();
			
			/*
			 * Using an if/if else/else block, we can check what the user chose
			 * and act accordingly.
			 */
			if(choice == 1) {
				/*
				 * Option 1 is to search for a name.
				 * 
				 * Here, we simply prompt the user for a name to search for
				 * and we can pass all of that to our function searchForUser(.)
				 */
				System.out.println("Enter a name:");
				String name = userInput.next();
				int i = searchForUser(name,names);
				
				/*
				 * If the index isn't -1 (marking not-found), we print the name
				 * and the number.
				 */
				
				if(i != -1) {
					System.out.println(names[i] + " : " + numbers[i]);
				}
				
			} else if(choice == 2) {
				/*
				 * Option 2 is to search for a name.
				 * 
				 * Here, we simply prompt the user for a name to search for
				 * and we can pass all of that to our function searchForUser(.)
				 */
				System.out.println("Enter a number:");
				String number = userInput.next();
				int i = searchForUser(number,numbers);
				
				/*
				 * If the index isn't -1 (marking not-found), we print the name
				 * and the number.
				 */
				
				if(i != -1) {
					System.out.println(names[i] + " : " + numbers[i]);
				}
			} else if(choice == 3) {
				/*
				 * Option 3 is to print all names.
				 * 
				 * We can simply call printAll(.)
				 */
				printAll(names,numbers);
				
			} else if(choice == 4) {
				/*
				 * Option 4 is to add an entry
				 * 
				 * We will prompt the user for a name and a number to add, and then use our extendPhoneBook(.) method 
				 * to make the arrays big enough to hold our new data.
				 */
				
				/*
				 * We can call our extendPhoneBook(.) method to make the arrays bigger
				 */
				names = extendPhoneBook(names,names.length+1);
				numbers = extendPhoneBook(numbers,numbers.length+1);
				
				/*
				 * Then we prompt the user for a new name and number
				 */
				System.out.println("Enter a name to add:");
				String newName = userInput.next();
				
				System.out.println("Enter a number:");
				String newNumber = userInput.next();
				
				/*
				 * And we save them at length - 1 in the arrays. Length - 1 being the last slot of the array.
				 */
				names[names.length - 1] = newName;
				numbers[numbers.length - 1] = newNumber;
				
			} else if(choice == 5) {
				/*
				 * Option 5 is to remove a user.
				 */
				
				//First, we prompt the user for a name to remove
				String name = userInput.next();
				
				int index = searchForUser(name,names);
				
				names = shrinkPhoneBook(names,index);
				numbers = shrinkPhoneBook(numbers,index);
				
				
			} else if(choice == 6) {
				/*
				 * Option 6 is quitting, we can use break to exit the loop.
				 */
				break;
			}
			
		}
		
		userInput.close();
	
	}
	
	/*
	 * Our searchForUser(.) method takes in an array of names, and a name to search for.
	 * 
	 * It simply scans through the name list and compares the name we are looking for
	 * for each one of them.
	 * 
	 * If found, we save the value of i, representing the index at which the name is
	 * located in the array. If not found, the index is left at its default value of -1,
	 * indicating that we haven't found anything.
	 */
	
	public static int searchForUser(String name, String[] names) {
		//Setting up the index to -1 as a default value, representing 'not found'
		int index = -1;
		
		//We scan through our array of names
		for(int i = 0 ; i < names.length ; i = i + 1) {
			//If the name we are looking for matches the name in the array at array i, we modify the index and we break
			if(name.equalsIgnoreCase(names[i])) {
				index = i;
				break;
			}
		}
		
		//In the end, we return the index.
		return index;
		
	}
	
	/*
	 * Our searchForNumber(.) method takes an array of numbers, and a number to search for.
	 * 
	 * It follows the same principle as the previous method.
	 */
	public static int searchForNumber(String number, String[] numbers) {
		int index = -1;

		for(int i = 0 ; i < numbers.length ; i = i + 1) {
			if(number.equalsIgnoreCase(numbers[i])) {
				index = i;
				break;
			}
		}

		return index;
	}
	
	/*
	 * Our printAll(.) method takes in an array of numbers and an array of names.
	 * 
	 * We want to print all of them in a nice format.
	 * We can simply loop through them and print each one them using System.out.println
	 */
	public static void printAll(String[] names, String[] numbers) {
		//Scan through the array using a for loop
		for(int i = 0 ; i < names.length ; i = i + 1) {
			//Print each entry
			System.out.println(names[i] + " : " + numbers[i]);
		}
		
	}
	
	/*
	 * Our extendPhoneBook(.) method makes an array bigger and copies everything to the new one.
	 * 
	 * The new array is returned.
	 */
	public static String[] extendPhoneBook(String[] array, int newSize) {
		//Declare a new 'blank' String array using the new size.
		String[] new_array = new String[newSize];
		
		//Copy everything over.
		for(int i = 0 ; i < array.length ; i = i + 1) {
			new_array[i] = array[i];
		}
		
		return new_array;
	}
	
	/*
	 * Our shrinkPhoneBook(.) method does the opposite of extendPhoneBook(.): it make a smaller array, and copy 
	 * each element EXCEPT one item we want to remove.
	 */
	public static String[] shrinkPhoneBook(String[] array, int indexToBeRemoved) {
		//Declare a new 'blank' String array using a size that is one less than the current one.
		String[] new_array = new String[array.length - 1];
		
		/*
		 * Copy everything but the item at index 'indexToBeRemoved'
		 * Similar to extendPhoneBook
		 */
		
		int i = 0;
		int j = 0;
		for(; i < array.length ; i = i + 1) {
			if(i != indexToBeRemoved) {
				new_array[j] = array[i];
				j = j + 1;
			}
		}
		
		return new_array;
		
	}
	
	
}

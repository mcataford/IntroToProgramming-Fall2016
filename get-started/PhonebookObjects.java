import java.util.Scanner;

public class PhonebookObjects {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("How many entries do you want to have in your phonebook?");
		int entryCount = userInput.nextInt();
		
		PhonebookEntry[] entries = new PhonebookEntry[entryCount];
		
		for(int i = 0 ; i < entryCount ; i = i + 1) {
			System.out.println("Name:");
			String name = userInput.next();
			System.out.println("Number:");
			String number = userInput.next();
			
			entries[i] = new PhonebookEntry(name,number);
		}
		
		while(true) {
			System.out.println("Press 1 to print all numbers on file");
			System.out.println("Press 2 to search for an entry by name");
			System.out.println("Press 3 to search for an entry by number");
			System.out.println("Press 0 to quit");
			
			int choice = userInput.nextInt();
			
			if(choice == 1) {
				printAllEntries(entries);
			} else if(choice == 2) {
				System.out.println("Enter the name you want to look for:");
				String query = userInput.next();
				PhonebookEntry found = searchByName(query,entries);
				
				if(found != null) {
					found.printEntry();
				} else {
					System.out.println("Entry not found!");
				}
			} else if(choice == 3) {
				System.out.println("Enter the number you want to look for:");
				String query = userInput.next();
				PhonebookEntry found = searchByNumber(query,entries);
				
				if(found != null) {
					found.printEntry();
				} else {
					System.out.println("Entry not found!");
				}
			} else if(choice == 0) {
				System.out.println("Good bye!");
				break;
			}
			
		}
		
		
		
	}
	
	public static void printAllEntries(PhonebookEntry[] entries) {
		for(int i = 0 ; i < entries.length ; i = i + 1) {
			entries[i].printEntry();
		}
	}
	
	public static PhonebookEntry searchByName(String name, PhonebookEntry[] entries) {
		for(int i = 0 ; i < entries.length ; i = i + 1) {
			if(entries[i].getName().equalsIgnoreCase(name)) {
				return entries[i];
			}
		}
		
		 return null;
	}
	
	public static PhonebookEntry searchByNumber(String number, PhonebookEntry[] entries) {
		for(int i = 0 ; i < entries.length ; i = i + 1) {
			if(entries[i].getNumber().equalsIgnoreCase(number)) {
				return entries[i];
			}
		}
		
		 return null;
	}
}

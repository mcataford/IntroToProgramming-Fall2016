import java.util.*;
import java.io.*;

public class Reading {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("What do you want to do?\nPress 1 to read a file\nPress 2 to write to a file\nPress 3 to quit");
			
			int choice = input.nextInt();
			input.nextLine();
			
			if(choice == 1) {
				System.out.println("Enter a filename:");
				
				String filename = input.next();
				input.nextLine();
				
				ArrayList<String> contentsOfTheFile = readFromFile(filename);
				
				System.out.println("Contents of " + filename + " : ");
				for(int i = 0 ; i < contentsOfTheFile.size() ; i = i + 1) {
					System.out.println(contentsOfTheFile.get(i));
				}
				
			} else if(choice == 2) {
				System.out.println("Enter a filename:");
				
				String filename = input.next();
				input.nextLine();
				
				System.out.println("Enter what you want to write to the file: ");
				
				String content = input.nextLine();
				
				writeToFile(filename,content);

			} else if (choice == 3) {
				break;
			}
			
			
		}
		
		input.close();
	}
	
	/*
	 * Reading from a file using FileReader and BufferedReader
	 * 
	 * We read each line and add it to an ArrayList, which we then return.
	 */
	
	public static ArrayList<String> readFromFile(String filename) {
		//Creating the arraylist
		ArrayList<String> lines = new ArrayList<String>();
		
		/*
		 * The try/catch block allows for a 'safe space' where risky code
		 * can be executed without crashing the whole program. If any error
		 * happens, the 'catch' block is run is the corresponding exception
		 * is triggered.
		 */
		try {
			
			//Risky code: we open a file, if the file doesn't exist, the 'catch' block happens.
			FileReader fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr);
			
			String currentLine;
		
			//As long as there's a new line, we add the line to the list.
			while((currentLine = br.readLine()) != null) {
				lines.add(currentLine);
			}

			//We close the file.
			fr.close();
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		return lines;
	}
	
	/*
	 * Writing to a file using FileWriter
	 * 
	 * We write to the file using FileWriter
	 */
	
	public static void writeToFile(String filename, String line) {
		
		//See earlier note about try/catch
		try {
			
			//Opening the file for writing, the second argument ensures that we APPEND
			FileWriter fw = new FileWriter(filename,true);
			
			//Writing the line
			fw.write(line);
			
			//We close the file
			fw.close();
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}

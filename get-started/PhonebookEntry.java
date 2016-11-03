public class PhonebookEntry {
	public String name;
	public String number;
	
	/*
	 * The constructor of our entry. It assigns the name and number to the entry.
	 */
	public PhonebookEntry(String name, String number) {
		this.name = name;
		this.number= number;
	}
	
	/*
	 * Prints the phone book entry data
	 */
	public void printEntry() {
		System.out.println("NAME: " + this.name + " NUMBER: " + this.number);
	}
	
	/*
	 * Getters
	 */
	public String getName() { return this.name; }
	public String getNumber() { return this.number; }
	
	/*
	 * Changes the number of the entry
	 */
	public void changeNumber(String newNumber) {
		this.number = newNumber;
	}
}

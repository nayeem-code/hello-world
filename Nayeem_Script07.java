package mYPackage2;

public class Nayeem_Script07 {

	public static void main(String[] args) {
		// Concatenation
		// expected output= Hello Mr. Jhon Doe, Good Evening
		
		String firstName = "Jhon";
		String lastName = "Doe";
		String greet = "Good Evening";
		
		String fullName;
		
		fullName = firstName; // first name initialization
		fullName+= " ";		  // first name with space initialization
		fullName+= lastName;  // last name initialization with first name and space 
		
		System.out.println("Hello Mr. "+fullName+","+" "+greet);
		
	}

}

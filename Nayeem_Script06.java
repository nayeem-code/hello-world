package mYPackage2;

public class Nayeem_Script06 {

	public static void main(String[] args) {
		// Concatenation
		String firstName = "Boris";
		String lastName = "Johnson";
		
		firstName = "Margeret";
		lastName = "Thatcher";
		
		String fullName;
		//System.out.println(firstName+" "+lastName);
		
		//fullName = firstName+" "+lastName;
		//System.out.println(fullName);		//output = Margeret Thatcher (Last assigned value)
		
		fullName = firstName;
		fullName+=" ";
		fullName+= lastName;
		
		System.out.println(fullName);
		
	}

}

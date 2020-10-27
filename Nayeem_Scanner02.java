package mYPackage2;

import java.util.Scanner;

public class Nayeem_Scanner02 {

	public static void main(String[] args) {
		// Second Example of Scanner
		
		Scanner scanner = new Scanner(System.in);
		
		String firstName;
		String lastName;
		String fullName;
		
		System.out.print("Enter FirstName:");
		firstName= scanner.nextLine();
		
		System.out.print("Enter LastName:");
		lastName=scanner.nextLine();

		fullName = firstName +" "+lastName;
		System.out.println("Name of the Employee is: "+fullName);
		
	}

}

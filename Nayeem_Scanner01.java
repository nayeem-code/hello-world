package mYPackage2;

import java.util.Scanner;

public class Nayeem_Scanner01 {

	public static void main(String[] args) {
		// First example with Scanner Input value by Scanner
		
		String firstName;
		Scanner scanner = new Scanner(System.in); // Scanner is a Class and scanner is a object of class scanner
		
	
		System.out.print("Reading/Input a Name:");
		firstName = scanner.nextLine();
		
		System.out.println("You typed: "+firstName);
				
	}

}

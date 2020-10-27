package mYPackage2;

import java.util.Scanner;

public class Loop_Practice_02 {

	public static void main(String[] args) {
		// Store a password and taking password from user and verifying by while loop
		
		String password = "nayeem123"; 	// Password Store
		String guesspassword;			// taking password
		
		System.out.println("Enter your Password: ");	// Enter your password from scanner
		Scanner scanner = new Scanner(System.in);
		guesspassword = scanner.nextLine();
		
		while(!guesspassword.equals(password)) {		// Compare password
			
			System.out.println("Invalid Password, Try again !"); 	// If not matched, Enter password from scanner again
			guesspassword = scanner.nextLine();
		}
		System.out.println("Login Successful");			// If matched, login Successful
		scanner.close();
	}
}
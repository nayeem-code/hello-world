package mYPackage1;

import java.util.Scanner;

public class MyClass4 {

	public static void main(String[] args) {
		// input string from user
		
		Scanner input = new Scanner(System.in);
		String name;
	
		System.out.print("Enter Any Name: ");
		name = input.nextLine();
		
		System.out.println("Your Entered Name is = "+name);
	}
}

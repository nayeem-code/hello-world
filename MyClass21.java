package mYPackage1;

import java.util.Scanner;

public class MyClass21 {

	public static void main(String[] args) {
		// Logical operator = Logical And (&&); Logical Or (||); Logical Not (!)
		// Logical OR ||
		Scanner input = new Scanner(System.in);
		char ch;
		
		System.out.println("Enter any char:");
		ch = input.next().charAt(0);		// Letter input method
		
		if (ch=='a'|| ch=='e'|| ch=='i'|| ch=='o' || ch=='u') {	// Single invited Comma required for letter // Logical OR
			System.out.println("This is Vowel");
		}
		else {
			System.out.println("This is Consonant");
		}
	}

}

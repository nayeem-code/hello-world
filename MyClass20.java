package mYPackage1;

import java.util.Scanner;

public class MyClass20 {

	public static void main(String[] args) {
		// Vowel or Consonant find by using if..else if...else
		
		Scanner input = new Scanner(System.in);
		char ch;
		
		System.out.println("Enter any char:");
		ch = input.next().charAt(0);		// Letter input method
		
		if (ch == 'a') {					// Single invited Comma required for letter
			System.out.println("This is Vowel");
		}
		else if (ch == 'e') {
			System.out.println("This is Vowel");
		}
		else if (ch == 'i') {
			System.out.println("This is Vowel");
			
		}else if (ch == 'o') {
			System.out.println("This is Vowel");
			
		}else if (ch == 'u') {
			System.out.println("This is Vowel");
			
		}
		else {
			System.out.println("This is Consonant");
		}
	}
}
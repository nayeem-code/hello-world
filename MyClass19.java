package mYPackage1;

import java.util.Scanner;

public class MyClass19 {

	public static void main(String[] args) {
		// Even or odd number
		
		Scanner input = new Scanner (System.in);
		int num;
		
		System.out.print("Enter any positive number:");
		num = input.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("This is Even Num");
		}
		else {
			System.out.println("This is odd Num");
		}
	}

}

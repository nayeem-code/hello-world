package mYPackage1;

import java.util.Scanner;

public class MyClass18 {

	public static void main(String[] args) {
		// if..else if..else statement
		
		Scanner input = new Scanner(System.in);
		int num;
		
		System.out.print("Enter any Number:");
		num = input.nextInt();
		
		if(num>0) {
			System.out.println("Number is positive");
		}
		else if (num<0) {
			System.out.println("Number is Negative");
		}	
		else {
			System.out.println("Number is Zero");
			
		}

}
}
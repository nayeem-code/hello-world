package mYPackage2;

import java.util.Scanner;

public class Nayeem_Scanner03 {

	public static void main(String[] args) {
		// Third Example
		
		int num1, num2;
		int result;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter first Number, num1:");
		num1 = scanner.nextInt();
		
		System.out.print("Enter second Number, num2:");
		num2 = scanner.nextInt();
		
		result= num1 + num2;
		System.out.println("The Result is:"+result);
		
		
	}

}

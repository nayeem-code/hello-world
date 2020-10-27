package mYPackage2;

import java.util.Scanner;

public class Nayeem_Scanner04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1, num2, num3;
		int result;
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter num1 is: ");
		num1 = scanner.nextInt();
		
		System.out.print("Enter num2 is: ");
		num2 = scanner.nextInt();
		
		System.out.print("Enter num3 is: ");
		num3 = scanner.nextInt();
		
		result = num1+ num2+ num3;
		System.out.println("The result is: "+result);
		
	}

}

package mYPackage2;

import java.util.Scanner;

public class Nayeem_Scanner05 {

	public static void main(String[] args) {
		// Input number by Scanner
		
		int num1;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter any Number:");
		num1 = scanner.nextInt();
		
		if (num1==5) {
			System.out.println("The Number is five");
		}else 
			
			System.out.println("The Number is Not five");
	}

}

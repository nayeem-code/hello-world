package mYPackage2;

import java.util.Scanner;

public class Nayeem_Script02 {

	public static void main(String[] args) {

		// If the number range is 1 to 10, it shows Key word Number; otherwise it shows Unknown number
		
		int num1;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter any Number:");
		num1 = scanner.nextInt();
		
		if (num1==1) {
			System.out.println("The Number is One");
		}else 
			System.out.println("The Number is Not five");
	}

}

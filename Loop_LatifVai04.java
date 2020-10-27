package mYPackage2;

import java.util.Scanner;

public class Loop_LatifVai04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int num;
		
		int sum =6;
		
		System.out.print("Enter a Number: ");
		num = scanner.nextInt();
		sum+=num;
		
		sum+=10; 	// sum = sum+num // adding num with sum
		
		System.out.println("The  sum is: "+sum);

	}

}

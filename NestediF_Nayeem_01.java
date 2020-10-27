package mYPackage2;

import java.util.Scanner;

public class NestediF_Nayeem_01 {

	public static void main(String[] args) {
		// Nested If [CONFUSION]
		
		int age;
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter age: ");
		age = sc.nextInt();
	
		if (age>15) {
			System.out.println("Probationary Driver license");
			
			if(age>17) {
				System.out.println("Full Driver License");
				
				if (age>99) {
					System.out.println("Surrender the Driver License");
				}
			}
		}
		else {
			System.out.println("Not Eligible");
		}
	}
}	

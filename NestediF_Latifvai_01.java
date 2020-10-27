package mYPackage2;

import java.util.Scanner;

public class NestediF_Latifvai_01 {

	public static void main(String[] args) {
		// Nested ..If  
		
		int age;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Age: ");
		age = scanner.nextInt();
		 
		if (age>15) {
			if (age>17) {
				System.out.println("Can have a full license");
			}else {
				System.out.println("Can have a Probationary license");
			}
		}else {
			System.out.println("Can not have any License");
		}
	}
}

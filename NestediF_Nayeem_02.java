package mYPackage2;

import java.util.Scanner;

public class NestediF_Nayeem_02 {

	public static void main(String[] args) {
		// Nested If: Age verify to allow the Party [CONFUSION]
		
		Scanner sc = new Scanner(System.in);
		
		int age;
		
		System.out.print("Enter any Age: ");
		age = sc.nextInt();
		
		if (age>=14) {
			System.out.println("You may allow in the Party");
			
			if(age>=17) {
				System.out.println("You can stay until Midnight");
			}
			else {
				System.out.println("You can stay until 10 P.M");
			}
		}
		else {
			
			System.out.println("You can not allowed in the Party");
		}
	}
}

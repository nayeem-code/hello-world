package mYPackage2;

import java.util.Scanner;

public class Nayeem_Assignment_05_else_if_Number {

	public static void main(String[] args) {
	// Read the number from Scanner 1 to 10 and verifying them by using if..else if..else method; 
			
				int num;
				
				Scanner scanner = new Scanner(System.in);
				
				System.out.print("Enter any Number(1-10):");
				num = scanner.nextInt();
				
				if (num==1) {
					System.out.println(num+"=The Number is One");
				}
				else if (num==2) {
					System.out.println(num+"=The Number is Two");
				}
				else if (num==3) {
					System.out.println(num+"=The Number is Three");
				}
				else if (num==4) {
					System.out.println(num+"=The Number is Four");
				}
				else if (num==5) {
				System.out.println(num+"=The Number is Five");
				}
				else if (num==6) {
					System.out.println(num+"=The Number is Six");
				}
				else if (num==7) {
					System.out.println(num+"=The Number is Seven");
				}
				else if (num==8) {
					System.out.println(num+"=The Number is Eight");
				}
				else if (num==9) {
					System.out.println(num+"=The Number is Nine");
				}
				else if (num==10) {
					System.out.println(num+"=The Number is Ten");
				}
				else {
					System.out.println("\"The Number is Out of Range\"");
				}
		}
	}

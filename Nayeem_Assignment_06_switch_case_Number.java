package mYPackage2;

import java.util.Scanner;

public class Nayeem_Assignment_06_switch_case_Number {

	public static void main(String[] args) {
	// Read the number from Scanner 1 to 10 and verifying them by using Switch case statement; 
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Valid Number from (1-10):");
		num = sc.nextInt();
		
		switch(num) {
		
		case 1:
			System.out.println(num+"=This is One");break;
		case 2:
			System.out.println(num+"=This is Two");break;
		case 3:
			System.out.println(num+"=This is Three");break;
		case 4:
			System.out.println(num+"=This is Four");break;
		case 5:
			System.out.println(num+"=This is Five");break;
		case 6:
			System.out.println(num+"=This is Six");break;
		case 7:
			System.out.println(num+"=This is Seven");break;
		case 8:
			System.out.println(num+"=This is Eight");break;
		case 9:
			System.out.println(num+"=This is Nine");break;
		case 10:
			System.out.println(num+"=This is Ten");break;
		default:
			System.out.println(num+"=Invalid Number!");
			
		}
	}
}	
		

package mYPackage2;

import java.util.Scanner;

public class Nayeem_Assignment_04_Switch_Case_Month {

	public static void main(String[] args) {
		// Read month number by scanner and displaying Month name by sequence
		// You can use Switch case statement
		
		int month;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Valid Month Number from (1-12):");
		month = sc.nextInt();
		
		switch(month) {
		
		case 1:
			System.out.println(month+"=This is January");break;
		case 2:
			System.out.println(month+"=This is February");break;
		case 3:
			System.out.println(month+"=This is March");break;
		case 4:
			System.out.println(month+"=This is April");break;
		case 5:
			System.out.println(month+"=This is May");break;
		case 6:
			System.out.println(month+"=This is June");break;
		case 7:
			System.out.println(month+"=This is July");break;
		case 8:
			System.out.println(month+"=This is August");break;
		case 9:
			System.out.println(month+"=This is September");break;
		case 10:
			System.out.println(month+"=This is October");break;
		case 11:
			System.out.println(month+"=This is November");break;
		case 12:
			System.out.println(month+"=This is December");break;
		default:
			System.out.println(month+"=Invalid Month Number!");

		}
		
	}

}

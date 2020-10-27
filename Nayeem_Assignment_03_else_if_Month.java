package mYPackage2;

import java.util.Scanner;

public class Nayeem_Assignment_03_else_if_Month {

	public static void main(String[] args) {
		// Read month number by scanner and displaying Month name by sequence
		// You can use if...else if..else statement
		
		Scanner scanner = new Scanner(System.in);
		
		String monthName;	//Output: January, February....December
		int monthNumber;	//Input: 1,2,3...12
		
		System.out.print("Enter desired Month Number from 1 to 12 :");
		monthNumber= scanner.nextInt();
		
		if (monthNumber==1) {
			System.out.println(monthNumber+"= Month name is: January");
		}
		else if (monthNumber==2) {
			System.out.println(monthNumber+"= Month name is: February");
		}
		else if (monthNumber==3) {
			System.out.println(monthNumber+"= Month name is: March");
		}
		else if (monthNumber==4) {
			System.out.println(monthNumber+"= Month name is: April");
		}
		else if (monthNumber==5) {
			System.out.println(monthNumber+"= Month name is: May");
		}
		else if (monthNumber==6) {
			System.out.println(monthNumber+"= Month name is: June");
		}
		else if (monthNumber==7) {
			System.out.println(monthNumber+"= Month name is: July");
		}
		else if (monthNumber==8) {
			System.out.println(monthNumber+"= Month name is: August");
		}
		else if (monthNumber==9) {
			System.out.println(monthNumber+"= Month name is: September");
		}
		else if (monthNumber==10) {
			System.out.println(monthNumber+"= Month name is: October");
		}
		else if (monthNumber==11) {
			System.out.println(monthNumber+"= Month name is: November");
		}
		else if (monthNumber==12) {
			System.out.println(monthNumber+"= Month name is: December");
		}
		else
			System.out.println(monthNumber+"= Invalid Month Number!");
	}

}

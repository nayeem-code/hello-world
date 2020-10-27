package mYPackage2;

import java.time.Month;
import java.util.Scanner;

public class Nayeem_If_elseIf_else_04 {

	public static void main(String[] args) {
		// December to February = 12-2 =  Winter
		// March to May	= 3-5 = Spring
		// June to August = 6-8 = Summer
		// September to November = 9- 11 = Fall/Autumn
		
		// Entering month number and show the Season name with their month name
		// This is Test Code: explore more option please
		
		Scanner sc = new Scanner(System.in);
		//String month = null;
		int monthNumber;
		
		System.out.print("Enter valid month Number (1-12): ");
		monthNumber = sc.nextInt();
		
		if (monthNumber>=3 && monthNumber<=5) {
			System.out.println("This is Spring Season: March, April, May");
		}
		else if (monthNumber>=6 && monthNumber<=8) {
			System.out.println("This is Summer Season: June , July, August");
		}
		else if (monthNumber>=9 && monthNumber<=11) {
			System.out.println("This is Fall Season: September, October, November");
		}
		else if (monthNumber>=1 && monthNumber<=2) {
			System.out.println("This is Winter Season: December, January, February");
		}
		else if (monthNumber==12) {
			System.out.println("This is Winter Season: December, January, February");
		}
		else {
			System.out.println("You Entered Invalid Month Number");
		}
	}
}
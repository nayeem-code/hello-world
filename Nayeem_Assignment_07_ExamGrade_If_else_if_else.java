package mYPackage2;

import java.util.Scanner;

public class Nayeem_Assignment_07_ExamGrade_If_else_if_else {

	public static void main(String[] args) {
		/* Assignment
		By Scanner using:
		1. Find the grade where: (by using if...else if..else statement and Nested if) 
		 	Mark<75 = Fail	= (1-74) below 75
		 	Mark >75= C 	= (75-84)
		 	Mark>85 = B 	= (85-89)
		 	Mark>90 = A		= (90-100)
		 	Invalid Mark	= above 100 and decimal number
		*/
		
		// Finding Grade by using if..else if..else method
		
		int mark;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter exam Mark: ");
		mark = sc.nextInt();
		
		if (mark<75) {
			System.out.println(mark+"=\"FAIL\"");
		}else if (mark>=75 && mark<85) {
			System.out.println(mark+"=\"C\"");
		}else if (mark>=85 && mark<90) {
			System.out.println(mark+"=\"B\"");
		}else if (mark>=90 && mark<=100) {
			System.out.println(mark+"=\"A\"");
		}else
			System.out.println("Invalid Input!");
	}
}

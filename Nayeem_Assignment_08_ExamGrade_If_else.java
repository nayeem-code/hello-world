package mYPackage2;

import java.util.Scanner;

import org.w3c.dom.ls.LSOutput;

public class Nayeem_Assignment_08_ExamGrade_If_else {

	public static void main(String[] args) {
		/* Assignment
		By Scanner using:
		1. Find the grade where: (by using Nested if) 
		 	Mark<75 = Fail	= (1-74) below 75
		 	Mark >74= C 	= (75-84)
		 	Mark>84 = B 	= (85-89)
		 	Mark>89 = A		= (90-100)
		 	Mark>100 =		= Invalid mark on above 100 
		*/
		
		// Finding Grade by using else...if. method
		
		int mark;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter exam Mark: ");
		mark = scanner.nextInt();
	
			if (mark>100) {
			System.out.println("Invalid Mark!");	// above 100
			}
			else {
				if (mark>89) {
				System.out.println("Grade A");		// (90 - 100)
				}
				else {
					if (mark>84) {
					System.out.println("Grade B");	// (85 - 89)
					}
					else {
						if (mark>74) {
						System.out.println("Grade C"); // (75 -84)
						}
						else {
							System.out.println("Fail !");	// below 74
					}
				}
			}	
			
		}

	}

}

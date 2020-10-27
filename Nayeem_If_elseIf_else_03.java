package mYPackage2;

import java.util.Scanner;

public class Nayeem_If_elseIf_else_03 {

	public static void main(String[] args) {
		// 	Input Month name by using Scanner and verifying their name by if..else if..else statement
		//	Here we use month.equals("January") instead of month=="January"
		
			Scanner scanner = new Scanner(System.in);
			String month;
			
			System.out.print("Enter the Month Name:");
			month=scanner.nextLine();			//String input method by next
			
			if (month.equals("January")) {		// For string compare: month.equals("January")
				System.out.println("The month name is: January");
			}
			else if(month.equals("February")) {
				System.out.println("The month name is: February");	
			}
			else if(month.equals("March")) {
				System.out.println("The month name is: March");	
			}
			else if(month.equals("April")) {
				System.out.println("The month name is: April");	
			}
			else if(month.equals("May")) {
				System.out.println("The month name is: May");	
			}
			else if(month.equals("June")) {
				System.out.println("The month name is: June");	
			}
			else if(month.equals("July")) {
				System.out.println("The month name is: July");	
			}
			else if(month.equals("August")) {
				System.out.println("The month name is: August");	
			}
			else if(month.equals("September")) {
				System.out.println("The month name is: September");	
			}
			else if(month.equals("October")) {
				System.out.println("The month name is: October");	
			}
			else if(month.equals("November")) {
				System.out.println("The month name is: November");	
			}
			else if(month.equals("December")) {
				System.out.println("The month name is: December");	
			}
			else {
				System.out.println("\"You entered wrong Month Name\"");
			}
		}
	}

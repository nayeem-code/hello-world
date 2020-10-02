package mYPackage1;

import java.util.Scanner;

public class MyClass7 {

	public static void main(String[] args) {
		// Arithmetic Operator = +, -, *, /, %
		
		//Arithmetic operation from getting User Number
		
		Scanner input = new Scanner(System.in);  	 // Method of Input Number from user
		int num1, num2, result;
		double result2;
		
		System.out.print("Enter your 1st number: "); // Method of Input Num1
		num1 = input.nextInt();
		
		System.out.print("Enter your 2nd number: "); // Method of Input Num2
		num2 = input.nextInt();
		
		result = num1 + num2;
		System.out.println("Sum ="+result);
		
		result = num1 - num2;
		System.out.println("Sub ="+result);
		
		result = num1 * num2;
		System.out.println("Mul ="+result);
		
		result = num1 / num2;
		System.out.println("Div ="+result);
		
		result2 = (double)num1 / num2;				// Convert int to double(type casting) and print the result with decimal value
		System.out.println("Div ="+result2);
		
		result = num1 % num2;
		System.out.println("Reminder ="+result);
		
		
	}

}

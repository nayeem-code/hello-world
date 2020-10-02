package mYPackage1;

import java.util.Scanner;

public class MyClass12 {

	public static void main(String[] args) {
		// Farn to Cels
		
		Scanner input = new Scanner(System.in);
		double farn, cels;
		
		System.out.print("Enter Farenheight=");
		farn = input.nextDouble();
		
		cels = 0.556 * (farn - 32);					//Cels = 5/9 * ( Farn -32)
		System.out.println("Celcious = "+cels);
	
	}

}

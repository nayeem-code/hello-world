package mYPackage1;

import java.util.Scanner;

public class MyClass11 {

	public static void main(String[] args) {
		// Temperature convert (Cels to Farn)
		
		Scanner input = new Scanner(System.in);
		double cels, farn;
		
		System.out.print("Enter Celcious = ");
		cels=input.nextDouble();
		
		farn= 1.8 * (cels + 32);					// farn = 9/5 * (cels + 32)
		System.out.println("Farenheight = "+farn);

	}

}

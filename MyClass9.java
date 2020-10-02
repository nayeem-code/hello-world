package mYPackage1;

import java.util.Scanner;

public class MyClass9 {

	public static void main(String[] args) {
		// Area of Triangle = 1/2*base*height
		
		Scanner input = new Scanner(System.in);
		double base, height, area;
		
		System.out.print("Enter base: ");
		base = input.nextDouble();
		
		System.out.print("Enter height: ");
		height = input.nextDouble();
		
		area = 0.5 * base * height;
		System.out.println("Area of Triangle:"+area);
		
	}

}

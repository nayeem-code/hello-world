package mYPackage1;

import java.util.Scanner;

public class MyClass10 {

	public static void main(String[] args) {
		// Area of Circle = pie * radius * radius
		
	Scanner input = new Scanner(System.in);
	double radius, area;
	
	System.out.print("Enter radius:");
	radius = input.nextDouble();
	
	area = 3.1416 * radius * radius;
	System.out.println("Area of Circle:"+area);

	}

}
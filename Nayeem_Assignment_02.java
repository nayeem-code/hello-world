package mYPackage2;

import java.util.Scanner;

public class Nayeem_Assignment_02 {

	public static void main(String[] args) {
		// Assignment: 02
				// Taking two numbers using Scanner and Compare two numbers to determine which one is the biggest number, 
				// if the numbers are identical (equal) then the result would be "Numbers are identical"

				int x, y;
				
				Scanner scanner =new Scanner(System.in);
				
				System.out.print("Enter Number X:");
				x=scanner.nextInt();
				
				System.out.print("Enter Number Y:");
				y=scanner.nextInt();
				
				if(x>y) {
					System.out.print("The Greater Number is X: "+x);
				}
				else if(y>x) {
					System.out.print("The Greater Number is Y: "+y);
				}
				else {
					System.out.println("The Number X == The Number Y, "+(x==y));
		}
	}
}
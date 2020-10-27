package mYPackage2;

import java.util.Scanner;

public class Nayeem_If_else_01 {

	public static void main(String[] args) {
		// If Else: verifying the driver license as per Age
		
				int age;
				
				Scanner sc = new Scanner (System.in);
				System.out.print("Enter age: ");
				age = sc.nextInt();
				
				if (age>99) {												   // Age =(100-100+); This line is true
					System.out.println("Don't need the Driver License");
				}
				else  {
					if (age>17) {												// Age =(18-99); This line is true
						System.out.println("Can have a full driver license");
					}
					else {
						if(age>15) {											// Age = (16-17); This line is true
							System.out.println("Can have a Probationary Driver license");
						}
						else {
							System.out.println("Can not have Driver License");	// Age=(1-15)below 15; This line is true
						}
					}
				}
			}		
		}

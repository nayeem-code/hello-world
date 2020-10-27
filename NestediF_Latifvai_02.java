package mYPackage2;

import java.util.Scanner;

public class NestediF_Latifvai_02 {

	public static void main(String[] args) {
		// by Latif vai: Nested..If
		// Loop, Array, list, 
		
	int mark;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter exam Mark: ");
		mark = scanner.nextInt();
	 
		if (mark>74) {
			if(mark>84) {
				if (mark>89) {
					System.out.println("Grade A"); 	// 89
				}else {
					System.out.println("Grade B"); 	// 84
				}
			}else {
				System.out.println("Grade C");   	// 74
			}
		}else {
			System.out.println("Below Grade C");
		}
	}
}

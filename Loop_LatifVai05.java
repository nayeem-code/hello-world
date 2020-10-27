package mYPackage2;

import java.util.Scanner;

public class Loop_LatifVai05 {

	public static void main(String[] args) {
		
		// Enter 5 numbers and adding their values
		
		Scanner scanner = new Scanner(System.in);
		
		int i, num, sum;
		sum = 0;	// Initially Sum=0,  When Multiplication Sum =1
		
		i= 1;
		
		while(i<6) {
			System.out.print(i+". Enter a Number: ");  // this line in a while block
			num = scanner.nextInt();
		//	sum += num; // sum = sum+num // adding num with sum
		//	sum -= num; // sum = sum-num 
		//	sum *= num; // sum = sum*num 
			i++;
		}
		System.out.println("The Sum is: "+sum);	// this line shows the final result
	}
}

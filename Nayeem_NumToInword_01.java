package mYPackage2;

import java.util.Scanner;

public class Nayeem_NumToInword_01 {

	public static void main(String[] args) {
		// Taking Number  from 1-99 and display with In word
		// This is Copy Code
		// This is Array
		
		Scanner sc = new Scanner(System.in);
		
		int num, digit1, digit2;
		
		String str1[]= {" ","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE","TEN", 
						"ELEVEN","TWELVE","THIRTEEN","FOURTEEN","FIFTEEN","SIXTEEN","SEVENTEEN","EIGHTEEN","NINETEEN"};
		
		String str2[]= {" "," ","TWENTY","THIRTY","FOURTY","FIFTY","SIXTY","SEVENTY","EIGHTY","NINETY"};
		
		System.out.print("Enter any number from 1-99: ");
		num = sc.nextInt();
		
		if ((num<1)|| (num>=100)) {					// Any condition is true
			System.out.println("Invalid Input");
		}
		else if ((num>=1)&& (num<=19)){				// Both Condition need to be true
			System.out.println(str1[num]);
		}
		else if ((num>=20)&& (num<=99)) {
			
			digit1 = num / 10;
			digit2 = num % 10;
			
			System.out.println(str2[digit1] +" "+str1[digit2]);
		}
	}
}

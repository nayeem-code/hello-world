package mYPackage2;

public class Nayeem_Script03 {
	
	public static void main(String[] args){ 
		
		//Expected output = Hello Mr. Kazi Rahman, Good evening
		
		String person = "Kazi Rahman"; // variable given
		String greet = "Good evening"; // variable given
		
		System.out.print("Hello Mr."); // 1st method
		System.out.print(" ");         // Space insert
		System.out.print(person);	   // Name  insert
		System.out.print(",");		   // Comma insert
		System.out.print(" ");		   // Space insert
		System.out.println(greet);	   // Greet insert
		
		System.out.println("Hello Mr."+" "+person+","+" "+greet);	// 2nd Method	(+) = addition
		
		System.out.println("Hello Mr. Kazi Rahman, Good evening");	// 3rd method
		
	}
}
package mYPackage2;

public class Nayeem_Script12 {

	public static void main(String[] args) {
		// String format-1
		//Formating string using System.out.format();
		// %a = floating value
		// %b = Any type
		// %c = Character single
		// %d = integer round value, no floating
		// %e = floating point
		// %f = floating point
		// %g = floating point
		// %h = Any type
		
		String person = "John Doe";
		int age =45;
		
		
		System.out.format("This is string format example");
		
		System.out.println("\nHis name is "+person +", he is "+age+" years old.");  
		
		//System.out.format(format, args); // it requires " String" and Args
		
		System.out.format("His name is %s, he is %d years old.",person, age); // %s = String = person // %d = integer = age	
		
	}

}

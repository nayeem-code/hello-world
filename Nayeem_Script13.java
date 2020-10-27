package mYPackage2;

public class Nayeem_Script13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		%s: String 
		%d: Integer 
		%a: floating point 
		%b: Any type 
		%c: character 
		%e: floating point 
		%f: floating point 
		%g: floating point 
		%h: Any type 
		%n: none 
		%o: Integer 
		%t: Date/Time 
		%x: Integer 
		 */ 

		String person = "John Doe";
		int age =45;
		int sl=1;
		
		
		System.out.format("This is string format example\n");
		
		System.out.println(sl+". His name is "+person +", he is "+age+" years old.");  
		
		person = "Jane Doe";
		sl=2;
		
		System.out.println(sl+". Her name is "+person +", she is "+age+" years old."); 
		sl=3;
		
		System.out.format("%d. Her name is %s, she is %d years old.",sl, person, age); // %s = String = person // %d = integer = age 
		
		
		
		/*
		String person="John Doe"; 
		int age=45; 
		int sl=1; 

		System.out.format("This is String format example\n"); 
		System.out.print(sl+". His name is "+person+", he is "+age+" years old.\n"); 
		person="Jane Doe"; 
		sl=2; 
		System.out.print(sl+". Her name is "+person+", she is "+age+" years old.\n"); 
		sl=3; 
		System.out.format("%d. Her name is %s, she is %d years old.",sl, person, age); 
		
		*/	
	}
}

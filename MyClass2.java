package mYPackage1;
/* Data Types of Variable: Primitive and Non Primitive
 * Primitive: 1. Boolean : True or False
 * 			  2. Numeric : char and integral (byte, short, int, long), Floating point (float, double)
 * Non Primitive : String , Array
 * Variable: is a Name starting with lower case character and creating by : A-Z, a-z, 0-9, _ , $ 
 * Syntax of Variable: declare data type + name
 */
public class MyClass2 {

	public static void main(String[] args) {
		boolean b = true;  // dynamic initialization 
		char 	c = 'a';
		short 	s = 12;
		int 	i = 123;
		float 	f = 5.6123f;
		double 	d = 10.12345 ;
		
		System.out.println("boolean b= "+b); 
		System.out.println("char c= "+c);
		System.out.println("short s ="+s);
		System.out.println("int i= "+i);
		System.out.println("float f= "+f);
		System.out.println("double d= "+d);
		/*
		 * Format Specifier = printf and %
		 */
		System.out.printf("boolean b = %b\n", b);
		System.out.printf("char c = %c\n", c); 
		System.out.printf("short s = %d\n", s);   // short = number= %d
		System.out.printf("int i = %d\n", i);     // int = number= %d
		System.out.printf("float f = %.2f\n", f); // float = number= %.2f (2 number after decimal)
		System.out.printf("double d = %.3f\n", d);// double = number= %.3f (3 number after decimal)
		
		
		
		
		
		
	}

}

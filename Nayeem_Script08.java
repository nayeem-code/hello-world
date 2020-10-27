package mYPackage2;

public class Nayeem_Script08 {

	public static void main(String[] args) {
		//Concatenation means add two or more strings
		
		
		String person="John Doe"; 
		int age=45; 

		String output=" "; 
		output="it is empty";//value assigned 
		output="it is no more empty"; 

		//output=person; 
		//System.out.println(person); 
		//System.out.println(output); 
		System.out.println("Hello Mr. "+person+", you are "+age+" years old."); // 1st method 

		output="Hello Mr. "; 
		output+=person; 
		output+=", you are "; 
		output+=age+" years old."; 

		System.out.println(output); // 2nd method 

	}

}

package mYPackage2;

public class Nayeem_Script05 {

	public static void main(String[] args) {
		// Concatenation
		
		String name = "John Doe";
		int age = 45;
		
		String output; 					// here output is a variable
		output="it is empty. ";
		output+="it is no more empty"; 	//output+= "it is empty. " + "it is no more empty";
		//System.out.println(output);
		output=name;					// name is initializing in output; last value always print
		//System.out.println(name);
		System.out.println(output+","+" "+"you are "+age+" "+"years old");
	}

}

package mYPackage1;

public class MyClass14 {

	public static void main(String[] args) {
		// Unary operator : (--x)Pre decrement, post decrement(x--), (++x)Pre Increment, Post Increment(x++)
		
		int x = 25;
		int y;
		
		y = --x;					//Instantly decrease by 1; x=25-1=24
		System.out.println("Y ="+y);
		
		y = x--;					//Later decrease by 1; x=24=24
		System.out.println("Y ="+y);
		
		y = ++x;					//Instantly increase by 1; x=24-1=23+1=24 
		System.out.println("Y ="+y);
		
		y = x++;					//Later increase by 1; x=24=24
		System.out.println("Y ="+y);

	}

}

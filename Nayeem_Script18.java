package mYPackage2;

public class Nayeem_Script18 {

	public static void main(String[] args) {
		// Increment++; 
		//Decrement--
		
		String firstName="Abdus";
		String lastName="Sabur";
		String fullName;
		
		fullName=firstName;
		fullName+=" ";
		fullName+=lastName;
		
		System.out.println(fullName);
		
		//...............................
		
		int a, b;
		
		a=25;
		//a=a+1; //26
		//a+=1;  //26
		a+=10; // 35
		a+=2;  //37
		a=a+1; //38
		a++;   //39
		
		System.out.println(a);
		//...........................
		
		b=25;
		b=b-1;
		b-=5;
		b--;  // b
		b-=2; //
		
		System.out.println(b);
		
		//............................
		
		//(x+y)^2 = x^2+2xy+y2
		
		int x, y, z;
		x=5;
		y=10;
		z = (x*x)+2*x*y+(y*y);
		
		System.out.println((x*x)+2*x*y+(y*y)); //25+2*50+100=225
		System.out.println("The result(x+y)^2 is:"+z); //25+2*50+100=225
		
	}

}

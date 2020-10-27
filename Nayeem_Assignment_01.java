package mYPackage2;

public class Nayeem_Assignment_01 {

	public static void main(String[] args) {
			// Assignment:
				// Area of Circle = pie * radius * radius
				// Area of Triangle = (base*height)/2 
				// Area of Square = (length of side * length of side) = s * s
				// Area of Rectangular= length * width
				// If Number is greater than 10, double the number, else square the number
			//..........................................	
			
			// Area of Circle = pie * radius * radius
			
				double carea, radius;
				radius = 10;	// let Radius =10 // Pie = Math.PI = 3.14159
				
				carea = Math.PI * radius * radius;
				System.out.println("Area of Circle is:"+carea);
				
			
			//	Area of Triangle = (base*height)/2 
				
				double tarea, tbase, theight;
				tbase = 5;   // let base =5; height = 10
				theight =10;
				
				tarea = (tbase * theight) /2;
				System.out.println("Area of a Triangle is:"+tarea);
				
			
			// Area of Square = (length of side * length of side) = s * s
				
				double sarea, s;
				s = 5;		// let s = length of side = 5
				
				sarea = (s * s);
				System.out.println("Area of Square is:"+sarea);
			
			// Area of Rectangular= length * width
				
				double rarea, rlength, rwidth;
				rlength = 10;  // let length =10, width =5
				rwidth = 5;
				
				rarea = rlength * rwidth;
				System.out.println("Area of Rectangular is:"+rarea);
				
				
			// If Number is greater than 10; Double the number(Number*2), else Square the number (Number*Number)	 
				
				int numx = 11;
				
				if (numx > 10) {
					System.out.println("Double the number:"+(numx*2));
				
				}else {
					System.out.println("Square the number:"+(numx*numx));
				}		
		}

}

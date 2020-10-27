package mYPackage2;

public class NestediF_Latifvai_03 {

	public static void main(String[] args) {
		// Nested If : Find the largest number
		
		int a,b,c;
		a=45;
		b=47;
		c=46;
		
		if (a>b) {
			if (a>c) {
				System.out.println("A is the biggest Number");
			}else {
				System.out.println("C is thde biggest Number");
			}
		}else {
			if (b>c) {
			System.out.println("B is the biggest number"); 
		}else {
			System.out.println("C is thde biggest Number");
		}
	}
}
}


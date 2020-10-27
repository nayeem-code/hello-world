package mYPackage2;

public class Nayeem_Script01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String myTitle = "String Compare";
		
		String expTitle = "String compare";
		/*
		if (myTitle.equals("String Compare")) {
			System.out.println("It is matched");
		}else {
			
			System.out.println("It doesn't match");
		*/
		
		/*
		if (myTitle.equals(expTitle)) {
			System.out.println("It is matched");
		}
		else {
			System.out.println("It doesn't match");
		}
		*/
		
		if (myTitle.equalsIgnoreCase(expTitle)) {
			System.out.println("It is matched");
		}
		else {
			System.out.println("It doesn't match");
		}

	}
}
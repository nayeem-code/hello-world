package mYPackage2;

public class SwitchCase_Latifvai_01 {

	public static void main(String[] args) {
		// Switch Case 

		int day=7;			// If we insert 1-7 it shows days name, other wise Invalid output
		
		switch(day) {
			case 1:
				System.out.println("Sunday"); break;
			case 2:
				System.out.println("Monday"); break;
			case 3:
				System.out.println("Tuesday"); break;
			case 4:
				System.out.println("Wednesday"); break;
			case 5:
				System.out.println("Thursday"); break;
			case 6:
				System.out.println("Friday"); break;
			case 7:
				System.out.println("Saturday"); break;
			default:
				System.out.println("Invalid Input"); break;
				
		}
	}
}

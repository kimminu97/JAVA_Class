package Condition;

public class Main04 {

	public static void main(String[] args) {

		char grade = 'B';
		
		switch( grade ) {
		case'A':
		case'B':
		case'C':
			System.out.println("PASS");
			break;
		default:
			System.out.println("Not-PASS");
			break;
		}
		
	}

}

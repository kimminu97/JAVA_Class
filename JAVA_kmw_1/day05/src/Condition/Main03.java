package Condition;

public class Main03 {

	public static void main(String[] args) {

		char grade = 'C';
		
		switch( grade) {
		case 'A':
			System.out.println("91~100�� ���� �Դϴ�.");
			System.out.println("A��� �Դϴ�");
		case 'B':
			System.out.println("81~90�� ���� �Դϴ�.");
			System.out.println("B��� �Դϴ�.");
		case 'C':
			System.out.println("71~80�� ���� �Դϴ�.");
			System.out.println("C��� �Դϴ�.");
		default:
			System.out.println("70�� �����Դϴ�.");
			
		}
		
	}

}

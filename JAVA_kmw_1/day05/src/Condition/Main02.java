package Condition;

public class Main02 {

	public static void main(String[] args) {

		char grade = 'B';
		
		switch( grade) {
		case 'A':
			System.out.println("91~100�� ���� �Դϴ�.");
			System.out.println("A��� �Դϴ�");
			break;
		case 'B':
			System.out.println("81~90�� ���� �Դϴ�.");
			System.out.println("B��� �Դϴ�.");
			break;
		case 'C':
			System.out.println("71~80�� ���� �Դϴ�.");
			System.out.println("C��� �Դϴ�.");
			break;
		default:
			System.out.println("70�� �����Դϴ�.");
			break;
			
		}
		
	}

}

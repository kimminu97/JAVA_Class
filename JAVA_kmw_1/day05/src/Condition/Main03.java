package Condition;

public class Main03 {

	public static void main(String[] args) {

		char grade = 'C';
		
		switch( grade) {
		case 'A':
			System.out.println("91~100점 사이 입니다.");
			System.out.println("A등급 입니다");
		case 'B':
			System.out.println("81~90점 사이 입니다.");
			System.out.println("B등급 입니다.");
		case 'C':
			System.out.println("71~80점 사이 입니다.");
			System.out.println("C등급 입니다.");
		default:
			System.out.println("70점 이하입니다.");
			
		}
		
	}

}

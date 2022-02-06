package Operator;

public class Main01 {

	public static void main(String[] args) {

		int a = 100;
		int b = 200;
		int x = 5;
		int y = 3;
		
		boolean result1 = a != b || a == b;	// t
		boolean result2 = a < b || x > y;	// t
		boolean result3 = a < b || x < y;	// t
		boolean result4 = a < b || x > y;	// t
		boolean result5 = a > b || x < y;	// f
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		System.out.println("---------------------");
		
		// boolean 값 끼리 논리 연산이 가능하다
		boolean r1 = a >= b;
		boolean r2 = x <= y;
		boolean result6 = r1 && r2;	// f
		boolean result7 = r1 || r2; // f
		System.out.println(result6);
		System.out.println(result7);
		System.out.println("---------------------");
		
		boolean success = true;
		boolean fail = !success;
		System.out.println(fail);
	}

}

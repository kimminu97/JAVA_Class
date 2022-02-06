package Scanner;

import java.util.Scanner;

/*
 * 자바 기본 입력 클래스인 스캐너(Scanner)클래스
 * java.util 패키지 내에 존재하는 클래스
 */
public class Main01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("int type 입력: ");
		int i = scanner.nextInt();
		System.out.println("int 결과 : " + i);
		
		System.out.print("double type 입력 : ");
		double d = scanner.nextDouble();
		System.out.println("double 결과 : " + d);
		
		System.out.print("String 입력 : ");
		String s = scanner.next();
		System.out.println("String 결과 : " + s);
		
		scanner.close();
	}

}

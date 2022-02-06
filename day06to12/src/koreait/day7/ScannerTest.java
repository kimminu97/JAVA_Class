package koreait.day7;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a= sc.nextInt();
		System.out.println(a);
//		sc.close();		//1)
		testA();
		
	}
	static void testA() {
		Scanner sc = new Scanner(System.in);
//		1)에서 close() 메소드로 해제된 표준 입력 system.in을 다시 사용할 수 없습니다.
//		전연변수로 선언해서 사용합니다.
		
		int c = sc.nextInt();
		System.out.println(c);
//		sc.close();
	}
	
//	protected void finalize() throws
	
}

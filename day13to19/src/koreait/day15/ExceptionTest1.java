package koreait.day15;

import java.util.Scanner;

public class ExceptionTest1 {
	public static void main(String[] args) {
		//Exception 요약 : 문법오류가 아닙니다. 실행하면서 발생하는 오류 입니다.(발생가능성을 고려해 프로그래밍해야합니다.)
		//	-> 원인에 따라 다른이름 xxxxException 이 방생하고 Exception 클래스의 자식클래스이다.
		//	-> Exception 이 실행 중에 발생하면 프로그램이 그 시점부터 중단
		//  따라서, Exception을 예상하고 프로그램이 중단되지 않도록 프로그램을 구현해야합니다.
		
		//Exception 예시 4 
		//Wrapper 클래스(Short,Integer,Double,Long..)에는 문자열을 기본형타입으로 변환하는 메소드가 있습니다.
//		int b = Integer.parseInt("abc");	// Integer.parseInt("123");정상적으로 실행
		//정수로 변환할 수 없는 문자열은 NumberFormatException 이 발생합니다.
//		System.out.println("b= "+b);
		
		double c = Double.parseDouble("1234,567");
		System.out.println("c=" + c);
		
		
		//Exceptiion 예시 3
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();	//키보드 입력을 정수로  변환해서 변수에 저장합니다.
		//사용자 입력한 문자에 숫자외에 것이 있을때 InputMismatchException 발생
		
		//Exception 예시2
		int[] nums = new int[5];	//배열선언 : 요소5개입니다.
		nums[5] = 100;
		//실행했을 때 ArrayIndexOutOfBoundsException이 발생 -> 인덱스 0~4
		
		//Exception 예시1
		String message = null;
		char temp = message.charAt(0);	//message 문자열에서 첫번째(0) 글자 1개 가져옵니다
		//실행했을 때 NullPointerException이 발생합니다. -> 이유 : message 참조객체 null이기 때문입니다.
		
	}
}

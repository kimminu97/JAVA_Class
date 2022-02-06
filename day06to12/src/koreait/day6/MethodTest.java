package koreait.day6;

import java.util.Scanner;

public class MethodTest {
	//클래스 (또는 객체)의 구성 : 필드, 메소드
	// -> 메소드를 이해하는 연습입니다. 단, 같은 클래스에서 사용되는 경우입니다.
	
	//static : 정적인(고정된), static 성질끼리 서로 사용가능
	public static void main(String[] args) {
		System.out.println();	//System은 클래스, out은 (객체형)필드, println은 out의 메소드
		Scanner sc = new Scanner(System.in);
		//메소드 실행 - 메소드 이름 호출
		testMethod1();	//main 메소드의 특징 : static , 실행할 수 있는 메소드는 static 만 가능합니다.
						// -> static 은 static 성질을 갖는 요소들만 사용합니다.
//		testMethod2(123, 123); 오류-> 두번째 인자의 형식이 틀림
		testMethod2(123, "kmw");
		testMethod2(456, "김민우");
		testMethod22(1.34,23,4.56);	//3개의 인자값을 더해서 출력하는 메소드입니다.
		testMethod22(23,45,1.8987);	//인자값 전달할때 자동캐스팅 됩니다.
		int testMethod3 = testMethod3();//반환값(리턴값)이 있는 메소드는 변수를 사용하여 저장 또는 출력을 합니다.
		System.out.println(testMethod3);
		System.out.println("testMethod3 return = "+ testMethod3());
		System.out.println("testMethod3 return 더하기 = "+ (testMethod3()+11));//리턴값 연산
		System.out.println(testMethod33()); //수요일 출력
		System.out.println("testMethod4 return = " +testMethod4(34, 67));
		
		//testMethod44를 실행해서 리턴값을 변수 d_result에 저장하고 출력하세요
		double d_result = testMethod44(3.41, 1.51);
		System.out.println("두 실수의 합은 " + d_result);
		
		System.out.print("요일출력 \n1~7을 입력하세요 : ");
		int a = sc.nextInt();
		String dayOfweek = dayOfweek(a);	//문자열의 참조값(메모리의 주소)을 반환
		System.out.println("오늘은 " + dayOfweek);	//반환받은 문자열의 참조값으로 내용(문자열)을 출력
	}
	
//	1.인자(args), 반환값이 없는(void) 메소드입니다.
	static void testMethod1() {	//메소드 정의 연습1
		System.out.println("첫번째 메소드 정의 연습입니다.");
	}
//	2. 인자 있고, 반환값이 없는 메소드 입니다.
//	인자 개수는 제한이 없습니다. 변수 선언과 같은 방식으로 ,로 구분합니다.
//	인자는 메소드 실해에 필요한 데이터입니다.
	static void testMethod2(int a, String name) {
		//메소드를 실행할 때는 정수, 문자열 순서에 맞게 값을 지정하고
		//a는 정수값, name은 문자열의 참조값을 저장합니다.
		System.out.println("정수값 ="+a);
		System.out.println("name="+name);
		
	}
	//연습 예제
	static void testMethod22(double a, double b, double c) {
		double result = a+b+c;		//실수값 + 정수값 = 실수값
		System.out.println("인자값의 합계는 "+result);
	}
	//3. 인자 없고, 반환값이 있는(*반환값 데이터 형식*) 메소드 입니다.
	static int testMethod3() {
		return 145;	//반환값이 있는 형식에서는 꼭 있어야하는 명령문 -> return
	}
	//연습 - "수요일"을 리턴하는 메소드
	static String testMethod33() {
		return "수요일";
	}
	//4.인자 있고 반환값이 있는 메소드
	static int testMethod4(int a, int b) {
		return (a+b);
	}
	static double testMethod44(double a, double b) {
		double result = a+b;
		return result;
	}
	//정수값을 전달 받습니다. 1.이면 월요일, 2이면 화요일, 3이면 수요일...,7이면 일요일을 리턴하는 메소드
	//리턴하는 메소드 -> 1~7이외의 값은 "unKnown" 리턴 , 메소드 이름은 dayOfweek
	static String dayOfweek(int a) {
		switch (a) {
		case 1:
			return "월요일";
		case 2:
			return "화요일";
		case 3:
			return "수요일";
		case 4:
			return "목요일";
		case 5:
			return "금요일";
		case 6:
			return "토요일";
		case 7:
			return "일요일";
		default:
			return "unKnown";
		}
	}
}

package koreait.day2;

public class DoubleVarTest {
	public static void main(String[] args) {
		//1. 선언
		float p1;
		double p2;
		
		//2. 데이터 저장
		p1 = 3.1415f;
		p2 = 3.1415;	//float 형ㅎ식으로 데이터를 표시할 때에는 f(F)를 표기
		
		//3. 변수 사용 : 연산
		p2 = p2 * 1.1;
//		p1 = p1 * 1.1;	//사칙연산결과는 double입니다. double 결과를 float에 저장못함
		
		//p2값 출력해보세요
		System.out.println("변수2 = " + p2);	// +는 연결기호입니다.
		System.out.println("변수1 = " + p2);
		
		//실제 기계어로 실수를 표현하는 방식은 복접한 형식이 있습니다.
		System.out.println(0.1 + 1.6);
		System.out.printf("%5.2f\n",(0.1 + 1.6));	//%f는 실수형식. 전체 5자리. 소수점이하 2자리
		
		//실수의 특별한 연산결과
		System.out.println("Infinity : 0.0으로 나눌때 입니다.");
		System.out.println(3.0/0.0);
		System.out.println("NaN(Not a Number) : 제수,피젯수 모두 0.0일때 입니다,");
		System.out.println(0.0/0.0);
		System.out.println("0.0 : 0.0을 다른수로 나눌때 입니다.");
		System.out.println(0.0/3.0);
		
		//그렇다면 정수는 ??? -> 0으로 나눌때 오류가 발생
//		System.out.println(3/0);	//오류
//		System.out.println(0/0);	//오류
		System.out.println(0/3);
		
	}

}

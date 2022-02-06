package koreait.day4;

import java.util.Scanner;

public class StringTest {
	public static void main(String[] args) {
		
		System.out.println("Hi Java");	//문자열 리터럴 "Hi Java"
		
		//문자열을 변수로 지정하고 싶다. 그러나 문자열은 int,double 처럼 기본형식이 없고 ...클래스가 있습니다.
		
		String name = "kim";	//name 변수의 타입은 String(클래스)
		System.out.println("name"+ name);
		
		name = "choi";
		System.out.println("name = " + name);
		
		System.out.println(name.length());	//int 타입 반환, 문자열의 크기
		System.out.println(name.charAt(0));	//char 타입 반환, 지정된 위치의 문자
		System.out.println(name.charAt(1));
		System.out.println(name.charAt(2));
		char result = name.charAt(3);	//char 반환값 지정을 위한 변수 선언
		System.out.println(result);
		System.out.println(name.equals("kim"));	//boolean 타입 반환, name이 참조하는 문자열과"kim"이 같은지 비교
		System.out.println(name.equals("choi"));
		
		//문자열 입력
		Scanner sc = new Scanner(System.in);
		String nickname;		//String 타입의 객체 즉 문자열을 참조하는 변수 
		
//	    nickname = sc.next();	//키보드로 입력 받은 문자열을 메모리에 저장하고 그 주소를 nickname이 참조
		nickname = sc.nextLine();
		//next 메소드는 공백 또는 엔터까지만 저장
		//nextLine 메소드는 엔터 이전까지 저장
		System.out.println("nickname = " + nickname);
		System.out.println("nickname length= " + nickname.length());
		System.out.println("nickname equals = " + nickname.equals("James"));
		System.out.println("일부 추출=" + nickname.substring(4));	//위치 4부터 끝까지
		System.out.println("일부 추출=" + nickname.substring(4,6));	//위치 4부터 6이전까지(6포함x)
		
		sc.close();
	}
}

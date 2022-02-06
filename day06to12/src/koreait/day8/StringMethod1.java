package kroeait.day8;

public class StringMethod1 {
	//String 클래스의 메소드를 연습1
	public static void main(String[] args) {
		
		String msg = "hello, JAVA";
		String temp;
		
		//1. 대소문자 변환 메소드
		temp = msg.toUpperCase();	//"HELLO, JAVA" 변환된 문자열을 메모리에 저장. 주소값은 temp가 저장
		System.out.println("원본 msg : " + msg);
		System.out.println("대문자 변환 결과 : " + temp);
		
		temp = msg.toLowerCase();
	
		System.out.println("원본 msg : " + msg);	
		System.out.println("소문자 변환 결과 : " + temp);
		//"hello, java" 변환된 문자열을 메모리에 저장. 주소값은 temp가 저장
		
		msg ="   hi~   ";	//msg 변수값이 다른 문자열을 참조합니다.(새로운 문자열의 주소를 저장)
		System.out.println("원본 msg : " + msg);
		
		//2. 공백제거
		//예를 들면 아이디 입력할 때 포함된 공백을 제거할 수 있습니다.
		temp = msg.trim();
		System.out.println("trim 결과 : " + temp);
		
		//3. 특정문자열 포함 여부
		msg = "coco0853@naver.com";
		System.out.println("원본 msg : " + msg);
		System.out.println("naver contains 메소드 : " + msg.contains("naver"));
		System.out.println("gmail contains 메소드 : " + msg.contains("gmail"));
		
		//4. 전체 문자열이 동일한지 비교
		msg="momo";
		System.out.println("원본 msg : " + msg);
		System.out.println("equls 비교(Momo) : " + msg.equals("Momo"));
		System.out.println("equls 비교(momo) : " + msg.equals("momo"));
		System.out.println("equls 비교(momo   ) : " + msg.equals("momo   "));
		
		//5. 문자열 == 로 비교 결과 : 주소 비교입니다.
		String t1 = "test", t2="java";
		String t3 = new String("test");	//String 객체를 생성하고 문자열을 "test"
		String t4 = "test";
		
		System.out.println("t1 == t2 : " + (t1==t2));	//각각 내용이 다른 문자열 비교 ->주소값이 다름
		System.out.println("t1 == t3 : " + (t1==t3));	//t3은 new 연산으로 만들어진 객체를 참조
		System.out.println("t1 == t4 : " + (t1==t4));	//문자열 내용이 같으면 -> 한번만 메모리에 저장.
	}
}

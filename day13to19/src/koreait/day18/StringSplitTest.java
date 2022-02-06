package koreait.day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringSplitTest {
	//String 클래스의 split 메소드를 이요하여 StringTokenizer 동작을 연습합니다.
	public static void main(String[] args) {
		
		String temp = "모모 90 88 79";
		
		String[] result = temp.split(" ");	//메소드 리턴타입은 String[]
					//split : 구분기호를 기준으로 문자열을 나누어 배열에 참조시키도록 합니다.
		System.out.println(result[0]);
		System.out.println(result[1]);
		System.out.println(result[2]);
		System.out.println(result[3]);
		
		for (String data : result) {
			System.out.println(data);
		}
		
		temp = "모모,90,88,79";
		result = temp.split(",");	//인자가 문자열이므로 문자열 형태로 해봅니다.
		System.out.println("--- 구분기호 : , ---");
		for(String data : result)
			System.out.println(data);
		
		temp = "모모-90-88-79";
		result = temp.split("-");	//구분 문자열은 정규식 표현으로 합니다.
		System.out.println("--- 구분기호 : - ---");
		System.out.println("배열의 크기" + result.length);
		for(String data : result)
			System.out.println(data);
		
		List<String> list;
		list = new ArrayList<String>();	//새로운 리스트 생성. 데이터는 없는 상태
		for(String data : result)	//Arrays.asList(result)에 해당하는 명령문들
			list.add(data);
		System.out.println("배열에서 리스트로 직접 변환한 결과 : " + list);
		
		//result 배열을 리스트 자료구조로 변환하기(리스트 객체가 결과로 생성됩니다.)
		list = Arrays.asList(result);	//변환결과 리스트 객체를 참조하는 주소는 list변수가 저장합니다.
			//이 변환은 고정 리스트를 생성합니다. 새로운 데이터 추가/삭제가 안됩니다.
		System.out.println("Arrays.asList 변환된 리스트 : " + list);
//		list.add("나나");
		
		list = new ArrayList<>(list);	//이 클래스에서 사용할 수 있는 가변 리스트 생성(인자는 변환된 리스트)
		list.add("나나");
		System.out.println("변환된 리스트에 항목추가 : " + list);
		
		//Collection 인터페이스 : 데이터를 저장한는 자료구조. List, Set 인터페이스가 하위 인터페이스
	}
}

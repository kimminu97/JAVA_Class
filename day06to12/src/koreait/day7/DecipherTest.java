package koreait.day7;

import java.util.Scanner;

public class DecipherTest {
	//내용 : 쯔위가 모모가 보낸 메세지를 받고 해독해서 확인합니다. 약속된 key 값 7을 알고있습니다.
    //p'sprl'h'qh}h
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int key = 7;
		String message ="";
		String cypherString;
		char[] temp;	//char[] 배열 사용안하고 하는 방법 있습니다.
		
		System.out.print("해독하고 싶은 암호문을 입력하세요 -> ");
		cypherString = sc.nextLine();
		
		temp = cypherString.toCharArray();
		
		for (int i = 0; i < temp.length; i++) {
			temp[i]-=key;			//cypherString.charAt(i) +key
		}							//message += (cyperString.charAt(i)+key)
		System.out.println(temp);	//"" + 'i' + ' '+ 'l'
		
		message = String.valueOf(temp);
		System.out.println("원본 메세지 : "+message);
	}
	//이 예제의 결론 : String을 char[] 배열로 변환	- 문자열.tocharArray()
	//			char[]배열을 String으로 변환    - String.valuOf(문자배열)
}

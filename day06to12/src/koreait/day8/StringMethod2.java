package kroeait.day8;

public class StringMethod2 {
	//String 클래스의 메소드를 연습2
	public static void main(String[] args) {
		
		//1.indexOf : contains 처럼 특정 문자열을 찾아서 시작 위치값을 반환
		String msg = "coco0853@naver.com";
		System.out.println("naver의 시작 위치 : "+msg.indexOf("naver"));
		System.out.println("gmail의 시작 위치 : "+msg.indexOf("gamil"));	//해당 문자열이 없을때 -1 반환
		
		msg = "naver coco coco naver.com";
		System.out.println("마지막 naver문자열의 시작 위치: "+msg.lastIndexOf("naver"));
		
		//2. 문자열의 첫부분 또는 마지막 부분을 검사
		System.out.println("korea로 시작하는가? "+ msg.startsWith("korea"));	//거짓
		System.out.println("naver로 시작하는가? "+msg.startsWith("naver"));	//참
		
		System.out.println("com으로 끝나는가? "+ msg.endsWith("com"));	//참
		System.out.println("@로 끝나는가? "+msg.endsWith("@"));			//거짓
		
		String temp;
		//3. 문자열 부분적인 추출하기
		msg ="i like java";
		temp =msg.substring(4);
		System.out.println("substring(4) : " + msg.substring(4));
		temp =msg.substring(4,8);	//4번부터(8-4)=4개 또는 4번부터 (8-1)=7번까지 추출 
		System.out.println("substring(4,8) : " + msg.substring(4,8));
		
		//문제 java 추출하려면 substring 메소드 인자는?
		temp = msg.substring(7);
		System.out.println("substring(7) : " + msg.substring(7));
		//문제 like 추출하려면 substring 메소드 인자는?
		temp = msg.substring(2,5);
		System.out.println("substring(2,6) : " + msg.substring(2,6));
		
		int start = msg.indexOf("like");
		int len = "like".length();
		temp = msg.substring(start,start+len);
		System.out.println("start : " + start + ",len : " + len+",추출결과 : "+temp);
		
		//4. 문자열 치환하기(바꾸기)
		msg = "minwoo0853@gmail.com";
		temp = msg.replace("0853", "2022");	//첫 인자 : 찾는 문자열, 두번째 인자 : 바꿀 문자열
		System.out.println("replace 결과 : " + temp);
		temp = msg.replace("gmail","daum");
		System.out.println("replace 결과 : " + temp);
		
		msg = "그는 오늘 치킨을 그녀와 먹는다. 치킨 브랜드는 ... 치킨의 재료 원산지는 브라질산이다.";
		//msg 문자열에서 "치킨"이 몇번 나오는지 출력해봅시다.
		
		int idx;	//치킨의 위치 저장
		int cnt=0;
		temp = msg;
		String find = "그녀";
		while(true) {
			idx = temp.indexOf(find);
			System.out.println("찾은 idx : " + idx);
			if(idx == -1) {
				break;
			}
			cnt++;
			temp = temp.substring(idx+find.length()); //첫번째 find뒤 부터 문자열 추출
		}
		System.out.println(find+ "을 찾은 횟수 : " + cnt);
		
	}

}

package Condition;

public class Main03 {

	public static void main(String[] args) {

		boolean is_korean = true;
		
		if( is_korean == true ) {
			System.out.println("한국사람 입니다.");
		}
		
		if( is_korean == false) {
			System.out.println("한국사람이 아닙니다.");
		}
		
		// 값 자체가 참이므로 성립된다.
		if( is_korean ) {
			System.out.println("한국사람 입니다.");
		}
		
		// "!"는 값을 부정한다. 참을 부정하므로 거짓이다.
		if( !is_korean ) {
			System.out.println("한국사람이 아닙니다.");
		}
		System.out.println("------------------------");
		
		boolean is_japanese = false;
		
		if(is_japanese != true) {
			System.out.println("일본사람이 아닙니다.");
		} else {
			System.out.println("일본사람 입니다.");
		}
			
	}

}

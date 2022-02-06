package koreait.day10;
//접근권한 연습합니다.
public class MyClass2 {
	private int age;	//private : 다른 클래스에서 사용 못합니다. ->현재 클래스만 사용
	String name;		//default(package) : 다른 패키지에서 사용 못합니다. -> 같은 패키지만 사용
	public int score;	//public  : 어디서나 사용합니다. -> 다같이 사용
	
	//생성자 메소드 : public,default 에 따라 접근권한 설정할수 있습니다. 기본 생성자 메소드 접근권한 public
/*
	MyClass2() {
		//이렇게 수정하면 다른 패키지에서 객체 생성을 못합니다.
	}
*/
	
	
}

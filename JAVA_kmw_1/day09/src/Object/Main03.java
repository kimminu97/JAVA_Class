package Object;

class Helloworld{
	// 멤버변수는 모든 메서드가 공유한다.(전역변수)
	String message;
	void sayHello() {
		System.out.println(message);
	}
	
	void setEng() {
		message = "Hello Java";
	}
	void setKor() {
		message = "안녕하세요 자바";
	}
}

public class Main03 {

	public static void main(String[] args) {
		Helloworld hello = new Helloworld();
		
		// 메서드 호출
		hello.sayHello();
		hello.setEng();
		hello.sayHello();
		
		hello.setKor();
		hello.sayHello();
		
		
	}

}

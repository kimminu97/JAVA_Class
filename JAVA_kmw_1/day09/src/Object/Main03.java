package Object;

class Helloworld{
	// ��������� ��� �޼��尡 �����Ѵ�.(��������)
	String message;
	void sayHello() {
		System.out.println(message);
	}
	
	void setEng() {
		message = "Hello Java";
	}
	void setKor() {
		message = "�ȳ��ϼ��� �ڹ�";
	}
}

public class Main03 {

	public static void main(String[] args) {
		Helloworld hello = new Helloworld();
		
		// �޼��� ȣ��
		hello.sayHello();
		hello.setEng();
		hello.sayHello();
		
		hello.setKor();
		hello.sayHello();
		
		
	}

}

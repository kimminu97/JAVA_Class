package Inheritance;


class A{
	int data;
	public A(){
		System.out.println("나는 부모 클래스 생성자");
	}
}
class B extends A{
	public B() {
		super();					// 없으면 자동으로 생성하여 부모생성자도 호출
		System.out.println("나는 자식 클래스 생성자");
	}
}
public class InheritanceTest {
	public static void main(String[] args) {
		B b = new B();				// 자식 생성자가 호출됐을때 부모생성자도 호출됌
		b.data = 10;
		System.out.println(b.data);
	}
}

package Inheritance;


class A{
	int data;
	public A(){
		System.out.println("���� �θ� Ŭ���� ������");
	}
}
class B extends A{
	public B() {
		super();					// ������ �ڵ����� �����Ͽ� �θ�����ڵ� ȣ��
		System.out.println("���� �ڽ� Ŭ���� ������");
	}
}
public class InheritanceTest {
	public static void main(String[] args) {
		B b = new B();				// �ڽ� �����ڰ� ȣ������� �θ�����ڵ� ȣ���
		b.data = 10;
		System.out.println(b.data);
	}
}

package Inheritance;

class Car{
	String brand;
	String color;
	int price;
	
	void engineStart() {
		System.out.println("����� �õ� �ѱ�");
	}
	void engineStop() {
		System.out.println("����� �õ� ����");
	}
}
class SuperCar extends Car{
	String mode;
	
	@Override
	void engineStart() {
		super.engineStart();
		System.out.println("�������� �õ� �ѱ�");
	}
	
	void openRoof() {
		System.out.println("���� ����");
	}
	void closeRoof() {
		System.out.println("���� ����");
	}
}
public class Road {
	public static void main(String[] args) {
		SuperCar ferrari = new SuperCar();
		ferrari.engineStart();
	}
}

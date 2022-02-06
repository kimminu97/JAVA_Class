package casting;

class Car{
	String brand;
	String color;
	int price;
	String pw;
	int count;
	
	void engineStart() {
		System.out.println("�õ� ����");
	}
	void engineStop() {
		System.out.println("�õ� ����");
	}
}

class SuperCar extends Car {
	String mode;
	
	@Override
	void engineStart() {
		System.out.println("�������� �õ� Ŵ");
		
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
		Car matiz = new Car();
		SuperCar ferrari = new SuperCar();
		// up casting
		Car noOptionFerrari = new SuperCar();
		
		// down casting �θ� -> �ڽ�Ÿ���ϼ� �����Ƿ� ����ȯ�������
		SuperCar fullOptionFerrari = (SuperCar)noOptionFerrari;
		
		//����
//		SuperCar brokenCar = (SuperCar)new Car();
		
		//matiz, ferrari, noOPtionFerrari, fullOptionFerrari
		
		// �׸��� ��� ��Ʈ+ ����Ʈ + a ������ �Ѳ����� 
		System.out.println(matiz instanceof Car);		// true
		System.out.println(matiz instanceof SuperCar);	// false
		System.out.println(ferrari instanceof Car);		// true
		System.out.println(ferrari instanceof SuperCar); // true
		System.out.println(noOptionFerrari instanceof Car); // true
		System.out.println(noOptionFerrari instanceof SuperCar); // true
		System.out.println(fullOptionFerrari instanceof Car);	// true
		System.out.println(fullOptionFerrari instanceof SuperCar);	// true
	}

}

package casting;

class Car{
	String brand;
	String color;
	int price;
	String pw;
	int count;
	
	void engineStart() {
		System.out.println("시동 켜짐");
	}
	void engineStop() {
		System.out.println("시동 꺼짐");
	}
}

class SuperCar extends Car {
	String mode;
	
	@Override
	void engineStart() {
		System.out.println("음성으로 시동 킴");
		
	}
	
	void openRoof() {
		System.out.println("지붕 열림");
	}
	void closeRoof() {
		System.out.println("지붕 닫힘");
	}
}

public class Road {
	public static void main(String[] args) {
		Car matiz = new Car();
		SuperCar ferrari = new SuperCar();
		// up casting
		Car noOptionFerrari = new SuperCar();
		
		// down casting 부모 -> 자식타입일순 없으므로 형변환해줘야함
		SuperCar fullOptionFerrari = (SuperCar)noOptionFerrari;
		
		//오류
//		SuperCar brokenCar = (SuperCar)new Car();
		
		//matiz, ferrari, noOPtionFerrari, fullOptionFerrari
		
		// 그리드 모드 알트+ 시프트 + a 여러줄 한꺼번에 
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

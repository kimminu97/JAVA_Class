package day02;

class Car{
	String brand;
	String color;
	int price;
	
	// Alt + shift + s, o 생성자 매개변수 자동생성
	public Car(String brand, String color, int price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	public Car(String color, int price) {
		super();
		this.color = color;
		this.price = price;
	}
	public Car() {
		super();
	}
	
	
	
}
public class Road {
	public static void main(String[] args) {
		Car myCar = new Car("페라리", "빨강", 35000);
		Car momCar = new Car("회색",40000);
		Car dadyCar = new Car();
		System.out.println(myCar.brand);
	}
}

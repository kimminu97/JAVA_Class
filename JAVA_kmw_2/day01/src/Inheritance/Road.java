package Inheritance;

class Car{
	String brand;
	String color;
	int price;
	
	void engineStart() {
		System.out.println("¿­¼è·Î ½Ãµ¿ ÄÑ±â");
	}
	void engineStop() {
		System.out.println("¿­¼è·Î ½Ãµ¿ ²ô±â");
	}
}
class SuperCar extends Car{
	String mode;
	
	@Override
	void engineStart() {
		super.engineStart();
		System.out.println("À½¼ºÀ¸·Î ½Ãµ¿ ÄÑ±â");
	}
	
	void openRoof() {
		System.out.println("ÁöºØ ¿­¸²");
	}
	void closeRoof() {
		System.out.println("ÁöºØ ´ÝÈû");
	}
}
public class Road {
	public static void main(String[] args) {
		SuperCar ferrari = new SuperCar();
		ferrari.engineStart();
	}
}

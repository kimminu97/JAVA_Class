package koreait.day14;

public class Cat extends Animal {
	static final String TYPE = "고양이";

	@Override
	public void sound() {

		System.out.println("고양이는 야옹하고 웁니다.");
	}

	public Cat() {
		// TODO Auto-generated constructor stub
	}

	public Cat(String name, String color) {
		super(name, color);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" - Type: "+ TYPE;
	}
}

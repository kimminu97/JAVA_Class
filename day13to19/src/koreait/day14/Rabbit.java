package koreait.day14;

public class Rabbit extends Animal {
	static final String TYPE = "토끼";

	public Rabbit() {
		
	}

	public Rabbit(String name, String color) {
		super(name, color);
	}

	@Override
	public void sound() {

		System.out.println("토끼는 소리를 내지 않습니다.");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" - Type: "+ TYPE;
	}
}

package koreait.day11;

public class AnimalTest {
	public static void main(String[] args) {
		Puppy puppy = new Puppy();
		puppy.sound();
		puppy.setType("poodle");
		System.out.println(puppy.getType());
		
		Cat cat = new Cat();
		
		Animal dog = new Puppy();		//자식객체를 부모타입으로 참조할 수 있습니다.
		dog.sound();
		
//		Puppy test = new Animal();		//오류 : 부모객체는 자식 타입으로 참조할 수 없습니다.
		
		Puppy test = (Puppy) dog;		//부모타입이고 Puppy 객체를  자식타입으로 강제 캐스팅입니다.
		test.sound();
		
//		Puppy test = (Puppy) new Animal();	//부모객체를 자식타입으로 강제 캐스팅입니다. -> 오류
//		test.sound();
	}
}

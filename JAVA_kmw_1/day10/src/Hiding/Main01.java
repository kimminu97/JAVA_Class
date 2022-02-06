package Hiding;
// private가 적용된 항목은 객체를 통하여 접근할 수 없다.(은닉된다)
class Foo{
	public String name = "자바학생";
	private int weight = 100;
}

public class Main01 {

	public static void main(String[] args) {
		Foo obj = new Foo();
		// public 이므로 접근 가능
		System.out.println(obj.name);
		
		//private 이므로 접근 불가능
		//System.out.println(obj.weight);
	}

}

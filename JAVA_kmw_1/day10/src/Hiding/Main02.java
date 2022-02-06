package Hiding;

class Student{
	//은닉된 멤버변수 -> 현재 블록 안에서만 접근 가능함.
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}

public class Main02 {

	public static void main(String[] args) {
		Student s = new Student();
		s.setName("자바학생");
		s.setAge(20);
		
		System.out.println("이름 : " + s.getName());
		System.out.println("나이 : " + s.getAge());
	}

}

package Hiding;

public class Main03 {

	public static void main(String[] args) {
		Member s = new Member("JAVA 학생", 20);
		
		String name = s.getName();
		System.out.println("이름 : " + name);
		
		System.out.println("나이 : " + s.getAge());
	}

}

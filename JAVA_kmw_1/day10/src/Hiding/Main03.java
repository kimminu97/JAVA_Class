package Hiding;

public class Main03 {

	public static void main(String[] args) {
		Member s = new Member("JAVA �л�", 20);
		
		String name = s.getName();
		System.out.println("�̸� : " + name);
		
		System.out.println("���� : " + s.getAge());
	}

}

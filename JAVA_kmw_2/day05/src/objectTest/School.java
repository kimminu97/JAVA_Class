package objectTest;

public class School {
	public static void main(String[] args) {
		Student std = new Student(1, "�ѵ���");
		System.out.println(std.equals(new Student(1,"�ѵ���")));
	}
}

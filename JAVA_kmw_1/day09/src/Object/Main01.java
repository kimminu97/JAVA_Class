package Object;

class Student{
	// �������(��������)�� ���� + �Ҵ�
	String name = "�ڹ��л�";
	int age = 19;
}

public class Main01 {

	public static void main(String[] args) {
		// ��ü�� ����� �Ҵ��� �и�
		Student std;
		std = new Student();
		
		System.out.println("�л��̸� : "+std.name);
		System.out.println("���� : "+std.age);
		
		// ��ü�� ���� �ϰ�����
		Student std2 = new Student();
		System.out.println("�л��̸�2 : " + std2.name);
		System.out.println("����2 : " + std2.age);
		
		System.out.println("-----------------------");
		std.name = "JSP�л�";
		std.age = 33;
		System.out.println("�л��̸� : "+std.name);
		System.out.println("���� : "+std.age);	
		System.out.println("�л��̸�2 : " + std2.name);
		System.out.println("����2 : " + std2.age);
	}

}

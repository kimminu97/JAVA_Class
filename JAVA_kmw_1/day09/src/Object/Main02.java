package Object;

class Character{
	// �Ϲ������� ��������� ���� �Ѵ�.
	String name;
	int age;
}
public class Main02 {

	public static void main(String[] args) {
		/*
		 * �ϳ��� Ŭ������ ���ǵǸ�, �� Ŭ������ ������ ������� �ϴ�
		 * �������� �������(=��ü)�� ������ �� �ִ�.
		 */
		Character d = new Character();
		d.name = "�Ѹ�";
		d.age = 19;
		
		Character h = new Character();
		h.name = "��";
		h.age = 3;
		System.out.println("�̸� : "+ d.name + ", ���� : " + d.age);
		System.out.println("�̸� : "+ h.name + ", ���� : " + h.age);
		
		
	}

}

package Hiding;
// private�� ����� �׸��� ��ü�� ���Ͽ� ������ �� ����.(���еȴ�)
class Foo{
	public String name = "�ڹ��л�";
	private int weight = 100;
}

public class Main01 {

	public static void main(String[] args) {
		Foo obj = new Foo();
		// public �̹Ƿ� ���� ����
		System.out.println(obj.name);
		
		//private �̹Ƿ� ���� �Ұ���
		//System.out.println(obj.weight);
	}

}

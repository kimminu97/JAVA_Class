package abst;

public class Refrigerator extends Electronics {

	@Override
	public void on() {
		System.out.println("�ڵ带 �Ȱ� ���� ����");
	}

	@Override
	public void off() {
		System.out.println("���� �ݰ� �ڵ带 �̴´�.");
	}

}

package inter;

public interface Pet {
	final static int eyes = 2;
	int nose = 1;	 // ����� ���� �� ������ final static ��������
	abstract void getHand();
	void shakeTail();
	void charms ();			// �߻� �޼ҵ常 �����ϴ� abstract ��������
	void bark();			// ��� �߻�޼ҵ�
}

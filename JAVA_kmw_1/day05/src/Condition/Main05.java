package Condition;

public class Main05 {

	public static void main(String[] args) {
		/*
		 * 1. ���� 3000�� �̻��� ���� ������ �ִٸ� �ýø� Ÿ�� �׷��� �ʴٸ� �ɾ��
		 */
		int money = 2500;
		if( money >= 3000 ) {
			System.out.println("�ýø� Ÿ����");
		} else {
			System.out.println("�ɾ����");
		}
		
		/*
		 * 2. ���� 3000�� �̻� �ְų� ī�尡 �ִٸ� �ýø� Ÿ�� �׷��� �ʴٸ� �ɾ��
		 */
		int money2 = 1000;
		boolean hasCard = true;
		if( money2 >= 3000 || hasCard) {
			System.out.println("�ýø� Ÿ����");
		} else {
			System.out.println("�ɾ����");
		}
		/*
		 * 3.� Ư�� ������ a�� ¦���̸� "¦��", Ȧ���̸� "Ȧ��"��� ���
		 */
		int a = 8;
		if( a%2 == 0 ) {
			System.out.println("¦��");
		} else {
			System.out.println("Ȧ��");
		}
		
	}

}

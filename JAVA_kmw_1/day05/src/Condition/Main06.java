package Condition;

public class Main06 {

	public static void main(String[] args) {

		/*
		 * 1. 1�̸� "�౸", 2�̸�"��", 3��"�߱�", 4��"�豸", �� �ܿ��� "������"��
		 * ��µǵ��� ���α׷��� ����ÿ�.
		 */
		int sportsCode=1;
		switch(sportsCode) {
		case 1: 
			System.out.println("�౸");
			break;
		case 2: 
			System.out.println("��");
			break;
		case 3:
			System.out.println("�߱�");
			break;
		case 4: 
			System.out.println("�豸");
			break;
		default : 
			System.out.println("������");
		}
		
		/*
		 * 2. ���ڰ� 3�̸� "�ȳ�"�� ����, 2�̸� "�ȳ�"�� ����, 1�̸�"�ȳ�"�� ����,
		 * �� �̿ܿ��� "�߰�"�� ��µǵ��� ���α׷��� ����ÿ�.
		 */
		int hello = 2;
		switch(hello) {
		case 3 :
			System.out.println("�ȳ�");
		case 2: 
			System.out.println("�ȳ�");
		case 1:
			System.out.println("�ȳ�");
			break;
		default:
			System.out.println("�߰�");
		}
		
	}

}

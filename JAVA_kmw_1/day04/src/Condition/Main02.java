package Condition;

public class Main02 {

	public static void main(String[] args) {

		int point = 75;
		
		// AND(&&) -> �� ������ ��� ���̾�� ��ü�� ��
		if( point > 70 && point <= 80 ) {
			System.out.println("c���� �Դϴ�.");
		}
		
		// OR(||) -> �� ������ �ϳ��� ���̸� ��ü�� ��
		if( point <= 70 || point > 80) {
			System.out.println("������ ������ϴ�.");
		}
	}

}

package Casting;

public class Main03 {

	public static void main(String[] args) {

		double a = 10.5d;
		float b = 20.5f;
		
		/*
		 * ū ������ ������ ���� ������ ������ ������ �����ϸ�,
		 * ���� ������ ������ ū ������ ������������
		 * �Ϲ��� ����ȯ�� �����Ѵ�.
		 * �׷��Ƿ� �Ʒ��� a+b�� double���� ������ �ǹǷ�,
		 * float���� ���� �����ϴ� ���� �����̴�.
		 */
		//float f = a + b;
		float f = (float)(a+b);
		System.out.println(f);
		
		double d = a+b;
		System.out.println(d);
		
	}

}

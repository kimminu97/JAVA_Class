package Casting;

public class Main02 {

	public static void main(String[] args) {
		// ����� ����ȯ
		long l = 100l;
		int i = (int)l;
		short s = (short)i;
		
		System.out.println("l = " + l);
		System.out.println("i = " + i);
		System.out.println("s = " + s);
		System.out.println("--------------------");
		
		double pi = 3.14d;
		
		// ū ������ ������ ���� ������ ������ �����ϴ� ���� ����
		// int pi2 = pi;
		
		// ����� ����ȯ�� �ʿ��ϴ�.
		int pi2 = (int)pi;
		System.out.println("pi : " + pi);
		System.out.println("pi2 : " + pi2);
		
	}

}

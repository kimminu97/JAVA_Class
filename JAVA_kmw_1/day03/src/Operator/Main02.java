package Operator;

public class Main02 {

	public static void main(String[] args) {

		// ������ ������
		int a = 7;
		int b = 3;
		int result1= a/b;
		
		System.out.println("7/3 = " +result1);
		
		// �Ǽ��� ������
		double c = 7.0d;
		double d = 3.0d;
		double result2 = c/d;
		
		System.out.println("7.0/3.0 = " + result2);
		
		//������ �Ǽ��� ���
		//int result3 = c/b; 	//�Ǽ��� ������ ����� �Ǽ� �̱⿡
								//int�� ������ ������ �� ����.
		
		double result3 = c/b;
		System.out.println("7.0/3 = " + result3);
		
		// 0���� ������
		int num = 100;
		int zero = 0;
		try{
			int result4 = num/zero;
		}catch (ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է��Ͽ� �ּ���");
		}
		// System.out.println("100/0 = " + result4);
	}

}

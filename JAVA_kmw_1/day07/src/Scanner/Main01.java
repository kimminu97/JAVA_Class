package Scanner;

import java.util.Scanner;

/*
 * �ڹ� �⺻ �Է� Ŭ������ ��ĳ��(Scanner)Ŭ����
 * java.util ��Ű�� ���� �����ϴ� Ŭ����
 */
public class Main01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("int type �Է�: ");
		int i = scanner.nextInt();
		System.out.println("int ��� : " + i);
		
		System.out.print("double type �Է� : ");
		double d = scanner.nextDouble();
		System.out.println("double ��� : " + d);
		
		System.out.print("String �Է� : ");
		String s = scanner.next();
		System.out.println("String ��� : " + s);
		
		scanner.close();
	}

}

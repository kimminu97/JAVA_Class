package Scanner;

import java.util.Scanner;

/*
 * scanner.next();		- ���� �� ���� �Է��� ����
 * scanner.nextLine();	- �� �� ��ü�� �Է� ����
 */
public class Main02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���ڿ��Է� : ");
		String str1 = scanner.nextLine();
		System.out.println(str1);
		
		System.out.println("���ڿ��Է� : ");
		String str2 = scanner.next();
		System.out.println(str2);
		
		scanner.close();
		
	}

}

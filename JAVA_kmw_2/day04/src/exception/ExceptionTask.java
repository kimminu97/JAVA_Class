package exception;

import java.util.Scanner;

public class ExceptionTask {

	public static void main(String[] args) {
		// 5���� ������ �Է¹ޱ�
		//- ���� �Է°���
		//- q�� �Է��ϸ� ������
		//- 5���� ������ �迭�� ���
		//- 6��° ������ �Է��ϸ� ��������
		//- if���� �� ���� ����ϱ�
		
		int[] arData = new int[5];
		Scanner sc = new Scanner(System.in);
		int idx = 0;
		String temp = null;
		
		while(true) {
			System.out.println(++idx + " �� ° ����[q - ������] : ");
			temp= sc.next();
			if(temp.toLowerCase().equals("q")) {break;}
			
			try {
				arData[idx -1] = Integer.parseInt(temp); // ���� ��� alt shift z -> try catch block
				System.out.println("�߰� ����!");
			} catch (NumberFormatException e) {
				System.out.println("������ �Է����ּ���.");
				idx--;
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(" �� �̻� ������ �Է��Ͻ� �� �����ϴ�.");
				for(int i=0; i<arData.length; i++ ) {
					System.out.println(arData[i] + " ");
				}
				break;
			} catch(Exception e) {
				System.out.println("�ٽ� �õ��� �ּ���");
				idx--;
			}
		}
	}

}

package Array;

public class Main01 {

	public static void main(String[] args) {
		/*
		 * �迭�� ���� ���
		 */
		// �迭�� ����� ũ�� ���� �� ���� �Ҵ翡 ���� ���� ó��
		int[] dooly;
		dooly = new int[3];
		dooly[0] = 75;
		dooly[1] = 82;
		dooly[2] = 91;
		
		// �迭�� ����� ũ�� ������ �ϰ�ó��
		int[] douneo = new int[3];
		douneo[0] = 84;
		douneo[1] = 64;
		douneo[2] = 50;
		
		// �迭 ������ �ϰ�ó��
		int[] ddochy = new int[] {100,100,90};
		
		/*
		 * �迭�� Ȱ�� ���
		 */
		// ���� ������ �������� �޸��� �����Ͽ� ���� ����
		int sum1 = 0, sum2 = 0, sum3 =0;
		// �� �迭����� ���� ���� �հ� ���ϱ�
		for(int i=0; i<dooly.length; i++) {
			sum1 += dooly[i];
		}
		for(int i=0; i<douneo.length; i++) {
			sum2 += douneo[i];
		}
		for(int i=0; i<ddochy.length; i++) {
			sum3 += ddochy[i];
		}
		// �迭�� ��ü ���̷� ������, ����� ����Ѵ�
		System.out.println("�Ѹ� : "+sum1/ dooly.length);
		System.out.println("����� : "+sum2/ douneo.length);
		System.out.println("��ġ : "+sum3/ ddochy.length);
		
	}

}

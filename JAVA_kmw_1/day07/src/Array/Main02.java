package Array;

public class Main02 {

	public static void main(String[] args) {
		/*
		 * ����ǥ�� ���� 2�� �迭 ����
		 */
		// �б� ������ ���� �迭
		int[][] grade = new int[3][3];
		
		// �Ѹ��� ���� ����
		grade[0][0] = 75;
		grade[0][1] = 82;
		grade[0][2] = 91;
		// ������� ���� ����
		grade[0][0] = 88;
		grade[1][1] = 64;
		grade[1][2] = 50;
		// ��ġ�� ���� ����
		grade[2][0] = 100;
		grade[2][1] = 100;
		grade[2][2] = 90;
		
		/*
		 * 2�� �迭�� Ž���Ͽ� ������ ������� ���ϱ�
		 */
		
		for(int i = 0; i<grade.length; i++) {
			// �ݺ��� �ȿ��� ����� ������ �� ����ø��� ���� �����ȴ�.
			int sum = 0;
			int avg = 0;
			
			for(int j = 0; j<grade[i].length; j++) {
				// i��° ���� �� ���� ������ ���� ���� ó��
				sum += grade[i][j];
			}
			// i��° ��ġ�� ������� ���ϱ� = ���� / �����
			// i��° �л��� ������� grade�迭�� i��°�� ���� ����
			avg = sum / grade[i].length;
			System.out.println("����= "+ sum + ", ���= "+ avg);
					
		}
		
	}

}

package MultiEx;

public class Main02 {

	public static void main(String[] args) {

		/* ���ǹ�
		 * 1. Ư�� ������ a,b,c�� �ִ밪�� ���Ͽ���
		 */
		int a= 10, b = 20, c= 9;
		int max = 0;
		if(a>b && a>c) {
			max= a;
		}else {
			if(b>c) {
				max=b;
			}else {
				max=c;
			}
		}
		System.out.println("max = " + max);
		
		System.out.println("-------------------------");
		/*
		 * �ݺ���
		 * 1. 1~10���� ������ ��
		 */
		int i = 0;
		int sum = 0;
		for(i=0; i<11; i++) {
			sum +=i;
		}
		System.out.println("1~10������ ��? "+sum);
		System.out.println("-------------------------");
		/*
		 * �ݺ���
		 * 2. 1~10������ Ȧ���� ��
		 */
		int sum1 = 0;
		for(i=0; i<11; i++) {
			if(i%2 == 1) {
				sum1 += i;
			}
		}
		System.out.println("1~10������ Ȧ�� ��? "+sum1);
		System.out.println("-------------------------");
		/*
		 * �ݺ���
		 * 3. 1~10������ ¦���� ��
		 */
		int sum2 = 0;
		for(i=0; i<11; i++) {
			if(i%2 == 0) {
				sum2 += i;
			}
		}
		System.out.println("1~10������ ¦�� ��? "+sum2);
		System.out.println("-------------------------");

	}

}

package MultiEx;

public class Main03 {

	public static void main(String[] args) {
		// 1~100���� Ȧ���� ��
		int sum = 0;
		int i = 0;
		
		while(true) {
			i++;
			if(i%2 ==0) {	//¦��
				continue;
			}
			if(i>100) {
				break;
			}
			sum += i;
			System.out.println(i);	// Ȧ��
		}
		System.out.println("���� : " + sum);
		
	}

}

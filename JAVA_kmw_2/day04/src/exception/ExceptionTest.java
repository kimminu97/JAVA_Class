package exception;

public class ExceptionTest {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}catch(Exception e) {		//��� Exception�� �θ� ȣ��(�ڽ��� �θ�Ÿ�� upcationg)
			System.out.println(e);	// ���� e ȣ��� � �������� Ȯ�ΰ���
			System.out.println("0���� ���� �� �����ϴ�.");
		}System.out.println("�ݵ�� ���;� �ϴ� ����");
//		int[] arData = new int[5];
//		
//		try {
//			arData[-1] = 20;
//		}catch(ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
//			System.out.println(e);
//			System.out.println(e.getMessage());
//			System.out.println("�ε����� ������ Ȯ�����ּ���.");
//		}
//		
	}
}

package Value;

public class Main02 {

	public static void main(String[] args) {
		// �Ϲ� ����
		int width = 100;
		// ���
		final double PI = 3.14d;
		
		System.out.println("width = "  + width);
		System.out.println("PI = " + PI);
		
		//���� ����
		width = 200;
		// �� ������ ������ �߻��Ѵ�.
		// PI = 3.141582d;
		
		System.out.println("width = "  + width);
		System.out.println("PI = " + PI);
		
	}

}

package Method;

public class Main03 {

	public static void main(String[] args) {
		// �޼����� ���ϰ��� ������ ����
		int a = plus(5,10);
		System.out.println(a);
		
		System.out.println(minus(10,5));
		
		System.out.println(plus(10,2) + minus(15,9));
		
	}
	public static int plus(int x, int y) {
		int z= x+y;
		return z;
	}
	public static int minus(int x, int y) {
		return x-y;
	}

}

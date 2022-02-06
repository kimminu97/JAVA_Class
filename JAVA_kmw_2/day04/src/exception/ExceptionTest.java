package exception;

public class ExceptionTest {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}catch(Exception e) {		//모든 Exception의 부모 호출(자식은 부모타입 upcationg)
			System.out.println(e);	// 예외 e 호출로 어떤 예외인지 확인가능
			System.out.println("0으로 나눌 수 없습니다.");
		}System.out.println("반드시 나와야 하는 문장");
//		int[] arData = new int[5];
//		
//		try {
//			arData[-1] = 20;
//		}catch(ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
//			System.out.println(e);
//			System.out.println(e.getMessage());
//			System.out.println("인덱스의 범위를 확인해주세요.");
//		}
//		
	}
}

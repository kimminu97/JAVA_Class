package Method;

public class Main01 {

	public static void main(String[] args) {
		// 메서드 반복해서 호출 가능
		F();
		F();
		F();
		F();
	}
	public static void F() {
		int x = 100;
		int y = x+1;
		System.out.println(y);
	}
	

}

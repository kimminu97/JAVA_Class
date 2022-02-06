package Casting;

public class Main02 {

	public static void main(String[] args) {
		// 명시적 형변환
		long l = 100l;
		int i = (int)l;
		short s = (short)i;
		
		System.out.println("l = " + l);
		System.out.println("i = " + i);
		System.out.println("s = " + s);
		System.out.println("--------------------");
		
		double pi = 3.14d;
		
		// 큰 범위의 변수를 작은 범위의 변수에 대입하는 것은 에러
		// int pi2 = pi;
		
		// 명시적 형변환이 필요하다.
		int pi2 = (int)pi;
		System.out.println("pi : " + pi);
		System.out.println("pi2 : " + pi2);
		
	}

}

package MultiEx;

public class Main02 {

	public static void main(String[] args) {

		/* 조건문
		 * 1. 특정 정수값 a,b,c의 최대값을 구하여라
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
		 * 반복문
		 * 1. 1~10까지 숫자의 합
		 */
		int i = 0;
		int sum = 0;
		for(i=0; i<11; i++) {
			sum +=i;
		}
		System.out.println("1~10까지의 합? "+sum);
		System.out.println("-------------------------");
		/*
		 * 반복문
		 * 2. 1~10까지의 홀수의 합
		 */
		int sum1 = 0;
		for(i=0; i<11; i++) {
			if(i%2 == 1) {
				sum1 += i;
			}
		}
		System.out.println("1~10까지의 홀수 합? "+sum1);
		System.out.println("-------------------------");
		/*
		 * 반복문
		 * 3. 1~10까지의 짝수의 합
		 */
		int sum2 = 0;
		for(i=0; i<11; i++) {
			if(i%2 == 0) {
				sum2 += i;
			}
		}
		System.out.println("1~10까지의 짝수 합? "+sum2);
		System.out.println("-------------------------");

	}

}

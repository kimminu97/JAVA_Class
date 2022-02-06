package Condition;

public class Main05 {

	public static void main(String[] args) {
		/*
		 * 1. 만약 3000원 이상의 돈을 가지고 있다면 택시를 타고 그렇지 않다면 걸어가라
		 */
		int money = 2500;
		if( money >= 3000 ) {
			System.out.println("택시를 타세요");
		} else {
			System.out.println("걸어가세요");
		}
		
		/*
		 * 2. 돈이 3000원 이상 있거나 카드가 있다면 택시를 타고 그렇지 않다면 걸어가라
		 */
		int money2 = 1000;
		boolean hasCard = true;
		if( money2 >= 3000 || hasCard) {
			System.out.println("택시를 타세요");
		} else {
			System.out.println("걸어가세요");
		}
		/*
		 * 3.어떤 특정 정수값 a가 짝수이면 "짝수", 홀수이면 "홀수"라고 출력
		 */
		int a = 8;
		if( a%2 == 0 ) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
	}

}

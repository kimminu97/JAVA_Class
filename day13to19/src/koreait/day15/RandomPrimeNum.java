package koreait.day15;

import java.util.Arrays;
import java.util.Random;

public class RandomPrimeNum {

	public static void main(String[] args) {
		// 주어진 난수 범위에서 소수가 7개 만듭니다. 소수 7개는 배열에 저장하여 출력합니다.
		// ->주어진 정수값이 소수인지 판별하는 메소드를 만들어 봅시다.(메소드 이름 isPrime, 리턴형식), 인자는 정수1개
		// 범위 100~999
		int[] prime = new int[7];
		Random r = new Random();
		long start = System.currentTimeMillis();	//현재시간을 ms(0.001초)단위로 가져옵니다.
		System.out.println("어떤 정수가 소수인지 확인합니다.");
		int i = 0,max=999999999,min=333333333;
		do {
			int num = r.nextInt(max-min+1)+min;
			if (isPrime(num)) {
				prime[i] = num;
				i++;
			}
		}while(i <7);
		long end = System.currentTimeMillis();
		System.out.println("실행시간 = " + (end-start)+"ms 소요되었습니다.");
		System.out.println(" 소수 7개는 " + Arrays.toString(prime) + "입니다.");
	}

	public static boolean isPrime(int num) {
		boolean isPrime = true;
		for (int i = 2; i < Math.sqrt(num); i++) {
			if (num % i == 0) { // 나누어 떨어지면
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

}

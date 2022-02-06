package quiz;

import java.util.Scanner;

public class quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 -> ");
		int n = sc.nextInt();
		int answer = 0;
		// 배열 생성
		int[] number = new int[n + 1];
		// number배열에 2~n까지 수 넣기
		for (int i = 2; i <= n; i++) {
			number[i] = i;
		}
		// 이미 0이면 패스, 2~n까지 배수는 모두 0처리
		for (int i = 2; i <= n; i++) {
			if (number[i] == 0)
				continue;
			for (int j = 2 * i; j <= n; j += i) {
				number[j] = 0;
			}
		}
		 //0이 아닌 수 만큼 ++
		for (int i = 0; i < number.length; i++) {
			if (number[i] != 0)
				answer++;
		}
		System.out.println("입력한 수 " + n + "까지 소수 개수는 " + answer);

	}
}

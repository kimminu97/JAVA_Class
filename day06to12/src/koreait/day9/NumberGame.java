package koreait.day9;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGame {
	//작성자 : 김민우 (2022.01.11)
	public static void main(String[] args) {
		Random r1 = new Random();
		Scanner sc = new Scanner(System.in);
		int ans, cnt = 10;
		int[] temp = new int[10];
//		boolean end = true;
		System.out.println("숫자 맞추기 게임을 시작합니다!");
		System.out.println("컴퓨터는 숫자를 결정하였습니다. 10번안에  1~100사이 숫자를 맞춰 보세요!");
		ans = r1.nextInt(100) + 1;
//		System.out.println(ans);
		for (int i = 0; i < 10; i++) {
			System.out.print("생각한 숫자 입력 - >");
			temp[i] = sc.nextInt();
			if (temp[i] < ans) {
				System.out.println("아닙니다. 더 큰값입니다.");
				cnt--;
				System.out.println(cnt+"번 남으셨습니다.");
			} else if (temp[i] > ans) {
				System.out.println("아닙니다. 더 작은 값입니다.");
				cnt--;
				System.out.println(cnt+"번 남으셨습니다.");
			} else if (temp[i] == ans) {
				System.out.println("딩동댕! 맞추셨습니다. 지금까지 시도한 값 " + Arrays.toString(temp));
				System.out.println(10 - cnt + "번만에 맞추셨습니다.");
				break;
			}  if(cnt == 0) {
				System.out.println("기회를 모두 사용하셨습니다!");
				System.out.println("정답맞추기에 실패하셨습니다. 정답은 : " + ans+"이었습니다.");
				break;
			}
		}

	}

}

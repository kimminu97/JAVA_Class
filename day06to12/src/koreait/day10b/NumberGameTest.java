package koreait.day10b;

import java.util.Arrays;
import java.util.Scanner;

//NumberGame 실행 -> 게임 기록 저장
public class NumberGameTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		NumberGame[] result = new NumberGame[5];	//게임기록 저장
		
		int k=0;
		System.out.println("숫자 맞추기 게임입니다.");
		System.out.println("게임을 시작하려면 너의 이름을 입력하세요 : ");
		String gamer = sc.nextLine();
		NumberGame ng = new NumberGame(gamer);
		
		do{
			int[] numbers = new int[10];
			System.out.println("이제 시작합니다. 컴퓨터는 숫자를 결정했습니다.");
			int random = ng.makeNumber(1, 100);
			
			System.out.println("숫자를 맞춰보세요(1~100)");
			int i=0;
			do {
				System.out.print("생각한 숫자 입력 (기회 : " + (10 - i) + ") -> ");
				numbers[i] = sc.nextInt();
				if (random > numbers[i]) {
					i++;
					System.out.println("아닙니다. 더 큰 값입니다.");
				} else if (random < numbers[i]) {
					i++;
					System.out.println("아닙니다. 더 작은 값입니다.");
				}

				if (i >= 10) {
					break;
				}
			} while (random != numbers[i]);
			if(random == numbers[i]) {
			ng.setSuccess(true);
			System.out.println("정답입니다! 지금까지 시도한 횟수는 ");
			ng.setCount(i);
			System.out.println(".."+ng.getCount()+"만에 정답입니다.");
			result[k]=ng;
			}else {
				System.out.println("실패! 모든 기회를 다 사용했습니다.");
				System.out.println("정답은"+random+"입니다.");
			}
			
			k++;	//게임 기록 저장을 위한 인덱스 증가
			System.out.print("게임을 계속 하시겠습니까? 계속하려면 0입력하세요 ->");
		}while(sc.nextInt()==0);
		//게임기록 result 배열 값 출력
		ng.print();
		System.out.println("[[Game End]]");
	}
}

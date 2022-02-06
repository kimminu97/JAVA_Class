package koreait.day3;

import java.util.Scanner;

public class ElseIfTest {

	public static void main(String[] args) {
		// if문 형식2 : if(조건관계식1) {...A...} //조건관계식 1이 참일때
		// else if(조건관계식2)
		// {...B...} //조건관계식 1이 거짓일때, 조건관계식2는 참일때
		// else
		// {...C...} //조건관계식1,2가 모두 거짓일때

		// 응용 : point가 150이상이면 사과세트를, 100~149이면 귤세트,
		// 50~99이면 과자세트를, 0~49이면 5000원 상품권
		int point;
		Scanner sc = new Scanner(System.in);

		System.out.print("포인트 입력하세요 -> ");
		point = sc.nextInt();

		System.out.print("설날 증정선물 : ");
		if (point >= 150) {
			System.out.println("사과세트");
		} else if (point >= 100) {
			System.out.println("귤 세트");
		} else if (point >= 50) {
			System.out.println("과자 세트");
		} else {
			System.out.println("5000원 삼품권");
		}
		sc.close();

	}

}

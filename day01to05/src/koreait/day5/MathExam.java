package koreait.day5;

import java.util.Scanner;

public class MathExam {

	public static void main(String[] args) {
		// 작성자 : 김민우 (2022.01.04)
		int menu, data1, data2, result;
		Scanner sc = new Scanner(System.in);

		do {
		System.out.println("[[수학 공부 도우미]]");
		System.out.println("1.덧셈  2.뺄셈  3.곱셈  4.종료");
		System.out.print("연산을 선택하세요 -> ");
		menu = sc.nextInt();
		

		switch (menu) {
		case 1:
			System.out.print("\n✏️  값 1 을 입력하세요. -> ");
			data1 = sc.nextInt();
			System.out.print("\n✏️  값 2 을 입력하세요. -> ");
			data2 = sc.nextInt();
			result = data1 + data2;
			System.out.println("정답 : " + data1 + "+" + data2 + " = " + result);
			break;
		case 2:
			System.out.print("\n✏️  값 1 을 입력하세요. -> ");
			data1 = sc.nextInt();
			System.out.print("\n✏️  값 2 을 입력하세요. -> ");
			data2 = sc.nextInt();
			result = data1 - data2;
			System.out.println("정답 : " + data1 + "-" + data2 + " = " + result);
			break;
		case 3:
			System.out.print("\n✏️  값 1 을 입력하세요. -> ");
			data1 = sc.nextInt();
			System.out.print("\n✏️  값 2 을 입력하세요. -> ");
			data2 = sc.nextInt();
			result = data1 * data2;
			System.out.println("정답 : " + data1 + "*" + data2 + " = " + result);
			break;
		

		default:
			System.out.println("적절한 메뉴를 골라주세요");
		}
		}while(menu != 4);
		System.out.println("프로그램을 종료 합니다.Bye,,👍👍");

	}

}

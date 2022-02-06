package koreait.day12;

import java.util.ArrayList;
import java.util.Scanner;

public class MyRedPenV3 {

	public static void main(String[] args) {

		ArrayList<MathProblem> addList = new ArrayList<MathProblem>();
		Scanner sc = new Scanner(System.in);
		int ans;
		int cnt = 0; // 맞은 개수 카운트
		do {
			System.out.println("-----------------------------------");
			System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
			System.out.println("-----------------------------------");
			System.out.println("시작합니다.");
			for (int i = 0; i < 5; i++) {
				MathProblem p1 = new MathProblem('+');
				addList.add(p1);
				p1.makeProb(); // 문제 만드는 메소드 : 연산종류에 따라 숫자가 다른 범위 난수로 만들어집니다.
				System.out.print("문제 " + (i + 1) + " " + p1 + " = 답 입력-> ");
				ans = sc.nextInt();
				if (ans == p1.showAnswer()) {
					cnt++;
					p1.setCorrect(true);
				}
			} // for end
			System.out.println("-----------------------------------");
			System.out.println("채점 합니다. 맞은 개수 " + cnt + "(" + cnt * 10 + "점)");
			System.out.println("틀린 문제 다시보기");
			for (MathProblem prob : addList) {
				if (!prob.isCorrect())
					System.out.println(prob + " 정답 : " + prob.showAnswer());
			}
			System.out.println("계속하시려면 : 0 , 종료하려면 : 아무 키를 누르세요");
		} while (sc.nextInt() == 0);
		System.out.println("프로그램 종료");
		sc.close();
	}

}

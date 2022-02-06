package koreait.day10;

import java.util.Random;
import java.util.Scanner;

public class MyRedPen1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int[] x1 = new int[10];
		int[] x2 = new int[10];
		int[] no = new int[10];
		int fNum, lNum, temp;
		int cnt = 0;
		System.out.println("-----------------------------");
		System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
		System.out.println("-----------------------------");
		System.out.println("시작합니다.");
		for (int i = 0; i < 10; i++) {
			fNum = r.nextInt(89) + 11; // (max-min+1)+min
			lNum = r.nextInt(89) + 11;
			System.out.print("문제 " + (i + 1) + " " + fNum + " + " + lNum + " = 답 입력-> ");
			temp = sc.nextInt();
			if (temp != fNum + lNum) { // 틀린문제를 cnt++

				x1[cnt] = fNum;
				x2[cnt] = lNum;
				no[cnt] = i + 1;
				cnt++;
			}	//틀린갯수는 cnt, 맞은 개수 10-cnt -> 문제 총 10개

		}
		System.out.println("-----------------------------");
		System.out.println("채점 합니다. 맞은 개수 " +(10-cnt) + "(" + (10-cnt) * 10 + "점)");
		//틀린문제에 대해 번호, 문제, 정답 보여주기 입니다.
		System.out.println("틀린 문제 다시보기");
		for (int i = 0; i < cnt; i++) {
			System.out.println("문제 " +no[i] + " " + x1[i] + " + " + x2[i] + " =" +(x1[i]+x2[i]));
			
		}
		//발전방향 : x1,x2,no 배열 -> 2차원 배열(단순히 값만 저장), 클래스(값저장 + 메소드)의 배열

	}

}

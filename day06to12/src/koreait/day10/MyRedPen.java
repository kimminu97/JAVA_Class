package koreait.day10;

import java.util.Random;
import java.util.Scanner;

public class MyRedPen {

	public static void main(String[] args) {
		// 김민우 (22.01.12)
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int temp,fNum, lNum;
		int k = 0;
		int cnt = 0;
		RedPen[] err = new RedPen[10];
		RedPen rp = new RedPen();

		System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
		System.out.println("-----------------------------------");
		do {
			System.out.println("시작합니다.");
			int i = 0;
			
			do {
				fNum = r.nextInt(89) + 11;	//(max-min+1)+min
				lNum = r.nextInt(89) + 11;
				System.out.print("문제 " + (i+1) + " " + fNum + " + " + lNum + " = 답 입력-> ");
				temp = sc.nextInt();
				if(temp==fNum+lNum) {
					cnt++;
				}else {
					rp.setNum1(fNum);
					rp.setNum2(lNum);
					err[k] = rp;
					k++;
				}
				i++;
			}while(i<10);
			System.out.println("채점 합니다. 맞은 개수 "+cnt+"("+cnt*10+"점)");
			System.out.println("틀린 문제 다시보기");
			for (int j = 0; j < k; j++) {
				err[j].print();
			}
			System.out.println("계속 하려면 0번을 누르세요");
		} while (sc.nextInt()==0);
		System.out.println("덧셈 풀기 프로그램 종료");
	}

}

package koreait.day6;

import java.util.Scanner;

public class StudentScoreTest {

	public static void main(String[] args) {
		//작성자 : 김민우 (22.01.05)
		Scanner sc = new Scanner(System.in);
		StudentScore StuScore= new StudentScore();
		System.out.println("[[학생 점수 계산]]");
		System.out.print("학생이름을 입력하세요 -> ");
		StuScore.name = sc.nextLine();
		System.out.print("학번을 입력하세요 -> ");
		StuScore.num = sc.nextInt();
		System.out.print("국어점수를 입력하세요 : ");
		StuScore.korean = sc.nextInt();
		System.out.print("영어점수를 입력하세요 : ");
		StuScore.english = sc.nextInt();
		System.out.print("과학점수를 입력하세요 : ");
		StuScore.science = sc.nextInt();
		StuScore.printScore();
		System.out.println("점수의 총점 : "+StuScore.sum());
		System.out.println("점수의 평균 : "+StuScore.avg());
	}

}

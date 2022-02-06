package koreait.day7;

import java.util.Scanner;

public class UpperLowerString {

	public static void main(String[] args) {
		String message; //입력
		String upper;	//결과
		String lower;
		int k=0, j=0;
		char[] uppers = new char[20];
		char[] lowers = new char[20];
		Scanner sc = new Scanner(System.in);
		
		System.out.print("영문자를 입력하세요 -> ");
		message = sc.nextLine();
		
		for (int i = 0; i < message.length(); i++) {
			char temp = message.charAt(i);
			if(temp>='A' && temp <= 'Z') {
				uppers[k] = temp;
				k++;
			}else if(temp >='a' && temp <= 'z') {
				lowers[j]=temp;
				j++;		//다음 소문자 저장될 인덱스를 증가
			}
		}
		
		upper = String.valueOf(uppers);
		lower = String.valueOf(lowers);
		
		System.out.println("[[결과]]");
		System.out.println("대문자 : " + upper);
		System.out.println("소문자 : " + lower);
		
	}

}

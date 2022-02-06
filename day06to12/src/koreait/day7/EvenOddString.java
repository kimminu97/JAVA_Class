package koreait.day7;

import java.util.Scanner;

public class EvenOddString {

	public static void main(String[] args) {
//		김민우 (22.01.06)
		String src_string, even_string="", odd_string = "";
		char[] temp;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("------------------------------");
		System.out.print("문자열(공백과 기호,숫자 포함)을 입력하세요 -> ");
		src_string = sc.nextLine();
		
		temp = src_string.toCharArray();
		for (int i = 0; i < temp.length; i++) {
			if(i%2 ==0) {
				even_string += String.valueOf(temp[i]);
			}else {
				odd_string += String.valueOf(temp[i]);
			}
		}
		System.out.println();
		System.out.println("[[결과]]");
		System.out.println("짝수 문자열 : "+even_string);
		System.out.println("홀수 문자열 : "+odd_string);
		
	}

}

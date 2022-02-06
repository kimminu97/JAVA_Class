package sort;

import java.util.Arrays;

public class StringAscendingSortTest {	// 문자열 오름차순 정렬
	public static void main(String[] args) {
		String[] names = {"iu","boa","nayeon","zun","twice","nana"};
		
		System.out.println("배열초기상태 : "+Arrays.toString(names));
		for (int i = 0; i < names.length; i++) {
			for (int j = i+1; j < names.length; j++) {
				if(names[i].compareTo(names[j]) > 0) {
					String temp = names[j];
					names[j] = names[i];
					names[i] = temp;
				}
			}//for
			System.out.println("i= " + i+", 중간결과  : "+Arrays.toString(names));
		}//for
	}
}

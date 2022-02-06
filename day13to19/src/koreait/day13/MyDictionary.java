package kroeait.day13;

import java.util.Scanner;
import java.util.TreeMap;

public class MyDictionary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String k, v;
		boolean isOk = true;
		TreeMap<String, String> map = new TreeMap<String, String>();

		while (isOk) {
			System.out.println("선택기능 1.단어저장  2.단어검색 3.단어장보기 4.프로그램 끝내기");
			System.out.print("선택 ✏️-> ");
			int menu = sc.nextInt();
			sc.nextLine();
			switch (menu) {
			case 1:
				System.out.printf("English -> ");
				k = sc.nextLine();
				System.out.printf("Korean -> ");
				v = sc.nextLine();
				if(map.containsKey(k)) {
					//존재하는 key값은 value를 ","로 구분하여 연결하여 저장
					String temp = map.get(k);
					temp +="/"+v;
					map.put(k, temp);
				}
				else map.put(k, v);
				continue;
			case 2:
				System.out.printf("검색단어 English -> ");
				k = sc.nextLine();
				System.out.println("단어장이 검색되었습니다. =>" + map.get(k));
				continue;
			case 3:
				System.out.println(map);
				continue;
			case 4:
				System.out.println("프로그램 종료");
				isOk = false;
			default:
				System.out.println("잘못된 입력입니다. 다시 입력하세요!");
				continue;

			}
		}
		sc.close();
	}

}

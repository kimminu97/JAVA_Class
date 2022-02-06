package koreait.day14;

import java.util.ArrayList;
import java.util.Scanner;

public class AnimalCommunity2 {
	// 작성자 : 김민우
	// 반려동물 커뮤니티 - 용품 공동구매, 반려<동물>분양,...,<회원>
	public static void main(String[] args) {
		

		ArrayList<Animal> animals = new ArrayList<>();
		Puppy dog = new Puppy("브라우니", "Brwon");
		Puppy dog2 = new Puppy("댕댕","White");
		Cat cat = new Cat();
		Rabbit rab = new Rabbit("바니바니", "White");
		cat.setName("냥이");
		cat.setColor("Black");

		animals.add(dog);
		animals.add(dog2);
		animals.add(cat);
		animals.add(rab);
		// 회원은 반려동물 분양
		System.out.println("[[환영합니다. 반려동물을 보여드리겠습니다.]]\n");
		for (int i = 0; i < animals.size(); i++) {
			System.out.println((i + 1) + "번. 동물 : " + animals.get(i));
		}

		System.out.println("[[우리 동물들의 소리도 들려드리겠습니다.]]");
		for (Animal ani : animals) {
			ani.sound();
		}
		// 분양을 원하면 회원생성을 합니다.
		Member sana = new Member("사나", 15);
//		System.out.println("분양가능한지 확인 : " + sana.isAdopt(animals[0]));
//		System.out.println("분양가능한지 확인 : " + sana.isAdopt(animals[1]));
//		System.out.println("분양가능한지 확인 : " + sana.isAdopt(animals[2]));
//		System.out.println("분양가능한지 확인 : " + sana.isAdopt(animals[3]));
		Scanner sc = new Scanner(System.in);
		System.out.print("분양을 원하는 아이의 숫자를 선택해 주세요. -> ");
		int sel = sc.nextInt();
		System.out.println("선택하신" + animals.get(sel-1) + "는");
		
			if (sana.isAdopt(animals.get(sel-1))) {
				System.out.println("😄분양 가능합니다.");
			} else {
				System.out.println("😥아쉽지만 분양 하실수 없는 나이 입니다.");
			}

		
	}
}

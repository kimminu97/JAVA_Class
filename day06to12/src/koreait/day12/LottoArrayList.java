package koreait.day12;

import java.util.ArrayList;
import java.util.Random;

public class LottoArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> lotto = new ArrayList<Integer>();	//선택된 숫자 저장
		ArrayList<Integer> balls = new ArrayList<Integer>();	//공 45개 저장
		Random r = new Random();
		int k;
		//1. balls리스트에 1~45 숫자를 추가한다.
		for (int i = 1; i < 46; i++) {
			balls.add(i);
		}
		//확인 : 출력해보기
//		System.out.println(balls);
		//2. balls 리스트에서 뽑을 인덱스를 난수 0~44 -> 0~43 -> 0~42...->0~39범위에서 반복
		for (int i = 0; i <6; i++) {
			k = r.nextInt(balls.size());
			System.out.println("index= "+k+", number = "+balls.get(k));
		
		//2-1. 난수인덱스에 해당하는 요소를 lotto 리스트에 추가합니다.
			lotto.add(balls.get(k));
		//2-2. 뽑힌 난수 인덱스의 요소는 삭제
			balls.remove(k);
		}
		//3.최종 lotto 변수가 참조하는 값을 출력
		lotto.sort(null);
		System.out.println("최종 선택 숫자 : " + lotto);
	}
	//ArrayList의 중요 메소드 : size(), add(), get(), remove()
}

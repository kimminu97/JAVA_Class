package kroeait.day8;

import java.util.Arrays;
import java.util.Random;

public class LottoTest {
	public static void main(String[] args) {
		// 난수 1~45 범위의 값을 중복된 값이 없도록 6개 생성하고 배열에 저장합니다.

		int[] lotto = new int[6];
		Random r1 = new Random();
		boolean isOk = true;

		for (int i = 0; i < 6; i++) {
			int temp=0;
			isOk = true;	//새로운 i인덱스로 검사할 때 초기화
			while (isOk) {
				temp = r1.nextInt(45) + 1;	//1~46
				System.out.println("만든값 : " + temp);
				int j;
				for (j = 0;j<i; j++) {
					// 현재 배열 인덱스 i의 앞에 있는 배열값들과 temp값을 비교
					if (temp == lotto[j]) {
						System.out.println("*");
						break;	//for-j에서 탈출
					}
				} // for -j end
				if(j==i) isOk = false;	//비교하는 동안 같은 값이 없을때
				
			} // while end
			lotto[i]=temp;
		} // for -i end
		System.out.println(Arrays.toString(lotto));
	}
}

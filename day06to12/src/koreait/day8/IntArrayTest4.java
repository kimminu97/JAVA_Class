package kroeait.day8;

import java.util.Arrays;
import java.util.Random;

public class IntArrayTest4 {
	//IntArrayTest 첫번째 예제는 day7프로젝트에 있습니다.
	//int값 저장하는 배열을 활용하는 연습입니다.-(3)
	public static void main(String[] args) {
		//배열의 크기는 20 -> 메모리 할당
		int[] scores = new int[20];
		
		// 배열의 값은 난수 1~99 범위값 저장
		Random r1 = new Random(System.currentTimeMillis());//난수 발생에 seed값 설정
		for(int i=0; i<scores.length;i++) {
			scores[i]=r1.nextInt(99)+1;
		}
		System.out.println(Arrays.toString(scores)); 	//배열값 출력
		//값의 분포 개수를 90~100, 80~89, 70~79, 60~69, 50~59, 40~49, 40미만 범위로 출력합니다.
		// -> 분포가 더 다양하다면 변수가 더 많이 필요합니다.
		int[] cnts = new int[7];
		//위 분포 순서대로 인덱스를 사용합니다.
		//20개 배열의 값 중에서 70이상의 값을 검색 - 인덱스와 값을 출력
		for (int i = 0; i < scores.length; i++) {
			//scores[0],scores[1],scores[2],scores[3]...scores[19]
			if(scores[i]>=90) {			//90~100
				cnts[0]++;
			}else if(scores[i]>=80) {	//80~89
				cnts[1]++;
			}else if(scores[i]>=70) {	//70~79
				cnts[2]++;
			}else if(scores[i]>=60) {	//60~69
				cnts[3]++;
			}else if(scores[i]>=50) {	//50~59
				cnts[4]++;
			}else if(scores[i]>=40) {	//40~49
				cnts[5]++;
			}else {						//40미만
				cnts[6]++;
			}
		}
		
		//결과 출력
		System.out.println("점수 분포 요약---------");
		System.out.println("90~100 : " + cnts[0]);
		System.out.println("80~89 : " + cnts[1]);
		System.out.println("70~79 : " + cnts[2]);
		System.out.println("60~69 : " + cnts[3]);
		System.out.println("50~59 : " + cnts[4]);
		System.out.println("40~49 : " + cnts[5]);
		System.out.println("40 미만 : " + cnts[6]);
	
	}
}

package koreait.day9;

import java.util.Arrays;
import java.util.Random;

public class ObjectArgMethod {
	// int배열의 정수값 중에서 최대값(최소값) 구하는 메소드를 만듭니다.->참조값을 인자로 전달
	public static void main(String[] args) {

		int[] arr = new int[10];
		Random r = new Random(); // 난수 범위 1~100

		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(100) + 1;
		}

		System.out.println(Arrays.toString(arr));	//정수를 인자로 합니다.

		int max; // max 초기값 : 1)배열 인텍스 0번값 2) 비교될 다른값들보다 작은값
					// 비교 범위 : 1)배열인덱스 1~마지막 인덱스 2) 0~마지막 인덱스
		max = arr[0]; // 1)로 구현
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) { // max보다 큰 값인 경우 max를 그 값으로 변경합니다.
				max = arr[i];
			}
		}
		System.out.println("최대값 : " + max);

		int min; // min 초기값 : 1)배열 인텍스 0번값 2) 비교될 다른값들보다 큰 값
					// 비교 범위 : 1)배열인덱스 1~마지막 인덱스 2) 0~마지막 인덱스
		min = 999; // 2)로 구현
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) { // min보다 작은 값인 경우 min을 그 값으로 변경합니다.
				min = arr[i];
			}
		}
		System.out.println("최소값 : " + min);

		// 메소드 실행해보기
//		arrayMaxValue(arr);
		System.out.println("메소드로 구한 최대값 : " + arrayMaxValue(arr));
		System.out.println("메소드로 구한 최소값 : " + arrayMinValue(arr));
		System.out.println("메소드로 구한 합계 : " + arraySumValue(arr));
		System.out.println("메소드로 구한 평균 : " + arrayAvgValue(arr));
		
		double[] darr = new double[10];
		for (int i = 0; i < darr.length; i++) {
//			darr[i] = r.nextDouble();	//0~1 사이의 실수
//			darr[i] = r.nextDouble()*10;	//0~10 사이의 실수
			darr[i] = r.nextDouble()*9+1;	//0~9 사이의 실수 +1 -> 1~10 사이의 실수
			
		}
		System.out.println(Arrays.toString(darr));	//실수를 인자로 합니다.
		
		// 메소드 오버로딩(overloading) - 메소드 이름은  같으나 인자형식이 다릅니다.
		//						   -반환값은 같은 형식
		//				대표적인 메소드 - Arrays.toString()메소드 입니다.
	}
	// 메소드 작성으로 구현해봅니다. : 최대값/최소값을 구하기 위해 다룰 데이터는 배열에 있습니다. ->배열변수는 참조 변수
	// ->메소드 인자가 참조타입이 됩니다. -> 데이터 자체를 전달하지 않고 데이터 저장 주소를 전달

	static int arrayMaxValue(int[] array) { // 인자의 변수 선언은 전달될 데이터 타입을 지정
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max; // 최대값
	}

	static int arrayMinValue(int[] array) {
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}

		}
		return min; // 최소값

	}
	//합계를 구하는 메소드
	static int arraySumValue(int[] array) {
		int sum=0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];	//배열 인덱스 0~마지막까지 순차적으로 sum 변수에 (누적)더합니다.
		}
		return sum;
	}
	//평균을 구하는 메소드
	static double arrayAvgValue(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];	//배열 인덱스 0~마지막까지 순차적으로 sum 변수에 (누적)더합니다.
		}
//		sum = arraySumValue(array); 위의 메소드 호출하는 방법도 있습니다.
		return (double)sum/array.length;
	}
	
	
	
	
}
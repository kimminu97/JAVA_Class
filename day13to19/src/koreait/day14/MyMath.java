package koreait.day14;

public class MyMath {
	// int배열의 정수값 중에서 최대값(최소값) 구하는 메소드를 만듭니다.->참조값을 인자로 전달
	//	->메소드 오버로딩으로 다른 형식의 데이터를 처리하도록 메소드를 정의해봅니다.
	

	static int arrayMaxValue(int[] array) { // 인자의 변수 선언은 전달될 데이터 타입을 지정
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max; // 최대값
	}
	static double arrayMaxValue(double[] array) {
		double max;
		max=array[0];
		for (int i = 0; i < array.length; i++) {
			if(max<array[i]) max = array[i];
		}
		return max;
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
	static double arrayAvgValue(double[] array) {
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum +=array[i];
		}
		return sum/array.length;
	}
	
	
	
	
}
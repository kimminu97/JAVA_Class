package koreait.day2;

public class ShapeTest {

	public static void main(String[] args) {
		// 작성자: 김민우
		//사각형
		int width = 23;
		int height = 19;
		int area = width*height;
		System.out.println("[[사각형 넓이 구하기]]");
		System.out.println("가로 : " + width +"cm");
		System.out.println("세로 : " + height+"cm");
		System.out.println("넓이를 구했습니다 -> " + width*height +"㎠ ");
		
		
		//원 :소수점 이하 3자리로 출력
		double radius =23;
		double c_area = 3.14*radius*radius;
		double round = 2*3.14*radius;
		System.out.println("[[원의 넓이와 둘레 구하기]]");
		System.out.println("반지름 : " + radius+"cm");
		System.out.printf("둘레를 구했습니다. -> %.3fcm\n" , round);
		System.out.printf("넓이를 구했습니다. -> %.3f㎠" , c_area);
		
		
	}

}

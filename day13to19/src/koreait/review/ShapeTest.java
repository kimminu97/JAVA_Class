package review;

public class ShapeTest {

	public static void main(String[] args) {

		Triangle tri1 = new Triangle("삼각형1", 23, 45);
		
		tri1.print();	//자식이 만든 메소드
		System.out.println("넓이 : "+tri1.getArea()); 	//2)부모가 물려준 메소드 오버라이드함
		System.out.println("넓이 : "+tri1.getAreaDouble()); 	//3)자식이 물려준 메소드
		System.out.println("특별한 변수 테스트(ShapreTest에서 출력");
		System.out.println("기타정보 : " + tri1.etc);
		System.out.println("count : " + tri1.count);
		
		
		Shape sha = new Shape("원", 10, 10);
		System.out.println("sha : "+sha);
	}

}
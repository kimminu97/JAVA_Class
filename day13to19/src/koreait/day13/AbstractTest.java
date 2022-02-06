package kroeait.day13;

public class AbstractTest {
	public static void main(String[] args) {
		
//		AShape ash = new AShape();	오류 : 추상클래스는 new로 객체생성 못합니다.
		
		AShape tri = new ATriangle();
		tri.setShapeName("작은 삼각형");
		
		ATriangle atri = (ATriangle) tri;
		atri.setWidth(20);
		atri.setHeight(40);
		
		System.out.println("넓이 : "+ tri.getArea());	//부모클래스의 추성메소드 -> 구체화된 메소드가 실행
		System.out.println("넓이 2 : " + atri.getArea());
		
		//새로만든 triangle() 메소드는 어떤 참조변수로 실행될까요?
		System.out.println("테스트 메소드 실행 "+atri.triangle());
		
		AShape square = new ASquare();
		square.setShapeName("중간정사각형");
		ASquare asq = (ASquare) square;
		
		System.out.println("테스트 메소드 실행 "+asq.square());
		
		asq.setWidth(30);
		System.out.println("넓이 : " + square.getArea());
		System.out.println("넓이2 : " + asq.getArea());

		
	}
}

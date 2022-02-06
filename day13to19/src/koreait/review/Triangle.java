package review;

public class Triangle extends Shape {

	public Triangle(String shapeName, int width, int height) {
		super(shapeName, width, height);
	}
	public void print() {	//getShapeName() : shape 클래스의 필드가 private 접근자입니다.
		System.out.println("도형이름 : "+ getShapeName()+
		",너비 : " + getWidth()+",높이 : "+getHeight());
		System.out.println("특별한 변수 테스트(Triangle에서 출력");
		System.out.println("기타정보 : "+ etc);		//private이 아닌 부모필드는 직접 접근합니다.(super.etc)
		System.out.println("count : " + count); 
	}	
	public int getArea() {	// 오버라이드 : 부모클래스가 정의한 형식의 메소드를 재정의합니다.
		return(getHeight()*getWidth())/2;
	}
	public double getAreaDouble() {	//같은 이름의 서로 다른(형식) 메소드가 있으면 오류
		return (double)(getHeight()*getWidth())/2;
	}
}

package koreait.day11;

public class ClassCC extends ClassC {
	int cc;		//자식클래스만의 필드
//	public ClassCC(int c) {
//		super(c);	//부모클래스의 생성자 호출 : 오류(부모클래스 커스텀생성자 없음)
//	}
	public ClassCC(int cc) {
		this.cc = cc;
	}
}
//super() : 부모클래스 생성자 Class() 호출
//super(c) :      "    Class(c) 호출

package koreait.day16_interface;
//이 클래스는 2개의 인터페이스를 사용합니다. - 결론: 상속은 다중상속잉 불가합니다. 인터페이스는 다중 구현이 가능합니다.
public class MyClassAB implements InterfaceA,InterfaceB{

	//InterfaceB의 추상메소드
	@Override
	public void methodBA() {
		// TODO Auto-generated method stub
		
	}

	//InterfaceA의 추상메소드
	@Override
	public void methodA() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int methodB(int num) {
		// TODO Auto-generated method stub
		return 0;
	}

}

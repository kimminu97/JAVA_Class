package koreait.day17;

public interface RemoteControl {

	//public static final 생력
	int MAX_VOLUME=20;
	int MIN_VOLUME=0;
	//public abstract 생략
	void setVolume(int volume);
	void turnOnOff();			//toggle 기능으로 구현 가능합니다.
	
	//default : 인스턴스 메소드
//	    (인터페이스를 구현한 클래스가 많은 상태일때 새로운 재정의 할 수있는 메소드를 추가하고 싶을때 사용)
//		-> 구현 클래스에서 제정의 할 수 있습니다 그 때 활용하는 것이 default 메소드 입니다.
	default void setMute(boolean mute) {	//toggle 기능으로 구현 가능합니다.
		if(mute) {
			System.out.println("무음 처리 합니다.");
		}else {
			System.out.println("무음 헤제 합니다.");
		}
	}
	
	//static
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
	default void setBattery() {
		
	}
}

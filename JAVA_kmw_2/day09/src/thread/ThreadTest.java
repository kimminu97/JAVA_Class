package thread;

public class ThreadTest {
	
	// main 메서드가 실행 프로그램 제작
	public static void main(String[] args) {
		Thread1 t1 = new Thread1("★");
		Thread1 t2 = new Thread1("♥️");
		
		t1.start();
		t2.start();
		
		try {
			//쓰레드 객체를 통해 join()을 사용하면
			//해당 객체 이외의 모든 쓰레드는 대기상태로 돌입한다.
			//해당 쓰레드가 종료되어야 이외의 쓰레드가 실행된다.
		t1.join();
		t2.join();
		} catch(InterruptedException e) {;}
		
		System.out.println("메인쓰레드 종료");
		
//		t1.run();
//		t2.run();

	}
}

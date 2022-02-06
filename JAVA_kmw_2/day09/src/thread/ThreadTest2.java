package thread;

public class ThreadTest2 {
	public static void main(String[] args) {
		Thread2 t1 = new Thread2();
		Thread2 t2 = new Thread2();
		
		Thread thread1 = new Thread(t1, "?");
		Thread thread2 = new Thread(t2,"!");
		//추상 메소드가 있는 객체를 생성자로 메모리에 할당할 때
		//구현을 하고 올려야 한다. 이 때 익명 클래스가 열리고 그 안에 재정의할 메소드가 선언된다.
		Thread thread3 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(Thread.currentThread().getName());
					try {Thread.sleep(500);}catch(InterruptedException e) {;}
				}
			}
		}, "~");
		
		thread1.start();
		thread2.start();
		thread3.start();
	}
}

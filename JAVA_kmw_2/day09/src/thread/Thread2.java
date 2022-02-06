package thread;

public class Thread2 implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			//이 자원에 접근한 객체 : Thread.currntThread()
			System.out.println(Thread.currentThread().getName());
			try{Thread.sleep(500);} catch(InterruptedException e) {;}
		}
	}
}

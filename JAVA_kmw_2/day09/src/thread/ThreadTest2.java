package thread;

public class ThreadTest2 {
	public static void main(String[] args) {
		Thread2 t1 = new Thread2();
		Thread2 t2 = new Thread2();
		
		Thread thread1 = new Thread(t1, "?");
		Thread thread2 = new Thread(t2,"!");
		//�߻� �޼ҵ尡 �ִ� ��ü�� �����ڷ� �޸𸮿� �Ҵ��� ��
		//������ �ϰ� �÷��� �Ѵ�. �� �� �͸� Ŭ������ ������ �� �ȿ� �������� �޼ҵ尡 ����ȴ�.
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

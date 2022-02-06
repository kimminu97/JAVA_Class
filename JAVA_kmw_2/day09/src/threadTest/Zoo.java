package threadTest;

public class Zoo {
	public static void main(String[] args) {
//		Animal dog = new Animal();
//		Animal cat = new Animal();
//		Animal tiger = new Animal();
		
		Animal[] animals = new Animal[3];
		Thread[] threads = new Thread[animals.length];
		String[] sounds = {"�۸�", "�߿�", "����"};
		
		for (int i = 0; i < animals.length; i++) {
			animals[i] = new Animal();
			threads[i] = new Thread(animals[i],sounds[i]);
		}
		// dog�� start, join x
		// cat�� start, join o 	* cat�� ������ �ɸ��� ��� ������ �� ���� Ÿ�̰� start
		// tiger�� start, join o	* ������ �� ���� ����� �Ϳ� ������ ��ģ��.
		for (int i = 0; i < animals.length; i++) {
			threads[i].start();
			if(i !=0) {
				try {threads[i].join();} catch(InterruptedException e) {;}
			}
		}
//		Thread thread1 = new Thread(dog,"�۸�");
//		Thread thread2 = new Thread(cat,"�߿�");
//		Thread thread3 = new Thread(tiger,"����");
		
//		threads[0].start();
//		threads[1].start();
//		try {
//			threads[0].join();
//			threads[1].join();
//		}catch(InterruptedException e) {;}
//		threads[2].start();
		
//		thread1.start();
//		thread2.start();
//		
//		
//		try {
//			thread1.join();
//			thread2.join();
//		}catch(InterruptedException e) {;}
//		
//		thread3.start();
	
	}
}

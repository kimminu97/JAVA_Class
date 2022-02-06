package threadTest;

public class Zoo {
	public static void main(String[] args) {
//		Animal dog = new Animal();
//		Animal cat = new Animal();
//		Animal tiger = new Animal();
		
		Animal[] animals = new Animal[3];
		Thread[] threads = new Thread[animals.length];
		String[] sounds = {"멍멍", "야옹", "어흥"};
		
		for (int i = 0; i < animals.length; i++) {
			animals[i] = new Animal();
			threads[i] = new Thread(animals[i],sounds[i]);
		}
		// dog가 start, join x
		// cat이 start, join o 	* cat에 조인이 걸리면 모두 끝난후 그 다음 타이거 start
		// tiger가 start, join o	* 조인은 그 이후 실행될 것에 영향을 미친다.
		for (int i = 0; i < animals.length; i++) {
			threads[i].start();
			if(i !=0) {
				try {threads[i].join();} catch(InterruptedException e) {;}
			}
		}
//		Thread thread1 = new Thread(dog,"멍멍");
//		Thread thread2 = new Thread(cat,"야옹");
//		Thread thread3 = new Thread(tiger,"어흥");
		
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

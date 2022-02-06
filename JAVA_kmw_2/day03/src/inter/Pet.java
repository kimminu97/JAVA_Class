package inter;

public interface Pet {
	final static int eyes = 2;
	int nose = 1;	 // 상수만 있을 수 있으니 final static 생략가능
	abstract void getHand();
	void shakeTail();
	void charms ();			// 추상 메소드만 가능하니 abstract 생략가능
	void bark();			// 모두 추상메소드
}

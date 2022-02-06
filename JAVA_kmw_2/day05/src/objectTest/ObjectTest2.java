package objectTest;

import java.util.Random;

public class ObjectTest2 {
	public static void main(String[] args) {
		Random r1 = new Random();
		Random r2 = new Random();
		
		System.out.println(r1.hashCode());
		System.out.println(r2.hashCode());
		System.out.println(r1.equals(r2));
		System.out.println(r1 == r2); 		//林家厚背
		
		r1= r2;
		System.out.println(r1.hashCode());
		System.out.println(r2.hashCode());
		System.out.println(r1.equals(r2));
		System.out.println(r1 == r2);		//林家厚背
	
	}
}

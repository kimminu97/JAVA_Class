package variable;

public class Variable2 {

	public static void main(String[] args) {
		Variable1 v1 = new Variable1();
		Variable1 v2 = new Variable1();
		
		Variable1.data_s = 100;			// static은 객체로 접근 x
		Variable1.data_s = 500;			// 클래스로 접근
		
		System.out.println(v1.data_s); 	// static: 객체간 공유(단 하나만 생김)
		
//		v1.data = 100;					// 전역변수: 각각의 필드 갖음
//		v2.data = 500;
//		
//		System.out.println(v1.data);

//		v1.increase_s();
//		v1.increase_s();
//		v1.increase_s();
//		v1.increase_s();
//		v1.increase_s();
//		
//		v1 = new Variable1();	// 메모리의 static변수는 생성자가 할당하는게 아니라
//								// 컴파일러가 할당하는것 
//		
//		v1.increase_s();
//		v1.increase_s();
//		v1.increase_s();
//		v1.increase_s();
//		v1.increase_s();
		
		//System.out.println(v1);
		//System.out.println(v1.data); 전역변수 자동 초기화
//		v1.increase();
//		v1.increase();
//		v1.increase();
//		v1.increase();
//		v1.increase();
//		
//		v1 = new Variable1();		// 전역변수가 new를 만나 새로운 필드
//		
//		v1.increase();
//		v1.increase();
//		v1.increase();
//		v1.increase();
//		v1.increase();
		
	}

}

package variable;

public class Variable2 {

	public static void main(String[] args) {
		Variable1 v1 = new Variable1();
		Variable1 v2 = new Variable1();
		
		Variable1.data_s = 100;			// static�� ��ü�� ���� x
		Variable1.data_s = 500;			// Ŭ������ ����
		
		System.out.println(v1.data_s); 	// static: ��ü�� ����(�� �ϳ��� ����)
		
//		v1.data = 100;					// ��������: ������ �ʵ� ����
//		v2.data = 500;
//		
//		System.out.println(v1.data);

//		v1.increase_s();
//		v1.increase_s();
//		v1.increase_s();
//		v1.increase_s();
//		v1.increase_s();
//		
//		v1 = new Variable1();	// �޸��� static������ �����ڰ� �Ҵ��ϴ°� �ƴ϶�
//								// �����Ϸ��� �Ҵ��ϴ°� 
//		
//		v1.increase_s();
//		v1.increase_s();
//		v1.increase_s();
//		v1.increase_s();
//		v1.increase_s();
		
		//System.out.println(v1);
		//System.out.println(v1.data); �������� �ڵ� �ʱ�ȭ
//		v1.increase();
//		v1.increase();
//		v1.increase();
//		v1.increase();
//		v1.increase();
//		
//		v1 = new Variable1();		// ���������� new�� ���� ���ο� �ʵ�
//		
//		v1.increase();
//		v1.increase();
//		v1.increase();
//		v1.increase();
//		v1.increase();
		
	}

}

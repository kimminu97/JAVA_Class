package Condition;

public class Main03 {

	public static void main(String[] args) {

		boolean is_korean = true;
		
		if( is_korean == true ) {
			System.out.println("�ѱ���� �Դϴ�.");
		}
		
		if( is_korean == false) {
			System.out.println("�ѱ������ �ƴմϴ�.");
		}
		
		// �� ��ü�� ���̹Ƿ� �����ȴ�.
		if( is_korean ) {
			System.out.println("�ѱ���� �Դϴ�.");
		}
		
		// "!"�� ���� �����Ѵ�. ���� �����ϹǷ� �����̴�.
		if( !is_korean ) {
			System.out.println("�ѱ������ �ƴմϴ�.");
		}
		System.out.println("------------------------");
		
		boolean is_japanese = false;
		
		if(is_japanese != true) {
			System.out.println("�Ϻ������ �ƴմϴ�.");
		} else {
			System.out.println("�Ϻ���� �Դϴ�.");
		}
			
	}

}

package inheritance;

import java.util.Scanner;

class Car {
	String brand;
	String color;
	int price;
	String pw;
	int count;

	public Car() {
		this("0000");
	}

	public Car(String pw) {
		super();
		this.pw = pw;
	}

	boolean check;

	// �õ��� �̹� �����ִٸ� "�õ��� �� �� �����ϴ�" ���
	// �õ��� �����ִٸ� "�õ� �ѱ�" ���
	public boolean engineStart() {
		if (!check) { // check�� false�� �� ����
			return true;
		}
		return false;
	}

	// �õ��� �̹� �����ִٸ� "�õ��� �� �� �����ϴ�" ���
	// �õ��� �����ִٸ� "�õ� ����" ���
	public boolean engineStop() {
		if (check) {
			return true;
		}
		return false;
	}
}

class SuperCar extends Car {
	String mode;

	// ��й�ȣ�� �Է¹��� �� �ڵ��� ��й�ȣ�� ��ġ �Ѵٸ� "�Ѳ� ����" ���
	// 3�� ���� ���� �� "���� �⵿" ���
	public boolean openRoof(String pw) {

		// ���ڿ���
		// "���ڿ�".equals("���ڿ�")
		// �� ���� ���ڿ��� ������ true, �ٸ��� false
		if (this.pw.equals(pw)) {
			count = 0;
			return true;
		}
		count++;
		return false;
	}

	public void closeRoof() {

	}
}

public class Road {
	public static void main(String[] args) {
		SuperCar ferrari = new SuperCar();

		Scanner sc = new Scanner(System.in);
		String pw = null;

		while (true) {
			System.out.println("��й�ȣ : ");
			pw = sc.next();

			if (ferrari.openRoof(pw)) {
				System.out.println("�Ѱ� ����");
			} else {
				System.out.println("��й�ȣ" + ferrari.count + "ȸ ����");
				if (ferrari.count == 3) {
					System.out.println("���� �⵿");
					break;
				}
			}
		}

//		if(ferrari.engineStart()) {
//			ferrari.check = true;
//			System.out.println("�õ� �ѱ�");
//		}else {
//			System.out.println("�̹� �õ��� �����ֽ��ϴ�.");
//		}
//		
//		if(ferrari.engineStart()) {
//			ferrari.check = true;
//			System.out.println("�õ� �ѱ�");
//		}else {
//			System.out.println("�̹� �õ��� �����ֽ��ϴ�.");
//		}
	}
}

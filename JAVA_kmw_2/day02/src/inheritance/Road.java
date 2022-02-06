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

	// 시동이 이미 켜져있다면 "시동을 켤 수 없습니다" 출력
	// 시동이 꺼져있다면 "시동 켜기" 출력
	public boolean engineStart() {
		if (!check) { // check가 false일 때 들어옴
			return true;
		}
		return false;
	}

	// 시동이 이미 꺼져있다면 "시동을 끌 수 없습니다" 출력
	// 시동이 켜져있다면 "시동 끄기" 출력
	public boolean engineStop() {
		if (check) {
			return true;
		}
		return false;
	}
}

class SuperCar extends Car {
	String mode;

	// 비밀번호를 입력받은 후 자동차 비밀번호와 일치 한다면 "뚜껑 열림" 출력
	// 3번 연속 실패 시 "경찰 출동" 출력
	public boolean openRoof(String pw) {

		// 문자열비교
		// "문자열".equals("문자열")
		// 두 개의 문자열이 같은면 true, 다르면 false
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
			System.out.println("비밀번호 : ");
			pw = sc.next();

			if (ferrari.openRoof(pw)) {
				System.out.println("뚜겅 열림");
			} else {
				System.out.println("비밀번호" + ferrari.count + "회 오류");
				if (ferrari.count == 3) {
					System.out.println("경찰 출동");
					break;
				}
			}
		}

//		if(ferrari.engineStart()) {
//			ferrari.check = true;
//			System.out.println("시동 켜기");
//		}else {
//			System.out.println("이미 시동이 켜져있습니다.");
//		}
//		
//		if(ferrari.engineStart()) {
//			ferrari.check = true;
//			System.out.println("시동 켜기");
//		}else {
//			System.out.println("이미 시동이 켜져있습니다.");
//		}
	}
}

package koreait.day9;

public class StudentScoreArray {
//StudentScore 클래스의 배열을 연습합니다.
	public static void main(String[] args) {

		StudentScore[] iclass = new StudentScore[5];
		// iclass 배열이 저장하는 값은 객체 주소

		// 화면 출력
		for (int i = 0; i < iclass.length; i++) {
			System.out.println(iclass[i]);
		}
		// 아직 참조하는 객체가 없습니다. -> null

		iclass[0] = new StudentScore(); // 객체를 먼저 생성하지 않으면
		iclass[0].inputData(); // -> null pointer 오류 발생

		// 반복문으로 객체를 3개 만들어서 인덱스 1~3 배열요소가 참조하도록 합니다.
		for (int i = 1; i <= 3; i++) {
			iclass[i] = new StudentScore();
			iclass[i].inputData();
		}
		
		iclass[4] = new StudentScore();
		System.out.println("객체 생성하고 필드값은 없는 경우 : ");
		iclass[4].printScore();
		//입력&배열저장된 객체에서 name 필드만 모두 출력해봅니다.
		System.out.println("학생 명단 : ");
		for (int i = 0; i < iclass.length; i++) {
			System.out.print("\t"+ iclass[i].name+"\n");
		}
		//학생이름 - 총점, 평균
		for (int i = 0; i < iclass.length; i++) {
			System.out.printf("이름 : %s - 총점 : %d, 평균 : %.2f\n" ,iclass[i].name 
					,iclass[i].sum(),iclass[i].avg());
		}
		//printSccore()메소드 출력
		for (int i = 0; i < iclass.length; i++) {
			iclass[i].printScore();
		}
	}
}
//지역변수는 초기값이 자동으로 설정되지 않습니다.
//전역변수는 (클래스 필드)초기값이 참조타입은 null, 기본타입은 0 또는 0.0 자동으로 저장됩니다.
package exception;

import java.util.Scanner;

public class ExceptionTask {

	public static void main(String[] args) {
		// 5개의 정수만 입력받기
		//- 무한 입력가능
		//- q를 입력하면 나가기
		//- 5개의 정수는 배열에 담기
		//- 6번째 정수를 입력하면 강제종료
		//- if문은 한 번만 사용하기
		
		int[] arData = new int[5];
		Scanner sc = new Scanner(System.in);
		int idx = 0;
		String temp = null;
		
		while(true) {
			System.out.println(++idx + " 번 째 정수[q - 나가기] : ");
			temp= sc.next();
			if(temp.toLowerCase().equals("q")) {break;}
			
			try {
				arData[idx -1] = Integer.parseInt(temp); // 영역 잡고 alt shift z -> try catch block
				System.out.println("추가 성공!");
			} catch (NumberFormatException e) {
				System.out.println("정수만 입력해주세요.");
				idx--;
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(" 더 이상 정수를 입력하실 수 없습니다.");
				for(int i=0; i<arData.length; i++ ) {
					System.out.println(arData[i] + " ");
				}
				break;
			} catch(Exception e) {
				System.out.println("다시 시도해 주세요");
				idx--;
			}
		}
	}

}

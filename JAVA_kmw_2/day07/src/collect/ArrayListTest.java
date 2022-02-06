package collect;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {
	public static void main(String[] args) {
		
	
		ArrayList<Integer> dataList = new ArrayList<>();
		System.out.println(dataList.size());
		
		dataList.add(10);
		dataList.add(20);
		dataList.add(40);
		dataList.add(50);
		dataList.add(90);
		dataList.add(80);
		dataList.add(70);
		dataList.add(60);
		
		Collections.shuffle(dataList);
		
		//삽입
		int index = 0;
		if(dataList.contains(50)) {
			index = dataList.indexOf(50);
			dataList.add(index + 1, 500);
			System.out.println(dataList);
		}else {
			System.out.println("없습니다.");
		}
		
		
		//수정
		//90을 9로 수정
		int prev = 0;
		if(dataList.contains(90)) {
			prev = dataList.set(dataList.indexOf(90), 9);
			System.out.println(prev + "이 9로 변경되었습니다.");
			System.out.println(dataList);
		}else {
			System.out.println("없습니다.");
		}
		
		//삭제
		// 80 삭제
		int removedElement = 0;
		//1. 인덱스로 삭제
		if(dataList.contains(80)) {
		removedElement = dataList.remove(dataList.indexOf(80));
		System.out.println(removedElement + "이 삭제되었습니다.");
		System.out.println(dataList);
		}else {
			System.out.println("없습니다.");
		}
		//2. 값으로 삭제  
		if(dataList.remove(new Integer(80))) {
			System.out.println("삭제성공");
			System.out.println(dataList);
		}
		
		

}
}
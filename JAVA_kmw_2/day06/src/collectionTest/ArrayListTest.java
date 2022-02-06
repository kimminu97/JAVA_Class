package collectionTest;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {
	public static void main(String[] args) {
		
		// <?> : 제네릭
		// 타입을 모를 때 사용하는 기법
		// 타입은 사용하는 부분에서 지정한다.
		
		// object가 아닌 제네릭을 사용하는 이유
		// 1. down casting을 할 필요가 없다
		// 2. 타입에 제한을 주기 위해서 ex) extends Number
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
		//50뒤에 500삽입
		int index = 0;
//		50이 있는지 먼저 검사
		if(dataList.contains(50)) {
//			50이 있으면 위치를 검색
			index = dataList.indexOf(50);
//			50의 위치 뒤에 500을 추가한다.
			dataList.add(index + 1, 500);
			System.out.println(dataList);
		}else {
			System.out.println("없습니다.");
		}
		
		
		//수정
		//90을 9로 수정
		
		//삭제
		// 80 삭제
		//1. 인덱스로 삭제
		//2. 값으로 삭제  
		
//		System.out.println(dataList.size());
//		System.out.println(dataList.get(0)+900);
//		
//		System.out.println(dataList);
//		//주소를 전달하면 다른 영역에서도 값을 수정할 수 있다.
//		Collections.sort(dataList);		//Collections 클래스의 sort
//		Collections.reverse(dataList);	//가운데를 기준으로 좌우를 반대로 바꿔준다.
//		//요소의 위치를 무작위로 섞어준다.
//		//Collections.shuffle(dataList);
//		System.out.println(dataList);
}
}
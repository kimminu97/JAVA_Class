package koreait.day17;

import java.util.ArrayList;
import java.util.List;

public class CompareTest2 {

	public static void main(String[] args) {
		//User 객체 5개 생성하여 list에 담아서 sort 해보세요
		//User 타입은 비교가능한 객체입니다.
		List<User> uList = new ArrayList<User>();
		
		uList.add(new User("민우", 15));
		uList.add(new User("흥민", 16));
		uList.add(new User("성용", 25));
		uList.add(new User("자철", 30));
		uList.add(new User("지성", 28));
		
		uList.sort(null);
		System.out.println(uList);
		
	}

}

package mapTest;

import java.util.HashMap;
/*
 * JSON(JavaScript Object Notation)
 * 1. 경량화(용량이 작다)
 * 2. 타 서버간 데이터 교환 가능
 * 3. 타 언어간 데이터 교환 가능
 * 4. 프로그래밍 언어가 아닌 형식이다.
 */
public class MapTest {
	public static void main(String[] args) {
		HashMap<String, Integer> fruitMap = new HashMap<>();
		fruitMap.put("사과", 1500);
		fruitMap.put("포도", 1000);
		fruitMap.put("바나나", 1500);
		fruitMap.put("오렌지", 2000);
		
		if(fruitMap.containsKey("바나나")) { //바나나가 기존에 있으면 3000원으로 수정
		fruitMap.put("바나나", 3000);
		}else {	//바나나가 기존에 없으면 1500원으로 추가
			fruitMap.put("바나나", 1500);
		}
		
		System.out.println(fruitMap.size());
		System.out.println(fruitMap);
		System.out.println(fruitMap.get("포도") + "원 입니다.");
	}
}

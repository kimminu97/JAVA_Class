package collect;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest {

	public static void main(String[] args) {
		//혈액형
		HashSet<String> bloodTypeSet = new HashSet<>();
		bloodTypeSet.add("A");
		bloodTypeSet.add("B");
		bloodTypeSet.add("AB");
		bloodTypeSet.add("O");
		bloodTypeSet.add("A");
		bloodTypeSet.add("A");
		bloodTypeSet.add("A");
		bloodTypeSet.add("A");
		bloodTypeSet.add("A");
		bloodTypeSet.add("A");
		bloodTypeSet.add("A");
		bloodTypeSet.add("A");
		
		System.out.println(bloodTypeSet.contains("AB"));
		
		System.out.println(bloodTypeSet);
		//set에서 값을 가져오는 법
		Iterator<String> iter = bloodTypeSet.iterator(); //순서부여(iterator)
		while(iter.hasNext()) {				
			System.out.println(iter.next());	//값 가져오기
		}
	}
	

}

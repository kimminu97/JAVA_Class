package collect;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest {

	public static void main(String[] args) {
		//������
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
		//set���� ���� �������� ��
		Iterator<String> iter = bloodTypeSet.iterator(); //�����ο�(iterator)
		while(iter.hasNext()) {				
			System.out.println(iter.next());	//�� ��������
		}
	}
	

}

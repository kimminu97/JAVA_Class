package collectionTest;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {
	public static void main(String[] args) {
		
		// <?> : ���׸�
		// Ÿ���� �� �� ����ϴ� ���
		// Ÿ���� ����ϴ� �κп��� �����Ѵ�.
		
		// object�� �ƴ� ���׸��� ����ϴ� ����
		// 1. down casting�� �� �ʿ䰡 ����
		// 2. Ÿ�Կ� ������ �ֱ� ���ؼ� ex) extends Number
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
		
		//����
		//50�ڿ� 500����
		int index = 0;
//		50�� �ִ��� ���� �˻�
		if(dataList.contains(50)) {
//			50�� ������ ��ġ�� �˻�
			index = dataList.indexOf(50);
//			50�� ��ġ �ڿ� 500�� �߰��Ѵ�.
			dataList.add(index + 1, 500);
			System.out.println(dataList);
		}else {
			System.out.println("�����ϴ�.");
		}
		
		
		//����
		//90�� 9�� ����
		
		//����
		// 80 ����
		//1. �ε����� ����
		//2. ������ ����  
		
//		System.out.println(dataList.size());
//		System.out.println(dataList.get(0)+900);
//		
//		System.out.println(dataList);
//		//�ּҸ� �����ϸ� �ٸ� ���������� ���� ������ �� �ִ�.
//		Collections.sort(dataList);		//Collections Ŭ������ sort
//		Collections.reverse(dataList);	//����� �������� �¿츦 �ݴ�� �ٲ��ش�.
//		//����� ��ġ�� �������� �����ش�.
//		//Collections.shuffle(dataList);
//		System.out.println(dataList);
}
}
package mapTest;

import java.util.HashMap;
/*
 * JSON(JavaScript Object Notation)
 * 1. �淮ȭ(�뷮�� �۴�)
 * 2. Ÿ ������ ������ ��ȯ ����
 * 3. Ÿ �� ������ ��ȯ ����
 * 4. ���α׷��� �� �ƴ� �����̴�.
 */
public class MapTest {
	public static void main(String[] args) {
		HashMap<String, Integer> fruitMap = new HashMap<>();
		fruitMap.put("���", 1500);
		fruitMap.put("����", 1000);
		fruitMap.put("�ٳ���", 1500);
		fruitMap.put("������", 2000);
		
		if(fruitMap.containsKey("�ٳ���")) { //�ٳ����� ������ ������ 3000������ ����
		fruitMap.put("�ٳ���", 3000);
		}else {	//�ٳ����� ������ ������ 1500������ �߰�
			fruitMap.put("�ٳ���", 1500);
		}
		
		System.out.println(fruitMap.size());
		System.out.println(fruitMap);
		System.out.println(fruitMap.get("����") + "�� �Դϴ�.");
	}
}

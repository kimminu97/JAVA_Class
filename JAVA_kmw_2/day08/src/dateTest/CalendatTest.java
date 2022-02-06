package dateTest;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendatTest {
	public static void main(String[] args) {
		//�̱��� ����(���)
		//��ü�� �ϳ��� �����ϵ��� �����ϸ�, ��ü�� ��𿡼����� ������ �� �ֵ��� �Ѵ�.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		
		//���� 0���� �����Ѵ�.
		c.set(2000, 3, 26);
		System.out.println(c.getTime());
		System.out.println(sdf.format(c.getTime()));
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH) + 1);
		System.out.println(c.get(Calendar.DATE));
	}
}

package dateTest;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd��");
		Date now = new Date();
		now.setMonth(0);	//���� 0~11�̴�.
		System.out.println(now);
		System.out.println(sdf.format(now));
	}
}

package dateTest;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		Date now = new Date();
		now.setMonth(0);	//월은 0~11이다.
		System.out.println(now);
		System.out.println(sdf.format(now));
	}
}

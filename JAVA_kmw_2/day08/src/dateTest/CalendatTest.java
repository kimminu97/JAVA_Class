package dateTest;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendatTest {
	public static void main(String[] args) {
		//싱글톤 패턴(약속)
		//객체를 하나만 생성하도록 설계하며, 객체를 어디에서든지 접근할 수 있도록 한다.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		
		//월은 0부터 시작한다.
		c.set(2000, 3, 26);
		System.out.println(c.getTime());
		System.out.println(sdf.format(c.getTime()));
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH) + 1);
		System.out.println(c.get(Calendar.DATE));
	}
}

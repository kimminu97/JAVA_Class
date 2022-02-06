package MultiEx;

public class Main03 {

	public static void main(String[] args) {
		// 1~100±îÁö È¦¼öÀÇ ÇÕ
		int sum = 0;
		int i = 0;
		
		while(true) {
			i++;
			if(i%2 ==0) {	//Â¦¼ö
				continue;
			}
			if(i>100) {
				break;
			}
			sum += i;
			System.out.println(i);	// È¦¼ö
		}
		System.out.println("ÃÑÇÕ : " + sum);
		
	}

}

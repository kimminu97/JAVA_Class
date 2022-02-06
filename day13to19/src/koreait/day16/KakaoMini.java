package koreait.day16;

import java.text.DecimalFormat;

public class KakaoMini extends CreditCard{
	static final int MAX_LIMIT = 100000;
	
	public KakaoMini(String owner) {
		super(owner);
	}
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("###,###,###");
		return "이번달 결제예정금액 "+df.format(payTotal)+"원 입니다." 
				+"[이용한도 "+df.format(limit)+"원]";
	}
	@Override
	public int upLimit(int plus) {
		if(MAX_LIMIT < limit+plus) {
			return 0;
		}else {
			limit += plus;
			return plus;
		}
	}

	@Override
	public int pay(int money) {
		if(limit < money+payTotal) {
		return 0;
		}else {
			payTotal += money;
			return money;
		}
		
	}

}

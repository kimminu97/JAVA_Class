package koreait.day16;

public abstract class CreditCard {
	//1) 부모클래스는 자식클래스가 사용하도록 protected로 합니다.
	protected String owner;	// 소유자
	protected int limit;	// 이용한도
	protected int payTotal;	// 결제금액
	
	public CreditCard(String owner) {
		this.owner = owner;
	}
	
	abstract int upLimit(int plus);
	
	abstract int pay(int money);
	
	public int getLimit() {
		return limit;
	}
	public String getOwner() {
		return owner;
	}
	public int getPayTotal() {
		return payTotal;
	}
}

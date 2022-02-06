package test;

import koreait.day16.KakaoMini;
import koreait.day16.KakaoVIP;

public class CreditCardTest {
	public static void main(String[] args) {
		//카드 객체 생성해서 이용한도, 카드사용 을 메소드로 테스트 해보세요
		KakaoMini card = new KakaoMini("김민우");
		System.out.println("현재 한도 : " +card.getLimit());
		card.upLimit(50000);
		System.out.println(card);
		System.out.println("-----------------------------");
		
		KakaoVIP vCard = new KakaoVIP("홍길동", 2000000);
		System.out.println(vCard);
		System.out.println("-----------------------------");
		
		
		System.out.println("\n김민우 회원이 점심 돈까스 5000원 사용");
		if(card.pay(5000)==0)
			System.out.println("사용한도가 초과되었습니다. 결제 승인거부");
		else System.out.println("결제 승인완료");
		System.out.println(card);
		
		System.out.println("\n홍길동 VIP회원이 스마트워치 구매 : 금액 50만원");
		vCard.pay(500000);
		System.out.println(vCard);
		
		System.out.println("\n홍길동 VIP회원이 냉장고 구매 : 550만원");
		vCard.pay(5500000);
		System.out.println(vCard);
		
		System.out.println("\n김민우 회원이 스마트폰 구매 : 금액20만원");
		if(card.pay(200000)==0)
			System.out.println("사용한도가 초과되었습니다. 결제 승인거부");
		else System.out.println("결제 승인완료");
		System.out.println(card);
		
	}
}

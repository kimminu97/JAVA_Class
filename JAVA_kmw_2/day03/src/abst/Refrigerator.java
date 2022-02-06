package abst;

public class Refrigerator extends Electronics {

	@Override
	public void on() {
		System.out.println("코드를 꽂고 문을 연다");
	}

	@Override
	public void off() {
		System.out.println("문을 닫고 코드를 뽑는다.");
	}

}

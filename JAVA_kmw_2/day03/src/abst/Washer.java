package abst;

public class Washer extends Electronics {

	@Override
	public void on() {
		System.out.println("전원 버튼을 누른다.");		
	}

	@Override
	public void off() {
		System.out.println("세탁을 다 하면 자동으로 꺼진다.");
	}

}

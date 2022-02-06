package koreait.day11;

public class Puppy extends Animal {
	private String type;
	
	@Override	//@ 어노테이션은 명령실행에 도움을 주는 주석
	public void sound() {
		System.out.println("🐶🐶🐶🐶🐶 멍멍");
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}

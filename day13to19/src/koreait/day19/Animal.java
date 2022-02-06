package koreait.day19;

public abstract class Animal {	//abstract클래스는 abstract메소드를 갖는것이 일반적입니다.
								//abstract 메소드 유무와 상관없이 객체는 직접 생성 못합니다.
	//필드 : 공통적인 값
	private String name;
	private String color;
	
	//생성자
	public Animal() {
		System.out.println("새로운 반려동물 가족이 생겼습니다.");
	}
	public Animal(String name) {
		this();		//자기자신 객체 기본생성자 메소드 호출
		this.name =name;
	}
	public Animal(String name, String color) {
		this(name);		
		this.color=color;
	}
	//추상 메소드
	public abstract void sound();
	
	//Object 클래스의 toString()메소드 오버라이드
	@Override
	public String toString() {
		return "Animal [name=" + name + ", color=" + color + "]";
	}
	//getter,setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}

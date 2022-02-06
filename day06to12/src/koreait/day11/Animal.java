package koreait.day11;

public class Animal {
	private String color, name;

	public Animal() {
		System.out.println("Animal : 새로운 반려동물 가족이 생겼습니다.");
	}
	public void sound() {
		System.out.println("Animal: 소리를 내는 동물입니다. 이름은 "+name);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

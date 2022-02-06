package objectTest;

public class ObjectTest1 {
	
	private String name;
	private int age;
	private String gender;
	
public ObjectTest1() {;}
	
	public ObjectTest1(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		String str = "�̸� : " + name + "\n���� : " + age + "��\n"
				+"���� : " + gender;
		return str;
	}
	public static void main(String[] args) {
		ObjectTest1 obj = new ObjectTest1("��ο�", 25, "����");
		System.out.println(obj.toString());
	}
}

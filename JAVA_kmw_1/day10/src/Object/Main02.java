package Object;

class Book{
	String subject;
	String content;
	
	/*
	 * ������ -> ��ü�� ������ ��, �ڵ����� ����Ǵ� Ư���� �޼���
	 * Ư¡ -> �������� ������� �ʴ´�. Ŭ������ �̸��� �����ϴ�.
	 */
	
	Book(){
		System.out.println("---------������ �����-----------");
		this.subject = "JAVA �Թ�";
		this.content = "JAVA�� ��ü���� ����Դϴ�.";
	}
	void read() {
		System.out.println("---------read() �����-----------");
		System.out.println(this.subject);
		System.out.println(this.content);
	}
}

public class Main02 {

	public static void main(String[] args) {
		Book book = new Book();
		book.read();
		
		
	}

}

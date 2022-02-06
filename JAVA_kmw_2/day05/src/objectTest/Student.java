package objectTest;

public class Student {
	// ��ȣ�� �ߺ��� ���ٰ� �����Ѵ�.
	String name;
	int num;
	
	public Student() {;}
	
	public Student(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {				// �ּҺ�
			return true;
		}
		if(obj instanceof Student) {	// Ÿ�Ժ�
			Student std = (Student)obj;	// �ٿ�ĳ����
			if(this.num == std.num) {	// �� ��
				return true;
			}
		}
		return false;
	}
	
}

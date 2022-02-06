package objectTest;

public class Student {
	// 번호는 중복이 없다고 가정한다.
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
		if(this == obj) {				// 주소비교
			return true;
		}
		if(obj instanceof Student) {	// 타입비교
			Student std = (Student)obj;	// 다운캐스팅
			if(this.num == std.num) {	// 값 비교
				return true;
			}
		}
		return false;
	}
	
}

package variable;

public class Variable1 {
	int data;
	static int data_s;
	
	void increase() {
		data++;
		System.out.println(data);
	}
	static void increase_s() {
		data_s++;
		System.out.println(data_s);
	}

}

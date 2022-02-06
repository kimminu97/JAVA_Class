package objectTest;

public class ObjectTest3 {
	public static void main(String[] args) {
		String data1 = "ABC";
		String data2 = "ABC";		//값의 주소	
		
		String data3 = new String("ABC");
		String data4 = new String("ABC");	// 필드의 주소
		
		System.out.println(data1.hashCode());
		System.out.println(data2.hashCode());
		System.out.println(data3.hashCode());
		System.out.println(data4.hashCode());
		System.out.println(data1 == data2);	
		System.out.println(data3 == data4);
		
		System.out.println(data3.equals(data4));
	}
}

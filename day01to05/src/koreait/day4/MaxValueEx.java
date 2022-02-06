package koreait.day4;

public class MaxValueEx {
	public static void main(String[] args) {
		int n1=5,n2=4,n3=12,max;
		if(n1>n2) {
			max=n1;
		}else 
			max=n2;
		if(max<n3) {
			max=n3;
		}
		System.out.println("최대값 : " + max);
	}
}

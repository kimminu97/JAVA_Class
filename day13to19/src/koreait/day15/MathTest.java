package koreait.day15;

public class MathTest {
	public static void main(String[] args) {
		//소수의 개념 : 1보다 큰 자연수 중 1과 자기 자신만을 약수로 가지는 수(prime number)
		//소수 판별 수식. 정수 num을 2부터 num-1까지 나누어서 나머지가 0인값이 있으면 소수아님
		//	예-> num이 15일때 2에서 14까지 나누어서 나머지가 0이 있는지? -> 2~루트(제곱근) 값까지 나누기하면 됩니다.
		//	->제곱근 대신에 2부터 num/2까지 나누어서 할 수도 있습니다.
		
		System.out.println(Math.sqrt(16));
		System.out.println(Math.sqrt(15));
		System.out.println(Math.sqrt(9));
		System.out.println(Math.sqrt(22));
		
		System.out.println("어떤 정수가 소수인지 확인합니다. 어떤 정수 입력 -> ");
		int num = 17;
		boolean isPrime = true;
		//조건 1)i<num, 2)i<num/2, 3)Math.sqrt(num)
		for (int i = 2; i < Math.sqrt(num); i++) {	
				//num이 소수일때 반복횟수가 가장 작은 조건식? 3번	//실행속도 개
			if(num%i ==0) {		//나누어 떨어지면
				isPrime=false;
				break;
			}
		}
		
		if(isPrime)
			System.out.println(num+" 은 소수입니다.");
		else
			System.out.println(num+" 은 소수가 아닙니다.");
	}
}

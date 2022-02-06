package sort;

public class SolutionTest {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] numbers = {1,2,3,4,6,7,8,0};
		
		int result = sol.solution(numbers);
		System.out.println("result = " + result);
	}

}
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] all = {0,1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < all.length; i++) {
        	for (int j = 0; j <numbers.length; j++) {
				if(all[i] == numbers[j] ) {
					all[i] -= numbers[j];
				}
			}
        	answer += all[i];
        }
        return answer;
    }
}

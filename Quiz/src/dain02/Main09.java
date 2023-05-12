package dain02;

public class Main09 {

	public static void main(String[] args) {
		/*
		 * 정수가 담긴 리스트 num_list가 주어질 때,
		 *  num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 
		 *  return 하도록 solution 함수를 완성해보세요.
		 * 
		 */
	}


	class Solution {
		public int[] solution(int[] num_list) {
			int i = 0;
			int j = 0;
			for(int a : num_list) {
				if(a %2 == 0) {
					i++;
				}else {
					j++;
				}
			}
			int[] arr = {i,j};
			
			return arr;
		}
	}

}

package dain03;

import java.util.Arrays;

public class Pro02 {

	public static void main(String[] args) {
		int[]numbers = {1,2,3,4,5};

		System.out.println(solution(numbers,2,4));

	}

	static int[] solution(int[] arr, int a, int b) {
		int[] arr2 = new int[(b-a)+1];                       

		for(int c = 0 ; c < arr2.length;c++) {
			arr2[c] = arr[a]; 
			a++;
		}
		return arr2;
	}

}

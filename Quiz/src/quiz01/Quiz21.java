package quiz01;

import java.util.Arrays;

//import java.util.Scanner;
public class Quiz21 {

	public static void main(String[] args) {

		/*
		 * 1. 1~9 까지 숫자 중에서 절대 중복되지 않은 숫자를 추출.
		 *    arr를 랜덤하게 10번 섞어줍니다.
		 *    0~2번째 값을 새로운 배열로 옮겨 닮아보세요.
		 */
		//Scanner scan = new Scanner(System.in);
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int[] arr2 = new int[3];
		int temp = 0;

		for(int i =0 ; i < arr.length ; i++) {

			int j = (int) (Math.random()*9);
			int k = (int) (Math.random()*9);
			temp = arr[j];
			arr[j] = arr[k];
			arr[k] = temp;
		}
		for(int l = 0 ; l < 3 ; l++) {
			arr2[l] =arr[l]; 
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
	}

}

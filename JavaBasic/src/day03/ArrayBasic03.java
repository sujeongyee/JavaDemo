package day03;

import java.util.Arrays;

public class ArrayBasic03 {
	
	public static void main(String[] args) {
		
		// 크기가 100인 배열에 1 ~ 100까지 수를 저장.
		
		int[] arr = new int [100];
		
		int a = 0;
		
		for(int i = 0 ; i < arr.length  ; i++) {
			arr[i] = i+1;
		}
		
		/////////////////////////////
		//System.out.println(Arrays.toString(arr));
		
		// 배열 요소의 문자열 합
		String str = "";
		for(int i =0 ; i < arr.length ; i++) {
			// System.out.print(arr[i] + " ");  int 값으로 밑으로 쭉 나열
			str +=  arr[i]; //???????????????????
		}
		
		System.out.println(str);
		
		
//		String s = "";
//		s = 1;
	}

}

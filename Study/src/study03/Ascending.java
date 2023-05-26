package study03;

import java.util.Arrays;

public class Ascending { // 오름차순 정렬 해주는 부모클래스
	
	public int[] make(int[] arr) {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		return arr;
	}
	
	public char[] make(char[] arr) {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		return arr;
	}

}

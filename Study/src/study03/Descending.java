package study03;

import java.util.Arrays;

public class Descending extends Ascending{
	
	
	public int[] make(int[] arr) {
		Arrays.sort(arr);
		int[] arr2 = new int[arr.length];
		int a = arr.length-1;		
		for(int i:arr) {
			arr2[a]=i;
			a--;
		}
		System.out.println(Arrays.toString(arr2));
		return arr2;
	}
	
	public char[] make(char[] arr) {
		Arrays.sort(arr);
		char[] arr2 = new char[arr.length];
		int a = arr.length-1;
		for(char i : arr) {
			arr2[a] = i;
			a--;
		}
		System.out.println(Arrays.toString(arr2));
		return arr2;
	}

	
	
}

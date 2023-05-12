package dain03;

import java.util.Arrays;

public class pro05 {

	public static void main(String[] args) {
		

		int[] emergency = {3,76,24};
		int b = 1;
		int[] arr = Arrays.copyOf(emergency, emergency.length);
		Arrays.sort(arr);
		int[] arr2 = new int[emergency.length];
		System.out.println(Arrays.toString(arr)); // 3 24 76
		
		for(int i = emergency.length-1 ; i >= 0 ; i--) { //2
			int a = Arrays.binarySearch(emergency, arr[i]); // 원래 배열에서 가장큰수
			arr2[a] = b;
			b++;
		}
		
		System.out.println(Arrays.toString(arr2));

	}

}

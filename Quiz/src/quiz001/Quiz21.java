package quiz001;

import java.util.Arrays;

public class Quiz21 {
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		for(int i = 0; i < 10; i++) {
			int temp = 0;
			int x = (int)(Math.random()*9);
			int y = (int)(Math.random()*9);
			temp = arr[x];
			arr[x] = arr[y];
			arr[y]=temp;			
		}
		System.out.println(Arrays.toString(arr));
		int[]arr2 = new int[3];
		
		for(int j =0; j <arr2.length; j++) {
			arr2[j] = arr[j];
		}
		
		System.out.println(Arrays.toString(arr2));
	}

}

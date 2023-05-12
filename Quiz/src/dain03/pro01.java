package dain03;

import java.util.Arrays;

public class pro01 {
	
	public static void main(String[] args) {
		
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = solution(arr1);
		System.out.println(Arrays.toString(arr2));
		
	}
	

	    static int[] solution(int[] num_list) {
	    	    int[] arr = new int[num_list.length];
	            int b = 0;
	            for(int a = num_list.length-1; a>=0;a--){
	            	
	                arr[b] = num_list[a];
	                b++;
	            }
	           return arr;
	    }
	}
	



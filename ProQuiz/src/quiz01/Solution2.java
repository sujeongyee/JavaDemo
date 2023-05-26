package quiz01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution2 {
	
	public static void main(String[] args) {
		
		int[][] lines = {{0,2},{-3,-1},{-2,1}};
		
		ArrayList<Integer> al = new ArrayList<>();
		ArrayList<Integer> al2 = new ArrayList<>();
		for(int i = lines[0][0]; i<= lines[0][1];i++) {
			al.add(i);
		}
		for(int i = lines[1][0]; i<= lines[1][1];i++) {
			al.add(i);
		}
		
		Collections.sort(al);
		int[] arr = al.stream().mapToInt(i->i).toArray();
		
		for(int i = 0 ; i < arr.length-1 ; i++) {
			 if(arr[i] == arr[i+1]) {
				 al2.add(arr[i]);
			 }
		 }
		int[] arr2 = al2.stream().distinct().mapToInt(i->i).toArray();
		
		
		System.out.println(Arrays.toString(arr2));
		
		
		
		
		
		
	}

}

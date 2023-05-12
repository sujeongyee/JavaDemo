package study01;

import java.util.Scanner;

public class Quiz02 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[9];
		
		int max = 0;
		int maxIndex = 0;
		
		int min = 100;
		int minIndex = 0;
		
		for(int i = 0 ; i <arr.length ; i++) {			
			arr[i] = scan.nextInt();
			if(arr[i] > max) {
				max = arr[i];
				maxIndex = i+1;
			}
			if(arr[i] < min) {
				min = arr[i];
				minIndex = i+1;
			}
		}
		
		System.out.println("최댓값 : " + max + ", " + maxIndex +"번째");
		System.out.println("최소값 : " + min + ", " + minIndex +"번째");
		
	}

}

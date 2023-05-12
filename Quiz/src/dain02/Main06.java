package dain02;

import java.util.Arrays;
import java.util.Scanner;

public class Main06 {
	
	public static void main(String[] args) {
		// 수 10개 입력 받고, 이를 42로 나눈 나머지 10개 중 서로 다른 값이 몇개 인지
		
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[10];
		
		for(int a = 0; a < 10 ; a++) {
			int b = scan.nextInt();
			arr[a] = b % 42;
		}
		Arrays.sort(arr);
		int count = 1;
		for(int a = 0; a < arr.length-1 ;a++ ) {
			if(arr[a]!=arr[a+1]) {
				count++;
			}
			
		}
		System.out.println(count);
	}

}
